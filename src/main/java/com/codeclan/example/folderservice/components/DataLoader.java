package com.codeclan.example.folderservice.components;


import com.codeclan.example.folderservice.models.User;
import com.codeclan.example.folderservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;



    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("Jack");
        User user2 = new User("Victor");
        User user3 = new User("Winston");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

    }
}
