package esprit.fgsc.congesmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import esprit.fgsc.congesmicroservice.entities.Conges;
import esprit.fgsc.congesmicroservice.services.CongesService;



@CrossOrigin(origins = "*")
@RestController
public class CongesController {
	
	@Autowired
	private  CongesService congesService;

	@PostMapping("/add/{employeId}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Conges> createConge(@PathVariable String employeId) {
		return new ResponseEntity<>(congesService.addConges(employeId), HttpStatus.OK);
	}
	
}
