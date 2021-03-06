package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.setQualification("FRCS");
        System.out.println(doctor1);

        Doctor doctor2 = context.getBean(Doctor.class);
        System.out.println(doctor2);


    }
}
