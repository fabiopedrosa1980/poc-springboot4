package br.com.pedrosa.product.adapter.out.api;


import br.com.pedrosa.product.model.Address;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface AddressClient {

    @GetExchange("/ws/{postalCode}/json/")
    Address findByPostalCode(@PathVariable String postalCode);
}
