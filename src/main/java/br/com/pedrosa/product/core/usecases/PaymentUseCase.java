package br.com.pedrosa.product.core.usecases;

import br.com.pedrosa.product.application.port.out.PaymentPortOut;
import br.com.pedrosa.product.common.anotation.UseCase;
import org.springframework.resilience.annotation.EnableResilientMethods;
import org.springframework.resilience.annotation.Retryable;

@UseCase
@EnableResilientMethods
public class PaymentUseCase implements PaymentPortOut {


    @Override
    @Retryable(maxAttempts = 3)
    public void processPayment() {
        // logic that may fail and should be retried
    }

}
