package com.mycompany.projetoav2;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import com.mycompany.projetoav2.newpackage.Carro;
import com.mycompany.projetoav2.newpackage.Moto;
import com.mycompany.projetoav2.newpackage.Onibus;

public class MenuDesconto {
    static Map<String, Carro> DicionarioCarro = new Hashtable<>();
    static Map<String, Onibus> DicionarioOnibus = new Hashtable<>();
    static Map<String, Moto> DicionarioMoto = new Hashtable<>();
    
    public void menuCarro() {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do 
        {
            System.out.println("Escolha um filtro do meio de transporte");
            System.out.println("1 - Carro qualquer.");
            System.out.println("2 - Carro especificado.");
            System.out.println("3 - Carro pelo volume da mala.");
            System.out.println("4 - Carro pela marca.");
            System.out.println("5 - Carro pela marca e total de passageiros.");
            System.out.println("0 - Voltar.");
            System.out.print("\n>>>>>>>>>> ");
            
            op = Integer.parseInt(sc.nextLine());
            switch(op) {
                case 1 -> {
                    Carro carro = new Carro();
                    System.out.println("Tipo do carro: ");
                    String nome = sc.nextLine().trim();
                    DicionarioCarro.put(nome,carro);
                }
                case 2 -> {
                    Carro carro = new Carro("","","",0,0.0,"","",0,0,0);
                    System.out.println("Tipo do carro:");
                    String nome = sc.nextLine().trim();
                    carro.entradaDados();
                    DicionarioCarro.put(nome,carro);
                }
                case 3 -> {
                    Carro carro = new Carro(0);
                    System.out.println("Tipo do carro: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Volume da Mala               :");
                    carro.setVolumeMala(Integer.parseInt(sc.nextLine())); 
                    DicionarioCarro.put(nome,carro);
                }
                case 4 -> {
                    Carro carro = new Carro("");
                    System.out.println("Tipo do carro: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Marca              :");
                    carro.setMarca(sc.nextLine());
                    DicionarioCarro.put(nome,carro);
                }
                case 5 -> {
                    Carro carro = new Carro("",0);
                    System.out.println("Tipo do carro: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Marca             :");
                    carro.setMarca(sc.nextLine());
                    System.out.println("Número de passageiros               :");
                    carro.setNumeroPassageiros(Integer.parseInt(sc.nextLine())); 
                    DicionarioCarro.put(nome, carro);
                }

                case 0 -> menuPrincipal();
                default -> {
                }
            }
        }
        while(op != -1);
    
    }
    
    public void menuMoto() {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do 
        {
            System.out.println("Escolha um filtro do meio de transporte");
            System.out.println("1 - Moto qualquer.");
            System.out.println("2 - Moto especificado.");
            System.out.println("3 - Moto pelo volume do bagageiro.");
            System.out.println("4 - Moto pela marca.");
            System.out.println("5 - Moto pela marca e total de passageiros.");
            System.out.println("0 - Voltar.");
            System.out.print("\n>>>>>>>>>> ");
            
            op = Integer.parseInt(sc.nextLine());
            switch(op) {
                case 1 -> {
                    Moto moto = new Moto();
                    System.out.println("Tipo de moto: ");
                    String nome = sc.nextLine().trim();
                    DicionarioMoto.put(nome, moto);
                }
                case 2 -> {
                    Moto moto = new Moto("","","",0,0.0,"","",0,0,0);
                    System.out.println("Tipo de moto:");
                    String nome = sc.nextLine().trim();
                    moto.entradaDados();
                    DicionarioMoto.put(nome,moto);
                }
                case 3 -> {
                    Moto moto = new Moto(0);
                    System.out.println("Tipo de moto: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Volume do bagageiro    :");
                    moto.setVolumeBagageiro(Integer.parseInt(sc.nextLine())); 
                    DicionarioMoto.put(nome, moto);
                }
                case 4 -> {
                    Moto moto = new Moto("");
                    System.out.println("Tipo de moto: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Marca              :");
                    moto.setMarca(sc.nextLine());
                    DicionarioMoto.put(nome,moto);
                }
                case 5 -> {
                    Moto moto = new Moto("",0);
                    System.out.println("Tipo de moto: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Marca             :");
                    moto.setMarca(sc.nextLine());
                    System.out.println("Número de passageiros               :");
                    moto.setNumeroPassageiros(Integer.parseInt(sc.nextLine())); 
                    DicionarioMoto.put(nome, moto);
                }
                case 0 -> menuPrincipal();
                default -> {
                }
            }
        }
        while(op != -1);
    
    }
    
