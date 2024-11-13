class Appointment {
    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    public Appointment() {
    }

    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName + ", Mobile Phone: " + mobilePhone + ", Time Slot: " + preferredTimeSlot);
        selectedDoctor.printDetails();
    }

    // Getters and Setters
    public String getMobilePhone() {
        return mobilePhone;
    }
}