package br.com.pedrosa.product.adapter.in.rest;


import br.com.pedrosa.product.core.usecases.ProductUseCase;
import br.com.pedrosa.product.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {

    @Value("#{systemProperties['field.size'] ?: 25}")
    private String field;

    private final ProductUseCase productUseCase;

    public ProductController(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    @GetMapping(value = "/products", version = "1")
    public List<Product> listAllNative() {
        System.out.println(field);
        return productUseCase.listAllNative();
    }

    @GetMapping(value = "/products", version = "2")
    public List<Product> listAllJPA() {
        System.out.println(field);
        return productUseCase.listAll();
    }


}
