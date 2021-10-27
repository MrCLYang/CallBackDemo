package com.lfkj.callbackdemo.Test05_Json;

/**
 * 作者：ycl
 * 时间：2021/10/26
 * 描述：
 */
public class test {

    private Integer id;
    private String lastName;
    private Integer age;
    private Double balance;
    private HobbyDescDTO hobbyDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public HobbyDescDTO getHobbyDesc() {
        return hobbyDesc;
    }

    public void setHobbyDesc(HobbyDescDTO hobbyDesc) {
        this.hobbyDesc = hobbyDesc;
    }

    public static class HobbyDescDTO {
        private String subject;
        private Integer score;
        private String sportDesc;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public String getSportDesc() {
            return sportDesc;
        }

        public void setSportDesc(String sportDesc) {
            this.sportDesc = sportDesc;
        }
    }
}
