package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


//        Doctor doctor = new Doctor();
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();
        Staff staff = context.getBean(Nurse.class);
        staff.assist();
        Staff staff2 = context.getBean(Doctor.class);
        staff2.assist();


    }
}
