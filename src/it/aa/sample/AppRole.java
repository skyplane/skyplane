package it.aa.sample;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Vladimir Kovalenko on 18.04.17
 */
public enum AppRole implements GrantedAuthority {
    ADMIN (0),
    NEW_USER (1),
    USER (2);

    private int bit;

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    AppRole(int bit) {
        this.bit = bit;
    }

    public String getAuthority() {
        return toString();
    }
}