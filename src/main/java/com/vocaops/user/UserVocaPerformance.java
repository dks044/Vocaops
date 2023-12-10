package com.vocaops.user;

import java.time.LocalDateTime;

import com.vocaops.voca.Voca;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//SiteUser가 틀린 단어를 카운팅 받는 엔티티
@Entity
public class UserVocaPerformance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @ManyToOne
    private SiteUser user;

    @ManyToOne
    private Voca voca;

    private int wrongCount;
    private LocalDateTime lastAttempted;
    
}

