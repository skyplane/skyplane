package it.aa.sample;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Vladimir Kovalenko on 18.04.17
 */
public class GaeUser implements Serializable {

    String userId;
    String email;
    String nickname;
    String forename;
    String surname;
    Set<AppRole> authorities;
    boolean enabled;

    public GaeUser(String userId, String nickname, String email) {
        this.userId = userId;
        this.email = email;
        this.nickname = nickname;
    }

    public GaeUser(String userId, String email, String nickname, String forename, String surname, Set<AppRole> authorities, boolean enabled) {
        this.userId = userId;
        this.email = email;
        this.nickname = nickname;
        this.forename = forename;
        this.surname = surname;
        this.authorities = authorities;
        this.enabled = enabled;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public Set<AppRole> getAuthorities() {
        return authorities;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
