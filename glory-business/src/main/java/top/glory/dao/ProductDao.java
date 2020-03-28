package top.glory.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.glory.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
