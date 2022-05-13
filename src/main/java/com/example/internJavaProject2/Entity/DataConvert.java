package com.example.internJavaProject2.Entity;

public class DataConvert {
    private String text;
    private String stringTypeConvert;
    private String typeWantConvert;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStringTypeConvert() {
        return stringTypeConvert;
    }

    public void setStringTypeConvert(String stringTypeConvert) {
        this.stringTypeConvert = stringTypeConvert;
    }

    public String getTypeWantConvert() {
        return typeWantConvert;
    }

    public void setTypeWantConvert(String typeWantConvert) {
        this.typeWantConvert = typeWantConvert;
    }

    public DataConvert() {
    }

    public DataConvert(String text, String stringTypeConvert, String typeWantConvert) {
        this.text = text;
        this.stringTypeConvert = stringTypeConvert;
        this.typeWantConvert = typeWantConvert;
    }
}
