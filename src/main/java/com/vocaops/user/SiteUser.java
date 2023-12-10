package com.vocaops.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SiteUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String password;
	
	private String name;
	
	private String phoneNumber;
	
	private String email;
	
    @Column(unique = true)
    private String phone_number; //폰번호
    
    @Enumerated(EnumType.STRING)
    private UserRole role; //권한
    
    private long rating;
}
