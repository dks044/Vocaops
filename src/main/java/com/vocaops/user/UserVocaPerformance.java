package com.vocaops.user;

import java.time.LocalDateTime;

import com.vocaops.voca.Voca;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UserVocaPerformance {
    @ManyToOne
    private SiteUser user;

    @ManyToOne
    private Voca voca;

    private int wrongCount;
    private LocalDateTime lastAttempted;
    
}

