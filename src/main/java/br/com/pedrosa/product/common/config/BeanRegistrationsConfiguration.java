package br.com.pedrosa.product.common.config;

import br.com.pedrosa.product.core.usecases.ProductUseCase;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

@Configuration
@Import(BeanRegistrationsConfiguration.MyBeanRegistrar.class)
public class BeanRegistrationsConfiguration {
    static class MyBeanRegistrar implements BeanRegistrar {
        @Override
        public void register(BeanRegistry registry, Environment env) {
            registry.registerBean(ProductUseCase.class);
        }
    }
}
