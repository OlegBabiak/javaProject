package lesson2HW.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Skills {
    private String[] skillsArr;

    public Skills() {
    }

    public Skills(String[] skillsArr) {
        this.skillsArr = skillsArr;
    }

    public String[] getSkillsArr() {
        return skillsArr;
    }

    public void setSkillsArr(String[] skillsArr) {
        this.skillsArr = skillsArr;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skillsArr=" + Arrays.toString(skillsArr) +
                '}';
    }
}
