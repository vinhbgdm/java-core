public class UserServiceImpl implements UserService{
    @Override
    public User getUser(int id) {
        System.out.println("------getUserId: " + id);
        return new User(id, "id_" + id);
    }
}
