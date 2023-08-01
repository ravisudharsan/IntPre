package net.codejava.product;

import java.net.URI;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeApi {

	@Autowired private EmployeeRepository repo;
	
	@PostMapping
	@RolesAllowed("ROLE_ADMIN")
	public ResponseEntity<Employee> create(@RequestBody @Valid Employee product) {
		Employee savedProduct = repo.save(product);
		URI productURI = URI.create("/employees/" + savedProduct.getId());
		return ResponseEntity.created(productURI).body(savedProduct);
	}
	
	@GetMapping
	@RolesAllowed({"ROLE_HR", "JR"})
	public List<Employee> list() {
		return repo.findAll();
	}
}
