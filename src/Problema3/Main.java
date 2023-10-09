package Problema3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        System.out.println("Introduceti textul: ");
        text= new StringBuilder(read.nextLine());
        System.out.println("Introduceti pozitia: ");
        int poz = read.nextInt();
        System.out.println("Introduceti numarul de caractere: ");
        int nrcar= read.nextInt();
        if(poz >= text.length())
        {
            System.out.println("Textul are lungimea "+text.length()+". Introduceti pozitia: ");
            poz=read.nextInt();
        }
        if((poz+nrcar) >= text.length())
        {
            System.out.println("Textul are lungimea "+text.length()+". Introduceti numarul de caractere: ");
            nrcar=read.nextInt();
        }
        System.out.println("Textul initial: "+text.toString());
        text.delete(poz,poz+nrcar);
        System.out.println("Textul final: "+text.toString());

    }
}
