package model;

public class MarkSheet {
    private CandidateType typeId;
    private String name;
    private float viva;
    private float written;
    private float practical;
    private float admission;
    private ExamVerdict verdict;
    private boolean paid;

    public MarkSheet() {
    }

    public MarkSheet(CandidateType typeId, String name, float viva, float written, float practical, float admission, ExamVerdict verdict, boolean paid) {
        this.typeId = typeId;
        this.name = name;
        this.viva = viva;
        this.written = written;
        this.practical = practical;
        this.admission = admission;
        this.verdict = verdict;
        this.paid = paid;
    }

    public CandidateType getTypeId() {
        return typeId;
    }

    public void setTypeId(CandidateType typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getViva() {
        return viva;
    }

    public void setViva(float viva) {
        this.viva = viva;
    }

    public float getWritten() {
        return written;
    }

    public void setWritten(float written) {
        this.written = written;
    }

    public float getPractical() {
        return practical;
    }

    public void setPractical(float practical) {
        this.practical = practical;
    }

    public float getAdmission() {
        return admission;
    }

    public void setAdmission(float admission) {
        this.admission = admission;
    }

    public ExamVerdict getVerdict() {
        return verdict;
    }

    public void setVerdict(ExamVerdict verdict) {
        this.verdict = verdict;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
