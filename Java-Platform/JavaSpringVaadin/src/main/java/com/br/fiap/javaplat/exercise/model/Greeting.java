package com.br.fiap.javaplat.exercise.model;

import java.io.Serializable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonDeserialize
@NoArgsConstructor
public class Greeting implements Serializable{

    private static final long serialVersionUID = 1L;
    private long id;
    private String content;
    
}