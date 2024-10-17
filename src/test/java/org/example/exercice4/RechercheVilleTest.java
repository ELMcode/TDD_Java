package org.example.exercice4;

import org.example.exercice4.exception.NotFoundException;
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


}


