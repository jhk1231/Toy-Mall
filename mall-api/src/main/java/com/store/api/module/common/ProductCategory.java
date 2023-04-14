package com.store.api.module.common;

public enum ProductCategory {
    IT("IT"),
    KIDS("KIDS")
    ;


    private String category;

    ProductCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
