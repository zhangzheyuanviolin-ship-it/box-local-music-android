            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            
            public final class loiI0oIOO {
                public static iiI10IO0io0I I000iOII;
                public static final iiO111IOo I000l1 = iiO111IOo.I00000oOI(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
                public String I00000oIO;
                public String I00000oOI;
                public loOlli1 I0000Il00O;
                public Oioo1I0o I0000O;
                public o0IiOl I0000oI00;
                public o0IiOl I0001Ioi1lo;
                public String I000II;
                public int I000O01llI0;
                public HashMap I000OOo1O;
                public HashMap I000OiO;

                public static long I00000oIO(ArrayList arrayList, double d) {
/* 28 */            return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
                }

                public final void I00000oOI(loOIiioiOool looiiioioool, li10OOoO0loI li10oooo0loi, String str) {
/* 5 */             IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(22);
/* 8 */             iO0iIlI1li.I00iiI = this;
/* 10 */            iO0iIlI1li.I00iiO = looiiioioool;
/* 12 */            iO0iIlI1li.I00iio = li10oooo0loi;
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

                public final boolean I0000O(li10OOoO0loI li10oooo0loi, long j) {
/* 1 */             HashMap map = this.I000OOo1O;
                    return map.get(li10oooo0loi) == null || j - ((Long) map.get(li10oooo0loi)).longValue() > 30000;
                }
            }
