package se.aresiel.ccatest;

import dev.onyxstudios.cca.api.v3.component.Component;

public interface IntComponent extends Component {
    int getValue();
    void increment();
}