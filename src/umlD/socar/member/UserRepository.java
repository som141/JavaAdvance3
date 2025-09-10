package umlD.socar.member;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    user save(user user);
    Optional<user> findById(String userId);
    List<user> findAll();
    void deleteById(String userId);

}
