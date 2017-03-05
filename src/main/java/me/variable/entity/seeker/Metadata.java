package me.variable.entity.seeker;

import com.googlecode.objectify.annotation.Index;
import me.variable.entity.Base;

/**
 * Created by adi on 3/4/17.
 */
public class Metadata extends Base {

    private String firstName;
    private String lastName;
    private String phone;
    @Index
    private String email;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
