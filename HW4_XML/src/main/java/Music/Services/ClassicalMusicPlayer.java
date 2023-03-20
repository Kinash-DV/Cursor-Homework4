package Music.Services;

import Music.PlayList;
import Music.Player;
import jakarta.annotation.PostConstruct;

public class ClassicalMusicPlayer extends Player {
    public ClassicalMusicPlayer() {
        super();
    }
    @PostConstruct
    public void init(){
        PlayList classicalPlayList = this.getPlayList();
        classicalPlayList.addRecord(classicalPlayList.new MusicRecord("Moonlight Sonata", "Beethoven"));
        classicalPlayList.addRecord(classicalPlayList.new MusicRecord("The Four Seasons", "Vivaldi"));
    }
}
