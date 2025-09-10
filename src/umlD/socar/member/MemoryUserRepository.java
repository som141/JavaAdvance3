package umlD.socar.member;

import java.util.*;

public class MemoryUserRepository implements UserRepository{

    private final Map<String,user > store = new HashMap<>();

    @Override
    public user save(user user) {
        store.put(user.getUserId(),user);
        return user;
    }

    @Override
    public Optional<user> findById(String userId) {
        return Optional.ofNullable(store.get(userId));
    }

    @Override
    public List<user> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void deleteById(String userId) {
        store.remove(userId);
    }
}
