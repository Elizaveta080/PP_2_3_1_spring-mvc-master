package web.dao;


import web.models.Users;


import java.util.List;



public interface UsersDao {
    void addUser(Users users);
    void removeUser(int id);
    List<Users> getAllUsers();


    Users findOne(int id);

    void update(int id, Users users);
}

