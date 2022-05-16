package com.example.internJavaProject2.controller;

import com.example.internJavaProject2.Service.ChangDataTypeService2;
import com.example.internJavaProject2.Service.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@Slf4j
@RestController
@RequestMapping("/api")
public class ChangeDataTypeController {
    @Autowired
    private ChangDataTypeService2 changDataTypeService2;

    @PostMapping("/convert")
    public ResponseEntity<Contact> changeData(@RequestBody Contact contact) {
        if (contact.getStringTypeConvert().equals(contact.getTypeWantConvert())) {
            contact.setKq("error to convert same Type");
            return new ResponseEntity<>(contact, HttpStatus.OK);
        }
        //them validate
        if (contact.getText().length() == 0 || contact.getStringTypeConvert().length() == 0 || contact.getTypeWantConvert().length() == 0) {
            contact.setKq("Text not null or choose type to convert");
            return new ResponseEntity<>(contact, HttpStatus.OK);
        }
        contact.setKq(changDataTypeService2.changeData(contact.getText(), contact.getStringTypeConvert(),
                contact.getTypeWantConvert()));
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

}
