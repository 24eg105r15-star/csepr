package jar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.repo.StudentRepo;


@RestController
@RequestMapping("/api/v1")
public class Delete{

    @Autowired
    StudentRepo db;

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable long id){
        if(db.existsById(id)){
            db.deleteById(id);
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }
}
