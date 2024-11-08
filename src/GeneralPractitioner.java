class GeneralPractitioner extends HealthProfessional {
        private String practiceArea; // For Doctor
    
        public GeneralPractitioner() {
        }
    
        public GeneralPractitioner(int ID, String name, String specialty, String practiceArea) {
            super(ID, name, specialty);
            this.practiceArea = practiceArea;
        }
    
        @Override
        public void printDetails() {
            super.printDetails();
            System.out.println("Practice Area: " + practiceArea);
        }
}
