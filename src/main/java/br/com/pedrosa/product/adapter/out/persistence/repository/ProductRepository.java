package br.com.pedrosa.product.adapter.out.persistence.repository;

import br.com.pedrosa.product.adapter.out.persistence.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
