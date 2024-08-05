package vn.edu.likelion.asm2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@Table(name = "tbl_warehouses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WareHouseEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(unique = true, nullable = false)
    @NonNull
    private String name;

    @Column
    private String address;


    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "user_id")
    private UserEntity userId;

    @ManyToMany
    @JoinTable(name = "tbl_warehouse_product",
            joinColumns = @JoinColumn(name = "warehouse_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<ProductEntity> productEntities;


}

