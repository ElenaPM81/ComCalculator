public class Calculator implements iCalculable{
    private double real1;
    private double real2;
    private double imaginary1;
    private double imaginary2;


    private double imaginary;
    private double realNum;
    private double imaginaryNum;

    public Calculator (double num1, double num2, double num3, double num4) {
        real1 = num1;
        imaginary1 = num2;
        real2 = num3;
        imaginary2 = num4;

    }



        public void sum(Calculator com) {


            realNum = real1 + real2 ;
            imaginaryNum = imaginary1 + imaginary2;

        }

        public void multiply(Calculator com) {


            realNum = ((real1 * real2) - (imaginary1 * imaginary2));
            imaginaryNum = ((real1* imaginary2) + (imaginary1* real2));
        }
//
        public void divide(Calculator com) {

            double temp = (real2 * real2) + (imaginary2 * imaginary2);

            realNum = ((real1 * real2) + (imaginary1 * imaginary2)) / temp;
            imaginaryNum = ((imaginary1 * real2) - (real1 * imaginary2)) / temp;


        }

        public double getReal() {
            return realNum ;
        }

        public double getImaginary() {
            return imaginaryNum;


        }
        public  void setImaginary(){
            this.imaginaryNum = imaginary;

        }
        public void setReal(){

            this.realNum = real1;
            
        }

    }


