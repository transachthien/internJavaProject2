package com.example.internJavaProject2.Entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HexFormat;
@Service
@Slf4j
public class ConvertToStringImpl implements ConvertToString {
    @Override
    public String convertBase64ToString(String base64String) {
        Base64.Decoder dec = Base64.getDecoder();
        try{
            return new String(dec.decode(base64String));
        }catch (Exception e){
            log.error("can't convert wrong format Base64 to String");
        }
        return null;
    }

    @Override
    public String convertHexToString(String hexString) {
        byte[] bytes;
        try {
             bytes = HexFormat.of().parseHex(hexString);
            return new String(bytes, StandardCharsets.UTF_8);
        }
        catch(Exception e) {
            log.error("can't convert wrong format Hex to String");
        }
        return null;
    }

    @Override
    public String convertByteToString(String byteString) {
        String[] words = byteString.split("\\s+");
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
