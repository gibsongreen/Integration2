//Gibson Green
// This was just an example of using methods from one of the videos
//that I was trying on my own.
class Person {
  int age;
  String name;

  void speak() {
    System.out.println(
        "Hello, my name is " + name + " and I am " + age + " years " + "old.");
  }
}


public class Hello {
  public static void main(String[] args) {

    Person person1 = new Person();
    person1.age = 37;
    person1.name = "Adam Smith";
    person1.speak();

    Person person2 = new Person();
    person2.age = 20;
    person2.name = "Jammal Murray";
  }
}
