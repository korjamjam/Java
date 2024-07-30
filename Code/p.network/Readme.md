package p.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 	네트워크 : 여러대의 컴퓨터들이 연결되어있는 통신망
 			=> 네트워크를 통해서 서로 데이터를 교환하기 위함
 			
 	IP주소 : 네트워크상에 각 컴퓨터들을 식별해줄 수 있는 번호(실제 주소와 동일한 역할을 한다고 생각하면 된다.)
 	
 	*서버와 클라이언트
 	*서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 또는 컴퓨터 (요청에대해서 응답해주는 것)
 	*클라이언트 : 서버에 요청을 하는 컴퓨터(서비스를 제공받는 고객)
 	
 	
 	- 서버에 요청하기위해서는 요청하고자하는 서버의 IP주소(또는 도메인), 포트번호를 알아야함
 	
 	* 현재 구동중인 서버가 있을 때
 	  클라이언트는 그 서버로 요청을 보낼 수 있음 -> 응답결과가 돌아옴
 	  
 	  -요청과 응답에 의해서 웹은 작동한다.("통신한다")
 	  -웹에서의 통신방식은 HTTP 프로토콜을 사용한다.
 	  
 	  *자바만가지고 서버와 클라이언트의 간단한 통신을 해보자
 	   이때 데이터를 입출력하고자한다면 서버와 클라이언트간에 스트림(통로)이 필요함
 	   
 	   소켓 프로그래밍(TCP / UDP)
 	   - TCP방식 : 데이터의 전송속도가 느려! 데이터가 정확하고 안정적으로 전달이 가능합니다(신뢰성이 요구되는 프로그램)
 	   - UDP방식 : 데이터의 전송속도가 빠름! 신뢰성이 없는 데이터 전달에 용이(데이터를 빠른속도로 전송하고자할 때)
 */

// InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
public class Run {
	public static void main(String[] args) {
		
		try {
			InetAddress localhost = InetAddress.getLocalHost(); //내PC에 대한 정보를 반환
			System.out.println(localhost); // 내pc명 + 내ip주소
			
			System.out.println("내 PC명 : " + localhost.getHostName()); // 호스트의 이름을 반환
			System.out.println("내 IP주소 : " + localhost.getHostAddress()); // 호스트의 IP주소를 반환
			
			System.out.println("=====================================");
			
			InetAddress googleHost = InetAddress.getByName("www.google.com"); //도메인명을 통해서 해당 호스트의 정보를 가져올 수 있다.
			
			System.out.println("google 서버명 : " + googleHost.getHostName()); // google의 이름을 반환
			System.out.println("google IP주소 : " + googleHost.getHostAddress()); // google의 IP주소를 반환
			


			System.out.println("=====================================");
			
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버의 호스트 개수 " + naverHost.length);
			
			for(InetAddress n : naverHost) {
				System.out.println("네이버 서버명 : " + n.getHostName()); // 네이버의 이름을 반환
				System.out.println("네이버 IP주소 : " + n.getHostAddress()); // 네이버의 IP주소를 반환
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}

}


package p.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;

		//요청하고자하는 서버 IP : 192.168.30.9
		//포트번호 : 3000
		
		int port = 3000;
		String serverIP = "192.168.30.9";
		
		Socket socket = null;
		
		try {
			//1) 서버로 연결 요청을 보내는 구문(연결을 요청하고자하는 서버의 ip와 지정된 포트를 전달)
			socket = new Socket(serverIP, port);
			//만약 통신에 실패했다면 null값이 socket객체에 담김
			
			if(socket != null) { //서버와 잘 연결된 경우
				System.out.println("서버와 연결 성공");
				
				//2)서버와 입출력기반 스트림 생성
				//3) 보조스트림을 활용해서 성능 개선
				
				
				//입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
				//출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					System.out.print("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage); //입력받은 내용 스트림에 담기
					pw.flush();//스트림에 담겨있는 내용을 강제로 보냄
					
					String message = br.readLine();
					System.out.println("서버로부터 전달받은 메세지 : " + message);
				}
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}


package p.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	/*
	 	TCP
	 	- 서버, 클라이언트간에 1:1 소켓통신
	 	- 데이터를 교환하기에 앞서 서버, 클라이언트 연결이 되어야한다.(서버가 먼저 실행되어 클라이언트의 요청을 기다린다.)
	 	- 신뢰성있는 데이터 전달 가능
	 	
	 	socket
	 	- 프로세스간의 통신을 담당
	 	- input/ouputStream을 가지고 있다.(해당 스트림을 이용해서 입출력이 가능하다)
	 	
	 	ServerSocket
	 	-포트와 연결되어 외부의 연결요청을 기다림-> 요청이 들어오면 수락해준다.
	 	수락 -> 통신할 수 있는 socket생성
	 */
	//서버용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		//1) 포트번호 지정(서버측에서 몇번 포트로 통로를 열것인가?)
		int port = 3000;
		
		try {
			//2) ServerSocket 객체생성시 포트와 결합(Bind)
			ServerSocket server = new ServerSocket(port);
			
			System.out.println("클라이언트 요청을 기다리고 있습니다.");
			
			//3)요청을 기다렸다 요청이 오면 -> 요청 수락 후 클라이언트와 통신할 수 있는 서버쪽 소켓객체 생성
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함...");
			
			//4) 클라이언트와 입출력 기반 스트림 생성(바이트스트림밖에 안됨
			//5) 보조스트림을 활용해서 성능개선
			
			//입력용 스트림(클라이언트로부터 전달된 값을 한줄단위로 읽어드리기 위해서 입력용 스트림 사용)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//BufferedReader : 데이터 입력시 readLine메소드 이용가능
			
			//출력용 스트림
			pw = new PrintWriter(socket.getOutputStream());
			//PrintWriter : 데이터출력시 print(), println() 메소드를 가지고 있는 보조 스트림
			
			while(true) {
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
				
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); //클라이언트에게 출력
				pw.flush(); //현재 스트림에 있는 데이터를 강제로 내보내기
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}


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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보낼메세지 : ");
		String msg = sc.nextLine();
		
		InetAddress inet;
		int port = 4000;
		
		try (DatagramSocket dsoc = new DatagramSocket();){
			inet = InetAddress.getByName("192.168.30.2");
		
			//전송할 데이터 생성 DatagramPacket(전송할 데이터의 byte배열, 전송할데이터의 길이, ip정보를 담은 inetaddress객체, 전송할 port)
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
			dsoc.send(dp);
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		
		int port = 4000;
				
		//서버가 4000포트를 결합하여 요청을 받을 준비를 한다.
		try (DatagramSocket dsoc = new DatagramSocket(port)){
			
			//전송받은 데이터를 지정할 바이트배열
			byte[] data = new byte[60000];
			
			//클라이언트로부터 받을 peacket객체 생성
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("데이터 받을 준비 완료");
			
			while(true) {
				//데이터전송된 것 받아주기
				dsoc.receive(dp);
				
				//데이터확인
				System.out.println("클라이언트 ip : " + dp.getAddress());
				String message = new String(dp.getData(), "UTF-8");
				System.out.println("클라이언트가 보낸 내용 : " + message);
				
			}
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

