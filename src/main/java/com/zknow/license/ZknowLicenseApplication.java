package com.zknow.license;

import com.zknow.license.server.publish.EnableHZeroLicense;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients
@EnableHZeroLicense
@EnableDiscoveryClient
@SpringBootApplication
public class ZknowLicenseApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZknowLicenseApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(ZknowLicenseApplication.class, args);
        } catch (Throwable thr) {
            LOGGER.error(thr.getMessage(), thr);
        }
    }

}
