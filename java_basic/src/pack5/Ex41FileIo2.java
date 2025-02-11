package pack5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

// 2 바이트 단위의 데이터에 대한 파일 입출력 - 한글 자료가 있을 때 효과적
public class Ex41FileIo2 {
	public void writeFile(File file, ArrayList<String> list) {
		try {
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter(file)); // 쓰기 객체 생성
			for (String ss:list) { writer.write(ss, 0, ss.length()); writer.newLine(); }
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("writeFile err : " +e.getMessage());
		}
	}
	public void readFile(File file) {
		try {		
			BufferedReader reader = 
					new BufferedReader(new FileReader(file)); // 읽기 객체 생성
			// 문자열 단순 더하기는 객체가 따로 생겨 메모리 소모가 생긴다. 이것을 효율적으로 하기위함
			StringBuffer buffer = new StringBuffer(); 
			String oneLine;
			while((oneLine = reader.readLine()) != null) {
				buffer.append(oneLine+"\n");
			}
			reader.close();
			System.out.println(buffer.toString()); // 버퍼에 누적된 문자열 출력
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("readFile err : " +e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호호호");
		list.add("good");
		File file = new File("C:/work/iotest4.txt");
		
		Ex41FileIo2 fileIo = new Ex41FileIo2();
		fileIo.writeFile(file, list);
		fileIo.readFile(file);
	}
}
