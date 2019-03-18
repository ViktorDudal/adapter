public class ClassVLCFormatAdapter extends VLC implements MediaPlayer {
    public ClassVLCFormatAdapter() {
        super();
    }
    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        this.playFile(filename);
    }
}