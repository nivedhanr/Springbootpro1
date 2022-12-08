package com.example.studentappnew_backend.doa;

import com.example.studentappnew_backend.Model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentDoa extends CrudRepository<Students,Integer> {
}
