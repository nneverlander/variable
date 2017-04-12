package me.variable.test.util;

import me.variable.categories.*;
import me.variable.common.Enums;
import me.variable.common.Location;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by adi on 3/5/17.
 */
public class Utils {

    public static Location buildTestLocation(int count) {
        Location location = new Location();
        location.setCity("city-test-" + count);
        location.setAddress("address-test-");
        location.setCountry("country-test-" + count);
        location.setState("state-test-" + count);
        location.setZip("zip-test-" + count);
        location.setLat(ThreadLocalRandom.current().nextDouble(-90, 90));
        location.setLng(ThreadLocalRandom.current().nextDouble(-180, 180));
        return location;
    }

    public static Office buildTestOffice(int count) {
        Office office = new Office();
        Location location = buildTestLocation(count);
        office.setLocation(location);

        List<String> facilities = new ArrayList<>();
        List<String> conveniences = new ArrayList<>();
        facilities.add("massage-test-" + count);
        facilities.add("gym-test-" + count);
        conveniences.add("bike-parking-test-" + count);
        conveniences.add("parking-test-" + count);
        conveniences.add("close-to-public-transport-test-" + count);
        office.setFacilities(facilities);
        office.setConveniences(conveniences);
        return office;

    }

    public static Education buildTestEducation(int educationCount, int orgCount, int activityCount, int awardCount) {
        Education education = new Education();
        education.setSchoolName("school-name-test-" + educationCount);

        Enums.EducationLevel[] values = Enums.EducationLevel.values();
        int ordinal = ThreadLocalRandom.current().nextInt(0, values.length);
        education.setLevel(values[ordinal]);

        Enums.EducationType[] values1 = Enums.EducationType.values();
        ordinal = ThreadLocalRandom.current().nextInt(0, values1.length);
        education.setType(values1[ordinal]);

        education.setField("field-test-" + educationCount);
        education.setGpa((float) ThreadLocalRandom.current().nextDouble(1, 4));

        education.setStarted(randomDate().getTime());
        education.setEnded(randomDate().getTime());
        education.setLocation(Utils.buildTestLocation(educationCount));

        List<Award> awards = new ArrayList<>();
        awards.add(buildTestAward(awardCount++));
        awards.add(buildTestAward(awardCount++));
        awards.add(buildTestAward(awardCount));

        List<String> orgs = new ArrayList<>();
        orgs.add("org-test-" + orgCount++);
        orgs.add("org-test-" + orgCount++);
        orgs.add("org-test-" + orgCount);

        List<String> activities = new ArrayList<>();
        activities.add("activity-test-" + activityCount++);
        activities.add("activity-test-" + activityCount++);
        activities.add("activity-test-" + activityCount);

        education.setAwards(awards);
        education.setOrgs(orgs);
        education.setActivities(activities);

        return education;
    }

    public static WorkEx buildTestWorkEx(int workExCount, int dutiesCount, int learningsCount, int skillCount) {
        WorkEx workEx = new WorkEx();
        workEx.setOccupation("occupation-test-" + workExCount);
        workEx.setCompany("company-test-" + workExCount);
        workEx.setField("field-test-" + workExCount);
        workEx.setStarted(randomDate().getTime());
        workEx.setEnded(randomDate().getTime());
        workEx.setLocation(Utils.buildTestLocation(workExCount));

        Enums.JobType[] values = Enums.JobType.values();
        int ordinal = ThreadLocalRandom.current().nextInt(0, values.length);
        workEx.setType(values[ordinal]);

        List<String> duties = new ArrayList<>();
        duties.add("duty-test-" + dutiesCount++);
        duties.add("duty-test-" + dutiesCount++);
        duties.add("duty-test-" + dutiesCount++);
        duties.add("duty-test-" + dutiesCount);

        List<Skill> skills = new ArrayList<>();
        skills.add(buildTestSkill(skillCount++));
        skills.add(buildTestSkill(skillCount++));
        skills.add(buildTestSkill(skillCount++));
        skills.add(buildTestSkill(skillCount));

        List<String> learnings = new ArrayList<>();
        duties.add("learning-test-" + learningsCount++);
        duties.add("learning-test-" + learningsCount++);
        duties.add("learning-test-" + learningsCount);

        workEx.setDuties(duties);
        workEx.setSkills(skills);
        workEx.setLearnings(learnings);

        workEx.setInterestedInField(ThreadLocalRandom.current().nextBoolean());

        return workEx;
    }

    public static Skill buildTestSkill(int skillCount) {
        Skill skill = new Skill();
        skill.setName("skill-name-test-" + skillCount);

        Enums.SkillLevel[] values = Enums.SkillLevel.values();
        int ordinal = ThreadLocalRandom.current().nextInt(0, values.length);
        skill.setLevel(values[ordinal]);

        return skill;
    }

    public static Award buildTestAward(int awardCount) {
        Award award = new Award();
        award.setAwardedBy("awarded-by-" + awardCount);
        award.setName("name-test-" + awardCount);
        award.setDateAwarded(randomDate().getTime());
        return award;
    }

    public static CompanyCulture buildTestCompanyCulture() {
        CompanyCulture companyCulture = new CompanyCulture();

        Enums.CompanySize[] values = Enums.CompanySize.values();
        int ordinal = ThreadLocalRandom.current().nextInt(0, values.length);
        companyCulture.setSize(values[ordinal]);

        Enums.CompanyFunding[] values1 = Enums.CompanyFunding.values();
        ordinal = ThreadLocalRandom.current().nextInt(0, values1.length);
        companyCulture.setFunding(values1[ordinal]);

        return companyCulture;
    }

    public static Job buildTestJob(int count) {
        Job job = new Job();
        job.setTitle("job-title-test-" + count);
        job.setWorkScheduleFlexible(ThreadLocalRandom.current().nextBoolean());
        job.setWfhAllowed(ThreadLocalRandom.current().nextBoolean());
        job.setRemoteAllowed(ThreadLocalRandom.current().nextBoolean());

        Enums.JobType[] values = Enums.JobType.values();
        int ordinal = ThreadLocalRandom.current().nextInt(0, values.length);
        job.setJobType(values[ordinal]);

        Office office = Utils.buildTestOffice(count);
        Benefits benefits = buildTestBenefits();
        job.setOffice(office);
        job.setBenefits(benefits);

        return job;
    }

    public static Benefits buildTestBenefits() {
        Benefits benefits = new Benefits();
        benefits.setSalary(ThreadLocalRandom.current().nextInt(50000, 200000));
        benefits.setJoiningBonus(ThreadLocalRandom.current().nextInt(5000, 100000));
        benefits.setRelocationBonus(ThreadLocalRandom.current().nextInt(3000, 20000));
        benefits.setHealthInsurance(ThreadLocalRandom.current().nextBoolean());
        benefits.setDentalInsurance(ThreadLocalRandom.current().nextBoolean());
        benefits.setVisionInsurance(ThreadLocalRandom.current().nextBoolean());
        benefits.setMatchPercent401k(ThreadLocalRandom.current().nextInt(0, 101));
        benefits.setStock(ThreadLocalRandom.current().nextBoolean());
        benefits.setOptions(ThreadLocalRandom.current().nextBoolean());
        return benefits;
    }

    public static Calendar randomDate() {
        int randYear = ThreadLocalRandom.current().nextInt(2010, 2017);
        int randMonth = ThreadLocalRandom.current().nextInt(0, 12);
        int randDate = ThreadLocalRandom.current().nextInt(1, 28);
        Calendar calendar = Calendar.getInstance();
        calendar.set(randYear, randMonth, randDate);
        return calendar;
    }

}
