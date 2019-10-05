package MXApi;

import org.junit.Before;
import org.junit.Test;
import org.xbill.DNS.MXRecord;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class MxRecordHandlerTests {
    MxRecordHandler testSubject;

    @Before
    public void beforeEachTest(){
       testSubject = new MxRecordHandler();
    }

    @Test
    public void getMxRecords_ReturnsEmptyLinkedList_WhenInvalidDomainGiven() {
        assertEquals(new LinkedList<MXRecord>(), testSubject.getMxRecords("123"));
    }

    @Test
    public void getMxRecords_ReturnsNonEmptyLinkedList_WhenValidDomainGiven(){
        assertTrue(testSubject.getMxRecords("oracle.com").size() > 0);
    }

    @Test
    public void getMxRecords_ReturnsNull_WhenNoDomainGiven(){
        assertEquals(null, testSubject.getMxRecords(""));
    }
}
