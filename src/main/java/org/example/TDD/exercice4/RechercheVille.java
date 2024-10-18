package org.example.TDD.exercice4;

import org.example.TDD.exercice4.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {
    private List<String> cities = List.of(
            "Paris", "Marseille", "Lille", "Nice", "Nantes", "Toulouse", "Valence", "Vancouver", "Budapest"
    );

    public List<String> rechercher(String search) {
        if (search == null || (!search.equals("*") && search.length() < 2)) {
            throw new NotFoundException("la recherche doit contenir au moins 2 caractères");
        }

        if (search.equals("*")) {
            return new ArrayList<>(cities);
        }

        List<String> results = new ArrayList<>();

        for (String city : cities) {
            if (city.toLowerCase().contains(search.toLowerCase())) {
                results.add(city);
            }
        }

        return results;
    }
}
