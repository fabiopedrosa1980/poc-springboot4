package br.com.pedrosa.adapter.in.rest;


import br.com.pedrosa.application.port.in.ProductUseCase;
import br.com.pedrosa.model.Product;
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
