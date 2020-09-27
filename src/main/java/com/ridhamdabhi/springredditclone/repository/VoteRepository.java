package com.ridhamdabhi.springredditclone.repository;

import com.ridhamdabhi.springredditclone.model.Post;
import com.ridhamdabhi.springredditclone.model.User;
import com.ridhamdabhi.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
