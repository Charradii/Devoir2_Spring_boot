package com.melek.mag.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ecrivain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEcrivain;
    private String name;
    private String email;

    
    @OneToMany(mappedBy = "ecrivain")
    @JsonIgnore
    private List<article> articles;


	public void setIdEcrivain(long l) {
        this.idEcrivain = l;
	}  
}