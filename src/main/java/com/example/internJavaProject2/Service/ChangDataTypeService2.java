package com.example.internJavaProject2.Service;

import com.example.internJavaProject2.Adapter.ChangeDataType;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Service
public class ChangDataTypeService2 {
    // bị lặp lại ChangeDataType gọi cả 2 kiểu
    public String changeData(String text, String stringTypeConvert, String typeWantConvert) {

        ChangeDataType encodeStringTypeConvert = new ChangeDataType(stringTypeConvert, typeWantConvert);
        if (Arrays.asList(encodeStringTypeConvert.getListConvertType()).contains(stringTypeConvert) == false
                || Arrays.asList(encodeStringTypeConvert.getListConvertType()).contains(typeWantConvert) ==false) {
            return "Type not support";

        }

        try {
            text = encodeStringTypeConvert.getStringTypeConvert().encodeToString(text);
        } catch (Exception e) {
            return e.getMessage();
        }
        try {
            return encodeStringTypeConvert.getTypeWantConvert().decodeToDataType(text);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public String decode(String value) throws UnsupportedEncodingException {
        return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
    }

}
