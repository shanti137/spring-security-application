package np.com.amityadav.springsecurity.controller.api;

import np.com.amityadav.springsecurity.dto.UserDto;
import np.com.amityadav.springsecurity.entity.Gender;
import np.com.amityadav.springsecurity.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserRestController {

    @PostMapping
    public String createUser(@RequestBody UserDto userDto){
        return "User Created";
    }

    @GetMapping
    public List<User> getUsers(){
        List<User> users = Arrays.asList(
                new User(1L, "Amit Yadav", "amit.yadav@miu.edu", "frensdude", "pass", Gender.MALE),
                new User(2L, "Ramesh Thapa", "ramesh.thapa@miu.edu", "ramesh", "ram", Gender.MALE),
                new User(3L, "Sita Devi", "sita@gmail.com", "sita", "123", Gender.FEMALE)
        );
        return users;

    }
    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id){
        return "User with id: " +id;
    }
}
