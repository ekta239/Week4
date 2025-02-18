package com.insaurancepolicymgmt;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        hashSetPolicies.removeIf(policy -> policy.getExpiryDate().isBefore(today));
        linkedHashSetPolicies.removeIf(policy -> policy.getExpiryDate().isBefore(today));
        treeSetPolicies.removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }

    public List<Policy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate soon = today.plusDays(30);
        List<Policy> expiringSoon = new ArrayList<>();
        for (Policy policy : treeSetPolicies) {
            if (!policy.getExpiryDate().isBefore(today) && policy.getExpiryDate().isBefore(soon)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        List<Policy> filteredPolicies = new ArrayList<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }

    public void displayPolicies() {
        for (Policy policy : treeSetPolicies) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P001", "Alice", LocalDate.of(2025, 5, 10), "Health", 500.0));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.of(2024, 3, 15), "Auto", 700.0));
        manager.addPolicy(new Policy("P003", "Charlie", LocalDate.of(2024, 4, 10), "Home", 300.0));

        System.out.println("All Policies:");
        manager.displayPolicies();

        System.out.println("\nPolicies Expiring Soon:");
        System.out.println(manager.getPoliciesExpiringSoon());

        System.out.println("\nRemoving Expired Policies...");
        manager.removeExpiredPolicies();
        manager.displayPolicies();
    }
}
