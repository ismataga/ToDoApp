package com.ismataga.to_do_app.repository;

import com.ismataga.to_do_app.entity.Task;
import com.ismataga.to_do_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//    List<Task> findByUserUserId(Long id);
}
