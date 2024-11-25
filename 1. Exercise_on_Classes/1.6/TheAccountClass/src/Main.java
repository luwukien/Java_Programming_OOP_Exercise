import data.Account;

public class Main {
    public static void main(String[] args) {
        //input data
        Account acc1 = new Account("000001", "CHI KIEN LUU");
        Account acc2 = new Account("000002", "VU TRUONG VU", 100_000);

        //test getter
        System.out.println("Id acc 1: " + acc1.getId());
        System.out.println("Name acc 1: " + acc1.getName());
        System.out.println("Name acc 2: " + acc2.getName());
        System.out.println("The balance of acc 2: " + acc2.getBalance());

        //test credit method
        System.out.println("Now the balance of acc 1: " + acc1.credit(50_000));

        //test debit method
//        System.out.println("Now the balance of acc 1 after debiting: " + acc1.debit(50_000));
        System.out.println("Now the balance of acc 2 after debiting: " + acc2.debit(40_000));

        //test transferTo method
        System.out.println("Now the balance of acc 2 after transfer: " + acc2.transferTo(acc1, 30_000));
        System.out.println(acc1); //toString()

    }
}