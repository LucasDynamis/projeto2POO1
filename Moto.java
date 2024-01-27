package com.mycompany.projetoav2.newpackage;

import java.util.Scanner;


public class Moto extends Transportes {
     private int volumeBagageiro;
    public Motor motor = new Motor();
      
    @Override
    public void frear() {
        System.out.println("Moto freando.");
    }
    @Override
    public void virarDireita() {
        System.out.println("Moto virando à direita.");
    }
    @Override
    public void virarEsquerda() {
        System.out.println("Moto virando à esquerda.");
    }
    @Override
    public void acelerar(){
        int temp = this.motor.getRpm();
        if (temp+200 > this.motor.getRpmMaximo()){
            System.out.println("\n Limite de velocidade.");
            this.motor.setRpm(this.motor.getRpmMaximo());
        } else {
           temp = temp+200;
            System.out.println("\n Rotações aumentando: " + temp );
            this.motor.setRpm(temp);
        }
    }
    @Override
    public void desacelerar(){
        int temp = this.motor.getRpm();
        if (temp-200 <= 0){
           System.out.println("\nVeículo parado.");
           this.motor.setRpm(0);
        } else {
            temp = temp-200;
            System.out.println("\n Rotações diminuindo : " + temp );
            this.motor.setRpm(temp);
        }
    }
     
    public int getVolumeBagageiro() {
        return volumeBagageiro;
    }
    public void setVolumeBagageiro(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }
    
    public void cadastrar(String pl, String prop, String ma, int nump, double pre, String maMot, String tipoC, int rpm, int rpmMax, int volumeBagageiro){
        super.cadastrar( pl, prop, ma, nump, pre);
        this.motor.cadastrar(maMot,  tipoC, rpm, rpmMax);
        this.setVolumeBagageiro(volumeBagageiro);
    
}
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        this.motor.entradaDados();
        System.out.println("Volume do Bagageiro    :");
        setVolumeBagageiro(Integer.parseInt(sc.nextLine()));
}
    @Override
    public void imprimir(){
        super.imprimir();
        this.motor.imprimir();
        System.out.println("Volume do Bagageiro    :" + getVolumeBagageiro());
    }
//metodos construtores
    public Moto() {
    }

    public Moto(String placa, String proprietario, String marca, int numeroPassageiros, double preco) {
        super(placa, proprietario, marca, numeroPassageiros, preco);
    }

    public Moto(int volumeBagageiro, String placa, String proprietario, String marca, int numeroPassageiros, double preco) {
        super(placa, proprietario, marca, numeroPassageiros, preco);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(String marca) {
        super(marca);
    }

    public Moto(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, int numeroPassageiros) {
        super(numeroPassageiros);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(String pl, String prop, String ma, int nump, double pre, String maMot, String tipoC, int rpm, int rpmMax, int volumeBagageiro){
        super( pl, prop, ma, nump, pre);
        this.motor.setRpm(rpm);
        this.motor.setRpmMaximo(rpmMax);
        this.motor.setMarcaMotor(maMot);
        this.motor.setTipoCombustivel(tipoC);
        this.volumeBagageiro = volumeBagageiro; 
    }

    public Moto(String marca, int numeroPassageiros) {
        super(marca, numeroPassageiros);
    }

    public Moto(String marca, int numeroPassageiros, double preco) {
        super(marca, numeroPassageiros, preco);
    }

    public Moto(String marca, double preco) {
        super(marca, preco);
    }
    
}
