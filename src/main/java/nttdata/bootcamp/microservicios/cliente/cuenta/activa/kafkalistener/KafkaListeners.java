package nttdata.bootcamp.microservicios.cliente.cuenta.activa.kafkalistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;



//@Component
public class KafkaListeners {
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaListeners.class);
	
	/*
	 * @KafkaListener( topics ="ClientsgetActiveAccounts", groupId = "groupId"
	 * 
	 * ) void listener(String data) { LOGGER.info("LISTENER RECEIVED " +data +
	 * "[configured by JOFFRE HERMOSILLA SALAS]"); }
	 */

}
