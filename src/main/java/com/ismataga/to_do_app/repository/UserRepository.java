package com.ismataga.to_do_app.repository;


import com.ismataga.to_do_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

//    @Query(value = "select * from users left join tasks t on users.id = t.user_id where users.id=:userId;", nativeQuery = true)
//    List<User> findUsersById(@Param("userId") Long id);
}
