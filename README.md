# Project2

For this project, I started by making looking at the Driver and deciding what constructors I would need. From there, I made a basic template of what my classes would look like. I began working through each line of the Driver to see how the classes needed to interact. The file needed to be read, store station information, and then compute the averages with the station information given.

## Problem Solving
To solve many of the issues, I apporached it with the idea of matching the final output. Since the Driver class called methods driectly, I could go line-by-line working to have the correct output. When the final output of the method was correct, I could then move on to the next line of the Driver to solve that problem. 

In reading the file, the first three lines were unnecessary information that I could scan past with the scanner. After that, I could assume that neither the first two or last two stations would be callled upon for this Project because they would not be able to find the staions two above or below them and there was no information about creating a toString() or exception for this case. After this, reading the file was simply scanning for the information given, and then storing the information for later use.

## LetterAvg
Class Level Variables:
    private char avgLetter
    private ArrayList<String> matchingStations

Constructor: 
    LetterAvg(char letter)  //Sets avgLetter to letter
    
public int numberOfStationWithLetterAvg():
    This scans the file, finds the number of stations that have their first letter matching the average letter
    
    method variables:
            String station
            char fileChar
            int numOfMatchingStations

public String toString() {
        Concatenates matchingStations and creates returns String

        method variables:
            int countingIndex = 0  
            String str
            
## MesoStation //Given Class
This class creates a Station with the name stID

Class Level Variables:
        private String stID;
        
Constructor:
        public MesoStation(String stId)
            Sets stID to stId

public String getStID() {
        returns stID

## MesoInherited
This class takes the Meso file and finds the average ascii characters of the stationID and creates a toString()

Class Extends:
        MesoAbstract

Class Level Variables:
        private String stationID 
        private int average

Constructor:
    public MesoInherit(MesoStation station) 
            Sets stationID to station

Methods:   
    public int[] calAverage()
            This method finds the average ascii character value along with it's ceiling and floor when rounding to an int, then returns them in an int array
            
        Method Variables:
                int[] asciiCharacters
                int[] asciiAverage
                int ceiling
                int floor
                double sumOfCharacters
                double trueAverage
    
public char letterAverage()
    This method finds the average ascii character associated with the average value (must be recalculated for ZyBooks)
    
        Method Variables:
            int[] asciiCharacters
            int[] asciiAverage
            int ceiling
            int floor
            double sumOfCharacters
            double trueAverage
            int averageReturn

## PosAvg
This class finds the index of the station and two examples of stations that average to that index.

Class Level Variables:
        int index = 0;
        String stationID = null;
        String indexPlusOne;
        String indexPlusTwo;
        String indexMinusOne;
        String indexMinusTwo;

Contructor:
    public PosAvg(String id)
        Sets stationID to id
        
Methods:
public int indexofStation() throws IOException
        Scans the file and finds the index of the staion with the given stationID
                
        Method Variables:
            FileInputStream fileByteStream = new FileInputStream("Mesonet.txt")
            Scanner scnr = new Scanner(fileByteStream)
            boolean exitWhile = false

public fileSearch(){
    Searches fine and instatiates indexMinusTwo, indexMinusOne, indexPlusOne, indexMinusOne
    
    Method Variables:
        FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
        Scanner scnr = new Scanner(fileByteStream);

public String toString()
    Uses fileSearch then creates String stating stations with average of stationID

## Tests

Rather than the standard JUnit tests, I used the assert class that we have been using in the Labs to help avoid submission issues. They work in a very similar way, so I used these for my tests. I made the tests check the output of each method to make sure that every method was working properly. My tests were very simple. If I had more time, the tests would be where I would spend the most work at so that I could create better tests.


## Author

Parker Williams

