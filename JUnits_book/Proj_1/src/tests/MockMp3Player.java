/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import javaapplication1.Mp3Player;

/**
 *
 * @author Piotrek
 */
class MockMp3Player implements Mp3Player {
    private ArrayList<String> list = new ArrayList();
    private Double position=0.0;
    private Integer curSongNumber=0;
    private Boolean isPlaying = false;

    public MockMp3Player() {
    }

    @Override
    public void play() {
        if (list.size() > 0){
            isPlaying = true; 
            position = 1.0;
        }
    }

    @Override
    public void pause() {
        isPlaying = false;
    }

    @Override
    public void stop() {
        pause();
        position = 0.0;
    }

    @Override
    public double currentPosition() {
        return position;
    }

    @Override
    public String currentSong() {
        return (list.size() != 0) ? list.get(curSongNumber) : null;
    }

    @Override
    public void next() {
        if (curSongNumber + 1 < list.size())
            ++curSongNumber;
    }

    @Override
    public void prev() {
        if (curSongNumber - 1 > -1)
            --curSongNumber;
        position = 0.0;
    }

    @Override
    public Boolean isPlaying() {
        return isPlaying;
    }

    @Override
    public void loadSongs(ArrayList names) {
        list = names;
    }
    
}
