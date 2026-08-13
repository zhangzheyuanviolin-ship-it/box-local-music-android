            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Objects;
            
            public final class o0OIl1o1i0Oi {
                public static iiOOi1OolOlO I000iOII;
                public static final iiiiIIllo I000l1 = iiiiIIllo.I00000oOI(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
                public final String I00000oIO;
                public final String I00000oOI;
                public final o0O011i1 I0000Il00O;
                public final Oioo1I0o I0000O;
                public final o0IiOl I0000oI00;
                public final o0IiOl I0001Ioi1lo;
                public final String I000II;
                public final int I000O01llI0;
                public final HashMap I000OOo1O = new HashMap();
                public final HashMap I000OiO = new HashMap();

                public o0OIl1o1i0Oi(Context context, Oioo1I0o oioo1I0o, o0O011i1 o0o011i1, String str) {
/* 22 */            this.I00000oIO = context.getPackageName();
/* 28 */            this.I00000oOI = IOi0li0I0.I00000oIO(context);
/* 30 */            this.I0000O = oioo1I0o;
/* 32 */            this.I0000Il00O = o0o011i1;
/* 34 */            o0llIi.I00II0oii1o();
/* 37 */            this.I000II = str;
/* 39 */            iiOlilo0IIIl.I001IO000();
/* 46 */            Io11llo0i io11llo0i = new Io11llo0i(18);
/* 49 */            io11llo0i.I00000oOI = this;
/* 51 */            VarHandle.storeStoreFence();
/* 58 */            this.I0000oI00 = iiOlilo0IIIl.I00Io1o110i(io11llo0i);
/* 60 */            iiOlilo0IIIl.I001IO000();
/* 63 */            Objects.requireNonNull(oioo1I0o);
/* 70 */            i1IiIOI0IlO i1iiioi0ilo = new i1IiIOI0IlO(12);
/* 73 */            i1iiioi0ilo.I00000oOI = oioo1I0o;
/* 75 */            VarHandle.storeStoreFence();
/* 82 */            this.I0001Ioi1lo = iiOlilo0IIIl.I00Io1o110i(i1iiioi0ilo);
/* 84 */            iiiiIIllo iiiiiillo = I000l1;
/* 105 */           this.I000O01llI0 = iiiiiillo.containsKey(str) ? IioIii0IO.I0000O(context, (String) iiiiiillo.get(str), false) : -1;
                }

                public static long I00000oIO(ArrayList arrayList, double d) {
/* 28 */            return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
                }

                public final void I00000oOI(o0IlO11iI0 o0ilo11ii0, lioiiIOoil lioiiiooil, String str) {
/* 5 */             IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(24);
/* 8 */             iO0iIlI1li.I00iiI = this;
/* 10 */            iO0iIlI1li.I00iiO = o0ilo11ii0;
/* 12 */            iO0iIlI1li.I00iio = lioiiiooil;
/* 14 */            iO0iIlI1li.I00ilI0I1 = str;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            io1OllI.I00000oIO(1, iO0iIlI1li);
                }

                public final String I0000Il00O() {
/* 1 */             o0IiOl o0iiol = this.I0000oI00;
/* 7 */             if (o0iiol.I000OOo1O()) {
/* 13 */                return (String) o0iiol.I000II();
                    }
/* 20 */            return O0oO1lOOo1.I0000Il00O.I00000oIO(this.I000II);
                }

                public final boolean I0000O(lioiiIOoil lioiiiooil, long j) {
/* 1 */             HashMap map = this.I000OOo1O;
                    return map.get(lioiiiooil) == null || j - ((Long) map.get(lioiiiooil)).longValue() > 30000;
                }
            }
