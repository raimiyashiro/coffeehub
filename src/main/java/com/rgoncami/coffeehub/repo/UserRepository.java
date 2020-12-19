package com.rgoncami.coffeehub.repo;

import com.rgoncami.coffeehub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByNickName(String nickname);
}
