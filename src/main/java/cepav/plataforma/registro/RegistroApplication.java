package cepav.plataforma.registro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroApplication.class, args);
		System.out.print(suma(1,10)); 
	}
	
	public static int  suma(int num1 , int num2) {
		
		int valor= num1+num2;
		
		return valor;
	}

}
