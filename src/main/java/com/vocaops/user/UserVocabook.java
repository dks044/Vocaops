package com.vocaops.user;

import com.vocaops.vocabook.VocaBook;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UserVocaBook {
    @ManyToOne
    private SiteUser user;

    @ManyToOne
    private VocaBook vocabook;

    private boolean isCleared;
    
}