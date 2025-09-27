package br.com.pedrosa.product.core.usecases;

import br.com.pedrosa.product.adapter.out.persistence.entities.ProductEntity;
import br.com.pedrosa.product.adapter.out.persistence.repository.ProductRepository;
import br.com.pedrosa.product.application.port.out.ProductPortOut;
import br.com.pedrosa.product.model.Product;
import org.springframework.jdbc.core.simple.JdbcClient;

import javax.sql.DataSource;
import java.util.List;

public class ProductUseCase implements ProductPortOut {
    private final ProductRepository productRepository;
    private  final DataSource dataSource;

    public ProductUseCase(ProductRepository productRepository, DataSource dataSource) {
        this.productRepository = productRepository;
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> listAll() {
        return productRepository.findAll().stream()
                .map(ProductEntity::toProduct)
                .toList();
    }

    public List<Product> listAllNative(){
        JdbcClient jdbcClient = JdbcClient.create(dataSource);
        return jdbcClient.sql("SELECT id,name FROM Product").query(Product.class).list();
    }
}
