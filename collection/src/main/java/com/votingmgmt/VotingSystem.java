package com.votingmgmt;


import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCounts = new HashMap<>();
    private TreeMap<String, Integer> sortedResults;
    private LinkedHashMap<String, Integer> voteOrder;

    public VotingSystem() {
        sortedResults = new TreeMap<>(voteCounts);
        voteOrder = new LinkedHashMap<>();
    }

    public void castVote(String candidate) {
        voteCounts.put(candidate, voteCounts.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCounts.get(candidate));
    }

    public void displayResults() {
        sortedResults.clear();
        sortedResults.putAll(voteCounts);

        System.out.println("Final Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    public void displayVoteOrder() {
        System.out.println("\nVotes in Order of Entry:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displayResults();
        votingSystem.displayVoteOrder();
    }
}