    public void menuOnibus() {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do 
        {
            System.out.println("Escolha um filtro do meio de transporte");
            System.out.println("1 - Onibus qualquer.");
            System.out.println("2 - Onibus especificado.");
            System.out.println("3 - Onibus pela marca.");
            System.out.println("4 - Onibus pelo número de passageiros.");
            System.out.println("5 - Onibus pelo motorista e total de passageiros.");
            System.out.println("0 - Voltar.");
            System.out.print("\n>>>>>>>>>> ");
            
            op = Integer.parseInt(sc.nextLine());
            switch(op) {
                case 1 -> {
                    Onibus onibus = new Onibus();
                    System.out.println("Escolha um nome para o Onibus: ");
                    String nome = sc.nextLine().trim();
                    DicionarioOnibus.put(nome,onibus);
                }
                case 2 -> {
                    Onibus onibus = new Onibus("","","",0,0.0,"","",0,0,"");
                    System.out.println("Tipo de onibus:");
                    String nome = sc.nextLine().trim();
                    onibus.entradaDados();
                    DicionarioOnibus.put(nome,onibus);
                }
                case 3 -> {
                    Onibus onibus = new Onibus("");
                    System.out.println("Tipo de Onibus: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Marca               :");
                    onibus.setMarca(sc.nextLine()); 
                    DicionarioOnibus.put(nome,onibus);
                }
                case 4 -> {
                    Onibus onibus = new Onibus(0);
                    System.out.println("Tipo de Onibus: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Número de passageiros               :");
                    onibus.setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
                    DicionarioOnibus.put(nome,onibus);
                }
                case 5 -> {
                    Onibus onibus = new Onibus("",0);
                    System.out.println("Tipo de Onibus: ");
                    String nome = sc.nextLine().trim();
                    System.out.println("Motorista            :");
                    onibus.setMotorista(sc.nextLine());
                    System.out.println("Número de passageiros               :");
                    onibus.setNumeroPassageiros(Integer.parseInt(sc.nextLine())); 
                    DicionarioOnibus.put(nome, onibus);
                }
                case 0 -> menuPrincipal();
                default -> {
                }
            }
        }
        while(op != -1);
    
    }
    
    public void TransporteImprimir(String transporte){
        double desconto = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Antes de imprimir escolha um valor para o desconto de: ");
        System.out.print(transporte);
        System.out.print("\nSelecione desconto entre 5% e 70%?>> ");
        double temp = Double.parseDouble(sc.nextLine());
            if(temp <= 5 || temp >= 70){
                System.out.println("\nSem desconto\n");
            } else {
                System.out.println("Descontando.");
                desconto = (100-temp)/100;
            }
        Moto moto = DicionarioMoto.get(transporte);
        Onibus onibus = DicionarioOnibus.get(transporte);
        Carro carro = DicionarioCarro.get(transporte);
        if(onibus != null){
            onibus.imprimir();
            System.out.println("O valor do Onibus com desconto é: R$" + onibus.getPreco()*desconto);
        }       
        if(moto != null){
            moto.imprimir();
            System.out.println("O valor da Moto com desconto é: R$" + moto.getPreco()*desconto);                 
        }       
        if(carro != null){
            carro.imprimir();
            System.out.println("O valor do Carro com desconto é: R$" + carro.getPreco()*desconto);
        }
        menuImprimir(transporte);
    }
    
    public void menuImprimir(String transporte){
        Scanner sc = new Scanner(System.in);
        System.out.print(transporte);
        System.out.println("1 - Informações do transporte.");
        System.out.println("2 - Acelerar.");
        System.out.println("3 - Desasecelar.");
        System.out.println("4 - Excluir.");
        System.out.println("0 - Escolher outro transporte.");
        System.out.print("\n>>>>>>>> ");
        
        int op = Integer.parseInt(sc.nextLine());
            switch(op) {
                case 1 ->{
                    TransporteImprimir(transporte);
                }
                case 2 -> {
                    Onibus onibus = DicionarioOnibus.get(transporte);
                    Moto moto = DicionarioMoto.get(transporte);
                    Carro carro = DicionarioCarro.get(transporte);
                    if(onibus != null) {
                        onibus.acelerar();
                    }
                    if (carro != null) {
                        carro.acelerar();
                    } else {
                        moto.acelerar();
                    }
                }
                case 3 -> {
                    Onibus onibus = DicionarioOnibus.get(transporte);
                    Moto moto = DicionarioMoto.get(transporte);
                    Carro carro = DicionarioCarro.get(transporte);
                    if(onibus != null) {
                        onibus.desacelerar();
                    }
                    if (carro != null) {
                        carro.desacelerar();
                    } else {
                        moto.desacelerar();
                    }
                }
                
                case 4 -> {
                    Onibus onibus = DicionarioOnibus.get(transporte);
                    Moto moto = DicionarioMoto.get(transporte);
                    Carro carro = DicionarioCarro.get(transporte);
                    if(onibus != null) {
                        DicionarioOnibus.remove(transporte);
                    }
                    if (carro != null) {
                        DicionarioCarro.remove(transporte);
                    } else {
                        DicionarioMoto.remove(transporte);
                    }
                }
                
                case 0 -> {
                    menuDisplay();
                }
                    
            }      
    }
    
    public void menuDisplay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Meios de Transporte disponíveis:");
        DicionarioCarro.keySet().forEach((k) -> System.out.print(k + " | "));
        DicionarioMoto.keySet().forEach((k) -> System.out.print(k + " | "));
        DicionarioOnibus.keySet().forEach((k) -> System.out.print(k + " | "));
        System.out.println("\b");
        System.out.println("\nDigite o tipo de meio de transporte: ");
        String transporte = sc.nextLine().trim();
            if (transporte.length() == 0){
                menuPrincipal();
            } else {
                menuImprimir(transporte);
            }
    }

    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int op;
    
        do 
        {
            
            System.out.println("Escolha uma opção>>>>>");
            System.out.println("1 - Carro.");
            System.out.println("2 - Moto.");
            System.out.println("3 - Onibus.");
            System.out.println("4 - Meios de Transporte.");
            System.out.println("0 - Sair.");
            System.out.print("\n>>>>>>> ");
            
            op = Integer.parseInt(sc.nextLine());
            switch(op) {
                case 1 -> menuCarro();
                case 2 -> menuMoto();
                case 3 -> menuOnibus();
                case 4 -> menuDisplay();
                case 0 -> System.exit(0);
                default -> {
                }
            }
        }
        while(op != 0);
    }

    
}
