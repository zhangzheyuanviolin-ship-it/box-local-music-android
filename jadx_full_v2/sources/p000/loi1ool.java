            package p000;

            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            
            public final class loi1ool {
                public static ii1loIOIll0 I000iOII;
                public static final ii01iIOliOOI I000l1;
                public String I00000oIO;
                public String I00000oOI;
                public loOli1Olil I0000Il00O;
                public Oioo1I0o I0000O;
                public o0IiOl I0000oI00;
                public o0IiOl I0001Ioi1lo;
                public String I000II;
                public int I000O01llI0;
                public HashMap I000OOo1O;
                public HashMap I000OiO;

                static {
/* 5 */             Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
/* 12 */            objArr[0].getClass();
/* 18 */            objArr[1].getClass();
/* 24 */            ii01iIOliOOI ii01iioliooi = new ii01iIOliOOI(2);
/* 27 */            ii01iioliooi.I00iiI = objArr;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            I000l1 = ii01iioliooi;
                }

                public static long I00000oIO(ArrayList arrayList, double d) {
/* 28 */            return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
                }

                public final void I00000oOI(loO1lOoI0oOi loo1looi0ooi, li0lloo li0llooVar, String str) {
/* 5 */             IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(21);
/* 8 */             iO0iIlI1li.I00iiI = this;
/* 10 */            iO0iIlI1li.I00iiO = loo1looi0ooi;
/* 12 */            iO0iIlI1li.I00iio = li0llooVar;
/* 14 */            iO0iIlI1li.I00ilI0I1 = str;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            io1OllI.I00000oIO(1, iO0iIlI1li);
                }

                public final void I0000Il00O(loi1IOlio loi1iolio, li0lloo li0llooVar) {
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 9 */             if (I0000oI00(li0llooVar, jElapsedRealtime)) {
/* 18 */                this.I000OOo1O.put(li0llooVar, Long.valueOf(jElapsedRealtime));
/* 29 */                I00000oOI(loi1iolio.zza(), li0llooVar, I0000O());
                    }
                }

                public final String I0000O() {
/* 1 */             o0IiOl o0iiol = this.I0000oI00;
/* 7 */             if (o0iiol.I000OOo1O()) {
/* 13 */                return (String) o0iiol.I000II();
                    }
/* 20 */            return O0oO1lOOo1.I0000Il00O.I00000oIO(this.I000II);
                }

                public final boolean I0000oI00(li0lloo li0llooVar, long j) {
/* 1 */             HashMap map = this.I000OOo1O;
                    return map.get(li0llooVar) == null || j - ((Long) map.get(li0llooVar)).longValue() > 30000;
                }
            }
