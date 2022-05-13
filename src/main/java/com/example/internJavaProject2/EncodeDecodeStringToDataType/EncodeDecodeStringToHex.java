package com.example.internJavaProject2.EncodeDecodeStringToDataType;

import com.example.internJavaProject2.InterfaceClass.EncodeDecodeStringToDataType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HexFormat;
@Slf4j
@Service
public class EncodeDecodeStringToHex implements EncodeDecodeStringToDataType {
    @Override
    public String encodeToString(String string) {
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

    @Override
    public String decodeToDataType(String string) throws UnsupportedEncodingException {
        byte[] myBytes = string.getBytes(StandardCharsets.UTF_8.name());
        return DatatypeConverter.printHexBinary(myBytes);
    }
}
