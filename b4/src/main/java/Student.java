import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private  String clas;
    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
       this.name=newName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
    public String getClas() {
        return this.clas;
    }
    public void setClas(String newClas) {
        this.clas=newClas;
    }

    public static void main(String[] args) {
        Student newStuden1= new Student();
        newOne(newStuden1);
//        Scanner sc =new Scanner(System.in);
//        System.out.println("input Name");
//        newStuden1.setName(sc.nextLine());
//        System.out.println("input class");
//        newStuden1.setClas(sc.nextLine());
//        System.out.println("input Age");
//        newStuden1.setAge(sc.nextInt());
//        sc.close();
//        System.out.println("the person is");
//
//       System.out.println(newStuden1.getName()+ newStuden1.getClas()+newStuden1.getAge());
    }
public static Student newOne(Student newFresher) {
    Scanner sc1 =new Scanner(System.in);
    System.out.println("input Name");
    newFresher.setName(sc1.nextLine());
    System.out.println("input class");
    newFresher.setClas(sc1.nextLine());
    System.out.println("input Age");
    newFresher.setAge(sc1.nextInt());
    sc1.close();
    System.out.println(newFresher.getName()+ newFresher.getClas()+newFresher.getAge());
    return newFresher;
}
}

