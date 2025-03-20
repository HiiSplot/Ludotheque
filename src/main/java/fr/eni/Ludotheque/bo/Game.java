package fr.eni.Ludotheque.bo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
@Table(name="GAMES")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_game;
	
	@Column(nullable = false, length = 50)
	@NonNull private String title;
	
	@Column(nullable = false, length = 50)
	@NonNull private String reference;

	@Column(nullable = false, length = 3)
	@NonNull private Integer age_min;
	
	@Column(nullable = false, length = 250)
	@NonNull private String description;
	
	@Column(nullable = false, length = 4)
	@NonNull private Integer duration;
	
	@Column(nullable = false, length = 50)
	@NonNull private Float day_rate;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="GameGenre",
						joinColumns= {@JoinColumn(name="id_game")},
						inverseJoinColumns= {@JoinColumn(name="id_genre")})
	@NonNull List<Genre> genre;
}
