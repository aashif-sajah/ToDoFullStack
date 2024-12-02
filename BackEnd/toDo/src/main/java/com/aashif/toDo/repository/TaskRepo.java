package com.aashif.toDo.repository;

import com.aashif.toDo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Integer> {
}
