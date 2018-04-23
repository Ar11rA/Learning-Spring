package com.api.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class BookstoreApplication {

	static Logger logger = Logger.getLogger("BookstoreApplication");

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
		logger.log(Level.INFO, "Started");
	}
}
