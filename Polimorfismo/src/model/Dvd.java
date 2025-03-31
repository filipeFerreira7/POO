package model;

import java.util.Scanner;

public class Dvd extends Midia {
    private int nFaixas;

    public Dvd() {

    }

    public Dvd(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
       nFaixas = (nFaixas > 0) ? nFaixas : 0;
    }


    public String getTipo(){
        return "DVD";
    }

    public String getDetalhes(){
        return super.getDetalhes() + "\n" + "Numero de faixas: " + nFaixas + "\n";
    }




    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Informe o n de faixas: ");
        int faixas = sc.nextInt();

        setnFaixas(faixas);

    }
    public void print(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Preco: " + getPreco());
        System.out.println("Nome: " + getNome());
    }
}
