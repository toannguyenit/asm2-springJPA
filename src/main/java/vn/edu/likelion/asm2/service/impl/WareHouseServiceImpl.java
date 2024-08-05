package vn.edu.likelion.asm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.asm2.entity.WareHouseEntity;
import vn.edu.likelion.asm2.repository.WareHouseRepository;
import vn.edu.likelion.asm2.service.WareHouseService;

import java.util.Iterator;
import java.util.Optional;

@Service
public class WareHouseServiceImpl  implements WareHouseService {
    
    @Autowired
    private WareHouseRepository wareHouseRepository;
    
    @Override
    public WareHouseEntity create(WareHouseEntity wareHouseEntity) {
        return wareHouseRepository.save(wareHouseEntity);
    }

    @Override
    public WareHouseEntity update(WareHouseEntity wareHouseEntity) {
        return wareHouseRepository.save(wareHouseEntity);
    }

    @Override
    public void delete(WareHouseEntity wareHouseEntity) {
        wareHouseRepository.delete(wareHouseEntity);
    }

    @Override
    public Iterator<WareHouseEntity> findAll() {
        return wareHouseRepository.findAll().iterator();
    }

    @Override
    public Optional<WareHouseEntity> findById(Long id) {
        return Optional.empty();
    }
}
