package MXApi;

import org.xbill.DNS.*;
import java.util.*;

public class MxRecordHandler {

    public LinkedList<MXRecord> getMxRecords(String domainName){
        Record[] records;
        try
        {
           records = new Lookup(domainName, Type.MX).run();
        }
        catch (TextParseException e) {
            return null;
        }

        LinkedList<MXRecord> mxRecords = new LinkedList<MXRecord>();
        if(records != null)
            for (Record record : records)
                mxRecords.add((MXRecord) record);

        return mxRecords;
    }
}
