package com.example.first_app_version;

public class Profile
{ String firstname,latname,number;

    public Profile(String firstname, String latname, String number) {
        this.firstname = firstname;
        this.latname = latname;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "firstname=" + firstname +
                ", latname=" + latname +
                ", number=" + number +
                '}';
    }
}
