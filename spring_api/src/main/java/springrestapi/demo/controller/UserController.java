package springrestapi.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springrestapi.demo.entity.User;
import springrestapi.demo.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {


    private final UserRepository userRepository;

    //Create
    @PostMapping("/create")
    public ResponseEntity<?> createUser(User user){
        user.setCreateTime(new MyLibrary().getDateTime());
        return ResponseEntity.ok(userRepository.save(user));
    }

    //ReadAll
    @GetMapping("/list")
    public List<User> readAll(){
        return userRepository.findAll();
    }

    //Read
    @GetMapping("/list/{id}")
    public User readUser(@PathVariable Long id) throws IllegalAccessException {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalAccessException());
    }

    //Update
    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, Integer age){
        userRepository.findById(id)
                .map(user -> {
                    user.setAge(age);
                    return userRepository.save(user);
                });
    }

    //Delete
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
    }

}
