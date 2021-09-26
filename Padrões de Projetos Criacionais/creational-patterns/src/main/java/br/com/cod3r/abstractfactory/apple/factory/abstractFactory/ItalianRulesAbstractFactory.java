package br.com.cod3r.abstractfactory.apple.factory.abstractFactory;

import br.com.cod3r.abstractfactory.apple.model.certificate.Certificate;
import br.com.cod3r.abstractfactory.apple.model.certificate.ItalianCertificate;
import br.com.cod3r.abstractfactory.apple.model.packing.ItalianPacking;
import br.com.cod3r.abstractfactory.apple.model.packing.Packing;

public class ItalianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new ItalianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new ItalianPacking();
    }

}
