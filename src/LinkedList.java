/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nejcb
 */
class Node
{
       private Node next,pre;
 private Customer customer; 
    public Node(Node next, Node pre, Customer customer) {
        this.next = next;
        this.pre = pre;
        this.customer = customer;
    }

    public Node() {
    next=null;
    pre=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
             
        

}

public class LinkedList {

    Node head,tail;
    
    public LinkedList() {
       this.head=null;
       this.tail=null;
    
    }
    
    
    
     public void insert(Customer customer)
     {
            Node node= new Node();
             node.setCustomer(customer);
       
         if(head==null||tail==null)
       {
              head=node;
              tail=node;
       
       }
       
       else
       {
             head.setNext(node);
             node.setPre(head);
             head=node;
       
       
       }
       
     
     
     }
     
     
     public Customer getInfo(String username)
     {
           Node temp=head;
           
           while(temp!=null)
           {
               
               if(username.equals(temp.getCustomer().getUsername()))
                    return temp.getCustomer();
                     temp=temp.getPre();
           
           }
           return null;
     
     }
    
    
    public int size()
     {
           Node temp=head;
           int size=0;
           while(temp!=null)
           {
              size++;
               temp=temp.getPre();
           
           }
           return size;
     
     }
    
     public String allData()
     {
           Node temp=head;
           String data="";
           while(temp!=null)
           {
               data+=temp.getCustomer().toString()+"\n";
               temp=temp.getPre();
           
           }
           return data;
     
     }

    boolean check(String card) {
         Node temp=head;
         
           while(temp!=null)
           {
               
               if(card.equals(temp.getCustomer().getCard()))
               {
                   return true;
               }
               temp=temp.getPre();
           
           }
           return false;
    }

    boolean isExist(String text) {
      Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getUsername()))
               {
                   return true;
               }
               temp=temp.getPre();
           
           }
           return false;
    }

    String UsernameInfo(Customer cuss) {
         Node temp=head;
         
           while(temp!=null)
           {
               
               if(cuss.getUsername().equals(temp.getCustomer().getUsername()))
               {
                   return "\nUsername                    "+temp.getCustomer().getUsername()
                         +"\nName                        "+temp.getCustomer().getName()
                         +"\nSurname                     "+temp.getCustomer().getSurname()
                         +"\nYear of birth               "+temp.getCustomer().getYear_birth()
                         +"\nCard#                       "+temp.getCustomer().getCard()
                         +"\nBalance                     "+temp.getCustomer().getBalance()
                         +"\nEmail                       "+temp.getCustomer().getEmail()
                         +"\nAddress                     "+temp.getCustomer().getAddress();
                                 
               }
               temp=temp.getPre();
           
           }
           return "";
    }

    void Deposit(Customer cuss, double amount) {
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(cuss.getUsername().equals(temp.getCustomer().getUsername()))
               {
                   temp.getCustomer().deposit(amount);
                   break; 
               }
               
               temp=temp.getPre();
           
           }
    
    }

    void Withraw(Customer cuss) {
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(cuss.getUsername().equals(temp.getCustomer().getUsername()))
               {
                   temp.setCustomer(cuss);
                   break;
               }
               
               temp=temp.getPre();
           
           }
    
    }

    
    
    Customer checkUser(String text, String text0) {
    
    
    Node temp=head;
         
           while(temp!=null)
           {
               String hash=SignUp.getMd5Hash(text);
               if(hash.equals(temp.getCustomer().getMD5password()) && text0.equals(temp.getCustomer().getUsername()) )
               {return temp.getCustomer();
               }
               
               temp=temp.getPre();
           
           }
           return null;
    
    }

    Customer checkPInCard(String text, String text0) {
    
    
        Node temp=head;
             
               while(temp!=null)
               {
                   
                   if(text.equals(temp.getCustomer().getPin()+"") && text0.equals(temp.getCustomer().getCard()) )
                   {return temp.getCustomer();
                   }
                   
                   temp=temp.getPre();
               
               }
               return null;
        
        }

    void Update(Customer cuss, String name, String surname, String year_birth, String email, String address) {
    Node temp=head;
           while(temp!=null)
           {       
               if(cuss.getUsername().equals(temp.getCustomer().getUsername()))
               {
                   temp.getCustomer().nameUpdate(name);
                   temp.getCustomer().surnameUpdate(surname);
                   temp.getCustomer().year_birthUpdate(year_birth);
                   temp.getCustomer().emailUpdate(email);
                   temp.getCustomer().addressUpdate(address);
                   break; 
               }
               temp=temp.getPre();
           
           }
    
    }
    
    void UpdatePassword(Customer cuss, String hash) {
    Node temp=head;
           while(temp!=null)
           {       
               if(cuss.getUsername().equals(temp.getCustomer().getUsername()))
               {
                   temp.getCustomer().passwordUpdate(hash);
                   break; 
               }
               temp=temp.getPre();
           
           }
    
    }

}