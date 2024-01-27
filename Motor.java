package com.mycompany.projetoav2.newpackage;

import java.util.Scanner;


public class Motor {
    private String marcaMotor, tipoCombustivel;
    private int rpm, rpmMaximo;

//metodos construtores

    public Motor() {
    }

    public Motor(String marca, String tipoCombustivel, int rpm, int rpmMaximo) {
        this.marcaMotor = marca;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }

    public Motor(String marca, String tipoCombustivel) {
        this.marcaMotor = marca;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Motor(int rpm, int rpmMaximo) {
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }

    public Motor(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    
    
//metodos get e set
    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marca) {
        this.marcaMotor = marca;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getRpmMaximo() {
        return rpmMaximo;
    }

    public void setRpmMaximo(int rpmMaximo) {
        this.rpmMaximo = rpmMaximo;
    }
    public void cadastrar(String ma, String tipoC, int rpm, int rpmMax){
        setMarcaMotor(ma);
        setTipoCombustivel(tipoC);
        setRpm(rpm);
        setRpmMaximo(rpmMax);
    }
    public void entradaDados(){
         Scanner ent = new Scanner(System.in);
         System.out.println("Marca  :");
         setMarcaMotor(ent.nextLine());
         System.out.println("Combustivel  :");
         setTipoCombustivel(ent.nextLine());
         System.out.println("rpm  :");
         setRpm(Integer.parseInt(ent.nextLine()));
         System.out.println("rpm maximo  :");
         setRpmMaximo(Integer.parseInt(ent.nextLine()));
    }
    public void imprimir(){
       System.out.println("Marca:" + getMarcaMotor());
       System.out.println("Tipo do combustivel:" + getTipoCombustivel());
       System.out.println("rpm:" + getRpm()); 
       System.out.println("rpm maximo:" + getRpmMaximo()); 
    }
    }
    
            
    

    

