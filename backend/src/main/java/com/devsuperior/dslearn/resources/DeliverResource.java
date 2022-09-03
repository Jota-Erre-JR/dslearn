package com.devsuperior.dslearn.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslearn.dto.DeliverRevisionDTO;
import com.devsuperior.dslearn.services.DeliverService;

@RestController
@RequestMapping(value = "/deliveries") /* resources route */
public class DeliverResource {
	
	@Autowired
	private DeliverService service;
	
	@PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> update(@PathVariable Long id, @Valid @RequestBody DeliverRevisionDTO dto) {
		service.saveRevision(id, dto);
		return ResponseEntity.noContent().build();
	}
}
