package me.variable.service.enums;

import me.variable.common.Enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adi on 3/5/17.
 */
public class EnumService {

    private static EnumService INSTANCE;
    private Map<String, Map<String, String>> allEnums;

    private EnumService() {
    }

    public static synchronized EnumService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EnumService();
        }
        return INSTANCE;
    }

    public Map<String, Map<String, String>> getAll() {
        if (allEnums != null && !allEnums.isEmpty()) {
            return allEnums;
        }

        allEnums = new HashMap<>();
        allEnums.put(Enums.CompanyType.class.getSimpleName(), getCompanyTypeMap());
        allEnums.put(Enums.CompanySize.class.getSimpleName(), getCompanySizeMap());
        allEnums.put(Enums.CompanyFunding.class.getSimpleName(), getCompanyFundingMap());
        allEnums.put(Enums.EducationType.class.getSimpleName(), getEducationTypeMap());
        allEnums.put(Enums.EducationLevel.class.getSimpleName(), getEducationLevelMap());
        allEnums.put(Enums.JobType.class.getSimpleName(), getJobTypeMap());
        allEnums.put(Enums.SkillLevel.class.getSimpleName(), getSkillLevelMap());

        return allEnums;
    }

    private Map<String, String> getCompanyTypeMap() {
        Map<String, String> ret = new HashMap<>();
        Enums.CompanyType[] values = Enums.CompanyType.values();
        for (Enums.CompanyType e : values) {
            ret.put(e.name(), e.value());
        }
        return ret;
    }

    private Map<String, String> getCompanySizeMap() {
        Map<String, String> ret = new HashMap<>();
        Enums.CompanySize[] values = Enums.CompanySize.values();
        for (Enums.CompanySize e : values) {
            ret.put(e.name(), e.value());
        }
        return ret;
    }

    private Map<String, String> getCompanyFundingMap() {
        Map<String, String> ret = new HashMap<>();
        Enums.CompanyFunding[] values = Enums.CompanyFunding.values();
        for (Enums.CompanyFunding e : values) {
            ret.put(e.name(), e.value());
        }
        return ret;
    }

    private Map<String, String> getEducationTypeMap() {
        Map<String, String> ret = new HashMap<>();
        Enums.EducationType[] values = Enums.EducationType.values();
        for (Enums.EducationType e : values) {
            ret.put(e.name(), e.value());
        }
        return ret;
    }

    private Map<String, String> getEducationLevelMap() {
        Map<String, String> ret = new HashMap<>();
        Enums.EducationLevel[] values = Enums.EducationLevel.values();
        for (Enums.EducationLevel e : values) {
            ret.put(e.name(), e.value());
        }
        return ret;
    }

    private Map<String, String> getJobTypeMap() {
        Map<String, String> ret = new HashMap<>();
        Enums.JobType[] values = Enums.JobType.values();
        for (Enums.JobType e : values) {
            ret.put(e.name(), e.value());
        }
        return ret;
    }

    private Map<String, String> getSkillLevelMap() {
        Map<String, String> ret = new HashMap<>();
        Enums.SkillLevel[] values = Enums.SkillLevel.values();
        for (Enums.SkillLevel e : values) {
            ret.put(e.name(), e.value());
        }
        return ret;
    }

}
