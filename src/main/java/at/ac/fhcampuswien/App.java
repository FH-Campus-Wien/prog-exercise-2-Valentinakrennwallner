package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        System.out.print("Number 1: ");
        Scanner scan = new Scanner(System.in);
        float Number = scan.nextFloat(), biggestnumb = 0;
        int count = 1;
        while (Number > 0) {
            count++;
            if (Number > biggestnumb) {
                biggestnumb = Number;
            }
            System.out.print("Number " + count + ": ");
            Number = scan.nextFloat();
        }
        if (biggestnumb <= 0) {
            System.out.println("No number entered.");
        } else {
            System.out.printf("The largest number is %.2f", biggestnumb);
            System.out.println();
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = 1, y = 1;
        if (n > 0) {
            for (int zeile = n; zeile > 0; zeile--) {
                for (int count = 0; count < y; count++) {
                    System.out.print(x + " ");
                    x++;
                }
                System.out.println();
                y++;
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        final int reihen = 6;
        int x = 1, zeilenabstand = 1, anzahl = 1, reset = 0;
        while (x <= reihen) {
            for (int sternchen = 1; sternchen <= anzahl; sternchen++) {
                for (int leerzeichen = 1; leerzeichen <= reihen - zeilenabstand; leerzeichen++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                zeilenabstand = reihen;
            }
            x++;
            reset++;
            zeilenabstand = 1 + reset;
            anzahl = anzahl + 2;
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("h: ");
        System.out.print("c: ");
        int h= scan.nextInt();
        char alphabet= scan.next().charAt(0);

        if( h % 2 == 0){
            System.out.println("Invalid number!"); return;
        }
        int i,d,e;
        for ( i = 0; i < (h/ 2) +1; i++){ //the bigger triangle

            for(d = 0; d < (h-1) / 2-i; d++){
                System.out.print(" ");
            }
            for (d= i; d > 0; d--) {
                System.out.print((char)(alphabet - d));
            }
            System.out.print(alphabet);

            for (e= 1; e <= i ; e++) {
                System.out.print((char)(alphabet - e));
            }
            System.out.println();
        }
        for(i= (h/2) -1; i >= 0; i--){

            for(d = 0; d < (h-1) / 2-i ; d++){
                System.out.print(" ");
            }
            for (d= i; d > 0 ; d--) {
                System.out.print((char)(alphabet - d));
            }
            System.out.print(alphabet);

            for (e= 1; e <= i; e++) {
                System.out.print((char)(alphabet - e));
            }
            System.out.println();
        }
    }


    //todo Task 5
    public void marks() {
        // input your solution here
        System.out.print("Mark 1: ");
        Scanner scan = new Scanner(System.in);
        int negative = 0, anzahl = 1, zaehler = 0, mark = scan.nextInt();
        float notendurchschnitt = 0, notensumme = 0;
        while (mark != 0) {
            if (mark < 0 || mark > 5) {
                System.out.println("Invalid mark!");
            } else {
                if (mark == 5) {
                    negative++;
                }
                anzahl++;
                zaehler++;
                notensumme = mark + notensumme;              //note1+note2+note3
            }
            System.out.print("Mark " + anzahl + ": ");
            mark = scan.nextInt();
        }
        if (zaehler != 0) {
            notendurchschnitt = notensumme / zaehler;
        }
        System.out.printf("Average: %.2f", notendurchschnitt);
        System.out.println();
        System.out.println("Negative marks: " + negative);

    }

    //todo Task 6
    public int happyNumbers() {
        // input your solution here
        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int Summe = 0;

        while (n > 0) {
            if (n != 1 && n != 4) {
                int hunderter = (n / 100);
                int zehner = (n / 10) % 10;
                int einer = n % 10;

                Summe = (einer * einer + zehner * zehner + hunderter * hunderter);
                n = Summe;
            }
            if (n == 4) {
                System.out.println("Sad number!");
                break;
            } else if (n == 1) {
                System.out.println("Happy number!");
                break;
            }
        }
        return n;
    }

        public static void main(String[] args){
            App exercise2 = new App();

            System.out.println("Task 1: Largest Number");
            exercise2.largestNumber();

            System.out.println("\nTask 2: Stairs");
            exercise2.stairs();

            System.out.println("\nTask 3: Pyramide");
            exercise2.printPyramid();

            System.out.println("\nTask 4: Raute");
            exercise2.printRhombus();

            System.out.println("\nTask 5: Notendurchschnitt");
            exercise2.marks();

            System.out.println("\nTask 6: Fröhliche Zahlen");
            exercise2.happyNumbers();


        }
    }