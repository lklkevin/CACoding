package use_case.clear_users;

import entity.User;

import java.util.List;

// TODO Complete me

public interface ClearUserDataAccessInterface {
    List<String> getAllUsernames();

    void deleteAll();
}
