            package p000;

            import android.net.Uri;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            
            public abstract class ll1110lO implements lloO1Oolo {
                public static final InputStream I00000oOI(OillOo0 oillOo0) {
                    llo0O00l llo0o00lI0000Il00O;
/* 9 */             lo1IiOOl1 lo1iiool1I00000oIO = ((loIo0iiOoi) oillOo0.I00iiI).I00000oIO((Uri) oillOo0.I00ilI0I1);
/* 15 */            ArrayList arrayList = new ArrayList();
/* 18 */            arrayList.add(lo1iiool1I00000oIO);
/* 23 */            ArrayList arrayList2 = (ArrayList) oillOo0.I00iio;
/* 29 */            if (!arrayList2.isEmpty() && (llo0o00lI0000Il00O = llo0O00l.I0000Il00O(arrayList2, lo1iiool1I00000oIO)) != null) {
/* 37 */                arrayList.add(llo0o00lI0000Il00O);
                    }
/* 44 */            Iterator it = ((IoillO0OOoo) oillOo0.I00iiO).iterator();
/* 52 */            if (!it.hasNext()) {
/* 54 */                Collections.reverse(arrayList);
/* 62 */                return (InputStream) arrayList.get(0);
                    }
/* 70 */            if (it.next() != null) {
/* 72 */                OIiilo1Ool0o.I00000oIO();
/* 69 */                return null;
                    }
/* 168 */           throw null;
                }
            }
