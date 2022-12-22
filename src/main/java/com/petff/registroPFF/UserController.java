package com.petff.registroPFF;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/usuarios/")

public class UserController {
	public final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
        this.userService = userService;
    }
	
	//GET para traer todos los usuarios

    @GetMapping
    public List<User> getUsuarios(){
        return userService.getUsers();
    }
    
  //GET para traer un usuario por id

    @GetMapping(path="{userId}")
    public User getUsuario(@PathVariable ("userId") Long userId) {
        return userService.getUser(userId);
    }
    
  //DELETE para borrar un usuario por ID

    @DeleteMapping
    public void deleteUsuario(@PathVariable ("userId") Long userId) {
        userService.deleteUser(userId);
    }
    
  //POST para agregar un nuevo usuario

    @PostMapping
    public void postUsuario(@RequestBody User user) {
        userService.addUser(user);
    }
    
  //PUT para modificar 

    @PutMapping(path="{userId}")
    public void updateUsuario (@PathVariable ("userId") Long userId,
            @RequestParam String currentPassword,
            @RequestParam String newPassword) {
        userService.updateUser(userId, currentPassword, newPassword);
    }
}
