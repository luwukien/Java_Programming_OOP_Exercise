import data.InvoiceItem;

public class Main {
    public static void main(String[] args) {
        InvoiceItem item1 = new InvoiceItem("000001", "Khăn giấy", 5, 10_000);
        InvoiceItem item2 = new InvoiceItem("000002", "Mì tôm", 60, 3000);
        InvoiceItem item3 = new InvoiceItem("000003", "Nabati", 50, 11_000);

        //test getter and setter

        System.out.println("The id of item 1 is " + item1.getId());
        System.out.println("desc item 2 is " + item2.getDesc());
        System.out.println("qty item 3 is " + item3.getQty());
        //....
        System.out.println(item1.toString());

        //test total
        System.out.println("The total of item 1 is " + item1.getTotal());
    }
}