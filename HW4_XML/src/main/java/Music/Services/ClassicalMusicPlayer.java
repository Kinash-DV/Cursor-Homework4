package Music.Services;

import Music.PlayList;
import Music.Player;

public class ClassicalMusicPlayer extends Player {
    public ClassicalMusicPlayer() {
        super();
        init();
    }
    public void init(){
        PlayList classicalPlayList = this.getPlayList();
        classicalPlayList.addRecord(classicalPlayList.new MusicRecord("Moonlight Sonata", "Beethoven"));
        classicalPlayList.addRecord(classicalPlayList.new MusicRecord("The Four Seasons", "Vivaldi"));
    }
}
