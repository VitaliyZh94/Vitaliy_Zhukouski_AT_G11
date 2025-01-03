package engineers;

public class AutomatedEngineer extends Engineer {

    final static int COEFF = 3;

    public AutomatedEngineer(int age, int experience) {
        super(age, experience * COEFF, experience);
    }

    public int getCoeff() {
        return COEFF;
    }

    public void setAge(int inputAge) {
    }
}
