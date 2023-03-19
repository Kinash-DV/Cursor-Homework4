package Music.Services;

import Music.PlayList;
import Music.Player;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class RockMusicPlayer extends Player {
    public RockMusicPlayer() {
        super();
    }
    @PostConstruct
    public void init(){
        PlayList rockPlayList = this.getPlayList();
        rockPlayList.addRecord(rockPlayList.new MusicRecord("Moonlight Sonata", "Beethoven"));
        rockPlayList.addRecord(rockPlayList.new MusicRecord("The Four Seasons", "Vivaldi"));
    }
}
