package fr.eni.Ludotheque.bo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@Entity
@Table(name="COPIES")
public class Copy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer no_copy;
	
	@Column(nullable = false, length = 20)
	@NonNull private Integer reference;
	
	@Column(nullable = false)
	@NonNull private Boolean isRentable;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Game game;
}
