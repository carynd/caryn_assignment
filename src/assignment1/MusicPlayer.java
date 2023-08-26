package assignment1;

import java.util.LinkedList;
import java.util.List;

class MusicPlayer {
    private List<Song> playlist;
    private int currentSongIndex;

    public MusicPlayer() {
        playlist = new LinkedList<>();
        currentSongIndex = -1;
    }

    //Time Complexity: O(1)
    public void addSong(Song song) {
        playlist.add(song);
        if (currentSongIndex == -1) {
            currentSongIndex = 0;
        }
    }

    //Time Complexity: O(N)
    public void removeSong(int index) {
        if (index >= 0 && index < playlist.size()) {
            playlist.remove(index);
            if (currentSongIndex >= index) {
                currentSongIndex--;
            }
        }
    }

    //Time Complexity: O(1)
    public void playCurrentSong() {
        if (currentSongIndex >= 0 && currentSongIndex < playlist.size()) {
            Song currentSong = playlist.get(currentSongIndex);
            System.out.println("Now playing: " + currentSong.name + " by " + currentSong.artist);
        } else {
            System.out.println("No song to play.");
        }
    }

    //Time Complexity: O(1)
    public void playNextSong() {
        if (currentSongIndex < playlist.size() - 1) {
            currentSongIndex++;
            playCurrentSong();
        } else {
            System.out.println("End of playlist.");
        }
    }

    //Time Complexity: O(1)
    public void playPreviousSong() {
        if (currentSongIndex > 0) {
            currentSongIndex--;
            playCurrentSong();
        } else {
            System.out.println("Beginning of playlist.");
        }
    }

    //Time Complexity: O(1)
    public void skipSong() {
        if (currentSongIndex < playlist.size() - 1) {
            currentSongIndex += 2; //Skip song will not play current song or next song
            //directly plays the second song from current
            playCurrentSong();
        } else {
            System.out.println("No song to skip.");
        }
    }
}