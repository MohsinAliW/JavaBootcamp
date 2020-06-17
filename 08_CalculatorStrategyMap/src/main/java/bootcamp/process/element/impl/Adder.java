package bootcamp.process.element.impl;

import java.math.BigDecimal;

public class Adder implements bootcamp.process.element.ProcessingElement {

    @Override
    public BigDecimal process(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) {
            return false;
        }
        return getClass() == obj.getClass();
    }
}