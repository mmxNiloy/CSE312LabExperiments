package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExamController {
    public static final HashMap<String, List<MarkSheet>> RESULTS = new HashMap<>();
    public static final float PASS_MARK_STUDENT = 40.0f;
    public static final float PASS_MARK_TEACHER = 45.0f;
    public static final float PASS_MARK_OFFICER_WR = 40.0f;
    public static final float PASS_MARK_OFFICER_VI = 45.0f;
    public static final float PASS_MARK_STAFF_WR = 33.0f;
    public static final float PASS_MARK_STAFF_VI = 33.0f;
    public static final float PASS_MARK_STAFF_PR = 45.0f;

    public static void processResults() {
        for(String fac : RESULTS.keySet()) {
            for(MarkSheet ms : RESULTS.get(fac)) {
                if(!Accounts.isValid(ms) || fac.isEmpty()) ms.setVerdict(ExamVerdict.INVALID);
                if(ms.getVerdict() != ExamVerdict.UNPROCESSED) continue;

                switch(ms.getTypeId()) {
                    case STUDENT -> {
                        ms.setVerdict(
                            ms.getAdmission() >= PASS_MARK_STUDENT ?
                                ExamVerdict.PASS : ExamVerdict.FAIL
                        );
                    }
                    case TEACHER -> {
                        ms.setVerdict(
                            ms.getViva() >= PASS_MARK_TEACHER ?
                                ExamVerdict.PASS : ExamVerdict.FAIL
                        );
                    }
                    case OFFICER -> {
                        ms.setVerdict(
                            ms.getViva() >= PASS_MARK_OFFICER_VI
                                && ms.getWritten() >= PASS_MARK_OFFICER_WR ?
                                    ExamVerdict.PASS : ExamVerdict.FAIL
                        );
                    }
                    case STAFF -> {
                        ms.setVerdict(
                            ms.getViva() >= PASS_MARK_STAFF_VI
                                && ms.getWritten() >= PASS_MARK_STAFF_WR
                                && ms.getPractical() >= PASS_MARK_STAFF_PR ?
                                    ExamVerdict.PASS : ExamVerdict.FAIL
                        );
                    }
                    default -> {}
                }
            }
        }
    }
}
