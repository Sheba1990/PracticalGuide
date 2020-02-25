//#5
class Subject {
    public String name;

    private int age;
    // if the variable is private, we need to create Getters & Setters for it
    // we won't be able to change the attributes of private variable without Getters & Setters

    public Subject() {// this is constrictor 1
        name = "NoName";// in this constructor we set attributes of variable String name to - "NoName"
        age = 0;// and of variable int age to - 0
    }

    public Subject(String n) {// constructor 2
        this.name = n;
    }

    public void setAge(int a) {// method setter
        this.age = a;
    }

    public int getAge() {// method getter
        return age;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
