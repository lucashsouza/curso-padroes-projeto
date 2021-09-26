package br.com.cod3r.abstractfactory.apple.factory.abstractFactory;

import br.com.cod3r.abstractfactory.apple.model.certificate.Certificate;
import br.com.cod3r.abstractfactory.apple.model.certificate.GermanyCertificate;
import br.com.cod3r.abstractfactory.apple.model.packing.GermanyPacking;
import br.com.cod3r.abstractfactory.apple.model.packing.Packing;

public class GermanyRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new GermanyCertificate();
    }

    @Override
    public Packing getPacking() {
        return new GermanyPacking();
    }

}
