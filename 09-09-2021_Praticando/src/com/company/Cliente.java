package com.company;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private LocalDate localDate;

    public Cliente(String nome,LocalDate localDate){
        this.nome = nome;
        this.localDate =  localDate;
    }
    public String getNome(){
        return nome;
    }
    public LocalDate getLocalDate(){
        return localDate;
    }
}

