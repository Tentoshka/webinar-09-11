public class Doctor {
    private String name;
    private String surname;
    private String specialization;
    private Hospital hospital;

    public Doctor(String name, String surname, String specialization, Hospital hospital) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.hospital = hospital;
    }

    public void diagnosisPatient() throws InterruptedException {
        Patient patient = hospital.healPatient();

        int random = (int) (Math.random() * 3);

        Thread.sleep(1000);

        if (random == 1) {
            System.out.println(this.specialization + " " + this.name + " " + this.surname + " госпитализирует пациента " + patient.getName() + " " + patient.getSurname() + " с диагнозом " + patient.getDiagnosis());
        } else {
            System.out.println(this.specialization + " " + this.name + " " + this.surname + " диагностирует пациента " + patient.getName() + " " + patient.getSurname() + " с диагнозом " + patient.getDiagnosis());
        }
    }
}
