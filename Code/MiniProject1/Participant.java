package com.kh.vo;

public class Participant {
    private String name;
    private int age;
    private String phoneNumber;
    private int[] lottoNumbers;
    private int prizeMoney;

    public Participant(String name, int age, String phoneNumber, int[] lottoNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.lottoNumbers = lottoNumbers;
        this.prizeMoney = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        this.prizeMoney += prizeMoney;
    }
}
