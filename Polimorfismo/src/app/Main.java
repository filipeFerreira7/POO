package app;

import model.Cd;
import model.Dvd;
import model.Midia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Midia[] midias = new Midia[10];

        int option;

        for(int i = 0; i < 2; i++){
            System.out.println("Digite 1 para CD e 2 para DVD");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            if(option == 1)
                midias[i] = new Cd();
            else
            midias[i] = new Dvd();
            midias[i].inserirDados();
        }

        for(int i = 0; i < 2; i++){
            midias[i].print();
        }
    }
}
