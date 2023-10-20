package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {

    private final SignupViewModel signupViewModel;

    public ClearPresenter(SignupViewModel signupViewModel) {
        this.signupViewModel = signupViewModel;
    }

    @Override
    public void prepareClearedView(ClearOutputData clearOutputData) {
        List<String> usernames = clearOutputData.getUsers();
        String userListString = "";
        for (String username: usernames){
            userListString = userListString + '\n' + username;
        }

        ClearState clearState = signupViewModel.getClearState();
        clearState.setDeletedUsers(userListString);
        this.signupViewModel.setClearState(clearState);
        signupViewModel.fireClearPropertyChanged();


    }
}
