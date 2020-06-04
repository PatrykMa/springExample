package main.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter
    @Setter
    private  String name;
    @Getter
    @Setter
    private  String email;

    public User( String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
    }
// standard constructors / setters / getters / toString
}