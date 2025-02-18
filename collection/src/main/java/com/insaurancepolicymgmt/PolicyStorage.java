package com.insaurancepolicymgmt;

import java.time.LocalDate;
import java.util.*;

public class PolicyStorage {
    private Map<String, Policy> hashMapPolicies = new HashMap<>();
    private Map<String, Policy> linkedHashMapPolicies = new LinkedHashMap<>();
    private Map<String, Policy> treeMapPolicies = new TreeMap<>();

    public void addPolicy(Policy policy) {
        hashMapPolicies.put(policy.getPolicyNumber(), policy);
        linkedHashMapPolicies.put(policy.getPolicyNumber(), policy);
        treeMapPolicies.put(policy.getPolicyNumber(), policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return hashMapPolicies.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate soon = today.plusDays(30);
        List<Policy> expiringSoon = new ArrayList<>();
        for (Policy policy : treeMapPolicies.values()) {
            if (!policy.getExpiryDate().isBefore(today) && policy.getExpiryDate().isBefore(soon)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public List<Policy> getPoliciesByHolder(String policyholderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashMapPolicies.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        hashMapPolicies.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        linkedHashMapPolicies.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        treeMapPolicies.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }

    public static void main(String[] args) {
        PolicyStorage storage = new PolicyStorage();
        
        storage.addPolicy(new Policy("P001", "Alice", LocalDate.of(2025, 5, 10), "Health", 500.0));
        storage.addPolicy(new Policy("P002", "Bob", LocalDate.of(2024, 3, 15), "Auto", 700.0));
        storage.addPolicy(new Policy("P003", "Charlie", LocalDate.of(2024, 4, 10), "Home", 300.0));

        System.out.println("Policies Expiring Soon: " + storage.getPoliciesExpiringSoon());
        System.out.println("Policies of Alice: " + storage.getPoliciesByHolder("Alice"));
    }
}
