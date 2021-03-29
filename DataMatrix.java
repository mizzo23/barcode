
public class DataMatrix implements BarcodeIO
{
   public static final char BLACK_CHAR = '*';
   public static final char WHITE_CHAR = ' ';
   private BarcodeImage image = null;
   private String text = null;
   private int actualWidth = 0;
   private int actualHeight = 0;
   
   /**
    * Dependencies: Default BarcodeImage constructor, readText()
    * 
    * @author Person 1
    */
   public DataMatrix()
   {
      
   }
   
   /**
    * Dependencies: Scan()
    * 
    * @param image
    * @author Dependent on Scan
    */
   public DataMatrix(BarcodeImage image)
   {
      
   }
   
   /**
    * Dependencies: readText()
    * 
    * @author
    */
   public DataMatrix(String text)
   {
      
   }
   
   /**
    * Dependencies: None
    * 
    * @return
    * @author
    */
   public int getActualWidth()
   {
      return actualWidth; //stub
   }
   
   /**
    * Dependencies: None
    * 
    * @return
    * @author
    */
   public int getActualHeight()
   {
      return actualHeight; //stub
   }
   
   /**
    * Dependencies: None, but testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @return
    * @author Josiah Sanchez
    */
   private int computeSignalWidth()
   {
      int signalWidth = 0;
      
      //iterate through bottom row of array
      for (int x = 0; x < actualWidth; x++)
      {
         /*
          * need to get the pixel on the bottom row of the array
          * (assuming that it is already situated at bottom of array)
          * if true, we add to the signal width. We use the final row in the
          * array, because it is our closed limitation line, consisting only of
          * true values (located in last row). Hence the constant actualHeight.
          * 
          * getPixel(int row, int col)
          */
         if (image.getPixel(actualHeight, x))
         {
            signalWidth++;
         }
      }
      
      return signalWidth; //stub
   }
   
   /**
    * Dependencies: None, but testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @author Josiah Sanchez
    */
   private int computeSignalHeight()
   {
      int signalHeight = 0;
      
      for (int x = 0; x < actualHeight; x++)
      {
         /*
          * If the pixel in the first position of each row is true,
          * we can then add to the height of the signal. We only need to 
          * check the closed limitation lines for this method, hence the 
          * constant 0 in image.getPixel(x, 0)
          * coming from the method getPixel(int row, int col).
          */
         if (image.getPixel(x, 0))
            signalHeight++;
      }
      
      return signalHeight;
   }
   
   /**
    * Dependencies: clone(), cleanImage(), computeSignalWidth(), 
    * computeSignalHeight()
    * 
    * @author
    */
   public boolean scan(BarcodeImage bc)
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: None
    * 
    * @author
    */
   public boolean readText(String text)
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: WriteChartoCol()
    * 
    * @author
    */
   public boolean generateImageFromText()
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: readCharFromCol(int col)
    * Also, testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @author Josiah Sanchez
    */
   public boolean translateImageToText()
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: None
    * 
    * @author
    */
   public void displayTextToConsole()
   {
      // TODO Auto-generated method stub
      
   }

   /**
    * Dependencies: None, but testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @author
    */
   public void displayImageToConsole()
   {
      // TODO Auto-generated method stub
      
   }
   
   /**
    * Dependencies: moveimageToLowerLeft(), shiftImageDown(), shiftImageLeft()
    * 
    * @author Nathan Huven
    */
   private void cleanImage()
   {
      
   }
   
   /**
    * 
    * @param col
    * @return
    * @author
    */
   private char readCharFromCol(int col)
   {
      return 'f'; //stub
   }
   
   /**
    * 
    * @param col
    * @param code
    * @return
    * @author
    */
   private boolean WriteCharToCol(int col, int code)
   {
      return false; //stub
   }
   
   /**
    * Dependencies: None
    * 
    * @author
    */
   public void displayRawImage()
   {
      
   }
   
   /**
    * Dependencies: None
    * 
    * @author
    */
   private void clearImage()
   {
      
   }

}
