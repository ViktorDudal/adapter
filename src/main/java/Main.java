public class Main {
    public static void main(String[] args) {

        //Object Adapter Pattern
       /* MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new ObjectFormatAdapter(new MP4());
        player.play("file.mp4");
        player = new ObjectFormatAdapter(new VLC());
        player.play("file.avi");*/

        //Class Adapter Pattern
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new ClassMP4FormatAdapter();
        player.play("file.mp4");
        player = new ClassVLCFormatAdapter();
        player.play("file.avi");
    }
}