package in.amjadit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.amjadit.binding.Employee;
import in.amjadit.entity.EmployeeEntity;
import in.amjadit.repository.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository repo;

	@GetMapping("/")
	public String formLoad(Model model) {

		loadFormData(model);

		return "index";

	}

	private void loadFormData(Model model) {
		List<String> workingList = new ArrayList<>();

		workingList.add("Jr.SoftWareEngineer");
		workingList.add("SoftWareEngineer");
		workingList.add("Sr.SoftwareEngineer");
		workingList.add("Manager");

		List<String> timingsList = new ArrayList<>();

		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");
		timingsList.add("Night");

		model.addAttribute("workingRole", workingList);
		model.addAttribute("timings", timingsList);

		Employee employee = new Employee();
		model.addAttribute("employee", employee);
	}

	@PostMapping("/save")
	public String hundelSubmit(Employee e, Model model) {

		System.out.println(e);

		// Logic to save
		EmployeeEntity entity = new EmployeeEntity();

		// copy data from binding obj to entity obj
		BeanUtils.copyProperties(e, entity);

		entity.setTimings(Arrays.toString(e.getTimings()));

		repo.save(entity);

		loadFormData(model);

		model.addAttribute("msg", "Employee Saved");

		return "index";
	}

	//method to display Saved students data

	@GetMapping("/viewEmployees")
	public String getEmployeeData(Model model) {

		//logic to fetch and send employee data

		List<EmployeeEntity> employeeList = repo.findAll();

		model.addAttribute("employeeList", employeeList);

		return "data";
	}

}
