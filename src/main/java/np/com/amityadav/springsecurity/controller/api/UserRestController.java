package np.com.amityadav.springsecurity.controller.api;

import np.com.amityadav.springsecurity.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserRestController {

    @PostMapping
    public String createUser(@RequestBody UserDto userDto){
        return "User Created";
    }

    @GetMapping
    public String getUsers(){
        return "All Users";
    }
}
