package model;

import java.util.Scanner;

public class Cd extends Midia {
    private int nMusicas;

    public Cd() {

    }

    public Cd(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        nMusicas = (nMusicas > 0) ? nMusicas : 0;
    }


    public String getTipo(){
        return "CD";
    }

    public String getDetalhes(){
        return super.getDetalhes() + "\n" + "Numero de musicas: " + nMusicas + "\n";
    }




    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Informe o n de musicas: ");
        int musicas = sc.nextInt();

        setnMusicas(musicas);

    }
    public void print(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Preco: " + getPreco());
        System.out.println("Nome: " + getNome());
    }
}
