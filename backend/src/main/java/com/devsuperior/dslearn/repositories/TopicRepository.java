package com.devsuperior.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
