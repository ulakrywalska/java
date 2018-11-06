public class Main{
    public static void main(String[] args) {
        Matrix m = new Matrix(new double[][]{{1,2,3,4},{5,6},{7,8},{9}});
        System.out.println(m.toString());
        double[][] d = m.asArray();
        System.out.println(m.get(0, 1));
       /* for (int i=0; i< d.length; ++i){
            for (int j=0; j<d[i].length; ++j){
                System.out.println(d[i][j]);
            }
        }*/
    }
}
