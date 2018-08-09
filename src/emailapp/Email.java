
package emailapp;


import java.util.Scanner;

public class Email {
        private String firstname;
        private String lastname;
        private String password;
        private String department;
        private int mailboxcapacity=500;
        private int defaultpasswordLength=100;
        private String alternativeemail;
        private String email;
        private String changePassword;
        private String companysuffix="company.com";

        public Email(String firstname, String lastname){
            this.firstname=firstname;
            this.lastname=lastname;
            System.out.println("email created" + this.firstname+" "+this.lastname);
          this.department=  setDepartment();
          this.password=generatePassword(defaultpasswordLength);
            System.out.println("your password is :"+ this.password);
            //calling a method to generate random email//
            email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+companysuffix;
            System.out.println("your email address is:"+ email);

        }
        //constructor for the first and the last name
        //call for department and return the department
        private String setDepartment(){
            System.out.print("Enter the department\n1 for sales\n2 for accounts\n3 for talking to the customer contact");
            Scanner in=new Scanner(System.in);
           int depChoice= in.nextInt();
           if (depChoice==1){
               return "sales";
           }
           else if (depChoice==2){
               return "accounts";
           }
           else return"";
        }
        //generate the random password
        private String generatePassword(int length){
            String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&";
            char[] password =new char[length];
            for (int i=0;i<=1;i++){
                int rand=(int) (Math.random()*passwordSet.length());
                password[i]=passwordSet.charAt(rand);

            }
            return new String(password);
    }
    public void setMailboxcapacity(int capacity){
            this.mailboxcapacity=capacity;//setting mailbox capacity and storing it to capacity//
    }
    public void setAlternativeemail(String alternate){
        this.alternativeemail=alternate;
    }
    public void changePassword(String chngpwd){
        this.password=chngpwd;
    }
    public int getMailboxcapacity(){return mailboxcapacity;}
        public String getAlternativeemailEmail(){return alternativeemail;}
        public String getPassword(){return password;}
    public String showInfo(){
            return "DISPLAY NAME: "+firstname+""+lastname+
                    "\nCOMPANYEMAIL: "+email+
                    "\n2MAILBOX CAPACITY: "+mailboxcapacity+"mb";

    }
}






