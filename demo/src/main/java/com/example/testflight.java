
import com.mashape.unirest.*;
public class testflight {
    

    public static void main (Strings[] args){
        HttpResponse<String> response = Unirest.get("https://timetable-lookup.p.rapidapi.com/TimeTable/BOS/LAX/20191217/")
            .header("X-RapidAPI-Key", "d06cf76b92msh9a73ad52c7bda01p1a3d75jsnea0ca004c33b")
            .header("X-RapidAPI-Host", "timetable-lookup.p.rapidapi.com")
            .asString();
    }
    
}
