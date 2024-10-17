package org.example.exercice4;

import org.example.exercice4.exception.NotFoundException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class RechercheVilleTest {

    @Test
    public void testSearchLessTwoCharactersThrowsException() {
        RechercheVille rechercheVille = new RechercheVille();
        Assert.assertThrows(NotFoundException.class, () -> {
            rechercheVille.rechercher("A");
        });
    }
}

