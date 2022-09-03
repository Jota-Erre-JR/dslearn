package com.devsuperior.dslearn.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearn.entities.Notification;
import com.devsuperior.dslearn.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

	Page<Notification> findByUser(User user, Pageable pageable);
}
