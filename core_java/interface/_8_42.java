// enum with if else and switch
enum status
    {
        running,failed,pending,success;
    }
public class _8_42 {
    
    public static void main(String[] args) {
        status s=status.running;
        if(s==status.running)
            System.out.println("all good");
        else if(s==status.failed)
            System.out.println("try again");
        else if(s==status.pending)
            System.out.println("wait");
        else
            System.out.println("done");


// implemetation of switch case using enum

        switch (s) {
            case running:
                System.out.println("all good");
                break;
                case failed:
                System.out.println("try again");
                break;
                case pending:
                System.out.println("wait");
                break;
                default:
                System.out.println("done");
                break;
        
        }
    } 
}
