package br.com.cod3r.flyweight.musicPlayer.after.musicFlyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static FlyWeightFactory instance = new FlyWeightFactory();
    private static Map<String, MusicFlyweight> musicFlyRepository;

    public FlyWeightFactory() {
        musicFlyRepository = new HashMap<String, MusicFlyweight>();
    }

    public static FlyWeightFactory getInstance() {
        return instance;
    }

    public MusicFlyweight getMusic(String description) {
        MusicFlyweight mf = musicFlyRepository.get(description);

        if(mf == null) {
            System.out.println("Creating new Flyweight for " + description);
            mf = getMusicByDescription(description);
            musicFlyRepository.put(description, mf);
        }
        return mf;
    }

    private MusicFlyweight getMusicByDescription(String description) {
        String[] musicData = description.split(";");
        return new MusicFlyweight(musicData[0], musicData[1], new Integer(musicData[2]));
    }

    public Integer getSize() {
        return musicFlyRepository.size();
    }

}
