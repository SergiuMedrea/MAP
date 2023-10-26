package Entities;

import Entities.Post;

import java.util.List;

public class Tag {
        private Long tagID;
        private String tagName;
        private List<Post> posts;

        public Tag(Long tagID, String tagName, List<Post> posts) {
                this.tagID = tagID;
                this.tagName = tagName;
                this.posts = posts;
        }

        public Long getTagID() {
                return tagID;
        }

        public void setTagID(Long tagID) {
                this.tagID = tagID;
        }

        public String getTagName() {
                return tagName;
        }

        public void setTagName(String tagName) {
                this.tagName = tagName;
        }

        public List<Post> getPosts() {
                return posts;
        }

        public void setPosts(List<Post> posts) {
                this.posts = posts;
        }
}
