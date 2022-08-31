public class Quadratic1
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double root1, root2;
        int x = 0, y = 0;
        double d = (Math.pow (b, 2) - (4 * a * c));
        if (d >= 0)
        {
            root1 =  (- b  + Math.sqrt ( d )) / ( 2 * a );
            root2 =  (- b  - Math.sqrt ( d )) / ( 2 * a );
            
            if(root1 == Math.rint(root1) || root2 == Math.rint(root2))
            {
                if(root1 == Math.rint(root1))
                {
                    x = (int)root1;
                }
                if(root2 == Math.rint(root2))
                {
                    y = (int)root2;
                }
                System.out.println(x + ", " + y);
            }
            else
            {
                System.out.println(root1 + ", " + root2);
            }
        }
        else 
        {
            double r = (-b) / (2 * a);
            double i = Math.sqrt(-d) / (2 * a);
            if(r == 0)
            {
                if (i == 1)
                {
                    System.out.print("i, ");
                    System.out.print(" -i");
                }
                else
                {
                    if(i == Math.rint(i))
                    {
                        y = (int) i;
                        System.out.print(y + "i, ");
                        System.out.print(y + "i");
                    }
                    else
                    {
                        System.out.print(i + "i, ");
                        System.out.print(i + "i");
                    }    
                } 
            }
            else
            {
                if (i == 1)
                {
                    if(r == Math.rint(r))
                    {
                        x = (int) r;
                        System.out.print(x + " + " + "i" + ", ");
                        System.out.print(x + " - " + "i");
                    }
                    else
                    {
                        System.out.print(r + " + " + "i" + ", ");
                        System.out.print(r + " - " + "i");
                    }
                    
                }
                else
                {
                    if(r == Math.rint(r) && i == Math.rint(i))
                    {
                        if(r == Math.rint(r))
                        {
                            x = (int)r;
                        }
                        if(i == Math.rint(i))
                        {
                            y = (int)i;
                        }
                        System.out.print(x + " + " + y + "i" + ", ");
                        System.out.print(x + " - " + y + "i");
                    }
                    else if(r == Math.rint(r))
                    {
                        x = (int)r;
                        System.out.print(x + " + " + i + "i" + ", ");
                        System.out.print(x + " - " + i + "i");
                    }
                    else if(i == Math.rint(i))
                    {
                        y = (int)i;
                        System.out.print(r + " + " + y + "i" + ", ");
                        System.out.print(r + " - " + y + "i");
                    }
                    else
                    {
                        System.out.print(r + " + " + i + "i" + ", ");
                        System.out.print(r + " - " + i + "i");
                    }
                }
            }  
        }
    }
}