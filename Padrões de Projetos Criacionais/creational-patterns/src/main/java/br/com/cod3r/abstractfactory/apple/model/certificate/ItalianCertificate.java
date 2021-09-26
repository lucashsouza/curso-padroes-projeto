package br.com.cod3r.abstractfactory.apple.model.certificate;

public class ItalianCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "\t- Calibrating Italian rules";
    }
}
