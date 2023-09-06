package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {

        Tea tea = new Tea("Fekete tea", 200);
        HerbalTea herbalTea = new HerbalTea("Macskagyökér", 300);

        System.out.println(tea.getName());
        System.out.println(tea.getPrice());
        System.out.println();
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());

    }
}
