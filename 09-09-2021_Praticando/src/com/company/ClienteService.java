package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    List<Cliente> clientes = new ArrayList<>();

    public void dicionar(Cliente cliente) throws ClienteExistenteException,MenorIdadeException{
        if (clienteCadastrado(cliente)){
            throw new ClienteExistenteException("Este cliente já está cadastrado");
        }
        if (!maiorIdade(cliente)){
            throw new MenorIdadeException("Cliente é menor de idade, não está autorozado seu cadastro");

        }

    }
    public boolean clienteCadastrado(Cliente cliente){
        return clientes.contains(cliente);
    }
    public boolean maiorIdade(Cliente cliente){
        long qtosAnos = ChronoUnit.YEARS.between(cliente.getLocalDate(), LocalDate.now());
        return (qtosAnos>= 18);
    }
    public List<Cliente> listagem(){
        return  clientes;
    }


}
