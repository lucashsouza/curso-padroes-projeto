package br.com.cod3r.command.alexa.after.alexa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AlexaAI {

    private Map<String, String[]> associations;

    public AlexaAI() {
        associations = new HashMap<String, String[]>();
    }

    public void addAssociation(String key, String[] association) {
        associations.put(key, association);
    }

    public String getFindAssociations(String request) {
        for (String[] association : associations.values()) {
            if (Arrays.stream(association).allMatch(request :: contains)) {
                return getKeyFromAssociations(association);
            }
        }
        return null;
    }

    private String getKeyFromAssociations(String... keywords) {
        return associations
                .entrySet()
                .stream()
                .filter(entry -> keywords.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
