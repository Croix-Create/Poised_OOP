package Poised;



public class Person  {


    private String name;
    private String telephoneNum;
    private String email;
    private String address;

    public  Person(String name, String telephoneNum, String email, String address) {
        this.name = name;
        this.telephoneNum = telephoneNum;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getTelephoneNum() {

        return telephoneNum;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setName(String NewName){
        this.name = NewName;
    }

    public void setTelephoneNum(String NewTelephoneNum){
        this.telephoneNum = NewTelephoneNum;
    }

    public void setEmail(String NewEmail){
        this.email = NewEmail;
    }

    public void setAddress(String NewAddress){
        this.address = NewAddress;
    }

    public String toString() {

        String output = "Name: " + this.name;
        output += "\nAge: " + this.telephoneNum;
        output += "\nEmail: " + this.email;
        output += "\nAddress: " + this.address;

        return output;
    }
}