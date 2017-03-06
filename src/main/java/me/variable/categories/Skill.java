package me.variable.categories;

import me.variable.common.Enums;

/**
 * Created by adi on 3/4/17.
 */
public class Skill {

    private String name;
    private Enums.SkillLevel level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enums.SkillLevel getLevel() {
        return level;
    }

    public void setLevel(Enums.SkillLevel level) {
        this.level = level;
    }
}
