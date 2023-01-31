package Player;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class HumanPlayer extends Player {
    public HumanPlayer() {
        this.playerInput = new Scanner(System.in);
    }

    @Override
    public String getResponse() {
        return this.getPlayerInput().nextLine();
    }

    @Override
    public void getSnapOpportunity() {
        System.out.println("Here is the snap opportunity");
        String userResponse = this.getResponse();
        String userName = this.getName();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (userResponse.toLowerCase().equals("snap") ) {
                    System.out.println("Congratulations! " + userName  + ", you win!");
                } else {
                    System.out.println("You miss the Snap opportunity :(");
                }
            }
        };

        long timeForResponse = TimeUnit.SECONDS.toMillis(2);
        Timer timer = new Timer();
        timer.schedule(task, timeForResponse);
    }
}
