            package p000;

            import android.content.Context;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Objects;
            
            public final class o0OiOio {
                public static ilIIoll0ll I000iOII;
                public static final ii01iIOliOOI I000l1;
                public final String I00000oIO;
                public final String I00000oOI;
                public final o0OI1Ooo1 I0000Il00O;
                public final Oioo1I0o I0000O;
                public final o0IiOl I0000oI00;
                public final o0IiOl I0001Ioi1lo;
                public final String I000II;
                public final int I000O01llI0;
                public final HashMap I000OOo1O = new HashMap();
                public final HashMap I000OiO = new HashMap();

                static {
/* 5 */             Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
/* 12 */            Objects.requireNonNull(objArr[0]);
/* 18 */            Objects.requireNonNull(objArr[1]);
/* 24 */            ii01iIOliOOI ii01iioliooi = new ii01iIOliOOI(5);
/* 27 */            ii01iioliooi.I00iiI = objArr;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            I000l1 = ii01iioliooi;
                }

                public o0OiOio(Context context, Oioo1I0o oioo1I0o, o0OI1Ooo1 o0oi1ooo1, String str) {
/* 22 */            this.I00000oIO = context.getPackageName();
/* 28 */            this.I00000oOI = IOi0li0I0.I00000oIO(context);
/* 30 */            this.I0000O = oioo1I0o;
/* 32 */            this.I0000Il00O = o0oi1ooo1;
/* 34 */            o0iOli.I000oI1ioi();
/* 37 */            this.I000II = str;
/* 39 */            iiOlilo0IIIl.I001IO000();
/* 46 */            Io11llo0i io11llo0i = new Io11llo0i(19);
/* 49 */            io11llo0i.I00000oOI = this;
/* 51 */            VarHandle.storeStoreFence();
/* 58 */            this.I0000oI00 = iiOlilo0IIIl.I00Io1o110i(io11llo0i);
/* 60 */            iiOlilo0IIIl.I001IO000();
/* 63 */            Objects.requireNonNull(oioo1I0o);
/* 70 */            i1IiIOI0IlO i1iiioi0ilo = new i1IiIOI0IlO(13);
/* 73 */            i1iiioi0ilo.I00000oOI = oioo1I0o;
/* 75 */            VarHandle.storeStoreFence();
/* 82 */            this.I0001Ioi1lo = iiOlilo0IIIl.I00Io1o110i(i1iiioi0ilo);
/* 84 */            ii01iIOliOOI ii01iioliooi = I000l1;
/* 105 */           this.I000O01llI0 = ii01iioliooi.containsKey(str) ? IioIii0IO.I0000O(context, (String) ii01iioliooi.get(str), false) : -1;
                }

                public static long I00000oIO(ArrayList arrayList, double d) {
/* 28 */            return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
                }

                public final void I00000oOI(o0IooioOOIl o0iooioooil, lliOo1oo llioo1oo, String str) {
/* 5 */             IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(25);
/* 8 */             iO0iIlI1li.I00iiI = this;
/* 10 */            iO0iIlI1li.I00iiO = o0iooioooil;
/* 12 */            iO0iIlI1li.I00iio = llioo1oo;
/* 14 */            iO0iIlI1li.I00ilI0I1 = str;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            io1OllI.I00000oIO(1, iO0iIlI1li);
                }

                public final void I0000Il00O(o0OiI0Oo o0oii0oo, lliOo1oo llioo1oo) {
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 9 */             if (I0000oI00(llioo1oo, jElapsedRealtime)) {
/* 18 */                this.I000OOo1O.put(llioo1oo, Long.valueOf(jElapsedRealtime));
/* 29 */                I00000oOI(o0oii0oo.zza(), llioo1oo, I0000O());
                    }
                }

                public final String I0000O() {
/* 1 */             o0IiOl o0iiol = this.I0000oI00;
/* 7 */             if (o0iiol.I000OOo1O()) {
/* 13 */                return (String) o0iiol.I000II();
                    }
/* 20 */            return O0oO1lOOo1.I0000Il00O.I00000oIO(this.I000II);
                }

                public final boolean I0000oI00(lliOo1oo llioo1oo, long j) {
/* 1 */             HashMap map = this.I000OOo1O;
                    return map.get(llioo1oo) == null || j - ((Long) map.get(llioo1oo)).longValue() > 30000;
                }
            }
