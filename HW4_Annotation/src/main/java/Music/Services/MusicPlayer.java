package Music.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicPlayer {
    private ClassicalMusicPlayer classicalMusicPlayer;
    private RockMusicPlayer rockMusicPlayer;
    @Autowired
    public MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }
    public void playClassical(){
        classicalMusicPlayer.play();
    }
    public void playRock(){
        rockMusicPlayer.play();
    }
}
