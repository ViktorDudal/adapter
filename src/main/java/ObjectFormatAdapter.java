public class ObjectFormatAdapter implements MediaPlayer {
    private MediaPackage media;
    public ObjectFormatAdapter(MediaPackage media) {
        this.media = media;
    }
    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        media.playFile(filename);
    }
}