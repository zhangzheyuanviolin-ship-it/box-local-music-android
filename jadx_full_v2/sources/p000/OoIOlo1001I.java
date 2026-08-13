            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.Set;
            
            public final class OoIOlo1001I {
                public static volatile Ii1111Olil I0000oI00;
                public IOO0l0i0Oo I00000oIO;
                public IOO0l0i0Oo I00000oOI;
                public IiI101Oo I0000Il00O;
                public IiOili0lOO1 I0000O;

                public static OoIOlo1001I I00000oIO() {
/* 1 */             Ii1111Olil ii1111Olil = I0000oI00;
/* 3 */             if (ii1111Olil != null) {
/* 11 */                return (OoIOlo1001I) ii1111Olil.I00ilO0.get();
                    }
/* 16 */            I000II.I001IO000("Not initialized!");
/* 19 */            return null;
                }

                public static void I00000oOI(Context context) {
/* 3 */             if (I0000oI00 == null) {
                        synchronized (OoIOlo1001I.class) {
                            try {
/* 10 */                        if (I0000oI00 == null) {
/* 14 */                            iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 17 */                            context.getClass();
/* 20 */                            iiolilo0iiil.I00iOIl = context;
/* 26 */                            I0000oI00 = iiolilo0iiil.I00100l0();
                                }
                            } catch (Throwable th) {
/* 34 */                        throw th;
                            }
                        }
                    }
                }

                public final OoIOil1iIO I0000Il00O(IIOO01 iioo01) {
/* 20 */            Set setUnmodifiableSet = iioo01 instanceof IIOO01 ? Collections.unmodifiableSet(IIOO01.I0000O) : Collections.singleton(Il0IIil.I00000oIO("proto"));
/* 24 */            IOO000ilo iOO000iloI00000oIO = I1lO11.I00000oIO();
/* 28 */            iioo01.getClass();
/* 33 */            iOO000iloI00000oIO.I00iiI = "cct";
/* 35 */            String str = iioo01.I00000oIO;
/* 37 */            String str2 = iioo01.I00000oOI;
/* 39 */            if (str2 == null) {
/* 41 */                str2 = "";
                    }
/* 61 */            iOO000iloI00000oIO.I00iiO = IIl001iO0Io.I000oI1ioi("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
/* 63 */            I1lO11 i1lO11I000OOo1O = iOO000iloI00000oIO.I000OOo1O();
/* 67 */            OoIOil1iIO ooIOil1iIO = new OoIOil1iIO();
/* 70 */            ooIOil1iIO.I00000oIO = setUnmodifiableSet;
/* 72 */            ooIOil1iIO.I00000oOI = i1lO11I000OOo1O;
/* 74 */            ooIOil1iIO.I0000Il00O = this;
/* 76 */            VarHandle.storeStoreFence();
/* 168 */           return ooIOil1iIO;
                }
            }
