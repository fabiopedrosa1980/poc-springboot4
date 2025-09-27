package br.com.pedrosa.product.adapter.out.persistence.repository;

import br.com.pedrosa.product.adapter.out.persistence.entities.ProductEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<ProductEntity,Long> {
}
