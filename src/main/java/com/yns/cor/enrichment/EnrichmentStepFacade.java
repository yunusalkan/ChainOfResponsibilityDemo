package com.yns.cor.enrichment;

import com.yns.cor.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrichmentStepFacade {

    private final EnrichmentStep chainHead;

    public EnrichmentStepFacade(List<EnrichmentStep> steps) {
        this.chainHead = ChainElement.buildChain(steps, new NoOpEnrichmentStep());
    }

    public Message enrich(Message message) {
        return chainHead.enrich(message);
    }
}
