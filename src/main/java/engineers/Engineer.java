package engineers;

public abstract class Engineer extends Person {

    private int skill;
    private int experience;

    public Engineer(int age, int skill, int experience) {
        super(age);
        this.experience = experience;
        experienceAdmission(age, experience);
        this.skill = skill;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;

        if (skill < 0 || skill > 200) {
            throw new IllegalArgumentException("Skill is not valid");
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
        experienceAdmission(getAge(), experience);
    }

    private void experienceAdmission(int age, int experience) {
        if (age - experience < 18 || experience < 0) {
            throw new IllegalArgumentException("Experience is not valid");
        }
    }
}
