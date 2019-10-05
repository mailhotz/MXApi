package MXApi;

import org.xbill.DNS.*;

public class App{

    public static void main(String[] args){
        MxRecordHandler api = new MxRecordHandler();

        for (MXRecord record : api.getMxRecords("google.com")) {
            System.out.println(record.getTarget());
        }
    }
}
