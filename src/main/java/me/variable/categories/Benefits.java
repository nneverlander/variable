package me.variable.categories;

/**
 * Created by adi on 3/4/17.
 */
public class Benefits {

    private int salary;
    private int joiningBonus;
    private int relocationBonus;
    private boolean healthInsurance;
    private boolean dentalInsurance;
    private boolean visionInsurance;
    private int matchPercent401k;
    private boolean stock;
    private boolean options;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJoiningBonus() {
        return joiningBonus;
    }

    public void setJoiningBonus(int joiningBonus) {
        this.joiningBonus = joiningBonus;
    }

    public int getRelocationBonus() {
        return relocationBonus;
    }

    public void setRelocationBonus(int relocationBonus) {
        this.relocationBonus = relocationBonus;
    }

    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(boolean healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public boolean isDentalInsurance() {
        return dentalInsurance;
    }

    public void setDentalInsurance(boolean dentalInsurance) {
        this.dentalInsurance = dentalInsurance;
    }

    public boolean isVisionInsurance() {
        return visionInsurance;
    }

    public void setVisionInsurance(boolean visionInsurance) {
        this.visionInsurance = visionInsurance;
    }

    public int getMatchPercent401k() {
        return matchPercent401k;
    }

    public void setMatchPercent401k(int matchPercent401k) {
        this.matchPercent401k = matchPercent401k;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public boolean isOptions() {
        return options;
    }

    public void setOptions(boolean options) {
        this.options = options;
    }
}
