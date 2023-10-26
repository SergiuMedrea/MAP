package Test;

import Entities.*;
import Repo.*;

import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SocialMediaRepositoryTest {
    @Test
    public void testCreateUserAndPost() {
        Post post = null;
        User user = new User(1L, "testuser", "testuser@gmail.com", "test1234", new Date(2023, 10, 9), (List<Post>) post, null, null, null);
        post = new Post(1L, user, "photo", new Date(2023, 10, 10, 22, 22), "Test Location", null, null);

        InMemoryRepo.saveUser(user);
        InMemoryRepo.savePost(post);

        User retrievedUser = InMemoryRepo.getUserByID(1L);

        assertNotNull(retrievedUser);
        assertEquals("testuser", retrievedUser.getUsername());
        assertEquals("testuser@gmail.com", retrievedUser.getEmail());

        Post retrievedPost = InMemoryRepo.getPostByID(1L);

        assertNotNull(retrievedPost);
        assertEquals("photo", retrievedPost.getContentType());
        assertEquals("Test Location", retrievedPost.getLocation());
    }
}
