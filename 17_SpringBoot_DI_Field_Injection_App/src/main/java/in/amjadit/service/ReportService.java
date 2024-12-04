package in.amjadit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.amjadit.dao.ReportDao;

@Service
public class ReportService {

	@Autowired
	private ReportDao reportDao;

	public void printName(Integer userId) {
		String nameById = reportDao.getNameById(userId);
		System.out.println(nameById);
	}

}
