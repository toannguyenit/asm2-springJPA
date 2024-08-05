package vn.edu.likelion.asm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.likelion.asm2.customAnotation.CheckLogin;
import vn.edu.likelion.asm2.entity.AttributeEntity;
import vn.edu.likelion.asm2.service.AttributeService;

import java.util.Iterator;

@RestController
@RequestMapping("/api/attribute")
@CheckLogin
public class AttributeController{

    @Autowired
    private AttributeService attributeService;

    @PostMapping
    public AttributeEntity create(@RequestParam String name) {
        AttributeEntity attribute = new AttributeEntity();
        attribute.setName(name);
        return attributeService.create(attribute);
    }

    @GetMapping
    public Iterator<AttributeEntity> findAll() {
        return attributeService.findAll();
    }
}
