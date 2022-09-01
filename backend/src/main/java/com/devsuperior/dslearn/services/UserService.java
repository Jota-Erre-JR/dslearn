package com.devsuperior.dslearn.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devsuperior.dslearn.entities.User;
import com.devsuperior.dslearn.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService{

private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEnconder;

	@Autowired
	private UserRepository repository;
	
//	@Autowired
//	private RoleRepository roleRepository;

	/*
	 * Transactional grant that transaction will be done inside the database and the
	 * readonly increase the performance, avoid the locking of database.
	 
	@Transactional(readOnly = true)
	public Page<UserDTO> findAllPaged(Pageable pageable) {
		Page<User> list = repository.findAll(pageable);
		return list.map(x -> new UserDTO(x));

	}

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Please review the typed content."));
		return new UserDTO(entity);

	}

	@Transactional
	public UserDTO insert(UserInsertDTO dto) {
		User entity = new User();
		CopyDTOToEntity(dto, entity);
		entity.setPassword(passwordEnconder.encode(dto.getPassword()));
		entity = repository.save(entity);
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO update(Long id, UserUpdateDTO dto) {
		try {
			User entity = repository.getOne(id);// At new Spring Boot versions getOne changed to getReferenceById().
			CopyDTOToEntity(dto, entity);
			entity = repository.save(entity);
			return new UserDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id " + id + " not found!");
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id " + id + " not found!");
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Integrity violation!");
		}
	}

	private void CopyDTOToEntity(UserDTO dto, User entity) {
		
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setEmail(dto.getEmail());
		
		entity.getRoles().clear();
		for (RoleDTO roleDTO : dto.getRoles()) {
			Role role = roleRepository.getOne(roleDTO.getId());
			entity.getRoles().add(role);
		}

	}*/

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
