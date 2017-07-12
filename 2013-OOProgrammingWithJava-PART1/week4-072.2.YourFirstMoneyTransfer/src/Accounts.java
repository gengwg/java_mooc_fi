
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account mattAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);

        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println("Final state");
        System.out.println(mattAccount);
        System.out.println(myAccount);

    }

}
