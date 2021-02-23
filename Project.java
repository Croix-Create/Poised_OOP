package Poised;

public class Project {
    // Setting private object attributes.
    private int projectNum;
    private String projectName;
    private String buildingType;
    private String buildingAddress;
    private String erfNum;
    private long projectFee;
    private long paidToDate;
    private String deadline;




    public Project(int projectNum, String projectName, String buildingType, String buildingAddress, String erfNum, long projectFee, long paidToDate, String deadline) {
        this.projectNum = projectNum;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.buildingAddress = buildingAddress;
        this.erfNum = erfNum;
        this.projectFee = projectFee;
        this.paidToDate = paidToDate;
        this.deadline = deadline;
    }
        // Getters

        public int getProjectNum () {
            return projectNum;
        }
        public String getProjectName () {
            return projectName;
        }
        public String getBuildingType () {
            return buildingType;
        }
        public String getBuildingAddress () {
            return buildingAddress;
        }
        public String getErfNum () {
            return erfNum;
        }
        public long getProjectFee() {
            return projectFee;
        }
        public long getPaidToDate () {
            return paidToDate;
        }
        public String getDeadline() {
            return deadline;
        }

        // Setters

        public void setProjectNum(int NewProjectNum ) {
            this.projectNum = NewProjectNum;
        }
        public void setProjectName(String NewProjectName) {
            this.projectName = NewProjectName;
        }
        public void setBuildingType(String NewBuildingType) {
            this.buildingType = NewBuildingType;
        }
        public void setBuildingAddress(String NewBuildingAddress) {
            this.buildingAddress = NewBuildingAddress;
        }
        public void setErfNum(String NewErfNum) {
            this.erfNum = NewErfNum;
        }
        public void setProjectFee(long NewProjectFee) {
            this.projectFee = NewProjectFee;
        }
        public void setPaidToDate(long NewPaidToDate) {
            this.paidToDate = NewPaidToDate;
        }
        public void setDeadline (String NewDeadline) {
            this.deadline = NewDeadline;
        }

    public String toString() {
        String output = "Project number: " + this.projectNum;
        output += "\nProject name: " + this.projectName;
        output += "\n Building Type" + this.buildingType;
        output += "\nBuilding Address: " + this.buildingAddress;
        output += "\nERF Number: " + this.erfNum;
        output += "\nProject Fee: " + this.projectFee;
        output += "\nPaid To Date: " + this.paidToDate;
        output += "\nDeadline: " + this.deadline;

        return output;
    }
}
