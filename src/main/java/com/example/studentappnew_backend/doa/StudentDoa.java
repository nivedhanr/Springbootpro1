package com.example.studentappnew_backend.doa;

import com.example.studentappnew_backend.Model.Students;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDoa extends CrudRepository<Students,Integer> {
    @Query(value = "SELECT `id`, `admno`, `college`, `name`, `rollno` FROM `students` WHERE `admno`=:admno",nativeQuery = true)
    List<Students> Search(@Param("admno") String admno);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `students` WHERE `id`=:id",nativeQuery = true)
    void delete(@Param("id") Integer id);
}
