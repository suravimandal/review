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

	/*@GetMapping("/reviews")
	@ResponseStatus(HttpStatus.OK)
	public List<ReviewDTO> findAll() {
		return reviewService.findAll();
	}*/

	@GetMapping("/reviews/{productId}")
	@ResponseStatus(HttpStatus.OK)
	public ReviewDTO getByProductId(@PathVariable Long productId) {
		return reviewService.getByProductId(productId);
	}

	@GetMapping("/reviews/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ReviewDTO getById(@PathVariable Long id) {
		return reviewService.getById(id);
	}

	@GetMapping("/reviews/{customerId}")
	@ResponseStatus(HttpStatus.OK)
	public ReviewDTO getByCustomerId(@PathVariable Long customerId) {
		return reviewService.getByCustomerId(customerId);
	}

	/*@PostMapping("/orders/{transactionId}/reviews")
	@ResponseStatus(HttpStatus.CREATED)
	public Long create(@RequestBody ReviewDTO reviewDTO) {
		return reviewService.create(reviewDTO);
	}*/

	@PostMapping("/orders/{customerId}/{productId}/reviews")
	@ResponseStatus(HttpStatus.CREATED)
	public Long create(@RequestBody ReviewDTO reviewDTO) {
		return reviewService.create(reviewDTO);
	}

	@PutMapping("/orders/{customerId}/reviews/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody ReviewDTO reviewDTO) {
		reviewService.update(reviewDTO);
	}

	/*@PutMapping("/orders/{productId}/reviews/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody ReviewDTO reviewDTO) {
		reviewService.update(reviewDTO);
	}

	@PutMapping("/orders/{transactionId}/reviews/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody ReviewDTO reviewDTO) {
		reviewService.update(reviewDTO);
	}

	@DeleteMapping(value = "/users/{userId}/reviews/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long userId, @PathVariable("id") Long id) {
		reviewService.deleteByUserIdAndId(userId, id);
	}*/

	@DeleteMapping(value = "/orders/{customerId}/reviews/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long customerId, @PathVariable("id") Long id) {
		reviewService.deleteByCustomerIdAndId(customerId, id);
	}
	

	
}
