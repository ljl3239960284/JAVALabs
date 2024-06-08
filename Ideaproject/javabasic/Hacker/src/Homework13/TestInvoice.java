package Homework13;

public class TestInvoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setLineItem(getListOfLineItems());
        System.out.println("Amount Due:"+invoice.getTotal() );

        System.out.println(invoice);
    }
    public static LineItem[] getListOfLineItems() {
        LineItem []list = new LineItem[3];

        Product p0 = new Product("Toaster",29.95);
        list[0] = new LineItem();
        list[0].addProduct(p0);
        list[0].addProduct(p0);
        list[0].addProduct(p0);

        Product p1 = new Product("Hair Dryer",24.95);
        list[1] = new LineItem();
        list[1].addProduct(p1);

        Product p2 = new Product("Car Vacuum",19.95);
        list[2] = new LineItem();
        list[2].addProduct(p2);
        list[2].addProduct(p2);

        return list;
    }
}
