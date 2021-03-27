
public class BarcodeImage implements Cloneable
{
   public static final int MAX_HEIGHT = 30;
   public static final int MAX_WIDTH = 65;
   private boolean[][] imageData = null;
   
   /**
    * @author Kevin Daill
    */
   public BarcodeImage()
   {
      
   }
   
   /**
    * 
    * @param strData
    * @author Josiah Sanchez
    */
   public BarcodeImage(String[] strData)
   {
      
   }
   
   /**
    * 
    * @param row
    * @param col
    * @return
    * @author Nathan Huven
    */
   public boolean getPixel(int row, int col)
   {
      if (row > 0 || col > 0 || row < MAX_HEIGHT || col < MAX_WIDTH)
         return imageData[row][col];
      else
         return false;
   }
   
   /**
    * 
    * @param row
    * @param col
    * @param value
    * @return
    * @author Nathan Huven
    */
   public boolean setPixel(int row, int col, boolean value)
   {
      if (row > 0 || col > 0 || row < MAX_HEIGHT || col < MAX_WIDTH)
      {
         imageData[row][col] = value;
         return true;
      }
      else
         return false;
   }
   
   /**
    * 
    * @param data
    * @return
    * @author Nathan Huven
    */
   private boolean checkSize(String[] data)
   {
      return false; //stub
   }
   
   /**
    * @author Nathan Huven2
    */
   public void displayToConsole()
   {
      //char pixel;

      if (imageData != null)
      {
         System.out.print("       ");
         for (int i = 0; i < imageData[0].length; i++)
            System.out.printf("%-6d", i);
         System.out.println();
         for (int row = 0; row < imageData.length; row++)
         {
            System.out.printf("Row %-2d ", row);
            if (imageData[row] != null)
               for (int col = 0; col < imageData[row].length; col++)
               {
                  /*if (getPixel(row, col) == true)
                     pixel = '*';
                  else
                     pixel = ' ';
                  System.out.printf("%c", pixel);*/
                  System.out.printf("%-6s", getPixel(row, col));
               }
            else
               System.out.print("is null");
            System.out.println();
         }
      }
      else
         System.out.println("imageData is null");
   }
   
   /**
    * 
    * @param obj
    * @return
    * @author James Meaden
    */
   public Object clone()
   {
      return obj; //stub
   }
}