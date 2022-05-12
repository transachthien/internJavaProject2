package com.example.internJavaProject2.Service;
import com.example.internJavaProject2.Entity.ConvertStringToDataType;
import com.example.internJavaProject2.Entity.ConvertToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
@Slf4j
public class ChangeDataTypeService {
    @Autowired
    public ConvertToString convertToString;
    @Autowired
    public ConvertStringToDataType convertStringToDataType;
    public String changedata(String text,String StringTypeConvert, String TypeWantConvert) throws UnsupportedEncodingException {
        String stringToConvert;
        String result;
        if(StringTypeConvert.equals(TypeWantConvert)){
            log.error("error to convert same Type");
            return null;
        }
        switch (StringTypeConvert) {
            case "base64" -> stringToConvert = convertToString.convertBase64ToString(text);
            case "string" -> stringToConvert = text;
            case "hex" -> stringToConvert = convertToString.convertHexToString(text);
            case "byte" -> stringToConvert = convertToString.convertByteToString(text);
            default -> {
                log.error("error convert diff Type support");
                return null;
            }
        }

        switch (TypeWantConvert) {
            case "base64" -> result = convertStringToDataType.stringToBase64(stringToConvert);
            case "string" -> result = stringToConvert;
            case "hex" -> result = convertStringToDataType.stringToHex(stringToConvert);
            case "byte" -> result = convertStringToDataType.stringToByte(stringToConvert);
            default -> {
                log.error("error to convert diff Type support");
                return null;
            }
        }
        return result;
    }

}
