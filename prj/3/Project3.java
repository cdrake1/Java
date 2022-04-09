import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int width = 0;
        int length = 0;

        System.out.print("Enter rows and columns ");
        width = input.nextInt();
        length = input.nextInt();
        String in = " ";


        char[][] circus = new char[width][length];
        for(int i =0; i < length; i++)
        {
            System.out.println("Enter each row: ");
            in = input.next();
            for(int j = 0; j< width; j++)
            {
                char Charin = in.charAt(j);
                circus[i][j] = Charin;
            }
        }
        input.close();
        char[][] answer = findExit(circus);
        for (int i = 0; i < answer.length; i++) 
        { //this equals to the row in our matrix.
            for (int j = 0; j < answer[i].length; j++) 
            { //this equals to the column in each row.
               System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }    

    public static char[][] findExit(char[][] circus)
    {
        int s = 0;
        int t = 0;
        int movement = 0;
        char start = '*';
        char mirror = '/';
        char mirror2 = '\\';
        char boarder = 'x';
        char space = '.';
        for(int row = 0; row < circus.length; row++)
        {
            for(int col = 0; col < row; col++)
            {
                if(start == circus[row][col])
                {
                    s = row;
                    t = col;
                    if (s == 0)
                    {
                        movement = 1;
                    }
                    if (s == circus.length - 1)
                    {
                        movement = 2;
                    }
                    if (t == 0)
                    {
                        movement = 3;
                    }
                    if (t == circus[0].length - 1)
                    {
                        movement = 4;
                    }
                }

                while(boarder == circus[s][t])
                {
                    if (space == circus[s][t] || start == circus[s][t])
                    {
                        if (movement == 1)
                        {
                            s++;
                        }
                        else if (movement == 2)
                        {
                            s--;
                        }
                        else if (movement == 3)
                        {
                            t++;
                        }
                        else if (movement == 4)
                        {
                            t--;
                        }
                    }

                    else if (mirror == circus[s][t])
                    {
                        if (movement == 1)
                        {
                            t--;
                            movement = 4;
                        }
                        else if (movement == 2)
                        {
                            t++; 
                            movement = 3;
                        }
                        else if (movement == 3)
                        {
                            s--;
                            movement = 2;
                        }
                        else if (movement == 4)
                        {
                            s++;
                            movement = 1;
                        }
                    }

                    else if (mirror2 == circus[s][t])
                    {
                        if (movement == 1)
                        {
                            t++; 
                            movement = 3;
                        }
                        else if (movement== 2)
                        {
                            t--;
                            movement = 4;
                        }
                        
                        else if (movement == 3)
                        {
                            s++; 
                            movement = 1;
                        }
                        else if (movement == 4)
                        {
                            s--;
                            movement = 2;
                        }
                    }
                    circus[s][t] = '&';
                }
                    
            }
        }
        return circus;
    }
            
}
