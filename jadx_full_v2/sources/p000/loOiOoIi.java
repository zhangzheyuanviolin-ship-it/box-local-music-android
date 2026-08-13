            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Objects;
            
            public final class loOiOoIi {
                public static ii0iO1l I000iOII;
                public static final ii01iIOliOOI I000l1;
                public String I00000oIO;
                public String I00000oOI;
                public loIo0Ilo00 I0000Il00O;
                public Oioo1I0o I0000O;
                public o0IiOl I0000oI00;
                public o0IiOl I0001Ioi1lo;
                public String I000II;
                public int I000O01llI0;
                public HashMap I000OOo1O;
                public HashMap I000OiO;

                static {
/* 5 */             Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
/* 12 */            Objects.requireNonNull(objArr[0]);
/* 18 */            Objects.requireNonNull(objArr[1]);
/* 23 */            ii01iIOliOOI ii01iioliooi = new ii01iIOliOOI(1);
/* 26 */            ii01iioliooi.I00iiI = objArr;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            I000l1 = ii01iioliooi;
                }

                public static long I00000oIO(ArrayList arrayList, double d) {
/* 28 */            return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
                }

                public final void I00000oOI(loII0oIOI1i1 loii0oioi1i1, lOoo11 looo11, String str) {
/* 5 */             IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(20);
/* 8 */             iO0iIlI1li.I00iiI = this;
/* 10 */            iO0iIlI1li.I00iiO = loii0oioi1i1;
/* 12 */            iO0iIlI1li.I00iio = looo11;
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

                public final boolean I0000O(lOoo11 looo11, long j) {
/* 1 */             HashMap map = this.I000OOo1O;
                    return map.get(looo11) == null || j - ((Long) map.get(looo11)).longValue() > 30000;
                }
            }
