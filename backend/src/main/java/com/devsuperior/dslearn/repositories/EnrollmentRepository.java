package com.devsuperior.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearn.entities.Enrollment;
import com.devsuperior.dslearn.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK>{

}
