package vn.edu.likelion.asm2.service;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface BaseCRUD<T> {
   T create(T t);
   T update(T t);
   void delete(T t);
   Iterator<T> findAll();
   Optional<T> findById(Long id);
}
