package interfacerules.bill;

import java.nio.file.Path;
import java.util.List;

public class ComplexBillWriter implements BillWriter{

    public static void main(String[] args) {
        Bill bill = new Bill();
        List<String> list = bill.readBillItemsFromFile(Path.of("src/test/resources/billitems.txt"));
        String result = new ComplexBillWriter().writeBill(list);
        System.out.println(result);
    }

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s : billItems) {
            String[] parts = s.split(";");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int count = Integer.parseInt(parts[2]);
            sb.append(name + "; darabszám: " + count + ", egységár: " + price + ", összesen: " + price * count + " Ft\n");
        }
        return sb.toString();
    }
}
