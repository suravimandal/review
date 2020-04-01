package backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backend.dto.ReviewDTO;
import backend.service.ReviewService;

@RestController
public class ReviewController{

	@Autowired
	private ReviewService reviewService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ReviewDTO> findAll() {
		return reviewService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ReviewDTO getById(@PathVariable Long id) {
		return reviewService.getById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Long create(@RequestBody ReviewDTO reviewDTO) {
		return reviewService.create(reviewDTO);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody ReviewDTO reviewDTO) {
		reviewService.update(reviewDTO);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		reviewService.deleteById(id);
	}
	

	
}
