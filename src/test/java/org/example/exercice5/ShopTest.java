package org.example.exercice5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopTest {

    @Test
    public void testQualityDecreasesByOneBeforeSellInDate() {
        Product product = new Product("normal", "Produit normal", 10, 20);
        Shop shop = new Shop();
        shop.update(product);
        Assertions.assertEquals(9, product.getSellIn());
        Assertions.assertEquals(19, product.getQuality());
    }

    @Test
    public void testQualityDecreasesTwiceAsFastAfterSellInDate() {
        Product product = new Product("normal", "Produit normal", 0, 20);
        Shop shop = new Shop();
        shop.update(product);
        Assertions.assertEquals(-1, product.getSellIn());
        Assertions.assertEquals(18, product.getQuality());
    }

    @Test
    public void testQualityNeverNegative() {
        Product product = new Product("normal", "Produit normal", 10, 0);
        Shop shop = new Shop();
        shop.update(product);
        Assertions.assertEquals(9, product.getSellIn());
        Assertions.assertEquals(0, product.getQuality());
    }

    @Test
    public void testBrieAgingIncreasesQuality() {
        Product product = new Product("brie", "Brie vieilli", 10, 30);
        Shop shop = new Shop();
        shop.update(product);
        Assertions.assertEquals(9, product.getSellIn());
        Assertions.assertEquals(31, product.getQuality());
    }

    @Test
    public void testBrieQualityNeverExceedsFifty() {
        Product product = new Product("brie", "Brie vieilli", 10, 50);
        Shop shop = new Shop();
        shop.update(product);
        Assertions.assertEquals(9, product.getSellIn());
        Assertions.assertEquals(50, product.getQuality());
    }

    @Test
    public void testDairyProductsDegradeTwiceAsFast() {
        Product product = new Product("Produit laitier", "Produit laitier", 10, 20);
        Shop shop = new Shop();
        shop.update(product);
        Assertions.assertEquals(9, product.getSellIn());
        Assertions.assertEquals(18, product.getQuality());
    }

    @Test
    public void testQualityDecreasesTwiceAsFastAfterSellInForDairyProducts() {
        Product product = new Product("Produit laitier", "Produit laitier", 0, 20);
        Shop shop = new Shop();
        shop.update(product);
        Assertions.assertEquals(-1, product.getSellIn());
        Assertions.assertEquals(16, product.getQuality());
    }
}
