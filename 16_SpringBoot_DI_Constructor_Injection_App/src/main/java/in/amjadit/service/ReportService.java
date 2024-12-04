package in.amjadit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.amjadit.Dao.ReportDao;

@Repository
public class ReportService {

	private ReportDao reportDao;

	public ReportService(ReportDao reportDao) {
		System.out.println("Constructor :: Injection Perform");
		this.reportDao = reportDao;
	}

	public void printName(Integer userId) {
		String nameById = reportDao.getNameById(userId);
		System.out.println(nameById);
	}

}
