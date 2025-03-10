package pack5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// 1 바이트 단위의 데이터에 대한 파일 입출력 - 보통 클래스의 이름에 stream이 포함된다
// 문자, 그림, 미디어 등 다양한 종류의 데이터 처리가 가능하다
public class Ex40FileIo {
	public void writeFile(File file, ArrayList<String> list) {
		try {
			BufferedWriter writer = 
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8")); // 출력 객체 생성
			for (String ss:list) { 
				writer.write(ss, 0, ss.length());
				writer.newLine();
				}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("writeFile err : " +e.getMessage());
		}
	}
	public void readFile(File file) {
		try {		
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8")); // 입력 객체 생성
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
		list.add("하하하");
		list.add("good");
		File file = new File("C:/work/iotest3.txt");
		
		Ex40FileIo fileIo = new Ex40FileIo();
		fileIo.writeFile(file, list);
		fileIo.readFile(file);
	}
}
