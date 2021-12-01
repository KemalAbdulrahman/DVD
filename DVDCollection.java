public class DVDCollection {

	// Data fields
	
	/** The current number of DVDs in the array */
	private int numdvds;
	
	/** The array to contain the DVDs */
	private DVD[] dvdArray;
	
	/** The name of the data file that contains dvd data */
	private String sourceName;
	
	/** Boolean flag to indicate whether the DVD collection was
	    modified since it was last saved. */
	private boolean modified;
	
	/**
	 *  Constructs an empty directory as an array
	 *  with an initial capacity of 7. When we try to
	 *  insert into a full array, we will double the size of
	 *  the array first.
	 */
	public DVDCollection() {
		numdvds = 0;
		dvdArray = new DVD[7];
	}
	
	public String toString() {
		String information = "numdvds = " + numdvds + "\n"
				+ "dvdArray.length = " + dvdArray.length + '\n';
		
		for(int i = 0; i< numdvds; i++) {
			information += "dvdArray[" + i + "] =" + dvdArray[i].toString();
		}
		return information;
	}

	public void addOrModifyDVD(String title, String rating, String runningTime) {
		DVD newDVD = new DVD(title, rating, Integer.parseInt(runningTime));
		dvdArray[numdvd] = newDVD;
		numdvds = nudvds + 1;
	}
	
	public void removeDVD(String title) {
       // taking title from user:
    	   String title;
    	   for(int i=0;i<length;i++)
    		   if(title=array[i];
    		   remove title;
    		   else 
    			   print("no dvd is not found");
	}
	
	public String getDVDsByRating(String rating) {
		for(int i = 0; i < dvdArray.size(); i++) {
			if(dvdArray[i].getRating() == rating) {
				dvd[i].toString();
			}
		}





		return null;	// STUB: Remove this line.

	}

	public int getTotalRunningTime() {
			int totalCount = 0;
			if(numdvds != 0) {
			for(int i = 0; i < numdvds; i++) {
				totalCount += dvdArray[i].getRunningTime();
			}
			return totalCount;
		}else {
			return 0;
		}
	}

	
	public void loadData(String filename) {






		
	}
	
	public void save() {







	}

	// Additional private helper methods go here:



	
}
