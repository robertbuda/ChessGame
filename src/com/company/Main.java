package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Queen queen = new Queen();
        Position testPosition = new Position(3, 1);
        if (queen.isValidMove(testPosition)) {
            System.out.println("Yes, I can move there!");
        } else {
            System.out.println("No, it's impossible!");
        }

    }
}
