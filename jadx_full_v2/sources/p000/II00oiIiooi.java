            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class II00oiIiooi implements IlliIl1l11O {
                public final int I00iOIl;
                public Ii0110 I00iiI;
                public OI10i0Il I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;
                public Object I00l0I0l0lO1;

                public II00oiIiooi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 91 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 95 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00io1l;
/* 97 */                    Ii0110 ii0110 = this.I00iiI;
/* 101 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 105 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilI0I1;
/* 109 */                   Ol1o0O0O0 ol1o0O0O02 = (Ol1o0O0O0) this.I00ioIO;
/* 113 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilO0;
/* 117 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00l0I0l0lO1;
/* 121 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 127 */                   int iIntValue = ((Integer) obj2).intValue();
/* 144 */                   if (!iloI0lOlll1.I00OIl(1 & iIntValue, (iIntValue & 3) != 2)) {
/* 232 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 149 */                       O11l0o011lO1 o11l0o011lO1 = new O11l0o011lO1(4);
/* 152 */                       o11l0o011lO1.I00iiI = oI10i0Il;
/* 154 */                       o11l0o011lO1.I00iiO = ol1o0O0O0;
/* 156 */                       o11l0o011lO1.I00iio = ii0110;
/* 158 */                       o11l0o011lO1.I00ilI0I1 = oI10i0Il2;
/* 160 */                       o11l0o011lO1.I00ilO0 = oI10i0Il3;
/* 162 */                       VarHandle.storeStoreFence();
/* 168 */                       IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-735963747, o11l0o011lO1, iloI0lOlll1);
/* 174 */                       II00oi10Ii0I iI00oi10Ii0I = new II00oi10Ii0I(0);
/* 177 */                       iI00oi10Ii0I.I00iiI = ol1o0O0O02;
/* 179 */                       iI00oi10Ii0I.I00iiO = oI10i0Il4;
/* 181 */                       VarHandle.storeStoreFence();
/* 187 */                       IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-971237285, iI00oi10Ii0I, iloI0lOlll1);
/* 193 */                       I0illI1iI i0illI1iI = new I0illI1iI(3);
/* 196 */                       i0illI1iI.I00iiI = illOOo00lI;
/* 198 */                       i0illI1iI.I00iiO = oI10i0Il;
/* 200 */                       VarHandle.storeStoreFence();
/* 226 */                       I11i1lloiiO.I00000oIO(iOii1lI00000oOI, null, iOii1lI00000oOI2, iiioOl1O.I00000oOI(-1806506734, i0illI1iI, iloI0lOlll1), 0.0f, null, null, null, iloI0lOlll1, 3462, 498);
                                break;
                            }
                        default:
/* 15 */                    Bitmap[] bitmapArr = (Bitmap[]) this.I00iio;
/* 19 */                    long[] jArr = (long[]) this.I00ilI0I1;
/* 24 */                    AtomicBoolean atomicBoolean = (AtomicBoolean) this.I00ilO0;
/* 26 */                    Ii0110 ii01102 = this.I00iiI;
/* 31 */                    IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00io1l;
/* 36 */                    Context context = (Context) this.I00ioIO;
/* 41 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00l0I0l0lO1;
/* 43 */                    OI10i0Il oI10i0Il5 = this.I00iiO;
/* 47 */                    Bitmap bitmap = (Bitmap) obj;
/* 53 */                    ((IoiO1IO1I1i) obj2).close();
/* 56 */                    bitmapArr[0] = bitmap;
/* 58 */                    long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 70 */                    if (jElapsedRealtime - jArr[0] >= 200 && atomicBoolean.compareAndSet(false, true)) {
/* 78 */                        jArr[0] = jElapsedRealtime;
/* 87 */                        iOi1II01i0.I0000O(ii01102, null, null, new I1iIiIIIio0(ilI1loI1lO1, context, o1oIOiI11o0, bitmap, atomicBoolean, oI10i0Il5, (IOoil1iiIilo) null), 3);
                                break;
                            }
                            break;
                    }
/* 90 */            return ooiIlOl1iI;
                }
            }
