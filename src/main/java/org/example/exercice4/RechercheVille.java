package org.example.exercice4;

import org.example.exercice4.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {
    private List<String> villes = List.of(
            "Paris", "Marseille", "Lille", "Nice", "Nantes", "Toulouse"
    );

    public List<String> rechercher(String mot) {
        if (mot == null || mot.length() < 2) {
            throw new NotFoundException("la recherche doit contenir au moins 2 caractères");
        }
        return new ArrayList<>();
    }
}
