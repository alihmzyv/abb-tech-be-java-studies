package problems.medium;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DesignTwitter355 {

}

class Twitter {

    private Set<User> users;

    public Twitter() {
        users = new HashSet<>();
    }

    public void postTweet(int userId, int tweetId) {
        //adds the tweet to the posted tweets of userId
        //adds the tweet to the newsFeed of the users who follows userId
        getUser(userId).postTweet(tweetId);
        }

    public List<Integer> getNewsFeed(int userId) {
        //return the list of tweetId's in the newsFeed of userId
        return getUser(userId).getNewsFeed();
    }

    public void follow(int followerId, int followeeId) {
        //adds followeeId to the followedList of followerId
        getUser(followerId).follow(getUser(followeeId));
    }

    public void unfollow(int followerId, int followeeId) {
        //removes followeeId from the followedList of followerId
        //updates the newsFeed newsFeed of followerId
        getUser(followerId).unfollow(getUser(followeeId));
    }

    public User getUser(int userId) {
        return users.stream()
                .filter(user -> user.getUserId() == userId)
                .findFirst()
                .orElseGet(() -> {
                    User newUser = new User(userId);
                    users.add(newUser);
                    return newUser;
                });
    }
}

class User {
    private int userId;
    private NavigableSet<Tweet> tweetsPosted;
    private List<User> usersFollowed;
    private List<User> followers;
    private NavigableSet<Tweet> newsFeed;

    public User(int userId) {
        this.userId = userId;
        tweetsPosted = new TreeSet<>();
        usersFollowed = new ArrayList<>();
        followers = new ArrayList<>();
        newsFeed = new TreeSet<>();
    }


    public void postTweet(int tweetId) {
        if (tweetsPosted.contains(new Tweet(tweetId))) {
            return;
        }
        Tweet newTweet = new Tweet(tweetId);
        tweetsPosted.add(newTweet);
        newsFeed.add(newTweet);
        followers.stream()
                .forEach(user -> user.newsFeed.add(newTweet));
    }

    public List<Integer> getNewsFeed() {
        try {
            return newsFeed.stream()
                    .limit(10)
                    .map(tweet -> tweet.getTweetId())
                    .collect(Collectors.toList());
        }
        catch (IndexOutOfBoundsException exc) {
            return newsFeed.stream()
                    .map(tweet -> tweet.getTweetId())
                    .collect(Collectors.toList());
        }
    }

    public int getUserId() {
        return userId;
    }

    public void follow(User user) {
        if (usersFollowed.contains(user)) {
            return;
        }
        usersFollowed.add(user);
        user.followers.add(this);
        this.newsFeed.addAll(user.tweetsPosted);
    }

    public void unfollow(User user) {
        usersFollowed.remove(user);
        user.followers.remove(this);
        newsFeed.removeAll(user.tweetsPosted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}

class Tweet implements Comparable<Tweet> {
    private int tweetId;
    private LocalDateTime dt;

    public Tweet(int tweetId) {
        this.tweetId = tweetId;
        this.dt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return tweetId == tweet.tweetId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tweetId);
    }

    @Override
    public int compareTo(Tweet o) {
        return - this.dt.compareTo(o.dt);
    }

    public int getTweetId() {
        return tweetId;
    }

    public LocalDateTime getDt() {
        return dt;
    }
}