package com.example.internJavaProject2.ConvertToString;

import com.example.internJavaProject2.InterfaceClass.ConvertToString2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Base64;
@Slf4j
@Service
public class convertBase64ToString implements ConvertToString2 {
    @Override
    public String convertToString(String string) {
        Base64.Decoder dec = Base64.getDecoder();
        try{
            return new String(dec.decode(string));
        }catch (Exception e){
            log.error("can't convert wrong format Base64 to String");
        }
        return null;
    }
}
