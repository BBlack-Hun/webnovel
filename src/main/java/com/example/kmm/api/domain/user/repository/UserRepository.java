package com.example.kmm.api.domain.user.repository;


import com.example.kmm.api.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository class.
 *
 * <p>
 * date: 2023-04-05
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
public interface UserRepository extends JpaRepository<User, String> {

}
