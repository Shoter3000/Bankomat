/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nejcb
 */
public class Customer {
    String name, surname, username, card, year_birth;
    double balance;
    int pin;
    //username+";" +name+";" +surname+";" +year_birth+";" +balance+";" +pin+";" +card ;
    public Customer(String username, String name, String surname, String year_birth, double balance, int pin, String card) {
        this.username = username;        
        this.name = name;        
        this.surname = surname;        
        this.year_birth = year_birth;        
        this.balance = balance;        
        this.pin = pin;        
        this.card = card;

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

    @Override
    public String toString() {
        return username+";" +name+";" +surname+";" +year_birth+";" +balance+";" +pin+";" +card ;
    }    
}
