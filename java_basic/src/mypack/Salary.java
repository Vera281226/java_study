package mypack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Salary {
	private ArrayList<SalaryDto> list = new ArrayList<SalaryDto>();
	
	public void insertData(String[] data) {
       for(int i=0; i<data.length;i++) {
		StringTokenizer tokenizer = new StringTokenizer(data[i], ",");
		SalaryDto dto = new SalaryDto(Integer.parseInt(tokenizer.nextToken()), tokenizer.nextToken(),
				   Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()));
		list.add(dto);
       }
	}
	public void excute() {
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		
		for(SalaryDto dto:list) {
			LocalDate now = LocalDate.now();
			int gunsook=0;
			int soo =0;
			double gongje = 0;
			int year = now.getYear()-dto.getYear();
			int total = dto.getSalary()+gunsook;
			
			if(year>9) gunsook=1000000;
			else if(year>4) gunsook=450000;	
			else gunsook=150000;
				
			if(total>=3000000) gongje = total*0.005;
			else if(total>=2000000) gongje = total*0.003;
			else gongje = total*0.0015;
			
			soo = total-(int)gongje;
			
			System.out.println(dto.getNumber()+"\t"+dto.getName()+"\t"+dto.getSalary()
								  +"\t"+(year)+"\t"+gunsook+"\t"+(int)gongje+"\t"+soo);
		}
	}
	
	public static void main(String[] args) {
		Salary salary = new Salary();
		
		String data[] = new String[3];
		data[0] = "1,홍길동,3000000,2000";
		data[1] = "2,나길동,2000000,2010";
		data[2] = "3,고길동,1000000,2020";
		salary.insertData(data);	
		salary.excute();
	}
}
	
