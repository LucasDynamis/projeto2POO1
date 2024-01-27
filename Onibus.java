package com.mycompany.projetoav2.newpackage;

import java.util.Scanner;


public class Onibus extends Transportes {

    private String motorista;
    public Motor motor = new Motor();
      
    @Override
    public void frear() {
        System.out.println("Onibus freando.");
    }
    @Override
    public void virarDireita() {
        System.out.println("Onibus virando à direita.");
    }
    @Override
    public void virarEsquerda() {
        System.out.println("Onibus virando à esquerda.");
    }
    @Override
    public void acelerar(){
        int temp = this.motor.getRpm();
        if (temp+50 > this.motor.getRpmMaximo()){
            System.out.println("\nLimite de velocidade.");
            this.motor.setRpm(this.motor.getRpmMaximo());
        } else {
           temp = temp+50;
            System.out.println("\nRotações aumentando: " + temp );
            this.motor.setRpm(temp);
        }
    }
    @Override
    public void desacelerar(){
        int temp = this.motor.getRpm();
        if (temp-50 <= 0){
           System.out.println("\nVeículo parado.");
           this.motor.setRpm(0);
        } else {
            temp = temp-50;
            System.out.println("\nRotações diminuindo: " + temp );
            this.motor.setRpm(temp);
        }
    }
     
    public String getMotorista() {
        return motorista;
    }
    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }
    public void cadastrar(String pl, String prop, String ma, int nump, double pre, String maMot, String tipoC, int rpm, int rpmMax, String motorista){
        super.cadastrar( pl, prop, ma, nump, pre);
        this.motor.cadastrar(maMot,  tipoC, rpm, rpmMax);
        this.motorista = motorista;
}
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        this.motor.entradaDados();
        System.out.println("Motorista      :");
        setMotorista(sc.nextLine());


}
    @Override
    public void imprimir(){
        super.imprimir();
        this.motor.imprimir();
        System.out.println("Motorista       :" + getMotorista());
    }
    
//metodos construtores

    public Onibus() {
    }

    public Onibus(String placa, String proprietario, String marca, int numeroPassageiros, double preco) {
        super(placa, proprietario, marca, numeroPassageiros, preco);
    }

    public Onibus(String motorista, String placa, String proprietario, String marca, int numeroPassageiros, double preco) {
        super(placa, proprietario, marca, numeroPassageiros, preco);
        this.motorista = motorista;
    }

    public Onibus(String marca) {
        super(marca);
    }

    public Onibus(int numeroPassageiros) {
        super(numeroPassageiros);
    }

    public Onibus(String motorista, int numeroPassageiros) {
        super(numeroPassageiros);
        this.motorista = motorista;
    }

    public Onibus(String pl, String prop, String ma, int nump, double pre, String maMot, String tipoC, int rpm, int rpmMax, String motorista){
        super( pl, prop, ma, nump, pre);
        this.motor.setRpm(rpm);
        this.motor.setRpmMaximo(rpmMax);
        this.motor.setMarcaMotor(maMot);
        this.motor.setTipoCombustivel(tipoC);
        this.motorista = motorista; 
    }

    public Onibus(String marca, int numeroPassageiros, double preco) {
        super(marca, numeroPassageiros, preco);
    }

    public Onibus(String marca, double preco) {
        super(marca, preco);
    }
    
    

}