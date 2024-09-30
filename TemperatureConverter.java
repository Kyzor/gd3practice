class TemperatureConverter {

    public static void main(String args[]){
        double degreesF = 47.5;
        double degreesC = (5.0 / 9.0) * (degreesF - 32);

        System.out.println("The Temperature 47.5 degrees F");
        System.out.println("is " + degreesC + " degrees C" );
    }
}
