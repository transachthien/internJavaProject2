package com.example.internJavaProject2.Entity;

import java.io.UnsupportedEncodingException;

public interface ConvertStringToDataType {
    String stringToByte(String string) throws UnsupportedEncodingException;
    String stringToHex(String string) throws UnsupportedEncodingException;
    String stringToBase64(String string) throws UnsupportedEncodingException;
}
