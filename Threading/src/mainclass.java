public class mainclass {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Entered Array Is :- ");
        for (int i = 0; i < args.length; i++)
         {
            arr[i]=Integer.parseInt(args[i]);
            System.out.print(""+arr[i]);
        }
        
        thread t=new thread(arr);
        
        t.start();
        
    }
}
