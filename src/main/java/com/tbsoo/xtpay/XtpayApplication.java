package com.tbsoo.xtpay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.tbsoo.xtpay.dao")
public class XtpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(XtpayApplication.class, args);
	}
}
