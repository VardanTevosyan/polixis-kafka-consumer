package com.polixis.repository;

import com.polixis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Vardan Tevosyan
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
