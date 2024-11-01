package mx.com.fractalyst.pdv.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import mx.com.fractalyst.pdv.sc.m.Cliente;
import mx.com.fractalyst.pdv.sc.m.ClientesRepository;
import mx.com.fractalyst.pdv.sc.m.TipoCliente;



@SpringBootApplication
@EnableDiscoveryClient
public class CbClientesApplication {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    ClientesRepository repository() {
        ClientesRepository repository = new ClientesRepository();
        repository.add(new Cliente("Ana Álvarez", TipoCliente.NUEVO));
        repository.add(new Cliente("Benito Buendia", TipoCliente.REGULAR));
        repository.add(new Cliente("Carlos Carmona", TipoCliente.VIP));
        return repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CbClientesApplication.class, args);
    }

}