package br.com.pedrosa.product.adapter.in.rest;

import br.com.pedrosa.product.core.usecases.AddressUseCase;
import br.com.pedrosa.product.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AddressController {

    private final AddressUseCase addressUseCase;

    public AddressController(AddressUseCase addressUseCase) {
        this.addressUseCase = addressUseCase;
    }

    @GetMapping(value = "/address/{postalCode}")
    public Address findAddress(@PathVariable String postalCode){
        return addressUseCase.findByPostalCode(postalCode);
    }
}
