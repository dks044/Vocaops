package com.vocaops.vocabook;

import java.util.List;

import com.vocaops.voca.Voca;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class VocaBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//ex) 토익보카,고등보카
	private String name;
	
	@OneToMany(mappedBy = "vocabook")
	private List<Voca> vocas;
	
}
