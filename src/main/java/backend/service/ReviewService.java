package backend.service;

import java.util.List;

import backend.dto.ReviewDTO;


public interface ReviewService {

	public Long create(ReviewDTO reviewDTO);

	public void update(ReviewDTO reviewDTO);

	public ReviewDTO getById(Long id);
	public ReviewDTO getByProductId(Long productId);
	public ReviewDTO getByCustomerId(Long customerId);

	/*public List<ReviewDTO> findAll();*/

	public void deleteByCustomerIdAndId(Long customerId, Long id);
}
