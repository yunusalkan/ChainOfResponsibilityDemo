package com.yns.cor.enrichment;

import com.yns.cor.Message;
import com.yns.cor.repo.AgeRepository;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Order(1)
public class AgeEnrichmentStep extends AbstractEnrichmentStep {

    private final AgeRepository ageRepository;

    AgeEnrichmentStep(AgeRepository ageRepository) {
        this.ageRepository = ageRepository;
    }

    @Override
    protected Optional<Message> enrichAndApplyNext(Message message) {
        return message.getValue("userId")
                .flatMap(ageRepository::findByUserId)
                .map(age -> message.with("age", age + ""));
    }
}
