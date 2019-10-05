package MXApi;

import org.xbill.DNS.*;

import java.util.*;

public class MxRecordHandler {
    private LinkedList<MXRecord> mxRecords;

    private void getMxRecords(String domainName){
        Record[] records = null;
        try
        {
           records = new Lookup(domainName, Type.MX).run();
        }
        catch (TextParseException e) {
            throw new RuntimeException("Invalid domain name.");
        }

        mxRecords = new LinkedList<>();
        if(records != null)
            for (Record record : records)
                mxRecords.add((MXRecord) record);

    }

    public LinkedList<String> getMxTargets(String domainName){
        getMxRecords(domainName);
        LinkedList<String> mxTargets = new LinkedList<>();

        for (MXRecord record : mxRecords)
            mxTargets.add(record.getTarget().toString());

        return mxTargets;
    }
}
