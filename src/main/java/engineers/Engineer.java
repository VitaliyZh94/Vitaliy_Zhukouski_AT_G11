package engineers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Engineer extends Person {

    private static final Logger LOGGER = LogManager.getLogger(Engineer.class);

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
            LOGGER.error("Skill is not valid: skill < 0 || skill > 200");
//            throw new IllegalArgumentException();
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
            //LOGGER.error("Experience is not valid: age - experience < 18 || experience < 0");
            throw new IllegalArgumentException("Experience is not valid: age - experience < 18 || experience < 0");
        }
    }
}
