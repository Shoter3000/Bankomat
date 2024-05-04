/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nejcb
 */
public class Customer {
    String name, surname, username, card, year_birth, MD5password, email, address;
    double balance;
    int pin;
    //username+";" +name+";" +surname+";" +year_birth+";" +balance+";" +pin+";" +card+";" +email+";" +MD5password+";" +address ;
    public Customer(String username, String name, String surname, String year_birth, double balance, int pin, String card, String email, String MD5password, String address) {
        this.username = username;        
        this.name = name;        
        this.surname = surname;        
        this.year_birth = year_birth;        
        this.balance = balance;   
        this.pin = pin;        
        this.card = card;
        this.email = email;
        this.MD5password = MD5password;
        this.address = address;

    }
    public Customer() {
    }

      public boolean withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance = Math.round((this.balance - amount) * 100.0) / 100.0;
            return true;
        }
        return false;
        }

     
     
    
      public void deposit(double amount)
      {
              this.balance+=amount;
       
      }
      
      public void nameUpdate(String n)
      {
              this.name=n;
      }
      
      public void surnameUpdate(String s)
      {
              this.surname=s;
      }
      
      public void year_birthUpdate(String y)
      {
              this.year_birth=y;
      }
      
      public void emailUpdate(String e)
      {
              this.email=e;
      }
      
      public void addressUpdate(String a)
      {
              this.address=a;
      }
      
       public void passwordUpdate(String p)
      {
              this.MD5password=p;
      }
      
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public String getUsername() {
        return username;
    }
    
    public String getYear_birth() {
        return year_birth;
    }

    public String getCard() {
        return card;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getMD5password() {
        return MD5password;
    }
    
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return username+";" +name+";" +surname+";" +year_birth+";" +balance+";" +pin+";" +card+";" +email+";" +MD5password+";" +address ;
    }    
}
