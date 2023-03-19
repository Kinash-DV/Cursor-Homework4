import Music.Services.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playClassical();
        musicPlayer.playRock();
    }
}
