package org.example.exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public void update(Product product) {
        product.setSellIn(product.getSellIn() - 1);

        if (product.getType().equals("brie")) {
            product.setQuality(Math.min(50, product.getQuality() + 1));
        } else if (product.getType().equals("Produit laitier")) {
            if (product.getSellIn() < 0) {
                product.setQuality(Math.max(0, product.getQuality() - 4));
            } else {
                product.setQuality(Math.max(0, product.getQuality() - 2));
            }
        } else {
            if (product.getSellIn() < 0) {
                product.setQuality(Math.max(0, product.getQuality() - 2));
            } else {
                product.setQuality(Math.max(0, product.getQuality() - 1));
            }
        }
    }
}
