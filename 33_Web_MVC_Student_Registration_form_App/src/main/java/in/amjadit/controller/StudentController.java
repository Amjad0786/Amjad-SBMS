package in.amjadit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.amjadit.binding.Student;

@Controller
public class StudentController {

	// method to load student form

	@GetMapping("/")
	public String loadForm(Model model) {

		loadFormData(model);

		return "index";

	}

	private void loadFormData(Model model) {
		List<String> coursesList = new ArrayList<>();
		coursesList.add("JAVA");
		coursesList.add("DevOps");
		coursesList.add("AWS");
		coursesList.add("Python");

		List<String> timingsList = new ArrayList<>();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");

		model.addAttribute("courses", coursesList);
		model.addAttribute("timings", timingsList);

		Student student = new Student();
		model.addAttribute("student", student);
	}

	// method to save student form data

	@PostMapping("/save")
	public String handleSubmit(Student s, Model model) {

		System.out.println(s);

		model.addAttribute("msg", "Student Saved");

		loadFormData(model);

		return "index";
	}

	// method to display saved students data

}
