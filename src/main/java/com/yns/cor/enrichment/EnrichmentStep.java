package com.yns.cor.enrichment;

import com.yns.cor.Message;

public interface EnrichmentStep extends ChainElement<EnrichmentStep> {
    Message  enrich(Message message);
}
