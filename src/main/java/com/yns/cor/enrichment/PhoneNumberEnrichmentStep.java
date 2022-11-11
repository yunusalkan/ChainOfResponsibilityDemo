package com.yns.cor.enrichment;

import com.yns.cor.Message;
import com.yns.cor.repo.PhoneNumberRepository;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Order(0)
public class PhoneNumberEnrichmentStep extends AbstractEnrichmentStep {

    private final PhoneNumberRepository phoneNumberRepository;

    public PhoneNumberEnrichmentStep(PhoneNumberRepository phoneNumberRepository) {
        this.phoneNumberRepository = phoneNumberRepository;
    }

    @Override
    protected Optional<Message> enrichAndApplyNext(Message message) {
        return message.getValue("SESSIONID")
                .flatMap(phoneNumberRepository::findPhoneNumber)
                .map(phoneNumber -> message.with("phoneNumber", phoneNumber));
    }
}
