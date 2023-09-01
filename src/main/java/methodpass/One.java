package methodpass;

public class One {

    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);

        number++;
        System.out.println(number);

        One one = new One();
        one.addOne(number);
        System.out.println(number);

    }

    public int addOne(int number){
        return number++;
    }
}
