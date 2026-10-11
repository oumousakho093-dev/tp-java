package fr.b1;

import com.google.gson.Gson;
import java.util.List;

public class Calcul {

    public static double moyenne(List<Double> notes) {
        if (notes == null || notes.isEmpty()) {
            throw new IllegalArgumentException("La liste est vide");
        }

        double somme = 0;
        for (double note : notes) {
            somme += note;
        }

        return somme / notes.size();
    }

    public static void main(String[] args) {
        List<Double> notes = List.of();
        System.out.println("Notes : " + new Gson().toJson(notes));
        System.out.println("Moyenne : " + moyenne(notes));
    }
}
