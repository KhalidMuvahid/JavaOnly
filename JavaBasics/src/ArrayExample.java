public class ArrayExample {
    public static void main(String[] args) {
        //if we did not put any value than array will have
        //if it`s integer=0, object=null;
        int[] a = new int[3];
        int[] b = new int[]{5,2,6,1};
        int[] c ={2,345,6};
        Object[] o = new Object[3];

        //two-dimensional array
        int[][] a1 = {
                {1,2,3,4},
                {5,6,7,8}
        };

        int[][] b2 = new int[2][];
        b2[0]= new int[]{1,2,3} ;
        b2[0][1] = 9;
        b2[1]= new int[]{8,9,0};

        for (int i=0;i<b2.length;i++){
            for (int j=0;j<b2[i].length;j++){
                System.out.print(" "+b2[i][j]);
            }
            System.out.println();
        }


    }


}
