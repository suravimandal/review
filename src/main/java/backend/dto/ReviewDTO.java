package backend.dto;

import java.time.ZonedDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO {
       private Long id;
       private Long productId;
       /*private Long transactionId;*/
       private Long customerId;
       private Integer starRating;
       private String remarks;
       private String createdBy;
       private ZonedDateTime createdDate;
       private String lastUpdatedBy;
       private ZonedDateTime lastUpdatedDate;

}
