package AddressBook;

import java.math.BigInteger;

public class ContactData {

    private String address;
    private String phone;
    private String email;

    public ContactData(String address, String phone, String email) {

        this.address = address;
        this.phone = phone;
        this.email = email;

    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return " address:" + address + " phone number: " + phone + " email: " + email;
    }
}
