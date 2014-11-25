/**
 * Excerpted from the book, "Pragmatic Unit Testing"
 * ISBN 0-9745140-1-2
 * Copyright 2003 The Pragmatic Programmers, LLC.  All Rights Reserved.
 * Visit www.PragmaticProgrammer.com
 */

import static org.easymock.EasyMock.*;
import junit.framework.*;
import java.util.ArrayList;

public class EasyMockTest extends TestCase {

  protected Mp3Player mock,mockControl;
  protected ArrayList mp3Entries = new ArrayList();

  @Override
  public void setUp() {
    mp3Entries = new ArrayList();
    mockControl = createMock(Mp3Player.class);
    mock = mockControl;
    mp3Entries.add("Bill Chase -- Open Up Wide");
    mp3Entries.add("Jethro Tull -- Locomotive Breath");
    mp3Entries.add("The Boomtown Rats -- Monday");
    mp3Entries.add("Carl Orff -- O Fortuna");
  }
  
  public void testPlay(){
      mock.loadSongs(mp3Entries);
      expect(mock.isPlaying()).andReturn(false);
      replay( mockControl );
      assertFalse(mock.isPlaying());
 
      reset(mockControl);
      mock.play();
      expect(mock.isPlaying()).andReturn(true);
      expect(mock.currentPosition()).andReturn(2.0);
      replay( mockControl );
      assertTrue(mock.isPlaying());
      assertTrue(mock.currentPosition() != 0.0);
     
      reset(mockControl);
      mock.pause();
      expect(mock.currentPosition()).andReturn(12.0);
      replay( mockControl );
      assertTrue(mock.currentPosition() != 0.0);
     
      reset(mockControl);
      mock.stop();
      expect(mock.currentPosition()).andReturn(0.0);
      replay( mockControl );
      assertEquals(mock.currentPosition(), 0.0, 0.1);
     
  }
  
  public void testPlayNoList() {
              expect(mock.isPlaying()).andReturn(false);
              replay( mockControl );
      assertFalse(mock.isPlaying());
     
      reset(mockControl);
      mock.play();
             expect(mock.isPlaying()).andReturn(false);
             expect(mock.currentPosition()).andReturn(25.0);
             replay( mockControl );
      assertFalse(mock.isPlaying());
      assertEquals(mock.currentPosition(), 25.0, 0.1);
     
      reset(mockControl);
      mock.pause();
      expect(mock.currentPosition()).andReturn(12.0);
      expect(mock.isPlaying()).andReturn(false);
             replay( mockControl );
      assertEquals(mock.currentPosition(), 12.0, 1.0);
      assertFalse(mock.isPlaying());
     
      reset(mockControl);
      mock.stop();        
      expect(mock.currentPosition()).andReturn(0.0);
      expect(mock.isPlaying()).andReturn(false);
      replay( mockControl );
      assertEquals(mock.currentPosition(), 0.0, 1.0);
      assertFalse(mock.isPlaying());
      }

public void testAdvance() {
      mock.loadSongs(mp3Entries);
      mock.play();
      expect(mock.isPlaying()).andReturn(true);
      replay( mockControl );
      assertTrue(mock.isPlaying());
      reset(mockControl);

      mock.prev();
      expect(mock.currentSong()).andReturn((String)mp3Entries.get(0));
      expect(mock.isPlaying()).andReturn(true);
      replay( mockControl );
      assertEquals(mock.currentSong(), (String)mp3Entries.get(0));
      assertTrue(mock.isPlaying());

      reset(mockControl);
      mock.next();
      expect(mock.currentSong()).andReturn((String)mp3Entries.get(1));
      replay( mockControl );
      assertEquals(mock.currentSong(),(String) mp3Entries.get(1));
     
      reset(mockControl);
      mock.next();
      expect(mock.currentSong()).andReturn((String)mp3Entries.get(2));
      replay( mockControl );
      assertEquals(mock.currentSong(), (String)mp3Entries.get(2));
     
      reset(mockControl);
      mock.prev();
      expect(mock.currentSong()).andReturn((String)mp3Entries.get(1));
      replay( mockControl );
      assertEquals(mock.currentSong(),(String) mp3Entries.get(1));
     
      reset(mockControl);
      mock.next();
      expect(mock.currentSong()).andReturn((String)mp3Entries.get(2));
      replay( mockControl );
      assertEquals(mock.currentSong(), (String)mp3Entries.get(2));
     
      reset(mockControl);
      mock.next();
      expect(mock.currentSong()).andReturn((String)mp3Entries.get(3));
      replay( mockControl );
      assertEquals(mock.currentSong(), (String)mp3Entries.get(3));
     
     
      reset(mockControl);
      mock.next();
      expect(mock.isPlaying()).andReturn(true);
      expect(mock.currentSong()).andReturn((String)mp3Entries.get(3));
      replay( mockControl );
      assertEquals(mock.currentSong(), (String)mp3Entries.get(3));
      assertTrue(mock.isPlaying());
      }
}
