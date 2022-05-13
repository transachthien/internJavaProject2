package com.example.internJavaProject2.Adapter;
import com.example.internJavaProject2.ConvertStringToDataType.stringToBase64;
import com.example.internJavaProject2.ConvertStringToDataType.stringToByte;
import com.example.internJavaProject2.ConvertStringToDataType.stringToHex;
import com.example.internJavaProject2.ConvertStringToDataType.stringToString;
import com.example.internJavaProject2.ConvertToString.convertBase64ToString;
import com.example.internJavaProject2.ConvertToString.convertByteToString;
import com.example.internJavaProject2.ConvertToString.convertHexToString;
import com.example.internJavaProject2.ConvertToString.convertStringToString;
import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToBase64;
import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToByte;
import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToHex;
import com.example.internJavaProject2.EncodeDecodeStringToDataType.EncodeDecodeStringToString;
import com.example.internJavaProject2.InterfaceClass.ConvertStringToDataType2;
import com.example.internJavaProject2.InterfaceClass.ConvertToString2;
import com.example.internJavaProject2.InterfaceClass.EncodeDecodeStringToDataType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class ChangeDataType {
    @Qualifier("encodeDecodeStringToBase64")
    @Autowired
    public
    EncodeDecodeStringToDataType stringTypeConvert;
    @Qualifier("encodeDecodeStringToBase64")
    @Autowired
    public
    EncodeDecodeStringToDataType typeWantConvert;
    public void init(String stringTypeConvert, String typeWantConvert){
        switch (stringTypeConvert) {
            case "base64" -> this.stringTypeConvert = new EncodeDecodeStringToBase64();
            case "hex" -> this.stringTypeConvert = new EncodeDecodeStringToHex();
            case "byte" -> this.stringTypeConvert = new EncodeDecodeStringToByte();
            case "string" -> this.stringTypeConvert = new EncodeDecodeStringToString();
        }
        switch (typeWantConvert) {
            case "base64" -> this.typeWantConvert = new EncodeDecodeStringToBase64();
            case "hex" -> this.typeWantConvert = new EncodeDecodeStringToHex();
            case "byte" -> this.typeWantConvert = new EncodeDecodeStringToByte();
            case "string" -> this.typeWantConvert = new EncodeDecodeStringToString();
        }

    }


}
