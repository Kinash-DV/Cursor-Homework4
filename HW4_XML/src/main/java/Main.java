import Music.Services.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playClassical();
        musicPlayer.playRock();
    }
}
