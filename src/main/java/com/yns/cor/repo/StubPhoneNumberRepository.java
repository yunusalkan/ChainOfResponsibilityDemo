package com.yns.cor.repo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StubPhoneNumberRepository implements PhoneNumberRepository {
    @Override
    public Optional<String> findPhoneNumber(String sessionId) {
        return Optional.of("189127231991");
    }
}
