package com.example.tree;


import java.util.Scanner;

public class Tree {

    public static void main(String[] args) {
        char tree = '*';
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write tree lvl: ");
        int level = scanner.nextInt();

        for (int i = 0; i < level; i++) {
            for (int n = 0; n < level * 2; n++) {
                if (n < (level - i) || n > (level + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(tree);
                }
            }
            System.out.println();
        }
    }
}