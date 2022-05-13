package com.example.internJavaProject2.ConvertStringToDataType;

import com.example.internJavaProject2.InterfaceClass.ConvertStringToDataType2;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

@Service
public class stringToByte implements ConvertStringToDataType2 {
    @Override
    public String stringToDatType(String string) throws UnsupportedEncodingException {
        byte[] byteArray = string.getBytes(StandardCharsets.UTF_8.name());
        StringBuilder result = new StringBuilder();
        for( byte x :byteArray){
            result.append(x).append(" ");
        }
        return result.toString();
    }
}
