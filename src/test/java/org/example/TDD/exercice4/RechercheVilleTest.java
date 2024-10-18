package org.example.TDD.exercice4;

import org.example.TDD.exercice4.RechercheVille;
import org.example.TDD.exercice4.exception.NotFoundException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class RechercheVilleTest {

    @Test
    public void testSearchLessTwoCharactersThrowsException() {
        RechercheVille rechercheVille = new RechercheVille();
        Assert.assertThrows(NotFoundException.class, () -> {
            rechercheVille.rechercher("A");
        });
    }

    @Test
    public void testSearchEqualOrMoreTwoCharactersReturnCity() {
        RechercheVille rechercheVille = new RechercheVille();
        List<String> result = rechercheVille.rechercher("Va");
        Assertions.assertEquals(List.of("Valence", "Vancouver"), result);
    }

    @Test
    public void testSearchCaseInsensitive() {
        RechercheVille rechercheVille = new RechercheVille();
        List<String> result = rechercheVille.rechercher("va");
        Assertions.assertEquals(List.of("Valence", "Vancouver"), result);
    }

    @Test
    public void testSearchWithSubstringReturnsCity() {
        RechercheVille rechercheVille = new RechercheVille();
        List<String> result = rechercheVille.rechercher("dap");
        Assertions.assertEquals(List.of("Budapest"), result);
    }

    @Test
    public void testSearchWithAsteriskReturnsAllCities() {
        RechercheVille rechercheVille = new RechercheVille();
        List<String> result = rechercheVille.rechercher("*");
        List<String> expected = List.of(
                "Paris", "Marseille", "Lille", "Nice", "Nantes", "Toulouse", "Valence", "Vancouver", "Budapest"
        );
        Assertions.assertEquals(expected, result);
    }



}


