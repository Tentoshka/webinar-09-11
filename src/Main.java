import com.github.javafaker.Faker;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));

        Hospital hospital = new Hospital();
        Doctor doctor = new Doctor(faker.name().firstName(), faker.name().lastName(), faker.job().field(), hospital);

        for (int i = 0; i < 10; i++) {
            hospital.addPatient(new Patient(faker.name().firstName(), faker.name().lastName(), faker.medical().symptoms()));
        }

        for (int i = 0; i < 10; i++) {
            doctor.diagnosisPatient();
        }
    }
}