package max;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ParentsDAO {
	
	public List<Father> getView(){
		try {
			Session s =  SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Criteria cr = s.createCriteria(Father.class);
			List<Father> list=cr.list();
			tx.commit();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertDetail(Father f){
		
		try {
			Session s =  SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Integer i = (Integer)s.save(f);
			tx.commit();
			if(i>0)
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
