package com.vocaops.user;

import com.vocaops.vocabook.VocaBook;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserVocaBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @ManyToOne
    private SiteUser user;

    @ManyToOne
    private VocaBook vocabook;

    private Boolean isCleared;
    
}