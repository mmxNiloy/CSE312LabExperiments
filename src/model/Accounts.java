package model;

public class Accounts {
    public static boolean isValid(MarkSheet ms) {
        if(ms.getName().isEmpty()) {
            ms.setName("Unknown");
            return false;
        }

        return !(ms.getAdmission() > 100.0f || ms.getAdmission() < 0.0f
                || ms.getViva() > 100.0f || ms.getViva() < 0.0f
                || ms.getWritten() > 100.0f || ms.getWritten() < 0.0f
                || ms.getPractical() > 100.0f || ms.getPractical() < 0.0f) && ms.isPaid();
    }
}
