package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	ClienteService clienteService = new ClienteService();

	while (true){
        System.out.println("\n Informe  o nome do cliente: ");
        String nome = teclado.nextLine();
        System.out.println("\n Informe a data de nascimento do cliente:");
        String dataNascimento = teclado.nextLine();
        if (nome.equalsIgnoreCase("Sistema finalizado!!") || dataNascimento.equalsIgnoreCase("Sistema finalizado!!")){
        teclado.close();;
        System.exit(0);
        }
        try {
            Cliente cliente = new Cliente("nome", LocalDate.parse(dataNascimento));
            clienteService.dicionar(cliente);
            System.out.println("\n Cadastro realizado com sucesso!!\n");

        }catch (MenorIdadeException | ClienteExistenteException e){
            System.out.println(e.getMessage());
            continue;
        }

        }


    }


}
