package vn.edu.likelion.asm2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.likelion.asm2.customAnotation.CheckLogin;
import vn.edu.likelion.asm2.entity.ProductEntity;
import vn.edu.likelion.asm2.service.ProductService;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/product")
@CheckLogin
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductEntity createProduct(@RequestParam String name) {
        ProductEntity product = new ProductEntity();
        product.setName(name);
        return productService.create(product);
    }

    @GetMapping
    public Iterator<ProductEntity> getProducts() {
        return productService.findAll();
    }

}
