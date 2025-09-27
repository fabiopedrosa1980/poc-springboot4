package br.com.pedrosa.product.core.usecases;

import br.com.pedrosa.product.adapter.out.api.AddressClient;
import br.com.pedrosa.product.application.port.out.AddressPortOut;
import br.com.pedrosa.product.model.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressUseCase implements AddressPortOut {

    private final AddressClient addressClient;

    public AddressUseCase(AddressClient addressClient) {
        this.addressClient = addressClient;
    }

    @Override
    public Address findByPostalCode(String postalCode) {
        return addressClient.findByPostalCode(postalCode);
    }
}
