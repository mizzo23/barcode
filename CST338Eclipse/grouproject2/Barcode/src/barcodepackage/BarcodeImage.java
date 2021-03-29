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
   * To initialze and transfer the strData array (1-D) into a 2-D array
   * called imageData. This method will call setPixel() to arrange data
   * in said 2-D array
   */
  public BarcodeImage(String[] strData)
  {
     imageData = new boolean[MAX_HEIGHT][MAX_WIDTH];

     //set all the empty space above strData to false
     for (int row = 0; row < (MAX_HEIGHT - strData.length); row++)
     {
        for (int col = 0; col < MAX_WIDTH; col++)
           setPixel(row, col, false);
     }
     
     //used as a counter to keep track of where we are in strData[]
     int strPos = 0;
     
     //pack strData[] to the bottom left of 2-D array
     for (int row = (MAX_HEIGHT - strData.length); row < MAX_HEIGHT; row++)
     {
        for (int col = 0; col < MAX_WIDTH; col++)
        {
           //if the col extends past length of strData[row] set to false
           if (col < strData[strPos].length())
           {
              //if the character at col is '*' set true
              if (strData[strPos].charAt(col) == '*')
                 setPixel(row, col, true);
              //if character at col is ' ' set false
              if (strData[strPos].charAt(col) == ' ')
                 setPixel(row, col, false);
           }
           else
              setPixel(row, col, false);
        }
        strPos++;
     }
  }

   /**
    * Pre-condition: imageData has been instantiated to size MAX_HEIGHT and 
    * MAX_WIDTH.
    * This method will find and return the boolean value of 
    * imageData[row][col].  
    *
    * @param row The index of the particular boolean array within imageData 
    * to return a value from
    * @param col The index within the boolean array to return a value from
    * @return If row and col are within the bounds of imageData then the 
    * boolean value of imageData[row][col] is returned.  Otherwise, false is
    * returned.
    * @author Nathan Huven
    */
   public boolean getPixel(int row, int col)
   {
      // Test to check row and col are within the bounds of imageData
      if (row > 0 && col > 0 && row < MAX_HEIGHT && col < MAX_WIDTH)
      {
         return imageData[row][col];
      }
      else
         return false;
   }

   /**
    * Pre-Condition: imageData has been instantiated to size MAX_HEIGHT and 
    * MAX_WIDTH.
    * This method will set the value of imageData[row][col] to value as long as
    * row and col are within the bounds of imageData.
    *
    * @param row The index of the particular boolean array within imageData 
    * that will be updated
    * @param col The index within the boolean array to update
    * @param value The value that imageData[row][index] will be set to
    * @return true if imageData[row][col] was successfully set to value.  false
    * if row or col exceeds the bounds or imageData.
    * @author Nathan Huven
    */
   public boolean setPixel(int row, int col, boolean value)
   {
      // Test to check row and col are within the bounds of imageData
      if (row > 0 && col > 0 && row < MAX_HEIGHT && col < MAX_WIDTH)
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
