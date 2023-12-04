package org.example;

import org.example.Repository.CompteRepository;

public class Main {
    public static void main(String[] args) {
        CompteRepository c = new CompteRepository();
        System.out.println(c.selectAllComptes());
        System.out.println("Hello world!");
    }
}