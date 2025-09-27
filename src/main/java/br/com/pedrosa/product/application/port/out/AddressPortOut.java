package br.com.pedrosa.product.application.port.out;

import br.com.pedrosa.product.model.Address;

public interface AddressPortOut {
    Address findByPostalCode(String postalCode);
}
