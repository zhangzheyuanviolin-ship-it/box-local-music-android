            package p000;

            import java.util.ListIterator;
            
            public abstract class il01iOI {
                public static final void I00000oIO(Olil0III olil0III) {
/* 1 */             O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 7 */             OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("SELECT name FROM sqlite_master WHERE type = 'trigger'");
/* 16 */            while (oiIIl0O1l0lI00000oIO.I00ol1()) {
                        try {
/* 22 */                    o101lO1I0000oI00.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                        } finally {
                        }
                    }
/* 29 */            iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 36 */            ListIterator listIterator = IOOi1I.I0000Il00O(o101lO1I0000oI00).listIterator(0);
                    while (true) {
/* 41 */                Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator;
/* 47 */                if (!io1ioiIIO1lI.hasNext()) {
/* 73 */                    return;
                        }
/* 53 */                String str = (String) io1ioiIIO1lI.next();
/* 61 */                if (OlOolloIIOl0.I000l1(str, "room_fts_content_sync_", false)) {
/* 69 */                    lO0I0Io.I00000oIO(olil0III, "DROP TRIGGER IF EXISTS ".concat(str));
                        }
                    }
                }
            }
