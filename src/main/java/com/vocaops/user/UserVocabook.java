package com.vocaops.user;

import com.vocaops.vocabook.Vocabook;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UserVocabook {
    @ManyToOne
    private SiteUser user;

    @ManyToOne
    private Vocabook vocabook;

    private boolean isCleared;
    
}