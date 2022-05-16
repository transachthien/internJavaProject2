package com.example.internJavaProject2.Adapter;

import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToBase64;
import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToByte;
import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToHex;
import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToString;
import com.example.internJavaProject2.InterfaceClass.EncodeDecodeStringToDataType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Slf4j
public class ChangeDataType {

    @Qualifier("encodeDecodeStringToBase64")
    @Autowired
    private EncodeDecodeStringToDataType stringTypeConvert;
    @Qualifier("encodeDecodeStringToBase64")
    @Autowired
    private EncodeDecodeStringToDataType typeWantConvert;
    private String typeConvert;
    private String wantConvert;
    private static String[] listConvertType = {"base64", "hex", "byte", "string"};


    // chuyen them get set private
    public EncodeDecodeStringToDataType init(String typeConvert) {
        switch (typeConvert) {
            case "base64" -> {
                return new EncodeDecodeStringToBase64();
            }
            case "hex" -> {
                return new EncodeDecodeStringToHex();
            }
            case "byte" -> {
                return new EncodeDecodeStringToByte();
            }
            case "string" -> {
                return new EncodeDecodeStringToString();
            }
        }

        return null;
    }

    public static String[] getListConvertType() {
        return listConvertType;
    }

    public ChangeDataType(String typeConvert, String wantConvert) {
        this.typeConvert = typeConvert;
        this.wantConvert = wantConvert;
    }

    public EncodeDecodeStringToDataType getStringTypeConvert() {
        return init(this.typeConvert);
    }

    public EncodeDecodeStringToDataType getTypeWantConvert() {
        init(this.wantConvert);
        return init(this.wantConvert);
    }

    public void setTypeConvert(String typeConvert) {
        this.typeConvert = typeConvert;
    }

    public void setWantConvert(String wantConvert) {
        this.wantConvert = wantConvert;
    }
}
