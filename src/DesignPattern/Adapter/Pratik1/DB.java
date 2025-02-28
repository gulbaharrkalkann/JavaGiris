package DesignPattern.Adapter.Pratik1;

public interface DB {
    public User selectUserById(int id);
    public void insertUser(User user);
}
