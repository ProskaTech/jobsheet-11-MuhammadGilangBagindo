package jobsheet11;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

public class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //metode
    public void info(){
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
    //akhir kelas program
}
