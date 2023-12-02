package max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CL {

	public static void main(String[] args){
		List<Child> l=new ArrayList<Child>();
		Father f = new Father();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Father Name");
		String fn = s.nextLine();
		 f.setName(fn);
		System.out.println("Add ");
		String add = s.nextLine();
		 f.setAdd(add);
		
		while(true){
			Child c =new Child();
			System.out.println("Child Name");
			String cn = s.nextLine();
			 c.setName(cn);
			System.out.println("GNDR");
			String gndr = s.nextLine();
			 c.setGndr(gndr);
			 System.out.println("Y/N");
			String st = s.nextLine();
			 l.add(c);
			
				if (!st.equalsIgnoreCase("Y")){
					break;
				}
		}
		f.setList(l);
		
		ParentsDAO pp = new ParentsDAO();
		if(pp.insertDetail(f)){
			System.out.println("Successss");
		}
		else{
			System.out.println("Failll");
		}
		
	}
	
}
