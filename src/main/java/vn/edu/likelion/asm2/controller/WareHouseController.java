package vn.edu.likelion.asm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.likelion.asm2.customAnotation.CheckLogin;
import vn.edu.likelion.asm2.entity.WareHouseEntity;
import vn.edu.likelion.asm2.service.WareHouseService;

import java.util.Iterator;

@RestController
@RequestMapping("/api/warehouse")
@CheckLogin
public class WareHouseController {

    @Autowired
    private WareHouseService wareHouseService;

    @PostMapping
    public WareHouseEntity create(@RequestParam String name,
                                  @RequestParam String address) {
        WareHouseEntity wareHouse = new WareHouseEntity();
        wareHouse.setName(name);
        wareHouse.setAddress(address);
        return wareHouseService.create(wareHouse);
    }

    @GetMapping
    public Iterator<WareHouseEntity> findAll() {
        return wareHouseService.findAll();
    }

}
