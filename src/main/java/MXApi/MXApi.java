package MXApi;

import org.xbill.DNS.*;
import java.util.*;

public class MXApi{

    public LinkedList<MXRecord> getMxRecords(String domainName){      
        Record[] records = null;
        try
        {
           records = new Lookup(domainName, Type.MX).run();
        }
        catch (TextParseException e) {
            return null;
        }
        LinkedList<MXRecord> mxRecords = new LinkedList<MXRecord>();

        for (Record record : records) {
            mxRecords.add((MXRecord) record);
        }

        return mxRecords;
    }
}