package jar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class StudentController {

    @GetMapping()
    Map<Object, Object> m1() {
        Map<Object, Object> res = new HashMap<>();

        res.put("msg", "Get api");
        res.put("list", getAllStudents());

        return res;
    }

    @Autowired
    StudentRepo db;

    @PostMapping()
    Map<Object, Object> m2(@RequestBody Student s) {
        Map<Object, Object> res = new HashMap<>();
        res.put("msg", "Post api");
        String name = s.getName();
        String roll = s.getRoll();
        String ip = s.getIp();
        Student obj = new Student();

        obj.setName(name);
        obj.setRoll(roll);
        obj.setIp(ip);

        db.save(obj);

        return res;
    }

    List<Student> getAllStudents() {
        return db.findAll();
    }
}
