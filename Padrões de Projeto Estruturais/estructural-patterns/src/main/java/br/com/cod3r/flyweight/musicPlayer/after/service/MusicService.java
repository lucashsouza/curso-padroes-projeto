package br.com.cod3r.flyweight.musicPlayer.after.service;

import br.com.cod3r.flyweight.musicPlayer.after.model.Music;
import br.com.cod3r.flyweight.musicPlayer.after.musicFlyweight.FlyWeightFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicService {
	private Map<String, Map<String, Music>> memory;
	
	public MusicService() {
		memory = new HashMap<String, Map<String, Music>>();
	}
	
	public void listenMusic(String user, String description) {
		Map<String, Music> userPlaylist = memory.get(user);

		if(userPlaylist == null) {
			userPlaylist = new HashMap<>();
			memory.put(user, userPlaylist);
		}

		Music song = userPlaylist.get(description);

		if(song == null) {
			song = new Music(FlyWeightFactory.getInstance().getMusic(description));
			userPlaylist.put(description, song);
		}

		System.out.println(String.format("%s is listenning '%s' from '%s'.",
				user, song.getMusicFlyweight().getName(), song.getMusicFlyweight().getArtist()));
		song.listenning();
	}

	public void report() {
		int musicInMemory = 0;
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			System.out.println("---------");
			System.out.println(user + " has listen...");
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				System.out.println(String.format("%s - %s, with %d times",
						music.getMusicFlyweight().getArtist(),
						music.getMusicFlyweight().getName(),
						music.getPlayerQty()));
				timeCounter += (music.getPlayerQty() * music.getMusicFlyweight().getDurationInSeconds());
				musicInMemory++;
			}
			System.out.println(String.format("%s has listen music for %d seconds", user, timeCounter));
		}
		System.out.println("Total of musics in memory: " + FlyWeightFactory.getInstance().getSize());
	}
}
