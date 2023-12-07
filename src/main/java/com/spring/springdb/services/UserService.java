package com.spring.springdb.services;

import com.spring.springdb.entity.Users;
import com.spring.springdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Users> getALlUsers(){
        return userRepository.findAll();
    }

    public Users getUserById(int id){
        return userRepository.findById(id).get();
    }

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public void deleteUserById(int id) {
        Optional<Users> probUser = userRepository.findById(id);
        if (probUser.isEmpty())
        {
            throw  new RuntimeException("User id: "+id +" doesn't exist");
        }
        userRepository.deleteById(id);
    }

    public void deleteALl()
    {
        userRepository.deleteAll();
    }

    public int record_numbers()
    {
        return userRepository.findAll().size();
    }

    public String getClassName()
    {
        return userRepository.getClass().toString();
    }

}
