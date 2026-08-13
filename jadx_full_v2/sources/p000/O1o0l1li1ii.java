            package p000;

            import com.google.ai.edge.litertlm.Content;
            import com.google.ai.edge.litertlm.Contents;
            import java.time.LocalDateTime;
            import java.time.format.DateTimeFormatter;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class O1o0l1li1ii {
                public static final Contents I00000oIO() {
/* 1 */             LocalDateTime localDateTimeNow = LocalDateTime.now();
/* 11 */            String str = localDateTimeNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
/* 21 */            String str2 = localDateTimeNow.format(DateTimeFormatter.ofPattern("EEEE"));
/* 25 */            Contents.Companion companion = Contents.INSTANCE;
/* 41 */            List listI000O01llI0 = IOOi1I.I000O01llI0("You are a model that can do function calling with the following functions", IIl001iO0Io.I000oI1ioi("Current date and time given in YYYY-MM-DDTHH:MM:SS format: ", str, "\nDay of week is ", str2));
/* 55 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000O01llI0, 10));
/* 58 */            Iterator it = listI000O01llI0.iterator();
/* 66 */            while (it.hasNext()) {
/* 79 */                arrayList.add(new Content.Text((String) it.next()));
                    }
/* 83 */            return companion.of(arrayList);
                }
            }
