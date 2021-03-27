package barcodepackage;

public class BarcodeImage implements Cloneable
{
   public static final int MAX_HEIGHT = 30;
   public static final int MAX_WIDTH = 65;
   private boolean[][] imageData = null;

   /**
    * @author Kevin Daill
    * James Meaden wrote initial constructor for testing
    * Kevin, you may need to verify.
    */
   public BarcodeImage()
   {
      imageData = new boolean[MAX_HEIGHT][MAX_WIDTH];
      for (int x = 0; x < MAX_HEIGHT; x++)
      {
         for (int y = 0; y < MAX_WIDTH; y++)
         {
            imageData[x][y] = false;
         }
      }
      //System.out.println(imageData[0][0]);
   }

   /**
    * 
    * @param strData
    * @author Josiah Sanchez
    */
   public BarcodeImage(String[] strData)
   {

   }
   /*Used by James for Testing
   public boolean[][] getImageData()
   {
      imageData = new boolean[MAX_HEIGHT][MAX_WIDTH];
      return imageData;
   }
   */
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
      {
         //boolean[][] newImageData = new boolean [row][col];
         //return newImageData[row][col];
         return imageData[row][col];
      }
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
      } else
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
      return false; // stub
   }

   /**
    * @author Nathan Huven2
    */
   public void displayToConsole()
   {
      // char pixel;

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
                  /*
                   * if (getPixel(row, col) == true) pixel = '*'; else pixel = ' ';
                   * System.out.printf("%c", pixel);
                   */
                  System.out.printf("%-6s", getPixel(row, col));
               }
            else
               System.out.print("is null");
            System.out.println();
         }
      } else
         System.out.println("imageData is null");
   }

   /**
    * 
    * @
    * @return BarcodeImage a cloned copy of the BarcodeImage Object
    * @author James Meaden
    */
   public Object clone()
   {
      try
      {
         BarcodeImage copy = (BarcodeImage)super.clone();
         
         /*imageData is an array, which is a mutable Object
         /therefore, this code below creates a deep copy of imageData*/
         copy.imageData = new boolean[MAX_HEIGHT][MAX_WIDTH];
         for (int x = 0; x < MAX_HEIGHT; x++)
         {
            for (int y = 0; y < MAX_WIDTH; y++)
            {
               copy.imageData[x][y] = imageData[x][y];
            }
         }
         
         return copy;
      }
      catch(CloneNotSupportedException e)
      {
         return null;
      } 
   }
}


