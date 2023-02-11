package Model;

import java.util.ArrayList;
import java.util.List;
import Exception.DAOException;
import Interface.IDAO;

public class TestBD {
    private IDAO<User> userDao=new UserDaoImpl();
    public void run() throws DAOException {
        User user1= new User("cheikh","passer");
        User user2= new User("ivan","passer");
        userDao.create(user1);
        userDao.create(user2);
        listUser();
        System.out.println("Chercher l'utilisateur avec l'id = 1");
        User user = readUser(2);
        afficheUser(user);
        deleteUser(user.getIdentifiant());
    }
    public void listUser() throws DAOException {
        List<User> userList = new ArrayList<>();
        userList = userDao.list();
        for (User user:userList) {
            afficheUser(user);
        }
    }
    public void afficheUser(User user){
        System.out.println("id: "+user.getIdentifiant()+", login: "+user.getLogin());
    }
    public void deleteUser(int id) throws DAOException {
        userDao.delete(id);
    }
    public User readUser(int id) throws DAOException {
        return userDao.read(id);
    }

}
