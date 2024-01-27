package com.mycompany.projetoav2.newpackage;

import java.util.Scanner;


public abstract class Transportes  {
    private String placa, proprietario, marca;
    private int numeroPassageiros;
    private final int tempoMaxUso = 30, idadeMinimaMotorista = 18;
    private double preco;
    
//metodos construtores
    
    public Transportes(){
        
    }

    public Transportes(String placa, String proprietario, String marca, int numeroPassageiros, double preco) {
        this.placa = placa;
        this.proprietario = proprietario;
        this.marca = marca;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }


    public Transportes(String marca) {
        this.marca = marca;
    }

    public Transportes(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Transportes(double preco) {
        this.preco = preco;
    }

    public Transportes(String marca, int numeroPassageiros) {
        this.marca = marca;
        this.numeroPassageiros = numeroPassageiros;
    }

    public Transportes(String marca, int numeroPassageiros, double preco) {
        this.marca = marca;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public Transportes(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    abstract void frear();
    abstract void virarDireita();
    abstract void virarEsquerda();
    abstract void acelerar();
    abstract void desacelerar();


    public void cadastrar(String pl, String prop, String ma, int nump, double pre) {
        setPlaca(pl);
        setProprietario(prop);
        setMarca(ma);
        setNumeroPassageiros(nump);
        setPreco(pre);
    
    }

  
    public void imprimir() {
        System.out.println("Placa:" + getPlaca());
        System.out.println("Proprietário:" + getProprietario());
        System.out.println("Marca:" + getMarca());
        System.out.println("Número de Passageiros:" + getNumeroPassageiros());
        System.out.println("Preço:" + getPreco());
    }
    
    public void entradaDados() {
    Scanner ent = new Scanner(System.in);
        System.out.println("Placa   :");
        setPlaca(ent.nextLine());
        System.out.println("Proprietário   :");
        setProprietario(ent.nextLine());
        System.out.println("Marca   :");
        setMarca(ent.nextLine());
        System.out.println("Número de Passageiros   :");
        setNumeroPassageiros(Integer.parseInt(ent.nextLine()));
        System.out.println("Preço   :");
        setPreco(Double.parseDouble(ent.nextLine()));  
        
    }

}
    
        
    
       
    

        
        
    
    
    

