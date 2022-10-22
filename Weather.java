public class Weather {
    private double degrees;
    private String weather;
    public Weather(int wnum){
        degrees = (int)Math.floor( Math.random() * 10 + 20 );
        System.out.println(wnum);
        switch(wnum){
            case 0:{
                weather = "cloudy";
            }
            case 1:{
                weather = "sunny";
            }
            case 2:{
                weather = "raining";
            }
        }
    }
    public double getDeg(){
        return degrees;
    }
    public String getW(){
        return weather;
    }
}
