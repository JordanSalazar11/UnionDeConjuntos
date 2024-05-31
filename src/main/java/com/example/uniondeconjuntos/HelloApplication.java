package com.example.uniondeconjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionDeConjuntos {
    public static void main(String[] args) {

        // Arrays
        String[] setA = {"2","4","10","11","12"};
        String[] setB = {"30","2","4","55","80","Hola","Chao"};
        String[] setC = {"2","33","55","Hola"};
        String[] setU = {};

        // Sets
        Set<String> mySetA = new HashSet<>(Arrays.asList(setA));
        Set<String> mySetB = new HashSet<>(Arrays.asList(setB));
        Set<String> mySetC = new HashSet<>(Arrays.asList(setC));
        Set<String> mySetU = new HashSet<>(Arrays.asList(setU));

        // New Sets for Difference
        Set<String> newSet = new HashSet<>(mySetU);


    }


}