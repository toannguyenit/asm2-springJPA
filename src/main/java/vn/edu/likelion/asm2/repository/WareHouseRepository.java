package vn.edu.likelion.asm2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.likelion.asm2.entity.WareHouseEntity;

@Repository
public interface WareHouseRepository extends JpaRepository<WareHouseEntity, Integer> {
}
