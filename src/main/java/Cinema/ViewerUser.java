package Cinema;

public class ViewerUser extends User implements UserInterface {
    public ViewerUser(String name, String role) {
        super(name, role);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getUserName() {
        super.getUserName();
    }

    @Override
    public void getUserRole() {
        super.getUserRole();
    }
}
