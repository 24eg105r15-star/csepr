package jar.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.services.Dservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class Delete {
    Dservice obj;
    Delete(Dservice obj){
        this.obj=obj;

    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable long id) {
        return obj.f(id);
    }

}
