package nttdata.bootcamp.microservicios.cliente.cuenta.activa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioClienteCuentaActivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioClienteCuentaActivaApplication.class, args);
	}

	/*
	 * @Bean CommandLineRunner commandLineRunner(KafkaTemplate<String, String>
	 * kafkaTemplate) { return args -> {
	 * kafkaTemplate.send("ClientsgetActiveAccounts",
	 * "Mensaje desde microservicio Cliente tine cuentas activas con apache KAFKA "
	 * ); }; }
	 */

}
