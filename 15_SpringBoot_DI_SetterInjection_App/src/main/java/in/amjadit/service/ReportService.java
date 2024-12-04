package in.amjadit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.amjadit.dao.ReportDao;

@Service
public class ReportService {

	private ReportDao reportDao;

	public ReportService(ReportDao reportDao) {
		System.out.println("0- Param -:: Constructor");

	}

	@Autowired
	public void setReportDao(ReportDao reportDao) {
		System.out.println("Setter injection Perform....");
		this.reportDao = reportDao;
	}

	public void printName(Integer userId) {
		String nameById = reportDao.getNameById(userId);

		System.out.println(nameById);
	}

}
