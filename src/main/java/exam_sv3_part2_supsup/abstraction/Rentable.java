package exam_sv3_part2_supsup.abstraction;

public interface Rentable {

    void rent(User user, int km);
    void closeRent();
    boolean isFree();
    String getId();
}
