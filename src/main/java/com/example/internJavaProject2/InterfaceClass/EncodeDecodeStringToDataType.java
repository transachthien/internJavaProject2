package com.example.internJavaProject2.InterfaceClass;

import java.io.UnsupportedEncodingException;

public interface EncodeDecodeStringToDataType {
    String encodeToString(String string);
    String decodeToDataType(String string) throws UnsupportedEncodingException;
}
