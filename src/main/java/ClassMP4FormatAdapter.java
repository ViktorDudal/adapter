public class ClassMP4FormatAdapter extends MP4 implements MediaPlayer {
    public ClassMP4FormatAdapter() {
        super();
    }
    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        this.playFile(filename);
    }
}