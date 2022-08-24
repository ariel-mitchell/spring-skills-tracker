package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String programmingLanguages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languagesForm() {
        return "<html>" +
                "<body>" +
                "<form method='post'>" +
                "<label>Name:<input type='text' name='name'></label>" +
                "<p>My favorite language:</p>" +
                "<select name='language1'><option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option></select>" +
                "<p>My second favorite language:</p>" +
                "<select name='language2'><option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option></select>" +
                "<p>My third favorite language:</p>" +
                "<select name='language3'><option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option></select>" +
                "<p><input type='submit' value='Submit'></p>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="form", method= RequestMethod.POST)
    public String formReturn(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol><li>"+language1+"</li>" +
                "<li>"+language2+"</li>" +
                "<li>"+language3+"</li></ol>";
    }
}
