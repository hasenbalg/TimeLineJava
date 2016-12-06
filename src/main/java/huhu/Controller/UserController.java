package huhu.Controller;

import huhu.Entity.User;
import huhu.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
/**
 * Created by frank on 22.11.16.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id){
        return this.userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id){
        userService.removeUserById(id);
    }

    @RequestMapping( method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

//    @RequestMapping( method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void addUser(@RequestBody User user){
//        userService.addUser(user);
//    }
    @RequestMapping( method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user){
        userService.checkUser(user);
    }


}
