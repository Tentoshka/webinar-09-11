import java.util.ArrayDeque;
import java.util.Queue;

public class Hospital {
    private Queue<Patient> patients;

    public Hospital() {
        this.patients = new ArrayDeque<>();
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public Patient healPatient() {
        return this.patients.poll();
    }
}
