package com.example.internJavaProject2.ConvertToString;

import com.example.internJavaProject2.InterfaceClass.ConvertToString2;
import org.springframework.stereotype.Service;

@Service
public class convertStringToString implements ConvertToString2 {
    @Override
    public String convertToString(String string) {
        return string;
    }
}
