package com.yns.cor.enrichment;

import com.yns.cor.Message;

import java.util.Optional;

public abstract class AbstractEnrichmentStep implements EnrichmentStep {

    private EnrichmentStep next;

    @Override
    public void setNext(EnrichmentStep step) {
        this.next = step;
    }

    @Override
    public Message enrich(Message message) {
        return enrichAndApplyNext(message)
                .map(enrichedMessage -> next.enrich(enrichedMessage))
                .orElseGet(() -> next.enrich(message));
    }

    protected  abstract Optional<Message> enrichAndApplyNext(Message message);
}
