            package p000;

            import android.os.Trace;
            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class ll1OIooo {
                public static void I00000oIO(o0OllIoI o0ollioi) {
/* 5 */             if (I0000Il00O(o0ollioi) || ((o01iIll0IO) o0ollioi).I00iOIl == null) {
/* 32 */                Trace.beginSection(((o01iIll0IO) o0ollioi).I00iiO);
/* 35 */                I0000O(o0ollioi);
                    } else {
/* 20 */                I00000oIO(((o01iIll0IO) o0ollioi).I00iOIl);
/* 23 */                I0000O(o0ollioi);
                    }
                }

                public static void I00000oOI(o0OllIoI o0ollioi) {
/* 5 */             if (I0000Il00O(o0ollioi) || ((o01iIll0IO) o0ollioi).I00iOIl == null) {
/* 26 */                Trace.endSection();
/* 29 */                Trace.endSection();
                    } else {
/* 15 */                Trace.endSection();
/* 22 */                I00000oOI(((o01iIll0IO) o0ollioi).I00iOIl);
                    }
                }

                public static boolean I0000Il00O(o0OllIoI o0ollioi) {
                    return ((o01iIll0IO) o0ollioi).I00ilI0I1 != Thread.currentThread();
                }

                public static void I0000O(o0OllIoI o0ollioi) {
/* 3 */             String strSubstring = ((o01iIll0IO) o0ollioi).I00iio;
/* 5 */             AtomicReference atomicReference = o0IOOIili01o.I00000oIO;
/* 13 */            if (strSubstring.length() > 127) {
/* 16 */                strSubstring = strSubstring.substring(0, 127);
                    }
/* 20 */            Trace.beginSection(strSubstring);
                }
            }
