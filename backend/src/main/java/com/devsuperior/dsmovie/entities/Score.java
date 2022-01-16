package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	//chave composta para java
	private ScorePK id = new ScorePK();
	
	private Double value;

	public Score() {
		
	}
	
	//serve para associar um filme a um score
	public void setMovie(Movie movie) {
		
		id.setMovie(movie);
		
	}
	
	public void setUser(User user) {
		
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
