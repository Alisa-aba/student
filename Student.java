package StudentClass;




import java.util.Random;

class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class Student extends Person {

    public boolean flag; //  Флаг, что студент решил все задания
    private int taskCount; // кол-во выполненных заданий
    public static int taskCountForAll; //  Количество решенных задач всеми студентами
    public Mentor mentor;

    public Student(boolean flag, int taskCount, Mentor mentor) {
        this(flag, 0, mentor);
    }

    public Student(String name, String surname, int age, boolean flag, int taskCount, Mentor mentor) {
        super(name, surname, age);
        this.flag = flag;
        this.taskCount = taskCount;
        this.mentor = mentor;
    }

    public enum Discipline {
        JAVA,
        ANDROID,
        PYTHON,
        WEB,
        UX,
        PROJECT_MANAGEMENT;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public static int getTaskCountForAll() {
        return taskCountForAll;
    }

    public static void setTaskCountForAll(int taskCountForAll) {
        Student.taskCountForAll = taskCountForAll;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void doHomework(int numberTask, Task[] tasks) {
        Student student = new Student();
        student.getTaskCount();
        int startNumberTask =

        if (taskCount+=1 == 20) {
            System.out.println("Вы решили все задачи!");
            return true;
        } else {
            System.out.println("Не все задачи решены!");
            return false;
        }

    }

    private void solveTask(Task count) { // выполнить дз
        if () {
            System.out.println("Задание решено!");
        } else {
            // Иначе у текущего отправлять ментору задание на проверку до тех пор, пока оно не будет зачтено

            taskCount++;
            taskCountForAll++;
        }
    }
}

class Mentor extends Person implements Staff {
    private boolean mood; // настроение
    private Random random; // Константа рандома

    public Mentor(boolean mood) {
        super();
        this(true, random);
    }

    public Mentor(String name, String surname, int age, boolean mood, Random random) {
        super(name, surname, age);
        this.mood = mood;
        this.random = random;
    }

    public void helStudent(Student student) {
        System.out.println(student.getName() + "не останавливайся на достигнутом, я тебе помогу");
    }
    public boolean testCode(Task task) {
        Random random = new Random();
        if (random.nextInt() < 1000) {
            System.out.println("Задача" + task.getNumber() + "не принята!");
            return false;
        } else {
            System.out.println("Задача принята!");
            return true;
        }
    }
}

abstract class Task {
    public int number;
    public String text;

    public Task() {
        this(0,"любой текст");
    }

    public Task(int number, String text) {
        this.number = number;
        this.text = text;
    }
}

class Test extends Task implements Autocheked {
    public String[] array;

    public Test(String[] array) {
        this.array = new String[] {"a", "b", "c"};
    }

    public Test(int number, String text, String[] array) {
        super(number, text);
        this.array = array;
    }
}
class DragAndDrop extends Task implements Autocheked {
    public String[][] arr;


    public DragAndDrop(String[][] arr) {
        super();
        this.arr = new String[][] {{"1", "2", "3"}, {"a", "b", "c"}};
    }

    public DragAndDrop(int number, String text, String[][] arr) {
        super(number, text);
        this.arr = arr;
    }


}

class Code extends Task {
    private String textСode;


    public Code(String textСode) {
        this(number, text, "какая-то строчка");
    }

    public Code(int number, String text, String textСode) {
        super(number, text);
        this.textСode = textСode;
    }
}