package com.yns.cor.repo;

import java.util.Optional;

public interface PhoneNumberRepository {
    Optional<String> findPhoneNumber(String sessionId);
}
