package com.example.internJavaProject2.EncodeDecodeStringToDataType;

import com.example.internJavaProject2.InterfaceClass.EncodeDecodeStringToDataType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
@Slf4j
@Service
public class EncodeDecodeStringToBase64 implements EncodeDecodeStringToDataType {
    @Override
    public String encodeToString(String string) {
        Base64.Decoder dec = Base64.getDecoder();
        try{
            return new String(dec.decode(string));
        }catch (Exception e){
            log.error("can't convert wrong format Base64 to String");
        }
        return null;
    }

    @Override
    public String decodeToDataType(String string) throws UnsupportedEncodingException {
        Base64.Encoder enc = Base64.getEncoder();
        return enc.encodeToString(string.getBytes(StandardCharsets.UTF_8.name()));
    }
}
