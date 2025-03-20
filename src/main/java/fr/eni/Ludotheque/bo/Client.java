package fr.eni.Ludotheque.bo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="CLIENTS")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer no_client;
	@Column(nullable = false, length = 50)
	@NonNull private String lastname;
	@Column(nullable = false, length = 50)
	@NonNull private String firstname;
	@Column(nullable = false, length = 50)
	@NonNull private String email;
	@Column(nullable = false, length = 10)
	@NonNull private Integer no_tel;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@NonNull private Address address;

}
