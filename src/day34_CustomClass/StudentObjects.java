package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Katiana", "Laotian", 20, 3.2,'F', false);


        Student student2 = new Student();
        student2.setStudentInfo("Mike", "American", 34, 3.7, 'M', false);

        Student student3 = new Student();
        student3.setStudentInfo("Anna", "Ukranian", 35, 2.5, 'F', true);

        Student[] students = {student1, student2, student3};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p -> p.gpa <= 3.0 ); // if gpa is below 3.0, will be removed from list
        System.out.println(canGraduate.size());

        for(int i=0; i <canGraduate.size(); i++ ){
           Student each = canGraduate.get(i);
            System.out.println(each.name+" can graduate");
        }

        ArrayList<Student> cannotGraduate = new ArrayList<>(Arrays.asList(students));
        cannotGraduate.removeIf(p -> p.gpa > 3.0 ); // if gpa is below 3.0, will be removed from list
        System.out.println(cannotGraduate.size());

        for(int i=0; i <cannotGraduate.size(); i++ ){
            Student each = cannotGraduate.get(i);
            System.out.println(each.name+" cannot graduate");
        }



    }
}
