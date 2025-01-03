package engineers;

public class ManualEngineer extends Engineer {

    final static int COEFF = 2;

    public ManualEngineer(int age, int experience) {
        super(age, experience * COEFF, experience);
    }

    public int getCoeff() {
        return COEFF;
    }
}
