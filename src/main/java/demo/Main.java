package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();
        Staff staff = context.getBean(Doctor.class);
        staff.assist();

    }
}
