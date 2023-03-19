import Music.Services.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playClassical();
        musicPlayer.playRock();
    }
}
