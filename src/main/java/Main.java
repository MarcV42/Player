public class Main {

    public static void main(String[] args) {

        MediaController mediaController = new MediaController();

        // Abspielen eines Songs
        Playable musicPlayer = new MusicPlayer();
        mediaController.playMedia(musicPlayer);

        // Abspielen eines Videos
        Playable videoPlayer = new VideoPlayer();
        mediaController.playMedia(videoPlayer);



    }
}
