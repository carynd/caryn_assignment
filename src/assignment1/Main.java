package assignment1;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        Song song1 = new Song("Song 1", "Artist 1");
        Song song2 = new Song("Song 2", "Artist 2");
        Song song3 = new Song("Song 3", "Artist 3");
        Song song4 = new Song("Song 4", "Artist 4");

        player.addSong(song1);
        player.addSong(song2);


        player.playCurrentSong();
        player.playNextSong();
        player.playPreviousSong();
        player.addSong(song3);

        player.addSong(song4);
        player.playNextSong();
        player.playNextSong();
        player.removeSong(1);
        player.playNextSong();
        player.playNextSong();
        player.skipSong();
        player.playPreviousSong();
        player.playPreviousSong();
        player.skipSong();
        player.playPreviousSong();
    }
}
