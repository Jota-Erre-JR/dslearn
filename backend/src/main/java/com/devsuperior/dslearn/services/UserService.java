package com.devsuperior.dslearn.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearn.dto.UserDTO;
import com.devsuperior.dslearn.entities.User;
import com.devsuperior.dslearn.repositories.UserRepository;
import com.devsuperior.dslearn.services.exceptions.ResourceNotFoundException;


@Service
public class UserService implements UserDetailsService{

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private AuthenticServices authService; 
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long userId) {
		authService.validateSelfOrAdmin(userId);
		Optional<User> obj = repository.findById(userId);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Please review the typed content."));
		return new UserDTO(entity);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repository.findByEmail(username);
		if (user == null) {
			logger.error("Email not found:" + username);
			throw new UsernameNotFoundException("Email not found!");
		}
		logger.info("Email found:" + username);
		return user;
	}

}
