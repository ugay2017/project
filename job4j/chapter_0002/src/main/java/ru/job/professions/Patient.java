package ru.job.professions;

public class Patient {
    private String name;
    private Diagnose diagnose;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Diagnose getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }
}
