package com.wangkaijun;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Proson {

    private String name;

    private Integer age;

    private Properties properties;

    private List<String> list;

    private Set<String> set;

    private Map<String,String> map;

    private Occupation occupation;


//    public Proson(){}

    public Proson(String name, Integer age, Properties properties, List<String> list, Set<String> set, Map<String, String> map, Occupation occupation) {
        this.name = name;
        this.age = age;
        this.properties = properties;
        this.list = list;
        this.set = set;
        this.map = map;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
}
