package br.com.cod3r.abstractfactory.apple.model.packing;

public class ItalianPacking implements Packing {

    @Override
    public String pack() {
        return "\t- Packing in Italian";
    }

}
