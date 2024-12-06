package in.amjadit.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import in.amjadit.binding.Student;
import in.amjadit.entity.StudentEntity;
import in.amjadit.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository repo;

	@GetMapping("/") 
	public String loadForm(Model model) { 
		loadFormData(model);
	  return "index"; // This should match the JSP filename (index.jsp) 
	  }

	private void loadFormData(Model model) {
		List<String> coursesList = List.of("JAVA", "DevOps", "AWS", "Python");
		List<String> timingsList = List.of("Morning", "Afternoon", "Evening");

		Student student = new Student();
		model.addAttribute("courses", coursesList);
		model.addAttribute("timings", timingsList);
		model.addAttribute("student", student);
	}

	@PostMapping("/save")
	public String handleSubmit(Student student, Model model) {
		try {
			StudentEntity entity = new StudentEntity();
			BeanUtils.copyProperties(student, entity);
			repo.save(entity);
			model.addAttribute("msg", "Student Saved Successfully!");
		} catch (Exception e) {
			model.addAttribute("msg", "Error occurred while saving student data.");
			e.printStackTrace();
		}
		loadFormData(model);
		return "index";
	}

}
