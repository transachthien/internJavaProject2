package com.example.internJavaProject2.ConvertToString;

import com.example.internJavaProject2.InterfaceClass.ConvertToString2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
@Slf4j
@Service
public class convertByteToString implements ConvertToString2 {
    @Override
    public String convertToString(String string) {
        String[] words = string.split("\\s+");
        byte[] bytes = new byte[words.length];
        for(int i =0; i< words.length;i++){
            try {
                bytes[i] = Byte.parseByte(words[i],10);
            }
            catch (Exception e){
                log.error(e.getMessage());
                return null;
            }
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
