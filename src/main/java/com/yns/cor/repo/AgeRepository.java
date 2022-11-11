package com.yns.cor.repo;

import java.util.Optional;

public interface AgeRepository {
    Optional<Integer> findByUserId(String userId);
}
