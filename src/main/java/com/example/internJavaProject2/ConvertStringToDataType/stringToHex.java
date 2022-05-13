package com.example.internJavaProject2.ConvertStringToDataType;

import com.example.internJavaProject2.InterfaceClass.ConvertStringToDataType2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
@Service
public class stringToHex implements ConvertStringToDataType2 {
    @Override
    public String stringToDatType(String string) throws UnsupportedEncodingException {
        byte[] myBytes = string.getBytes(StandardCharsets.UTF_8.name());
        return DatatypeConverter.printHexBinary(myBytes);
    }
}
