package com.example.internJavaProject2.controller;

import com.example.internJavaProject2.Service.ChangeDataTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
@Slf4j
@RestController
@RequestMapping("/api")
public class ChangeDataTypeController {
    @Autowired
    private ChangeDataTypeService changeDataTypeService;
        @GetMapping("/changeData")
    public String changeData(@RequestParam("text") String text, @RequestParam("stringTypeConvert") String stringTypeConvert,@RequestParam("typeWantConvert") String typeWantConvert) throws UnsupportedEncodingException {
         text = text.replaceAll("\\s\\s+", " ").trim();

        if (stringTypeConvert.equals(typeWantConvert)){
            return "error to convert same Type";
        }
        if (text.length()==0||stringTypeConvert.length()==0||typeWantConvert.length()==0){
            return "Text not null or choose type to convert";
        }
        return changeDataTypeService.changedata(text,stringTypeConvert,typeWantConvert);
    }

}
