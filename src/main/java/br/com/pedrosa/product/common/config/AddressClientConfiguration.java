package br.com.pedrosa.product.common.config;

import br.com.pedrosa.product.adapter.out.api.AddressClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class AddressClientConfiguration {

    @Value("${url.address}")
    private String urlApi;

    @Bean
    public AddressClient addressClient() {
        RestClient restClient = RestClient.builder().baseUrl(urlApi).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(AddressClient.class);
    }
}
