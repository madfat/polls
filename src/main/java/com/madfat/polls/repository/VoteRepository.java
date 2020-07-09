package com.madfat.polls.repository;

import com.madfat.polls.model.ChoiceVoteCount;
import com.madfat.polls.model.Vote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<Vote, String> {
    @Query("select new com.madfat.polls.model.ChoiceVoteCount(v.choice.id, count(v.id)) " +
            "from Vote v " +
            "where v.poll.id in :pollIds " +
            "group by v.choice.id")
    List<ChoiceVoteCount> countByPollIdInGroupByChoiceId(@Param("pollIds") List<String> pollsIds);

    @Query("select new com.madfat.polls.model.ChoiceVoteCount(v.choice.id, count(v.id)) " +
            "from Vote v " +
            "where v.poll.id = :pollId " +
            "group by v.choice.id")
    List<ChoiceVoteCount> countByPollIdGroupByChoiceId(@Param("pollId") String pollId);

    @Query("select v from Vote v " +
            "where v.user.id = :userId and v.poll.id in :pollIds")
    List<Vote> findByUserIdAndPollIdIn(@Param("userId") String userId, @Param("pollIds") List<String> pollIds);

    @Query("select v from Vote v " +
            "where v.user.id = :userId and v.poll.id = :pollId")
    Vote findByUserIdAndPollId(@Param("userId") String userId, @Param("pollId") String pollId);

    @Query("select count(v.id) from Vote v where v.user.id = :userId")
    Long countByUserId(@Param("userId") String userId);

    @Query("select v.poll.id from Vote v where v.user.id = :userId")
    Page<String> findVotedPollIdsByUserId(@Param("userId") String userId, Pageable pageable);
}
