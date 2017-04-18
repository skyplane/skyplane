package it.aa.sample;

/**
 * Created by Vladimir Kovalenko on 18.04.17
 */
public interface UserRegistry {
    GaeUser findUser(String userId);
    void registerUser(GaeUser newUser);
    void removeUser(String userId);
}
