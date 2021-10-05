package poo2users;

import java.util.ArrayList;

/**
 * Classe que gestiona els usuaris de la nostre app. El login, logout, info...
 * @author alumne
 * 
 */
public class UserManager {
    
    private ArrayList<User> users = new ArrayList<User>();
    private User loggedUser;
    public UserManager() {
        User pr1 = new User("pga","123456","ADMIN", 20, 1200);
        users.add(pr1);
        users.add(new User("mba","123456","ADMIN",30, 2000));
        users.add(new User("rse","123456","ADMIN", 50, 1500));
        users.add(new User("vra","123456","ADMIN",35,1800));
        User pr5 = new User("mam","123456","ADMIN", 25, 1500 );
        users.add(pr5);
    }
    
    /**
     * Detects if the username and the password are in the users database.
     * @param username
     * @param password
     * @return true if the username and password exists
     */
    public boolean loginUser(String username, String password) 
    {
        // User.contains is not possible, let's search in the collection.
        // users.contains()
        boolean exists = false;
        int listSize = users.size();
        for (int i = 0; i < listSize && !exists; i++) {
            if(users.get(i).getUsername().equals(username) 
                    && users.get(i).getPassword().equals(password) ) {
                exists = true;
            }
        }
        return exists;
    }
    
    
    
    
     /**
     * Detects if the user with this username and password has an Admin role or not.
     * @param username
     * @param password
     * @return true if the username has Admin role in the system.
     */
    public boolean isAdmin(String username, String password){
        boolean admin = false;
        int listSize = users.size();
        for (int i = 0; i< listSize; i++)
        {
            if(users.get(i).getRole().equals("admin")){
                admin= true;
                return admin;
            }
            else
            {
                return admin;
            }
        }
        return admin;
    }
     public String infoUser()
    {  
        return loggedUser.toString();    
    }
    
    
}
