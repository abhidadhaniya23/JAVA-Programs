class cricket {
    String name;
    int age;

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class match extends cricket {
    int no_of_odi;
    int no_of_test;

    void setData(String name, int age, int no_of_odi, int no_of_test) {
        super.setData(name, age);
    }

    void display() {
        super.display();
        System.out.println("number of odi : " + no_of_odi);
        System.out.println("number of test : " + no_of_test);
    }
}

public class program4_1 {
    public static void main(String[] args) {
        match person[] = new match[5];
        for (int i = 0; i < 5; i++) {
            person[i] = new match();
        }
        for (int i = 0; i < 5; i++) {
            person[i].name = args[0 + (i * 4)];
            person[i].age = Integer.parseInt(args[1 + (i * 4)]);
            person[i].no_of_odi = Integer.parseInt(args[2 + (i * 4)]);
            person[i].no_of_test = Integer.parseInt(args[3 + (i * 4)]);
            person[i].setData(person[i].name, person[i].age, person[i].no_of_odi, person[i].no_of_test);
        }
        for (int i = 0; i < 5; i++) {
            person[i].display();
        }
    }
}
