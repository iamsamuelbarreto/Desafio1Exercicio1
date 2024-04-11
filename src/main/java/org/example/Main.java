package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Esse programa mostra se o numero é positivo, negativo ou neutro");
        Double numero = Double.valueOf(JOptionPane.showInputDialog(null, "Digite qual é o numero:"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null,"Esse numero é positivo"); }

        else if (numero < 0) {
            JOptionPane.showMessageDialog(null,"Esse numero é negativo"); }

        else {
            JOptionPane.showMessageDialog(null,"Esse numero é neutro"); }
    }
}