package com.yns.cor.repo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StubAgeRepository implements AgeRepository{
    @Override
    public Optional<Integer> findByUserId(String userId) {
        return Optional.of(42);
    }
}
