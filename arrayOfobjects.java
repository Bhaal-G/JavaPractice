class Student{
    int rollno;
    String name;
    int marks;
}

public class arrayOfobjects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno=2;
        s1.name="Ellen";
        s1.marks=400;

        Student s2=new Student();
        s2.rollno=4;
        s2.name="John";
        s2.marks=500;

        Student s3=new Student();
        s3.rollno=6;
        s3.name="Kratos";
        s3.marks=700;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<3;i++){
            System.out.println(students[i].name+" : "+ students[i].marks);
        }
        
        for(Student stud: students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
    
}
