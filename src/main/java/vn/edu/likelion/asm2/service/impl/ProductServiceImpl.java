package vn.edu.likelion.asm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.asm2.entity.ProductEntity;
import vn.edu.likelion.asm2.repository.ProductRepository;
import vn.edu.likelion.asm2.service.ProductService;

import java.util.Iterator;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    
    @Override
    public ProductEntity create(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity update(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public void delete(ProductEntity productEntity) {
        productRepository.delete(productEntity);
    }

    @Override
    public Iterator<ProductEntity> findAll() {
        return productRepository.findAll().iterator();
    }

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return Optional.empty();
    }
}
