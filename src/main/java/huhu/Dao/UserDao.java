package huhu.Dao;

import huhu.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by frank on 22.11.16.
 */
@Repository
public class UserDao {
    @Autowired
    private static Map<Integer, User> users;
    static {
        users = new HashMap<Integer, User>(){
            {
                put(1, new User(1, "frank", "huhu"));
                put(2, new User(2, "ramona", "huhu"));


            }
        };
    }

    public Collection<User> getAllUsers(){
        return this.users.values();
    }

    public User getUserById(int id){
        return this.users.get(id);
    }

    public void removeUserById(int id) {
        this.users.remove(id);
    }

    public void updateUser(User user){
        User u = users.get(user.getId());
        u.setName(user.getName());
        u.setPassword(user.getPassword());
        users.put(user.getId(), user);
    }

    public void addUser(User user) {
        this.users.put(user.getId(), user);
    }

    public void checkUser(User user) {
        for (User u : this.users.values()){
            System.out.println(u);
            if (u.equals(user)){
                System.out.println("Yehaaaaar!!!!!!!!!!!!!!!!");
            }
        }
        System.out.println("fuck!!!!!!!!!!!!!!!!");
//        if (this.users.containsKey(user)){
//            System.out.println("Yehaaaaar!!!!!!!!!!!!!!!!");
//        }
//        System.out.println("fuck!!!!!!!!!!!!!!!!");
    }
}
