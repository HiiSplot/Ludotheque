package fr.eni.Ludotheque.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_address;

	@Column(nullable = false, length = 10)
	@NonNull private Integer no_address;

	@Column(nullable = false, length = 50)
	@NonNull private String rue;
	
	@Column(nullable = false, length = 5)
	@NonNull private Integer code_postal;
	
	@Column(nullable = false, length = 20)
	@NonNull private String ville;
	
}
