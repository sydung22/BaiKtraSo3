package com.example.thecoffeehouse;

public class orderItem {
    String title207,price207;
    Integer image207;

    public orderItem(String title, String price, Integer image) {
        this.title207 = title;
        this.price207 = price;
        this.image207 = image;
    }

    public String getTitle() {
        return title207;
    }

    public void setTitle(String title) {
        this.title207 = title;
    }

    public String getPrice() {
        return price207;
    }

    public void setPrice(String price) {
        this.price207 = price;
    }

    public Integer getImage() {
        return image207;
    }

    public void setImage(Integer image) {
        this.image207 = image;
    }
}
