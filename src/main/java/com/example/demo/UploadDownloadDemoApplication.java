package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.vo.FileStorageProperties;

@SpringBootApplication
@ComponentScan(value = "com.example.demo" )
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class UploadDownloadDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadDownloadDemoApplication.class, args);
	}
}
