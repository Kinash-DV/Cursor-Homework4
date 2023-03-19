package Music.Services;

import Music.PlayList;
import Music.Player;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
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
