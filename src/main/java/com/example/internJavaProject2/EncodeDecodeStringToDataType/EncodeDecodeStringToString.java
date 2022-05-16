package com.example.internJavaProject2.EncodeDecodeStringToDataType;
import com.example.internJavaProject2.InterfaceClass.EncodeDecodeStringToDataType;
import org.springframework.stereotype.Component;

@Component
public class EncodeDecodeStringToString implements EncodeDecodeStringToDataType {
    @Override
    public String encodeToString(String string) {
        return string;
    }

    @Override
    public String decodeToDataType(String string){
        return string;
    }
}
