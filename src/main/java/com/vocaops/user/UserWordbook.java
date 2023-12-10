package com.vocaops.user;

import com.vocaops.vocabook.Vocabook;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UserWordbook {
    @ManyToOne
    private SiteUser user;

    @ManyToOne
    private Vocabook vocabook;

    private boolean isCleared;
    // ... 기타 필드와 메소드 ...
}