package com.example.internJavaProject2.ConvertToString;

import com.example.internJavaProject2.InterfaceClass.ConvertToString2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.HexFormat;
@Slf4j
@Service
public class convertHexToString implements ConvertToString2 {
    @Override
    public String convertToString(String string) {
        byte[] bytes;
        try {
            bytes = HexFormat.of().parseHex(string);
            return new String(bytes, StandardCharsets.UTF_8);
        }
        catch(Exception e) {
            log.error("can't convert wrong format Hex to String");
        }
        return null;
    }
}