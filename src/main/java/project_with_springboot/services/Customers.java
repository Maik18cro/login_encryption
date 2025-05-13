package project_with_springboot.model;

public class Customers {
    private int Id;
    private String name;
    private String username;
    private String password;


    public Customers(int id, String name, String username, String password) {
        Id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
       this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername(){
      return username;
    }

    public void setUsername(String username){
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
