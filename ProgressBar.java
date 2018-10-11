import java.io.File;

class ProgressBar
{
    public static void main(String[] args) throws InterruptedException {  
        String progressBar = "[          ]";
        int countDown = 10;
        try
        {
            while (countDown >= 0)
            {
                System.out.print(progressBar);   
                if (countDown == 0) break;
                deleteBar();
                progressBar = updateProgressBar(progressBar, countDown);   
                countDown--;
            }
        }
        catch (InterruptedException ex)
        {
        }
    }

    public static String updateProgressBar(String progressBar, int count) {
        int equalLoc = 10 - count + 1;
        StringBuilder myName = new StringBuilder(progressBar);
        myName.setCharAt(equalLoc, '=');
        return myName.toString();
    }

    public static void deleteBar() throws InterruptedException {
        for (int i = 0; i < 12; i++) {
            System.out.print("\b");
        }

        Thread.sleep(100);
    }
}
