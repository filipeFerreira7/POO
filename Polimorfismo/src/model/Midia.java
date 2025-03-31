package model;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    //getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo(){
        return "Midia: " + getNome();
    }

    public String getDetalhes(){
        return "Codigo: "+ getCodigo() + "\n" +
                "Nome: "+ getNome() +
                "Preco: "+ getPreco() + "\n" ;
    }

    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o codigo da Midia: ");
        int cod = sc.nextInt();
        System.out.println("Informe o nome da Midia: ");
        String nome = sc.next();
        System.out.println("Informe o preço da Midia: ");
        String preco = sc.next();


        setCodigo(cod);
        setNome(nome);
        setPreco(Double.parseDouble(preco));

    }
    public void print(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Preco: " + preco);
        System.out.println("Nome: " + nome);
    }

    @Override
    public String toString() {
        return "Midia{" +
                "codigo=" + codigo +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
