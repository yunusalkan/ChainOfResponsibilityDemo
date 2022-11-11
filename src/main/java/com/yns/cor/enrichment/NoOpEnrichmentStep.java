package com.yns.cor.enrichment;

import com.yns.cor.Message;

public class NoOpEnrichmentStep implements EnrichmentStep {

    @Override
    public void setNext(EnrichmentStep step) {
        // no op
    }

    @Override
    public Message enrich(Message message) {
        return message;
    }
}
