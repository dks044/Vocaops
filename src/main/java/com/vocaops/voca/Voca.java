package com.vocaops.voca;

import com.vocaops.vocabook.Vocabook;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Voca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// TODO:korQuestion ,engQuestion 중 랜덤으로 
	
	//ex) Q: 사과 - A: 구글번역기 API를 사용한 사용자의 입력값 번역이 맞아 떨어질경우
	//TODO: KOR문제일 경우 영어 포함안되게 해야함.
	private String korWord;
	
	//ex) Q: apple - A: 구글번역기 API를 사용한 사용자의 입력값 번역이 맞아 떨어질경우
	//TODO: ENG문제일 경우 한국어 포함안되게 해야함.
	private String engWord;

	//ex: 채용, 법률
	private String category;
}
