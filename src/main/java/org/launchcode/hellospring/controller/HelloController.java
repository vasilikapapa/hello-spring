package org.launchcode.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping("hello")
@Controller
    public  class HelloController {

         //handles request a path /hello
//        @GetMapping("hello")
//        @ResponseBody
//        public String hello() {
//            return "Hello, Spring!";
//        }
    //lives /hello/goodbye
        @GetMapping("goodbye")
        @ResponseBody
        public String goodbye() {
            return "Hello, GoodBye!";
        }

        //Handles request of the form /hello?name=LaunchCode
    //lives /hello
//        @RequestMapping( method = {RequestMethod.GET, RequestMethod.POST})
//        public String helloWithQueryParam(@RequestParam String name)
//        {
//            return "Hello, " + name + "!";
//        }
//
//        //Handles requests of the form /hello/LaunchCode
//        @GetMapping("{name}")
//        public String helloWithQueryParamVar(@PathVariable String name)
//        {
//            return "Hello, " + name + "!";
//        }
//        @GetMapping("form")
//        @ResponseBody
//        public String helloForm()
//        {
//           return "<html>" +
//                   "<body>" +
//                   "<form method = 'get' action = '/hello'>" + // submit a request to /hello
//                   "<input type = 'text' name = 'name' />" +
//                   "<input type = 'submit' value = 'Greet Me!' />" +
//                   "</form>" +
//                   "</body>" +
//                   "</html>";
//
//        }
// Responds to get and post requests at /hello?coder=LaunchCoder
//lives /hello/form
//@GetMapping("form")
//public String helloForm() {
//    String html =
//            "<html>" +
//                    "<body>" +
//                    "<form method = 'post' action = '/hello'>" +
//                    "<input type = 'text' name = 'name' />" +
//                    "<input type = 'submit' value = 'Greet Me!' />" +
//                    "</form>" +
//                    "</body>" +
//                    "</html>";
//    return html;
//}
///Exercises

    @GetMapping("form")
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello/hello'>" +
                        "<input type = 'text' name = 'name' />" +
                        "<select name='language' id='language'>" +
                        "    <option value='english'>English</option>" +
                        "    <option value='french'>French</option>" +
                        "    <option value='italian'>Italian</option>" +
                        "    <option value='spanish'>Spanish</option>" +
                        "    <option value='german'>German</option>" +
                        "  </select>"+
                        "<input type = 'submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("english")) {
            greeting = "Hello";
        }
        else if (l.equals("french")) {
            greeting = "Bonjour";
        }
        else if (l.equals("italian")) {
            greeting = "Bonjourno";
        }
        else if (l.equals("spanish")) {
            greeting = "Hola";
        }
        else if (l.equals("german")) {
            greeting = "Hallo";
        }

        return greeting + " " + n;
    }
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }

        return createMessage(name, language);

    }
    }


