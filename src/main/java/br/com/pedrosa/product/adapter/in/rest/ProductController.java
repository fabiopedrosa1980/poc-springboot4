package br.com.pedrosa.product.adapter.in.rest;


import br.com.pedrosa.product.application.port.in.usecases.ProductUseCase;
import br.com.pedrosa.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final ProductUseCase productUseCase;

    public ProductController(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    @GetMapping
    public List<Product> listAll(){
        return productUseCase.listAll();
    }
}
