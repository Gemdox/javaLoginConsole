package poo2users;

/**
 *
 * @author alumne
 */
public class User {
    
    /**
     * Username.
     */
    
    private String username;
    /**
     * password. Easy to remember for you, difficult for others.
     */
    private String password;
    /**
     * role. Role in the app: admin, user
     */
    private String role;
    private int age;
    private float salario;

    public User(String username, String password, String role, int age, float salario) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.age = age;
        this.salario = salario;
    }

    

    public User() {
    }

    User(String anew, String string, String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", role=" + role + '}';
    }
    
}
