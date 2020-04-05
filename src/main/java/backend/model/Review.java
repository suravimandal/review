package backend.model;

import java.time.ZonedDateTime;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "reviews")
@NoArgsConstructor
public class Review implements Serializable{
	
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Integer starRating;
    private String remarks;
    

    @Column(name="created_by")
    private String createdBy;

    @Column(name="created_dt")
    private ZonedDateTime createdDate;

    @Column(name="last_updated_by")
    private String lastUpdatedBy;

    @Column(name="last_updated_dt")
    private ZonedDateTime lastUpdatedDate;

    @PrePersist
    private void prePersist() {
        if (createdDate == null) {
            createdDate = ZonedDateTime.now();
        }
        if (lastUpdatedDate == null) {
            lastUpdatedDate = ZonedDateTime.now();
        }
    }

    @PreUpdate
    public void preUpdate() {
        if (lastUpdatedDate == null) {
            lastUpdatedDate = ZonedDateTime.now();
        }
    }


    public Long getId() {
        return id;
    }
}
