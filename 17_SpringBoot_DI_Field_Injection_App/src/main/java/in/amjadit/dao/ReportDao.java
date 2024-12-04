package in.amjadit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {
	
	public String getNameById(Integer userId ) {
		if(userId == 100) {
			return "Ashraf";
		}else if(userId == 101) {
			return "Amjad";
		}else {
			return "Name Not Found";
		}
	}

}
