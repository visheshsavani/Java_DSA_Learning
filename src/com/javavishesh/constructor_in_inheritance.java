package com.javavishesh;
class country{
    private int id;
    private int name;
    private long phonenumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    country(){
        phonenumber=95857490;
        System.out.println(phonenumber);
    }
}
class india extends country{
private long phonenumber1;

    public long getPhonenumber1() {
        return phonenumber1;
    }

    public void setPhonenumber1(long phonenumber1) {
        this.phonenumber1 = phonenumber1;
    }

    india(){
    setPhonenumber(98483668);
    System.out.println(getPhonenumber());
}
}
public class constructor_in_inheritance{
    public static void main(String[] args) {
india a=new india();
    }
}
