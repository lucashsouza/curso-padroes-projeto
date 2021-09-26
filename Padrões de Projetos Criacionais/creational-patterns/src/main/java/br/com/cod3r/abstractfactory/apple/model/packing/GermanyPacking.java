package br.com.cod3r.abstractfactory.apple.model.packing;

import br.com.cod3r.abstractfactory.apple.model.packing.Packing;

public class GermanyPacking implements Packing {

    @Override
    public String pack() {

        return "\t- Packing in German";

    }
}
