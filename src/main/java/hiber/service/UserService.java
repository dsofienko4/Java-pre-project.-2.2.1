package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    @Autowired
    User getUserByCar(Car car);
}
