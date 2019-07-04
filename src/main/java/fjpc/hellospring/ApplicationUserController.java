package fjpc.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {

    private ApplicationUserRepository repository;

    public ApplicationUserController(ApplicationUserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ApplicationUser> getAllUsers() {
        return repository.findAll();
    }

}
