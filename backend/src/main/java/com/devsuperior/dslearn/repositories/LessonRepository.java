package com.devsuperior.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
