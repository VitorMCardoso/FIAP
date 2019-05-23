package com.br.fiap.javaplat.exercise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
	@GeneratedValue
	private Long id;
	private String firstName;
    private String lastName;
    
    public Customer(String f, String l){
        this.firstName=f;
        this.lastName=l;
    }

    
}