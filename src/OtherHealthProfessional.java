class OtherHealthProfessional extends HealthProfessional {
    private String specificSkill; // another

    public OtherHealthProfessional() {
    }

    public OtherHealthProfessional(int ID, String name, String specialty, String specificSkill) {
        super(ID, name, specialty);
        this.specificSkill = specificSkill;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specific Skill: " + specificSkill);
    }
}