package com.example.internJavaProject2.Service;

import com.example.internJavaProject2.Adapter.ChangeDataType;
import org.springframework.stereotype.Component;

@Component
public class ChangDataTypeService2 {
    private final ChangeDataType changeDataType;

    public ChangDataTypeService2(ChangeDataType changeDataType) {
        this.changeDataType = changeDataType;
    }
    public String changeData(String text){
        try {
             text = changeDataType.stringTypeConvert.encodeToString(text);
        }catch (Exception e){
            return e.getMessage();
        }
        try {
            return changeDataType.typeWantConvert.decodeToDataType(text);
        }catch (Exception e){
            return e.getMessage();
        }

    }

}
