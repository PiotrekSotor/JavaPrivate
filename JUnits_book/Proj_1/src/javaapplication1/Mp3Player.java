
package javaapplication1;

import java.util.ArrayList;

public interface Mp3Player {
    public void play();
    public void pause();
    public void stop();
    public double currentPosition();
    public String currentSong();
    public void next();
    public void prev();
    public Boolean isPlaying();
    public void loadSongs(ArrayList names);
}
