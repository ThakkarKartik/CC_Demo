package com.example.sy_b1;

public class Product {

    String Name;
    int price;
    int productImage;

    public Product() {}
    public Product(String name, int price, int productImage) {
        Name = name;
        this.price = price;
        this.productImage = productImage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
