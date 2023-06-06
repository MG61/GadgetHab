package com.example.gadgethab;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class GadgetHabApplication {

    public static void main(String[] args) throws IOException {

        ClassLoader classLoader = GadgetHabApplication.class.getClassLoader();

        SpringApplication.run(GadgetHabApplication.class, args);
    }

}
