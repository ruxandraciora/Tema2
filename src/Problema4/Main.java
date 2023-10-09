package Problema4;

import java.text.ParseException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner read = new Scanner(System.in);
        String nume = new String();
        String cnp = new String();
        System.out.println("Introduceti n: ");
        int n = read.nextInt();
        Persoana[] pers = new Persoana[n];
        int ok = 1;
        int[] nr_control = new int[]{2,7,9,1,4,6,3,5,8,2,7,9};
        int cifra_control = 0;

        for(int i=0;i<n;i++)
        {
            System.out.println("Introduceti numele: ");
            read.nextLine();
            nume = read.nextLine();
            System.out.println("Introduceti CNP-ul: ");
            cnp = read.nextLine();
            for(int j=0;j<cnp.length()-1;j++)
            {
                if(cnp.charAt(j) < 48 || cnp.charAt(j) > 57)
                    ok=0;
                cifra_control += (parseInt(String.valueOf(cnp.charAt(j))))* nr_control[j];
            }
            cifra_control = cifra_control % 11;
            if(cifra_control == 10)
                cifra_control = 1;
            while(cnp.length() > 13 || cnp.length() < 13 || ok == 0 || (cnp.charAt(0) != '1' &&
                    cnp.charAt(0) != '2' && cnp.charAt(0) != '5' && cnp.charAt(0) != '6'))
            {
                System.out.println("CNP invalid. Incercati din nou: ");
                cnp = read.nextLine();
                ok=1;
                cifra_control = 0;
                for(int j=0;j<cnp.length();j++)
                {
                    if(cnp.charAt(j) < 48 || cnp.charAt(j) > 57)
                        ok=0;
                }
                for(int j=0;j<cnp.length();j++)
                {
                    if(cnp.charAt(j) < 48 || cnp.charAt(j) > 57)
                        ok=0;
                    cifra_control += (parseInt(String.valueOf(cnp.charAt(j))))* nr_control[j];
                }
                cifra_control = cifra_control % 11;
                if(cifra_control == 10)
                    cifra_control = 1;
            }
            pers[i] = new Persoana(nume,cnp);
            pers[i].afisare();
        }
    }
}
