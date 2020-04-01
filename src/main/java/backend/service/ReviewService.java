package backend.service;

import java.util.List;

import backend.dto.ReviewDTO;


public interface ReviewService {

	public Long create(ReviewDTO reviewDTO);

	public void update(ReviewDTO reviewDTO);

	public ReviewDTO getById(Long userId);

	public List<ReviewDTO> findAll();

	public void deleteById(Long id);
}
