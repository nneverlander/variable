package me.variable.common;

/**
 * Created by adi on 3/5/17.
 */
public class Enums {

    public enum CompanyType {
        PUBLIC, PRIVATE;

        public String value() {
            return toString();
        }
    }

    public enum CompanySize {
        STARTUP("1-10"), SMALL("11-100"), MEDIUM("100-1000"), LARGE("1000-10000"), HUGE("10000+");

        private String employeeCount;

        CompanySize(String employeeCount) {
            this.employeeCount = employeeCount;
        }

        public String value() {
            return employeeCount;
        }
    }

    public enum CompanyFunding {
        BOOTSTRAPPED("$1-$10000"), ANGEL("$10000-$100,000"), SEED("$100,000-$500,000"), SERIES_A("$500,000-$2,000,000"),
        SERIES_B("$2,000,000-$10,000,000"), SERIES_C("$10,000,000-$20,000,000"), SERIES_D_AND_ABOVE("$20,000,000+");

        private String funding;

        CompanyFunding(String funding) {
            this.funding = funding;
        }

        public String value() {
            return funding;
        }
    }

    public enum EducationType {
        HIGHSCHOOL, COLLEGE, HOMESCHOOL, SELF_TAUGHT, NO_FORMAL_EDUCATION, LIFE;

        public String value() {
            return toString();
        }
    }

    public enum EducationLevel {
        SCHOOL, BACHELORS, DIPLOMA, MASTERS, PHD;

        public String value() {
            return toString();
        }
    }

    public enum JobType {
        FULLTIME, PARTTIME, REMOTE, CONTRACTOR, VENDOR, INTERN, FREELANCE, SELF_EMPLOYMENT, HOURLY, SEASONAL, VOLUNTEERING;

        public String value() {
            return toString();
        }
    }

    public enum SkillLevel {
        BEGINNER("beginner"), TINKERER("tinkerer"), INTERMEDIATE("intermediate"), EXPERT("expert");

        private String description;

        SkillLevel(String description) {
            this.description = description;
        }

        public String value() {
            return description;
        }
    }

}
