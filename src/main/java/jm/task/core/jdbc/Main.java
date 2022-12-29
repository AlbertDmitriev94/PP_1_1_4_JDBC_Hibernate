package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Polly", "Dangerous", (byte) 23);
        userDao.saveUser("Jack", "Sparrow", (byte) 45);
        userDao.saveUser("Bruce", "Wayne", (byte) 40);
        userDao.saveUser("Peter", "Parker", (byte) 25);

        userDao.removeUserById(4);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

