package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		// Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 합니다.
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 메시지를 입력받습니다.
		System.out.print("보낼메세지 : ");
		String msg = sc.nextLine();
		
		// InetAddress 객체와 포트 번호를 선언합니다.
		InetAddress inet;
		int port = 4000;
		
		// try-with-resources 구문을 사용하여 DatagramSocket 객체를 생성합니다.
		try (DatagramSocket dsoc = new DatagramSocket();) {
			// 지정된 IP 주소를 통해 InetAddress 객체를 생성합니다.
			inet = InetAddress.getByName("192.168.30.2");
		
			// 전송할 데이터를 생성합니다. DatagramPacket(전송할 데이터의 byte 배열, 전송할 데이터의 길이, IP 정보를 담은 InetAddress 객체, 전송할 포트)
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
			
			// DatagramPacket을 통해 데이터를 전송합니다.
			dsoc.send(dp);
		
		} catch (SocketException e) {
			// 소켓 생성 및 접근 중 발생한 예외를 처리합니다.
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// 호스트 이름을 IP 주소로 변환하는 과정에서 발생한 예외를 처리합니다.
			e.printStackTrace();
		} catch (IOException e) {
			// 입출력 예외를 처리합니다.
			e.printStackTrace();
		}
		
		// Scanner 객체를 닫습니다.
		sc.close();
	}
}
