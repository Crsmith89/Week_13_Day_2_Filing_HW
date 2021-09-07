package com.codeclan.example.folderservice.components;


import com.codeclan.example.folderservice.models.File;
import com.codeclan.example.folderservice.models.Folder;
import com.codeclan.example.folderservice.models.User;
import com.codeclan.example.folderservice.repository.FileRepository;
import com.codeclan.example.folderservice.repository.FolderRepository;
import com.codeclan.example.folderservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;



    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("Jack");
        userRepository.save(user1);

        User user2 = new User("Victor");
        userRepository.save(user2);

        User user3 = new User("Winston");
        userRepository.save(user3);

        Folder folder1 = new Folder("Holiday pictures", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Music", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("CV", user2);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Dog Pictures", user3);
        folderRepository.save(folder4);


        File file1 = new File("New York", ".jpeg", 156, folder1);
        fileRepository.save(file1);

        File file2 = new File("90's Dance", "mp3", 256, folder2);
        fileRepository.save(file2);

        File file3 = new File("Tam CV", ".txt", 56, folder3);
        fileRepository.save(file3);

        File file4 = new File("Buddy", ".png", 516, folder4);
        fileRepository.save(file4);



    }


}
