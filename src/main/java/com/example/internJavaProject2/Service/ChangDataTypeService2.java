package com.example.internJavaProject2.Service;

import com.example.internJavaProject2.Adapter.ChangeDataType;
import org.springframework.stereotype.Component;

@Component
public class ChangDataTypeService2 {
    private final ChangeDataType changeDataType;

    public ChangDataTypeService2(ChangeDataType changeDataType) {
        this.changeDataType = changeDataType;
    }
    public String encodeData(String text){
        try {
             return changeDataType.stringTypeConvert.encodeToString(text);
        }catch (Exception e){
            return e.getMessage();
        }
    }
    public String decodeData(String text){
        try {
            return changeDataType.stringTypeConvert.decodeToDataType(text);
        }catch (Exception e){
            return e.getMessage();
        }
    }


}
