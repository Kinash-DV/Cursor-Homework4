import Music.PlayList;
import Music.Services.ClassicalMusicPlayer;
import Music.Services.MusicPlayer;
import Music.Services.RockMusicPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public ClassicalMusicPlayer classicalMusicPlayer(){
        PlayList playList = new PlayList();
        playList.addRecord(playList.new MusicRecord("Moonlight Sonata", "Beethoven"));
        playList.addRecord(playList.new MusicRecord("The Four Seasons", "Vivaldi"));
        return new ClassicalMusicPlayer(playList);
    }
    @Bean
    public RockMusicPlayer rockMusicPlayer(){
        PlayList playList = new PlayList();
        playList.addRecord(playList.new MusicRecord("Purple Haze", "Jimi Hendrix"));
        playList.addRecord(playList.new MusicRecord("Whole Lotta Love", "Led Zeppelin"));
        return new RockMusicPlayer(playList);
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(
                classicalMusicPlayer(),
                rockMusicPlayer()
        );
    }
}
