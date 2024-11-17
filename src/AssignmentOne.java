import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Health", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Health", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Williams", "General Health", "Geriatrics");

        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Brown", "Dietitian", "Nutrition");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Davis", "Surgeon", "Orthopedics");

        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        ohp1.printDetails();
        System.out.println("------------------------------");
        ohp2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(createAppointment("John Doe", "1234567890", "08:00", gp1));
        appointments.add(createAppointment("Jane Smith", "0987654321", "10:00", ohp1));
        appointments.add(createAppointment("Alice Johnson", "1112223333", "14:30", gp2));
        appointments.add(createAppointment("Bob Brown", "4445556666", "16:00", ohp2));

        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        cancelBooking(appointments, "1234567890");
        printExistingAppointments(appointments);
    }

    private static Appointment createAppointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        return new Appointment(patientName, mobilePhone, preferredTimeSlot, selectedDoctor);
    }

    private static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    private static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        Appointment appointmentToCancel = null;
        for (Appointment appointment : appointments) {
            if (appointment.getMobilePhone().equals(mobilePhone)) {
                appointmentToCancel = appointment;
                break;
            }
        }
        if (appointmentToCancel != null) {
            appointments.remove(appointmentToCancel);
            System.out.println("Appointment cancelled for mobile phone: " + mobilePhone);
        } else {
            System.out.println("No appointment found for mobile phone: " + mobilePhone);
        }
    }
}
