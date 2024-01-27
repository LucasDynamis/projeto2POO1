package com.mycompany.projetoav2.newpackage;

import java.util.Scanner;

public class Carro extends Transportes{
    private int volumeMala;
    public Motor motor = new Motor();
      
    @Override
    public void frear() {
        System.out.println("Carro freando.");
    }
    @Override
    public void virarDireita() {
        System.out.println("Carro virando à direita.");
    }
    @Override
    public void virarEsquerda() {
        System.out.println("Carro virando à esquerda.");
    }
    @Override
    public void acelerar(){
        int temp = this.motor.getRpm();
        if (temp+100 > this.motor.getRpmMaximo()){
            System.out.println("\nLimite de velocidade.");
            this.motor.setRpm(this.motor.getRpmMaximo());
        } else {
           temp = temp+100;
            System.out.println("\nRotações aumentando: " + temp );
            this.motor.setRpm(temp);
        }
    }
    @Override
    public void desacelerar(){
        int temp = this.motor.getRpm();
        if (temp-100 <= 0){
           System.out.println("\nVeículo parado.");
           this.motor.setRpm(0);
        } else {
            temp = temp-100;
            System.out.println("\nRotações diminuindo: " + temp );
            this.motor.setRpm(temp);
        }
    }
     
    public int getVolumeMala() {
        return volumeMala;
    }
    public void setVolumeMala(int volumeMala) {
        this.volumeMala = volumeMala;
    }
 
    public void cadastrar(String pl, String prop, String ma, int nump, double pre, String maMot, String tipoC, int rpm, int rpmMax, int volumeMala){
        super.cadastrar( pl, prop, ma, nump, pre);
        this.motor.cadastrar(maMot,  tipoC, rpm, rpmMax);
        this.setVolumeMala(volumeMala);
    }
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        this.motor.entradaDados();
        System.out.println("Volume da mala     :");
        setVolumeMala(Integer.parseInt(sc.nextLine()));
    }
    @Override
    public void imprimir(){
        super.imprimir();
        this.motor.imprimir();
        System.out.println("Volume da mala     :" + getVolumeMala());
    }
    //metodos construtores
    public Carro(){
        super();
    }
    
    public Carro(String pl, String prop, String ma, int nump, double pre, String maMot, String tipoC, int rpm, int rpmMax, int volumeMala){
        super( pl, prop, ma, nump, pre);
        this.motor.setRpm(rpm);
        this.motor.setRpmMaximo(rpmMax);
        this.motor.setMarcaMotor(maMot);
        this.motor.setTipoCombustivel(tipoC);
        this.volumeMala = volumeMala; 
    }
    public Carro(int volumeMala) {
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, String placa, String proprietario, String marca, int numeroPassageiros, double preco) {
        super(placa, proprietario, marca, numeroPassageiros, preco);
        this.volumeMala = volumeMala;
    }

    public Carro(String marca) {
        super(marca);
    }

    public Carro(String marca, int numeroPassageiros) {
        super(marca, numeroPassageiros);
    }

    public Carro(double preco) {
        super(preco);
    }

    public Carro(String marca, int numeroPassageiros, double preco) {
        super(marca, numeroPassageiros, preco);
    }

    public Carro(String marca, double preco) {
        super(marca, preco);
    }

    public Carro(int volumeMala, int numeroPassageiros) {
        super(numeroPassageiros);
        this.volumeMala = volumeMala;
    }
}
    
    
    
    
    
