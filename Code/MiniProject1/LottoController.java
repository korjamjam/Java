package com.kh.control;

import java.util.Random;

import com.kh.vo.Participant;

public class LottoController {
    private Participant[] participants;
    private int participantCount;

    public LottoController() {
        participants = new Participant[10];
        participantCount = 0;
    }

    public boolean addParticipant(Participant participant) {
        if (participantCount < 10) {
            participants[participantCount] = participant;
            participantCount++;
            return true;
        } else {
            return false;
        }
    }

    public int getParticipantCount() {
        return participantCount;
    }

    public Participant getParticipant(int index) {
        if (index >= 0 && index < participantCount) {
            return participants[index];
        }
        return null;
    }

    public int[] generateRandomNumbers() {
        Random rand = new Random();
        int[] numbers = new int[45];
        for (int i = 0; i < 45; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            int randomIndexToSwap = rand.nextInt(numbers.length);
            int temp = numbers[randomIndexToSwap];
            numbers[randomIndexToSwap] = numbers[i];
            numbers[i] = temp;
        }
        int[] result = new int[6];
        System.arraycopy(numbers, 0, result, 0, 6);
        return result;
    }

    public int calculatePrize(int[] userNumbers, int[] winningNumbers) {
        int matchCount = 0;
        for (int userNumber : userNumbers) {
            for (int winningNumber : winningNumbers) {
                if (userNumber == winningNumber) {
                    matchCount++;
                    break;
                }
            }
        }
        switch (matchCount) {
            case 6:
                return 10000000; // 1등
            case 5:
                return 2500000; // 2등
            case 4:
                return 500000; // 3등
            case 3:
                return 50000; // 4등
            default:
                return 5000; // 5등
        }
    }

    public int searchPrizeByNameAndPhone(String name, String phoneNumber) {
        for (int i = 0; i < participantCount; i++) {
            if (participants[i].getName().equals(name) && participants[i].getPhoneNumber().equals(phoneNumber)) {
                return participants[i].getPrizeMoney();
            }
        }
        return 0;
    }

    public void printAllParticipants() {
        for (int i = 0; i < participantCount; i++) {
            Participant p = participants[i];
            System.out.println("이름: " + p.getName() + ", 전화번호: " + p.getPhoneNumber() + ", 총 상금: " + p.getPrizeMoney());
        }
    }

    public boolean removeParticipant(String name, String phoneNumber) {
        for (int i = 0; i < participantCount; i++) {
            if (participants[i].getName().equals(name) && participants[i].getPhoneNumber().equals(phoneNumber)) {
                for (int j = i; j < participantCount - 1; j++) {
                    participants[j] = participants[j + 1];
                }
                participants[participantCount - 1] = null;
                participantCount--;
                return true;
            }
        }
        return false;
    }
}
