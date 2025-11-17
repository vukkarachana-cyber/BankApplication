package com.github.derickfelix.bankapplication.models;

public class Customer extends Entity {

    private String name;
    private String address;
    private char sex;
    private String accountNumber;
    private String accountType;
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public char getSex()
    {
        return sex;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }
    
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

}
