package com.twu.biblioteca;

public class CustomerInfo {
    private String id;
    private String password;
    private String name;
    private String email;
    private String phoneNum;

    public CustomerInfo(String id, String password, String name, String email, String phoneNum) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getId(){return this.id;}
    public String getPassword(){return this.password;}

    //准备输出顾客信息
    public String getCustomerINfo(){
        String customerInfo=String.format("%s-%s-%s",this.name,this.email,this.phoneNum);
        return customerInfo;
    }
}
