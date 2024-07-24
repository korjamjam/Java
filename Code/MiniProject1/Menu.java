package com.kh.menu;

import java.util.Scanner;

import com.kh.control.LottoController;
import com.kh.vo.Participant;

public class Menu {
    private LottoController controller;
    private Scanner scanner;

    public Menu() {
        controller = new LottoController();
        scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        while (true) {
            System.out.println("1. 로또 참여");
            System.out.println("2. 상금 확인");
            System.out.println("3. 참여자 정보 출력");
            System.out.println("4. 참여 종료");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    joinLotto();
                    break;
                case 2:
                    checkPrize();
                    break;
                case 3:
                    printParticipants();
                    break;
                case 4:
                    removeParticipant();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
            }
        }
    }

    private void joinLotto() {
        if (controller.getParticipantCount() >= 10) {
            System.out.println("참여자가 너무 많습니다. 더 이상 참여할 수 없습니다.");
            return;
        }
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        System.out.print("전화번호: ");
        String phoneNumber = scanner.nextLine();

        int[] lottoNumbers = new int[6];
        System.out.println("로또 번호 6개를 입력하세요 (1~45):");
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + "번째 번호: ");
            lottoNumbers[i] = scanner.nextInt();
            if (lottoNumbers[i] < 1 || lottoNumbers[i] > 45) {
                System.out.println("번호는 1에서 45 사이여야 합니다. 다시 입력하세요.");
                i--; // 잘못된 번호를 입력했으므로 인덱스를 되돌림
            }
        }

        Participant participant = new Participant(name, age, phoneNumber, lottoNumbers);
        if (controller.addParticipant(participant)) {
            System.out.println("로또 참여가 완료되었습니다.");
        } else {
            System.out.println("참여 인원이 가득 찼습니다. 참여할 수 없습니다.");
        }
    }

    private void checkPrize() {
        int[] winningNumbers = controller.generateRandomNumbers();
        System.out.print("당첨 번호: ");
        for (int num : winningNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < controller.getParticipantCount(); i++) {
            Participant p = controller.getParticipant(i);
            int prize = controller.calculatePrize(p.getLottoNumbers(), winningNumbers);
            p.setPrizeMoney(prize);
            System.out.println(p.getName() + "님의 상금은 " + prize + "원 입니다.");
        }
    }

    private void printParticipants() {
        controller.printAllParticipants();
    }

    private void removeParticipant() {
        System.out.print("삭제할 참여자의 이름: ");
        String name = scanner.nextLine();
        System.out.print("삭제할 참여자의 전화번호: ");
        String phoneNumber = scanner.nextLine();

        if (controller.removeParticipant(name, phoneNumber)) {
            System.out.println("참여자가 삭제되었습니다.");
        } else {
            System.out.println("참여자를 찾을 수 없습니다.");
        }
    }
}
