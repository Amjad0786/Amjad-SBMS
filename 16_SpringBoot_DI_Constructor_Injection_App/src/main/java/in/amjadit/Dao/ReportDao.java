package in.amjadit.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {

	public String getNameById(Integer userId) {
		if(userId == 100) {
			return "Sameer";
		}else if(userId == 101) {
			return "Amjad";
		}else {
			return "Not Name Found";
		}
	}
}
