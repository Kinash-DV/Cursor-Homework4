package Music.Services;

import Music.PlayList;
import Music.Player;

public class RockMusicPlayer extends Player {
    public RockMusicPlayer() {
        super();
        init();
    }
    public void init(){
        PlayList rockPlayList = this.getPlayList();
        rockPlayList.addRecord(rockPlayList.new MusicRecord("Moonlight Sonata", "Beethoven"));
        rockPlayList.addRecord(rockPlayList.new MusicRecord("The Four Seasons", "Vivaldi"));
    }
}
