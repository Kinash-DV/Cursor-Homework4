package Music;

public abstract class Player {
    private PlayList playList;
    public Player() {
        this.playList = new PlayList();
    }
    public PlayList getPlayList() {
        return playList;
    }
    public void play() {
        System.out.println("The playlist is starting to play:");
        if (playList != null)
            for (PlayList.MusicRecord record : playList.getRecords())
                System.out.println("\t" + record);
    }
}
