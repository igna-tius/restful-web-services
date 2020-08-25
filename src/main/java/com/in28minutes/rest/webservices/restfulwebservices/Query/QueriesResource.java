package com.in28minutes.rest.webservices.restfulwebservices.Query;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.webservices.restfulwebservices.Query.Query;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QueriesResource {
	
	@Autowired
	private QueryHardCodedService queryService;
	
	@GetMapping("/users/{username}/queries")
	public List<Query> getAllQueries(@PathVariable String username){
		return queryService.findByUsername(username);
		
	}
	
	@GetMapping("/users/{username}/queries/{id}")
	public Query getQuery(@PathVariable String username,@PathVariable long id){
		return queryService.findById(id);
		
	}
	
	@PutMapping("/users/{username}/queries/{id}")
	public ResponseEntity<Query>  updateQuery(@PathVariable String username,@PathVariable long id,@RequestBody Query query){
		Query queryUpdated = queryService.save(query);
		return new ResponseEntity<Query>(query,HttpStatus.OK);
	}
	
	@PostMapping("/users/{username}/queries")
	public ResponseEntity<Query>  updateQuery(@PathVariable String username,@RequestBody Query query){
		
		Query queryCreated = queryService.save(query);
		
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(queryCreated.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	
	
	@DeleteMapping("/users/{username}/queries/{id}")
	public ResponseEntity<Void> deleteQuery(@PathVariable String username,@PathVariable long id ){
		Query deletedQuery= queryService.deleteById(id);
		if(deletedQuery!=null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}

}
