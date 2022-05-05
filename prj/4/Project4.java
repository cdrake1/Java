import java.util.*;
import java.io.*;
import java.nio.file.Files;


//Not sure if we were ever taught how to read through a file and save everything into an arraylist...
//I checked modules, previous homeworks and even searched the internet and could not find an answer that worked for this case
//my UML diagram is in a word document so im not sure if youll be able to open it, i added a mini one as a text file just in case
// I would appreciate if we could go over this project. Most of the students I spoke to had no idea how to complete this assignment

public class Project4
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);
        //grab user input for year
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        //grab user input for gender
        System.out.print("Enter the gender: ");
        String gender = input.nextLine();
        //grab user input for name
        System.out.print("Enter the name: ");
        String name = input.nextLine();
        input.close();
        //create babynames arraylist
        ArrayList<BabyName> BabyNames = new ArrayList<>();
        //save file from folder
        File fileT = new File("babynamesranking" + year + ".txt");
        //try to pass the file to loadnames
        try 
        {
            BabyNames = loadNames(fileT);
        }
        catch(FileNotFoundException e) //catch if file doesnt exist
        {
            throw new FileNotFoundException("File does not exist");
        }
        //pass to findname
        finally 
        {
            findName(name, year, BabyNames);
        }
        // JA: What about the output?

    }
    private static ArrayList<BabyName> loadNames(File fileT)
    {
        //create arraylist
        ArrayList<BabyNames> babies = new ArrayList<>();
        Scanner read = new Scanner(System.in); //create scanner and open file
        read = new Scanner(fileT).openStream();

        while(read.hasNext())  //while its reading through file
        {
            //create a boy and a girl baby using the babynames class
            BabyName boy = new BabyName();
            BabyName girl = new BabyName();
            boy.setGender("M");
            girl.setGender("F");

            int rank = read.nextInt();
            boy.setRank(rank);
            String bName = read.next();
            boy.setName(bName);
            babies.add(boy); //add boys info

            String gName = read.next();
            girl.setRank(rank);
            girl.setName(gName);
            babies.add(girl);  //add girls info

        }
       return babies;  //return arraylist
    }


    private static BabyName findName(String name, int year, ArrayList<BabyName> names)
    {
        String answer = " ";
        for(int i = 0; i < names.size(); i++) //read through arraylist for information of boys or girls
        {
            if(names.get(i).contains(name, year))
            {
                answer = names.get(i);  //save answer
            }
        }
        return answer;  //return answer

    }
}
public class BabyName 
{
    //babyname class
    // JA: These fields should be private
    String name;
    String gender;
    int year;
    int rank;
            
    public BabyName() 
    {
        //define values
        this.name = null;
        this.gender = null;
        this.year = 0;
        this.rank = 0;
    }
    //getters for name, gender, year and rank
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public int getYear()
    {
        return year;
    }
    public int getRank()
    {
        return rank;
    }

    //Setters for name, gender, year and rank
    public String setName(String newName)
    {
        this.name = newName;
    }
    public String setGender(String newGender)
    {
        this.gender = newGender;
    }
    public int setYear(int newYear)
    {
        this.year = newYear;
    }
    public int setRank(int newRank)
    {
        this.year = newRank;
    }

}


