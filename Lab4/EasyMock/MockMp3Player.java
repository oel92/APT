/**
 * Excerpted from the book, "Pragmatic Unit Testing"
 * ISBN 0-9745140-1-2
 * Copyright 2003 The Pragmatic Programmers, LLC.  All Rights Reserved.
 * Visit www.PragmaticProgrammer.com
 */

import java.util.ArrayList;

public class MockMp3Player implements Mp3Player {

 private ArrayList<String> songs= null;
 private String playSong;
 private Long timeOfPlay, currentTime;
 private Long timeOfPause;
 private final static int PLAY = 0;
 private final static int PAUSE = 1;
 private final static int STOP = 2;
 private final static int REWIND = 3;
 private int index;
 private int status = STOP;

 public MockMp3Player() {
	playSong = null;
	timeOfPlay = 0L;
	timeOfPause = 0L;
	index = 0;
	currentTime = 0L;
 }
  /** 
   * Begin playing the filename at the top of the
   * play list, or do nothing if playlist 
   * is empty. 
   */
  public void play() {
	if (songs==null || songs.isEmpty()){
		return;
	}
	 playSong = songs.get(0);
     timeOfPlay = 2L;
	 currentTime = 25L;
	 status = PLAY;
	 index = 0;
  }

  /** 
   * Pause playing. Play will resume at this spot. 
   */
  public void pause(){
    timeOfPause = 12L;
	status = PAUSE;
  }

  /** 
   * Stop playing. The current song remains at the
   * top of the playlist, but rewinds to the 
   * beginning of the song.
   */
  public void stop(){
	timeOfPlay = 0L;	  
	timeOfPause = timeOfPlay;
	currentTime = timeOfPlay;
	status = REWIND;
  }
  
  /** Returns the number of seconds into 
   * the current song.
   */
  public double currentPosition(){
	return ((double)(currentTime - timeOfPlay));
  }


  /**
   * Returns the currently playing file name.
   */
  public String currentSong(){
	return playSong;
  }	

  /** 
   * Advance to the next song in the playlist 
   * and begin playing it.
   */
  public void next(){
	if (songs == null || songs.isEmpty()){
		return;
	}
	index++;
	if (index >= songs.size()){
		 return;
	}
	playSong = songs.get(index);
	timeOfPlay = 2L;	
	status = PLAY;
  }

  /**
   * Go back to the previous song in the playlist
   * and begin playing it.
   */
  public void prev(){
	if (songs==null || songs.isEmpty()) {
		return;
	}
	if (index <= 0){
	 return;
	}
	index--;
	if (index >= songs.size()){
		return;
	}
	playSong = songs.get(index);
	timeOfPlay = 2L;
	status = PLAY;
  }

  /** 
   * Returns true if a song is currently 
   * being played.
   */
  public boolean isPlaying(){
	return (status == PLAY);
  }
  /**
   * Load filenames into the playlist.
   */
  public void loadSongs(ArrayList names) {
  	songs = new ArrayList<String>(names);
  }
}
