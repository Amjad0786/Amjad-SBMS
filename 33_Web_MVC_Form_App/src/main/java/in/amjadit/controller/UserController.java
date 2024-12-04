package in.amjadit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.amjadit.binding.User;

@Controller
public class UserController {

    // This method loads the login form
    @GetMapping("/hey")
    public String loadForm() {
        return "login";  // Returns the login form view
    }

    // This method handles the form submission
    @PostMapping("/user")
    public String handleSubmitBtn(User user, Model model) {
        // Handle saving or processing the user data here
        model.addAttribute("msg", "User saved successfully!");
        
        // Optionally, add the user data to the model for display
        model.addAttribute("user", user);
        
        return "login";  // Return to the login page or a confirmation page
    }
}
