package Player;

public class ComputerPlayer extends Player {
    public ComputerPlayer() {
        this.name = "Snapinator";
    }

    @Override
    public String getResponse() {
        return "ENTER";
    }

    @Override
    public void getSnapOpportunity() {
        System.out.println(this.getName() + " won this time");
    }
}
