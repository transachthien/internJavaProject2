package com.example.internJavaProject2.Entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

@Service
@Slf4j
public class ConvertStringToDataTypeImpl implements ConvertStringToDataType {
    @Override
    public String stringToByte(String string) throws UnsupportedEncodingException {
        byte[] byteArray = string.getBytes(StandardCharsets.UTF_8.name());
        StringBuilder result = new StringBuilder();
        log.info(Arrays.toString(byteArray));
        for( byte x :byteArray){
            result.append(x).append(" ");
        }
        return result.toString();
    }

    @Override
    public String stringToHex(String string) throws UnsupportedEncodingException {
        byte[] myBytes = string.getBytes(StandardCharsets.UTF_8.name());
        return DatatypeConverter.printHexBinary(myBytes);
    }

    @Override
    public String stringToBase64(String string) throws UnsupportedEncodingException {
        Base64.Encoder enc = Base64.getEncoder();
        return enc.encodeToString(string.getBytes(StandardCharsets.UTF_8.name()));
    }
}
