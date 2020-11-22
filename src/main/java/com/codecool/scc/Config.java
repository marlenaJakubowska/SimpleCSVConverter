package com.codecool.scc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@ComponentScan("com.codecool.scc")
public class Config {

    public static String path;

    public static void setPath(String newPath) {
        path = newPath;
    }

    @Bean
    public File file() {
        return new File(path);
    }

}
