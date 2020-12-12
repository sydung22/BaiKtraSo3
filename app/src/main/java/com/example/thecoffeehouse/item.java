package com.example.thecoffeehouse;

public class item {
    String title207,text207,bt207;
    Integer image207;

    public item(String title, String text, String bt, Integer image) {
        this.title207 = title;
        this.text207 = text;
        this.image207 = image;
        this.bt207=bt;
    }

    public String getTitle() {
        return title207;
    }

    public void setTitle(String title) {
        this.title207 = title;
    }

    public String getText() {
        return text207;
    }

    public void setText(String text) {
        this.text207 = text;
    }

    public String getBt() {
        return bt207;
    }

    public void setBt(String bt) {
        this.bt207 = bt;
    }

    public Integer getImage() {
        return image207;
    }

    public void setImage(Integer image) {
        this.image207 = image;
    }
}
