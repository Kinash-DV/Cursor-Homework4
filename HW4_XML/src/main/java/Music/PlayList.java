package Music;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<MusicRecord> records = new ArrayList<>();
    public List<MusicRecord> getRecords() {
        return records;
    }
    public void addRecord(MusicRecord record){
        records.add(record);
    }
    public class MusicRecord{
        private String songTitle;
        private String singer;
        public MusicRecord(String songTitle, String singer) {
            this.songTitle = songTitle;
            this.singer = singer;
        }
        @Override
        public String toString() {
            return songTitle + " <" + singer + ">";
        }
    }
}
