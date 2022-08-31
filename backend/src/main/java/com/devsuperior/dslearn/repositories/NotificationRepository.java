package com.devsuperior.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
