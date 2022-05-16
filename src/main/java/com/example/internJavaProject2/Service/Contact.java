package com.example.internJavaProject2.Service;

public class Contact {
    private String stringTypeConvert;
    private String text;
    private String typeWantConvert;
    private String kq;

    public Contact() {
    }

    public String getStringTypeConvert() {
        return stringTypeConvert;
    }

    public void setStringTypeConvert(String stringTypeConvert) {
        this.stringTypeConvert = stringTypeConvert;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTypeWantConvert() {
        return typeWantConvert;
    }

    public void setTypeWantConvert(String typeWantConvert) {
        this.typeWantConvert = typeWantConvert;
    }

    public String getKq() {
        return kq;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }

    public Contact(String stringTypeConvert, String text, String typeWantConvert, String kq) {
        this.stringTypeConvert = stringTypeConvert;
        this.text = text;
        this.typeWantConvert = typeWantConvert;
        this.kq = kq;
    }

}
