package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
public class SkillsTracker {
    @RequestMapping(value = "")
    public String skillsTracker() {
        String html =
                "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>";
        return html;
    }

    public String optionForm() {
        return "<html>" +
                "<body>"+
                "<form method='post'>" +
                "<label for='name'>Name</label><br>" +
                "<input type='text' name='name' id='name'/><br>" +
                "<label for='firstLang'>My favorite language:</label><br>" +
                "<select id='firstLang' name='firstLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='secondLang'>My second favorite language:</label><br>" +
                "<select id='secondLang' name='secondLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='thirdLang'>My third favorite language:</label><br>" +
                "<select id='thirdLang' name='thirdLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'/><br>" +
                "</form>"+
                "</body>"+
                "</html>";

    }

    @PostMapping(value = "form")
    public String namePage(@RequestParam String name, @RequestParam String firstLang, @RequestParam String secondLang, @RequestParam String thirdLang) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLang + "</li>" +
                "<li>" + secondLang + "</li>" +
                "<li>" + thirdLang + "</li>" +
                "</ol>";

    }
}
