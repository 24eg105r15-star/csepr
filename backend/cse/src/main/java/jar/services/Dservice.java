package jar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jar.repo.StudentRepo;

@Service
public class Dservice {

    @Autowired
    StudentRepo db;

    public String f(long id) {
        if (db.existsById(id)) {
            db.deleteById(id);
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }

}
