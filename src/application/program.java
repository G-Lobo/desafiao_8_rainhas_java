package application;

import entities.Solver;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho do tabuleiro (n X n)? ");
        System.out.print("n = ");
        int size = sc.nextInt();


        Solver solver = new Solver(size);
        solver.solve();
        solver.printSolutions();
    }
}
