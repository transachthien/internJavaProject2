package com.example.internJavaProject2.Service;

import com.example.internJavaProject2.Adapter.ChangeDataType;
import org.springframework.stereotype.Component;

@Component
public class ChangDataTypeService2 {


    public String changeData(String text,String stringTypeConvert, String typeWantConvert){
        ChangeDataType encodeStringTypeConvert = new ChangeDataType();
        encodeStringTypeConvert.init(stringTypeConvert);
        ChangeDataType decodeTypeWantConvert = new ChangeDataType();
        decodeTypeWantConvert.init(typeWantConvert);

        try {
             text = encodeStringTypeConvert.stringTypeConvert.encodeToString(text);
        }catch (Exception e){
            return e.getMessage();
        }
        try {
            return decodeTypeWantConvert.stringTypeConvert.decodeToDataType(text);
        }catch (Exception e){
            return e.getMessage();
        }
    }

}
