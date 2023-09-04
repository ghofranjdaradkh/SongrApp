package com.ghofranjdaradkh.songer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongerApplicationTests {

	@Test
	void contextLoads() {
	}

@Test
	void testConstructor(){
	Album  Album = new Album("Album1", "Name", 1, 300, "album.jpg");
	assertEquals("Album1", Album.getTitle());
	assertEquals("Name", Album.getArtist());
	assertEquals(1, Album.getSongCount());
	assertEquals(300, Album.getLength());
	assertEquals("album.jpg", Album.getImageUrl());

}

	@Test
	public void testGettersAndSetters() {
		Album  album = new Album("Album1", "Name", 1, 300, "album.jpg");


		album.setTitle("New Title");
		assertEquals("New Title", album.getTitle());

		album.setArtist("New Artist");
		assertEquals("New Artist", album.getArtist());


		album.setSongCount(20);
		assertEquals(20, album.getSongCount());

		// Test lengthSeconds
		album.setLength(480);
		assertEquals(480, album.getLength());

		// Test imageUrl
		album.setImageUrl("newImage.jpg");
		assertEquals("newImage.jpg", album.getImageUrl());
	}
}
