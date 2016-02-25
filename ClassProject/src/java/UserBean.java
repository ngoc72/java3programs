
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javauser
 */
public class UserBean implements Serializable {
    private String email;
    private String firstName;
    private String lastName;
    private String favColor;
    private String favPet;
    private String favMusic;

    public UserBean() {
        email = firstName
              = lastName
              = favColor
              = favPet
              = favMusic
              = " ";
    }

    public UserBean(String email, String firstName, String lastName, String favColor, String favPet, String favMusic) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.favColor = favColor;
        this.favPet = favPet;
        this.favMusic = favMusic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getFavPet() {
        return favPet;
    }

    public void setFavPet(String favPet) {
        this.favPet = favPet;
    }

    public String getFavMusic() {
        return favMusic;
    }

    public void setFavMusic(String favMusic) {
        this.favMusic = favMusic;
    }
    
    
    
}
