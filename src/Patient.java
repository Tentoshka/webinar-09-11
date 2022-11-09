public class Patient {
    private String name;
    private String surname;
    private String diagnosis;

    public Patient(String name, String surname, String diagnosis) {
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
