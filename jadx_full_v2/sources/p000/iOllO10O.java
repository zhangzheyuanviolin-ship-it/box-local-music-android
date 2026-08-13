            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Objects;
            
            public final class iOllO10O {
                public static lIil0l010OO I000OOo1O;
                public static final ii01iIOliOOI I000OiO;
                public final String I00000oIO;
                public final String I00000oOI;
                public final iOllIooOOl I0000Il00O;
                public final Oioo1I0o I0000O;
                public final o0IiOl I0000oI00;
                public final o0IiOl I0001Ioi1lo;
                public final String I000II;
                public final int I000O01llI0;

                static {
/* 5 */             Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
/* 12 */            Objects.requireNonNull(objArr[0]);
/* 18 */            Objects.requireNonNull(objArr[1]);
/* 24 */            ii01iIOliOOI ii01iioliooi = new ii01iIOliOOI(6);
/* 27 */            ii01iioliooi.I00iiI = objArr;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            I000OiO = ii01iioliooi;
                }

                public iOllO10O(Context context, Oioo1I0o oioo1I0o, iOllIooOOl iolliooool, String str) {
/* 6 */             new HashMap();
/* 11 */            new HashMap();
/* 18 */            this.I00000oIO = context.getPackageName();
/* 24 */            this.I00000oOI = IOi0li0I0.I00000oIO(context);
/* 26 */            this.I0000O = oioo1I0o;
/* 28 */            this.I0000Il00O = iolliooool;
/* 30 */            iOloo0O0O.I000l1();
/* 33 */            this.I000II = str;
/* 35 */            iiOlilo0IIIl.I001IO000();
/* 41 */            Io11llo0i io11llo0i = new Io11llo0i(5);
/* 44 */            io11llo0i.I00000oOI = this;
/* 46 */            VarHandle.storeStoreFence();
/* 53 */            this.I0000oI00 = iiOlilo0IIIl.I00Io1o110i(io11llo0i);
/* 55 */            iiOlilo0IIIl.I001IO000();
/* 58 */            Objects.requireNonNull(oioo1I0o);
/* 64 */            i1IiIOI0IlO i1iiioi0ilo = new i1IiIOI0IlO(3);
/* 67 */            i1iiioi0ilo.I00000oOI = oioo1I0o;
/* 69 */            VarHandle.storeStoreFence();
/* 76 */            this.I0001Ioi1lo = iiOlilo0IIIl.I00Io1o110i(i1iiioi0ilo);
/* 78 */            ii01iIOliOOI ii01iioliooi = I000OiO;
/* 99 */            this.I000O01llI0 = ii01iioliooi.containsKey(str) ? IioIii0IO.I0000O(context, (String) ii01iioliooi.get(str), false) : -1;
                }
            }
