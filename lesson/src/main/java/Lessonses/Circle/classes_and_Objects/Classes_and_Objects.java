package Lessonses.Circle.classes_and_Objects;

public class Classes_and_Objects {

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        test1.name="Vasya";
        test2.name="Den";
        test1.age=50;
        test2.age=30;
        System.out.println("My name is: "+ test1.name);
        System.out.println("My age is:" +test1.age);

        System.out.println("-----------");

        test1.speak();

        System.out.println("//////////////");
        test1.calculate();
        test2.calculate();

        System.out.println("******");
        System.out.println(test1.calc());
        System.out.println(test2.calc());

        /*Параметры метода setName*/

test1.setName("Oleg");
test1.speak();
        System.out.println("//////////////");
String s1="Serya";
test1.setName(s1);
test1.speak();

        System.out.println("**********");

test1.setNameAndAge("Name", 35);
test1.speak();

/*ИНКАПСУЛЯЦИЯ*/
        System.out.println("------");
        test2.setName("Nan");

        test2.speak();
    }

}

class Test {
String name;
int age;

void speak(){
    for(int i=0; i<3; i++){
        System.out.println("My name is: "+name+" i am "+age+" years old");
    }


    }
    void calculate(){
        int years = 65-age;
        System.out.println("Pensia v: "+years);

}

int calc(){
    int year = 65-age;
    return year;
}


/*ПАРАМЕТРЫ МЕТОДА*/

    void setName(String name){
        this.name = name;
    }

    void setNameAndAge(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Text2  {

    /*Инкапсляция*/
    private String name;
    private int age;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    void speak() {

            System.out.println("My name is: " + name );

    }

}
