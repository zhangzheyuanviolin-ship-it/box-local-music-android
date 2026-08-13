            package p000;

            import java.io.InputStream;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function1;
            
            public final class O0I0lI1IOool implements OIo0loI111I1 {
                public OOoOIoio1i I00000oIO;
                public OI0011 I00000oOI;
                public Ii10lIo0l1 I0000Il00O;
                public I1ooIoloo0 I0000O;

                @Override
                public final boolean I00000oIO(Ill0IO ill0IO) {
/* 1 */             I1ooIoloo0 i1ooIoloo0 = this.I0000O;
/* 7 */             Object obj = ((ConcurrentHashMap) i1ooIoloo0.I00iiO).get(ill0IO);
                    return ((obj == null || obj == O1I0IoIO0li.I00iiI) ? I0000Il00O(ill0IO) : (OIo0il) i1ooIoloo0.invoke(ill0IO)) == null;
                }

                @Override
                public final void I00000oOI(Ill0IO ill0IO, ArrayList arrayList) {
/* 7 */             iiIiiol0.I00000oIO(arrayList, this.I0000O.invoke(ill0IO));
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIIOiol I0000Il00O(Ill0IO ill0IO) {
                    InputStream inputStream;
/* 3 */             this.I00000oIO.getClass();
/* 15 */            if (ill0IO.I00000oIO.I000O01llI0(OlIlllOI1.I000iOII)) {
/* 21 */                IIIOIlo1oo0.I000lI.getClass();
/* 24 */                String strI00000oIO = IIIOIlo1oo0.I00000oIO(ill0IO);
/* 30 */                ClassLoader classLoader = IIIOlol.class.getClassLoader();
/* 34 */                if (classLoader == null) {
/* 36 */                    inputStream = ClassLoader.getSystemResourceAsStream(strI00000oIO);
                        } else {
/* 41 */                    URL resource = classLoader.getResource(strI00000oIO);
/* 45 */                    if (resource != null) {
/* 48 */                        URLConnection uRLConnectionOpenConnection = resource.openConnection();
/* 53 */                        uRLConnectionOpenConnection.setUseCaches(false);
/* 56 */                        inputStream = uRLConnectionOpenConnection.getInputStream();
                            }
                        }
                    } else {
/* 17 */                inputStream = null;
                    }
/* 60 */            if (inputStream != null) {
/* 64 */                return iOi1iIoO.I00000oIO(ill0IO, this.I00000oOI, inputStream);
                    }
/* 14 */            return null;
                }

                @Override
                public final Collection I000O01llI0(Ill0IO ill0IO, Function1 function1) {
/* 1 */             return Il01llIol0.I00iOIl;
                }
            }
