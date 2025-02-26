import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat all = new SimpleDateFormat("hh:mm:ss");
        Watch watch1 = new Watch(10, 10, 10);
        Watch watch2 = new Watch(10, 10);

        int h;
        int m;
        int s;

        System.out.println("kamat awy: \n" +
                "1. hh:mm:ss\n" +
                "2. hh:mm \n" +
                "3. hh\n" +
                "4. all zero");
        System.out.print("your choice: ");

        int ch = user.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Your watch: ");
                System.out.println(watch1.getHour() + ":" + watch1.getMinute() + ":" + watch1.getSecond());
                System.out.println("Atawy update kait ba: \n" +
                        "1. Manual\n" +
                        "2. Time Zone");
                ch = user.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("sahat chana: ");
                        h = user.nextInt();

                        if (h>=0&&h<=24){
                            watch1.setHour(h);
                        }else {
                            System.out.println("bram agadar ba 0 ta 24 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            h = user.nextInt();
                            watch1.setHour(h);
                        }

                        System.out.println("daqat chana: ");
                        m = user.nextInt();
                        if (m>=0&&m<=60){
                            watch1.setMinute(m);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            m = user.nextInt();
                            watch1.setMinute(m);
                        }

                        System.out.println("chrkay chana: ");
                        s = user.nextInt();

                        if (s>=0&&s<=60){
                            watch1.setSecond(s);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            s = user.nextInt();
                            watch1.setSecond(s);
                        }

                        System.out.println("Your watch: " + watch1.getHour() + ":" + watch1.getMinute() + ":" + watch1.getSecond());
                        break;
                    case 2:
                        System.out.println("Katy esta"+all.format(date));
                        SimpleDateFormat timeH = new SimpleDateFormat("HH");
                        SimpleDateFormat timeM = new SimpleDateFormat("mm");
                        SimpleDateFormat timeS = new SimpleDateFormat("ss");
                        watch1.setHour(Integer.parseInt(timeH.format(date)));
                        watch1.setMinute(Integer.parseInt(timeM.format(date)));
                        watch1.setSecond(Integer.parseInt(timeS.format(date)));
                        System.out.println("Your watch: " + watch1.getHour() + ":" + watch1.getMinute() + ":" + watch1.getSecond());
                        break;
                }
                break;
            case 2:
                System.out.print("Your watch: ");
                System.out.println(watch2.getHour() + ":" + watch2.getMinute() + ":" + watch2.getSecond());
                System.out.println("Atawy update kait ba: \n" +
                        "1. Manual\n" +
                        "2. Time Zone");
                ch = user.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("sahat chana: ");
                        h = user.nextInt();
                        if (h>=0&&h<=24){
                            watch2.setHour(h);
                        }else {
                            System.out.println("bram agadar ba 0 ta 24 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            h = user.nextInt();
                            watch2.setHour(h);
                        }

                        System.out.println("daqat chana: ");
                        m = user.nextInt();
                        if (m>=0&&m<=60){
                            watch2.setMinute(m);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            m = user.nextInt();
                            watch2.setMinute(m);
                        }

                        System.out.println("chrkay chana: ");
                        s = user.nextInt();

                        if (s>=0&&s<=60){
                            watch2.setSecond(s);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            s = user.nextInt();
                            watch2.setSecond(s);
                        }

                        System.out.println("Your watch: " + watch2.getHour() + ":" + watch2.getMinute() + ":" + watch2.getSecond());
                        break;
                    case 2:
                        System.out.println("Katy esta"+all.format(date));
                        SimpleDateFormat timeH = new SimpleDateFormat("HH");
                        SimpleDateFormat timeM = new SimpleDateFormat("mm");
                        SimpleDateFormat timeS = new SimpleDateFormat("ss");
                        watch2.setHour(Integer.parseInt(timeH.format(date)));
                        watch2.setMinute(Integer.parseInt(timeM.format(date)));
                        watch2.setSecond(Integer.parseInt(timeS.format(date)));
                        System.out.println("Your watch: " + watch2.getHour() + ":" + watch2.getMinute() + ":" + watch2.getSecond());
                        break;
                }
                break;
            case 3:
                System.out.print("Your watch: ");
                Watch watch3 = new Watch(10);
                System.out.println(watch3.getHour() + ":" + watch3.getMinute() + ":" + watch3.getSecond());
                System.out.println("Atawy update kait ba: \n" +
                        "1. Manual\n" +
                        "2. Time Zone");
                ch = user.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("sahat chana: ");
                        h = user.nextInt();
                        if (h>=0&&h<=24){
                            watch3.setHour(h);
                        }else {
                            System.out.println("bram agadar ba 0 ta 24 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            h = user.nextInt();
                            watch3.setHour(h);
                        }
                        System.out.println("daqat chana: ");
                        m = user.nextInt();
                        if (m>=0&&m<=60){
                            watch3.setMinute(m);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            m = user.nextInt();
                            watch3.setMinute(m);
                        }


                        System.out.println("chrkay chana: ");
                        s = user.nextInt();
                        if (s>=0&&s<=60){
                            watch3.setSecond(s);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            s = user.nextInt();
                            watch3.setSecond(s);
                        }

                        System.out.println("Your watch: " + watch3.getHour() + ":" + watch3.getMinute() + ":" + watch3.getSecond());
                        break;
                    case 2:
                        System.out.println("Katy esta"+all.format(date));
                        SimpleDateFormat timeH = new SimpleDateFormat("HH");
                        SimpleDateFormat timeM = new SimpleDateFormat("mm");
                        SimpleDateFormat timeS = new SimpleDateFormat("ss");
                        watch3.setHour(Integer.parseInt(timeH.format(date)));
                        watch3.setMinute(Integer.parseInt(timeM.format(date)));
                        watch3.setSecond(Integer.parseInt(timeS.format(date)));
                        System.out.println("Your watch: " + watch3.getHour() + ":" + watch3.getMinute() + ":" + watch3.getSecond());
                        break;
                }
                break;
            case 4:
                System.out.print("Your watch: ");
                Watch watch = new Watch();
                System.out.println(watch.getHour() + ":" + watch.getMinute() + ":" + watch.getSecond());
                System.out.println("Atawy update kait ba: \n" +
                        "1. Manual\n" +
                        "2. Time Zone");
                ch = user.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("sahat chana: ");
                        h = user.nextInt();
                        if (h>=0&&h<=24){
                            watch.setHour(h);
                        }else {
                            System.out.println("bram agadar ba 0 ta 24 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            h = user.nextInt();
                            watch.setHour(h);
                        }
                        System.out.println("daqat chana: ");
                        m = user.nextInt();
                        if (m>=0&&m<=60){
                            watch.setMinute(m);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            m = user.nextInt();
                            watch.setMinute(m);
                        }
                        System.out.println("chrkay chana: ");
                        s = user.nextInt();
                        if (s>=0&&s<=60){
                            watch.setSecond(s);
                        }else {
                            System.out.println("bram agadar ba 0 ta 60 atwani daxl kay");
                            System.out.println("Dubara daxly kawa");
                            s = user.nextInt();
                            watch.setSecond(s);
                        }

                        System.out.println("Your watch: " + watch.getHour() + ":" + watch.getMinute() + ":" + watch.getSecond());
                        break;
                    case 2:
                        System.out.println("Katy esta"+all.format(date));
                        SimpleDateFormat timeH = new SimpleDateFormat("HH");
                        SimpleDateFormat timeM = new SimpleDateFormat("mm");
                        SimpleDateFormat timeS = new SimpleDateFormat("ss");
                        watch.setHour(Integer.parseInt(timeH.format(date)));
                        watch.setMinute(Integer.parseInt(timeM.format(date)));
                        watch.setSecond(Integer.parseInt(timeS.format(date)));
                        System.out.println("Your watch: " + watch.getHour() + ":" + watch.getMinute() + ":" + watch.getSecond());
                        break;
                }
                break;

        }
    }
}