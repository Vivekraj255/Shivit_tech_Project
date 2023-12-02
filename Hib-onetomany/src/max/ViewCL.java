package max;

import java.util.List;

public class ViewCL {

	public static void main(String[] args) {
		ParentsDAO parentsDAO=new ParentsDAO();
		List<Father> list = parentsDAO.getView();
		for(Father p:list){
			System.out.println("father"+p.getFid()+" "+p.getName()+" "+p.getAdd());
			List<Child> clist = p.getList();
			for(Child c:clist){
				System.out.println(c.getCid()+" "+c.getName()+" "+(c.getGndr().equalsIgnoreCase("m")?"Male":"Female")); 
			}
		}
	}
	
}
