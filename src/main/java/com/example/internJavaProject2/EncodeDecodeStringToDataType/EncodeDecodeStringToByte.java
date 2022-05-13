package com.example.internJavaProject2.EncodeDecodeStringToDataType;

import com.example.internJavaProject2.InterfaceClass.EncodeDecodeStringToDataType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
@Slf4j
@Service
public class EncodeDecodeStringToByte implements EncodeDecodeStringToDataType {
    @Override
    public String encodeToString(String string) {
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

    @Override
    public String decodeToDataType(String string) throws UnsupportedEncodingException {
        byte[] byteArray = string.getBytes(StandardCharsets.UTF_8.name());
        StringBuilder result = new StringBuilder();
        for( byte x :byteArray){
            result.append(x).append(" ");
        }
        return result.toString();
    }
}
