package info.gehrels.voting;

import org.apache.commons.math3.fraction.BigFraction;

import java.util.Collection;

public class VotesForCandidateCalculation {
	static <CANDIDATE_TYPE extends Candidate> BigFraction calculateVotesForCandidate(CANDIDATE_TYPE candidate, Collection<BallotState<CANDIDATE_TYPE>> ballotStates) {
		BigFraction votes = BigFraction.ZERO;
		for (BallotState ballotState : ballotStates) {
			if (ballotState.getPreferredCandidate() == candidate) {
				votes= votes.add(ballotState.getVoteWeight());
			}
		}

		return votes;
	}
}
