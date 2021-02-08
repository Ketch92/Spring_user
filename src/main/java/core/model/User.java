package core.model;

import java.util.Objects;

public class User {
    private String email;
    private String name;
    private int age;
    
    public User() {
    }
    
    public User(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{"
               + "email='" + email + '\''
               + ", name='" + name + '\''
               + ", age=" + age
               + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
               && Objects.equals(email, user.email)
               && Objects.equals(name, user.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(email, name, age);
    }
}
