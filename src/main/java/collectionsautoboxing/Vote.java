package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> result = new HashMap<>();
        result.put(VoteResult.YES, 0);
        result.put(VoteResult.NO, 0);
        result.put(VoteResult.ABSTAIN, 0);
        for (VoteResult v : votes.values()) {
            if (v == VoteResult.YES) {
                result.put(VoteResult.YES, result.get(VoteResult.YES) + 1);
            } else if (v == VoteResult.NO) {
                result.put(VoteResult.NO, result.get(VoteResult.NO) + 1);
            } else if (v == VoteResult.ABSTAIN) {
                result.put(VoteResult.ABSTAIN, result.get(VoteResult.ABSTAIN) + 1);
            }

        }
        return result;
    }


    public Map<VoteResult, Integer> getResult2(Map<String, VoteResult> results) {
        Map<VoteResult, Integer> finalResults = new HashMap<>();
        for (VoteResult v : results.values()) {
            if (!finalResults.containsKey(v)) {
                finalResults.put(v, 0);
            }
            finalResults.put(v, finalResults.get(v) + 1);
        }
        return finalResults;
    }
}
