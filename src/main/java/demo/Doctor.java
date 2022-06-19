package demo;
// singleton scope demo
public class Doctor implements Staff {

    @Override
    public String toString() {
        return "Doctor{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    private String Qualification;

    public void assist(){
        System.out.println("Doctor is assisting!");
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
