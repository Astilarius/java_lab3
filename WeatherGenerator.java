import java.lang.Math;

public class WeatherGenerator {
    public static Weather[] getWeather(){
        Weather[] res = new Weather[7];
        Weather tempW;
        int choice;
        for(int i=0; i < 7; i++){
            choice = (int)Math.floor( Math.random() * 3 );
            tempW = new Weather(choice);
            res[i] = tempW;
        }
        return res;
    }
}
