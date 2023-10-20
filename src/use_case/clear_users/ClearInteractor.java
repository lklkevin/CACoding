package use_case.clear_users;

import entity.User;

import java.util.ArrayList;
import java.util.List;

// TODO Complete me
public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary clearPresenter){
        this.clearPresenter = clearPresenter;
        this.userDataAccessObject = userDataAccessObject;
    }

    @Override
    public void execute() {
        List<String> usernames = userDataAccessObject.getAllUsernames();
        ClearOutputData clearOutputData = new ClearOutputData(usernames);
        userDataAccessObject.deleteAll();

        clearPresenter.prepareClearedView(clearOutputData);
    }
}
