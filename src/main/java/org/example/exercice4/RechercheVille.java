package org.example.exercice4;

import org.example.exercice4.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {
    private List<String> cities = List.of(
            "Paris", "Marseille", "Lille", "Nice", "Nantes", "Toulouse", "Valence", "Vancouver", "Budapest"
    );

    public List<String> rechercher(String search) {
        if (search == null || search.length() < 2) {
            throw new NotFoundException("la recherche doit contenir au moins 2 caractères");
        }

        List<String> results = new ArrayList<>();

        for (String cities : cities) {
            if (cities.toLowerCase().contains(search.toLowerCase())) {
                results.add(cities);
            }
        }

        return results;
    }
}
