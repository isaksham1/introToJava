//use record to create an immutable represent of student(name, id, age) and use its  constructor for initialization, equals to compare 2 students methods. Also keep a static counter to keep the count of objects created.

package Java9and17.Q11;

record Student(String name,int id, int age){
    static int counter = 0;
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        counter++;
    }

}
public class Program11 {
    public static void main(String[] args) {
        Student student1 = new Student("Saksham",111,28);
        Student student2 = new Student("Garg",113,29);
        System.out.println(student1);
        System.out.println(student1.age());
        System.out.println(student1.id());
        System.out.println(student1.name());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2));
        System.out.println(Student.counter);
    }
}