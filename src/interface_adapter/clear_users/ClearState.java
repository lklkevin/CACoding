package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String deletedUsers = "";

    public ClearState(ClearState copy) {
        this.deletedUsers = copy.deletedUsers;
    }

    public ClearState() {

    }

    public void setDeletedUsers(String deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public String getDeletedUsers() {
        return deletedUsers;
    }

    @Override
    public String toString() {
        return deletedUsers;
    }
}
