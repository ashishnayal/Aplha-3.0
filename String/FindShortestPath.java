 // Program to find the shortest path in string to reach the destination.
public class FindShortestPath {
    public static float getShortestPath(String paths){
        int X=0,Y=0;
        for(int i=0;i<paths.length();i++){
            char dir=paths.charAt(i);
            //south
            if(dir=='S')
            { 
                Y--;
            }
            //north
            else if(dir=='N')
            {
                Y++;
            }
            //west
            else if(dir=='W')
            {
                X--;
            }
            //east
            else{
                X++;
            }
        }
        int X2=X*X;
        int Y2=Y*Y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String paths="WNEENESENNN";
        System.out.println(getShortestPath(paths));
    }
}
