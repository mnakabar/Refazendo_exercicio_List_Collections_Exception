package com.company;

import java.time.LocalDate;
import java.util.List;

public class TesteStatico {

    public static void main(String[] args){

        ClienteService service1 = new ClienteService();

        service1.dicionar(new Cliente("Paulo", LocalDate.parse("1980-05-23")));
        service1.dicionar(new Cliente("Joana", LocalDate.parse("1989-08-04")));
        service1.dicionar(new Cliente("Maria", LocalDate.parse("1991-12-09")));

        ClienteService service2 = new ClienteService();
        List<Cliente> listagem = service2.listagem();

        for (Cliente cliente : listagem){
            System.out.println(cliente.getNome());
        }
        System.out.println("Programa finalizado");


    }


}
