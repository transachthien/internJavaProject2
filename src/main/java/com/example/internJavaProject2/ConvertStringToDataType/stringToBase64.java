package com.example.internJavaProject2.ConvertStringToDataType;

import com.example.internJavaProject2.InterfaceClass.ConvertStringToDataType2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
@Service
public class stringToBase64 implements ConvertStringToDataType2 {
    @Override
    public String stringToDatType(String string) throws UnsupportedEncodingException {
        Base64.Encoder enc = Base64.getEncoder();
        return enc.encodeToString(string.getBytes(StandardCharsets.UTF_8.name()));
    }
}
