package StudentClass;

public interface Staff {
    void helpStudent(Student student);
    default void giveAdditionalInformation() {
        System.out.println("https://habr.com/ru/flows/develop/top/");
    }
}
