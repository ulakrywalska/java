public class Matrix {
    double[]data;
    int rows;
    int cols;
    //...
    Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows*cols];
    }

    Matrix(double[][] d){
        this.rows = d.length;
        int max_length = d[0].length;
        for (int i=0; i<rows; ++i){
            if (max_length<d[i].length) max_length=d[i].length;
        }
        this.cols = max_length;
        this.data = new double[rows*cols];
        for (int i=0; i<rows; ++i){
            for (int j=0; j<d[i].length; ++j){
                data[i*cols+j]=d[i][j];
            }
            for (int j=d[i].length; j<cols; ++j){
                data[i*cols+j]=0;
            }
        }
    }

    double[][] asArray(){
        double[][] output = new double[rows][cols];
        for(int i=0; i<rows; ++i){
            for (int j=0; j<cols; ++j){
                output[i][j] = data[i*cols+j];
            }
        }
        return output;
    }

    double get(int r,int c){
        return data[r*cols+c];
    }

    void set (int r,int c, double value){
        data[r*cols+c] = value;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            buf.append("[");
            for (int j = 0; j < cols; ++j) {
                buf.append(data[i * cols + j] + " ");
            }
            buf.append("]");
        buf.append("\n");
        }
        return buf.toString();
    }



    void print(){
        for(int i=0;i<rows; ++i){
            for(int j=0;j<cols;++j){
                System.out.print(data[i*cols+j]+" ");
            }
            System.out.println();
        }
    }
}