package br.com.cod3r.abstractfactory.apple.model.certificate;

public class GermanyCertificate implements Certificate {

    @Override
    public String applyCertification() {
        return "\t- Calibrating Germany rules";
    }

}
