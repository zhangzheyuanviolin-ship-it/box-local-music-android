            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class IIl10ilil1 {
                public Map I00000oIO;
                public Object I00000oOI;
                public LinkedHashMap I0000Il00O;
                public IIil1o0olooo I0000O;

                public final IIil1o0olooo I00000oIO(String str) {
                    synchronized (this.I00000oOI) {
                        try {
/* 16 */                    IIil1o0olooo iIil1o0olooo = (IIil1o0olooo) this.I0000Il00O.get(IIl10Ilo.I00000oIO(str));
/* 18 */                    if (iIil1o0olooo != null) {
/* 21 */                        return iIil1o0olooo;
                            }
/* 32 */                    IIo000ll110 iIo000ll110 = (IIo000ll110) this.I00000oIO.get(IIl10Ilo.I00000oIO(str));
/* 41 */                    IIil1o0olooo iIil1o0olooo2 = iIo000ll110 != null ? iIo000ll110.I00000oIO : null;
/* 42 */                    if (iIil1o0olooo2 != null) {
/* 50 */                        if (!str.equals("CXCP-Camera2")) {
/* 101 */                           throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) IIl10Ilo.I00000oOI(str)) + " but it was actually " + ((Object) IIl10Ilo.I00000oOI("CXCP-Camera2"))).toString());
                                }
/* 58 */                        this.I0000Il00O.put(IIl10Ilo.I00000oIO(str), iIil1o0olooo2);
                            }
/* 103 */                   return iIil1o0olooo2;
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }
            }
