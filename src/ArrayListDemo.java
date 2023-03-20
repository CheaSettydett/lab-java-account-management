
import java.util.*;

class Account implements Comparable{
    int id;
    String ownerName;
    double balance;

    public Account() {
    }

    public Account(int id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    @Override
    public int compareTo(Object o) {
       Account accID = (Account) o;
       return this.id - accID.id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
public class ArrayListDemo {
    //acc id owner balance
    //add acc add edit remove show
    //show account information
    // 1 . descending order by account_id
    // 2.  ascending order by account_id
    // 3. descendinder order by balance
    public static void main(String[] args) {

        int option;
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(1,"Noi",300.00));
        accountList.add(new Account(3,"Det",100.00));
        accountList.add(new Account(2,"Koi",200.00));
        accountList.add(new Account(4,"Nono",300.00));
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Add account:");
            System.out.println("2: Remove Account: ");
            System.out.println("3. Edit Account ");
            System.out.println("4. Show account info");
            System.out.println("5. Exit ");
            System.out.println("Choose option ( 1 - 5 ) : ");
            option  = input.nextInt();

            switch (option){
                case  1 :
                    // enter account information
                    // object add list
                    //accountList.add();
                    System.out.println("Enter your account info");
                    Account acc = new Account();
                    System.out.print("Input ID:");
                    acc.id = input.nextInt();
                    System.out.print("Name:");
                    input.nextLine();
                    acc.ownerName = input.nextLine();
                    System.out.print("Balance:");
                    acc.balance = input.nextDouble();
                    accountList.add(acc);
                    System.out.println("Account Info:"+accountList);
                    //Iterator<String> i = accountList.iterator();
                    break;
                case 2 :
                    System.out.println("Enter Remove Account :");
                    int getId =  input.nextInt();
//                    System.out.println(accountList.size());
                    for(int i =0; i<accountList.size() ; i++)
                    {
                        if(accountList.get(i).id == getId)
                        {
                            accountList.remove(i);
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Please enter ID ");
                    int getID = input.nextInt();
                    for(int i = 0 ; i<accountList.size();i++)
                    {
                        if(accountList.get(i).id == getID)
                        {
//                            System.out.print("Input ID:");
//                            accountList.get(i).id = input.nextInt();
                            System.out.print("Name:");
                            input.nextLine();
                            accountList.get(i).ownerName = input.nextLine();
                            System.out.print("Balance:");
                            accountList.get(i).balance = input.nextDouble();
                        }
                    }
                    break;
                case 4 :
                    int showOption ;
                    System.out.println("Show account information");
                    System.out.println("1. Show Account Detail");
                    System.out.println("2. Ascending order (by ID )");
                    System.out.println("3. Descending order (by ID) ");
                    System.out.println("4. Descendig order by balance ");

                    System.out.println("Choose show option : ");
                    showOption =  input.nextInt();
                    switch (showOption){
                        case 1:
                            for (Account account1: accountList
                            ) {
                                System.out.println(account1);
                            }
                            break;
                        case 2 :
                            System.out.println("Sort Ascending ID");
                            Collections.sort(accountList);
                            for(Account accID: accountList){
                                System.out.println(accID);
                            }
                            break;
                        case 3:
                    }
                    break;
                case 5 :
                    System.out.println("Exit the program....!");break;

            }
        }while(option  !=5);

    }
}
