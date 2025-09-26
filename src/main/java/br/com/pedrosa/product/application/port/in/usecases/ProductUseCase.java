package br.com.pedrosa.product.application.port.in.usecases;

import br.com.pedrosa.product.adapter.out.persistence.repository.ProductRepository;
import br.com.pedrosa.product.application.port.out.ProductPortOut;
import br.com.pedrosa.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductUseCase implements ProductPortOut {
    private final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listAll() {
        return productRepository.findAll().stream()
                .map(p -> new Product(p.getId(),p.getName()))
                .toList();
    }
}
