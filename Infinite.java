import java.util.concurrent.TimeUnit;

public class Infinite {

public static void main(String args[]){

while(true){

System.out.println("Hey , I'm running\n");
try{
TimeUnit.SECONDS.sleep(1);
}
catch(Exception e){


}

}

}

}
