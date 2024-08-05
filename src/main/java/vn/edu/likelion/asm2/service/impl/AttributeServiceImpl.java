package vn.edu.likelion.asm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.asm2.entity.AttributeEntity;
import vn.edu.likelion.asm2.repository.AttributeRepository;
import vn.edu.likelion.asm2.service.AttributeService;

import java.util.Iterator;
import java.util.Optional;

@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    private AttributeRepository attributeRepository;
    
    @Override
    public AttributeEntity create(AttributeEntity attributeEntity) {
        return attributeRepository.save(attributeEntity);
    }

    @Override
    public AttributeEntity update(AttributeEntity attributeEntity) {
        return attributeRepository.save(attributeEntity);
    }

    @Override
    public void delete(AttributeEntity attributeEntity) {
        attributeRepository.delete(attributeEntity);
    }

    @Override
    public Iterator<AttributeEntity> findAll() {
        return attributeRepository.findAll().iterator();
    }

    @Override
    public Optional<AttributeEntity> findById(Long id) {
        return Optional.empty();
    }
}
