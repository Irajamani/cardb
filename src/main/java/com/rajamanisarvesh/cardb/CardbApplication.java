package com.rajamanisarvesh.cardb;

import com.rajamanisarvesh.cardb.domain.Car;
import com.rajamanisarvesh.cardb.domain.CarRepository;
import com.rajamanisarvesh.cardb.domain.Owner;
import com.rajamanisarvesh.cardb.domain.OwnerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardbApplication {



    @Autowired
    private CarRepository carRepository;

    @Autowired
    private OwnerRespository ownerRespository;

    public static void main(String[] args) {
        SpringApplication.run(CardbApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
            return args -> {
                Owner owner1 = new Owner("Rajamani", "Sarvesh");
                Owner owner2 = new Owner("JOHN","johnson");
                ownerRespository.save(owner1);
                ownerRespository.save(owner2);
                carRepository.save(new Car("Toyata", "Etios", "Black", "TN 0123", 2013, 600000, owner1));
                carRepository.save(new Car("Honda", "CRV", "Brown", "TN 02 0123", 2016, 350000, owner2));
            };
        }


}
