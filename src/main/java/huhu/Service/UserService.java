package huhu.Service;

import huhu.Dao.UserDao;
import huhu.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by frank on 11/23/16.
 */
@Service
public class UserService {
        @Autowired
        private UserDao userDao;
        public Collection<User> getAllUsers(){
            return this.userDao.getAllUsers();
        }

        public User getUserById(int id){
            return this.userDao.getUserById(id);
        }

        public void removeUserById(int id) {
            this.userDao.removeUserById(id);
        }

        public void updateUser(User student){
            this.userDao.updateUser(student);
        }

        public void addUser(User student) {
            this.userDao.addUser(student);
        }


    public void checkUser(User user) {
        this.userDao.checkUser(user);
    }
}
