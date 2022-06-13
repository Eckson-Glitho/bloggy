package models;

public class UserModel {
    private int id;
    private String fullname, email, password;

    public UserModel() {}

    /**
     * constructutor
     * @param id
     * @param fullname
     * @param email
     * @param password
     */
    public UserModel(int id, String fullname, String email, String password) {
        super();
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }

    /**
     * constructutor
     * @param fullname
     * @param email
     * @param password
     */
    public UserModel(String fullname, String email, String password) {
        super();
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
