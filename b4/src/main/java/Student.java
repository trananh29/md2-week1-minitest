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
        Scanner sc =new Scanner(System.in);
        System.out.println("input Name");
        newStuden1.setName(sc.nextLine());
        System.out.println("input Age");
        newStuden1.setAge(sc.nextInt());
        System.out.println("input Class");
        newStuden1.setClas(sc.nextLine());
        System.out.println("the person is");

        System.out.println(newStuden1.getName()+ newStuden1.getClas()+newStuden1.getAge());
    }

}

