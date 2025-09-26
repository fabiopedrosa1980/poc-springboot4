package br.com.pedrosa.product.application.port.out;

import br.com.pedrosa.product.model.Product;

import java.util.List;

public interface ProductPortOut {
    List<Product> listAll();
}
