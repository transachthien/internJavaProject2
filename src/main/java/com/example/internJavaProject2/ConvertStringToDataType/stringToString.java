package com.example.internJavaProject2.ConvertStringToDataType;

import com.example.internJavaProject2.InterfaceClass.ConvertStringToDataType2;
import org.springframework.stereotype.Service;

@Service
public class stringToString implements ConvertStringToDataType2 {
    @Override
    public String stringToDatType(String string) {
        return string;
    }
}
