package io.fair_acc.dataset.event;

import io.fair_acc.dataset.events.BitState;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Default event source for testing
 * @author rstein
 */
public class TestEventSource implements EventSource {

    protected BitState state = BitState.initDirty(this);

    @Override
    public BitState getBitState() {
        return state;
    }
}
