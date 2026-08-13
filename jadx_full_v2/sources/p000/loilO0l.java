            package p000;

            import android.os.SystemClock;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class loilO0l {
                public String I00000oIO;
                public I01i1oI I00000oOI;
                public IIlOoolol0ll I0000Il00O;
                public IoloOio0I I0000O;
                public I0Oi111ii I0000oI00;
                public I0Oi111ii I0001Ioi1lo;
                public Object I000II;
                public Io1Oioii1111 I000O01llI0;
                public List I000OOo1O;

                public final I01iI0l00O I00000oIO(lii0l0 lii0l0Var, OI011o1 oI011o1) {
/* 4 */             liOOloi0I liooloi0i = new liOOloi0I(3);
/* 7 */             liooloi0i.I00000oOI = lii0l0Var;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            ll10Ii1io1I ll10ii1io1iI00000oOI = o0iOII1liI.I00000oOI(liooloi0i);
/* 16 */            o0ilOOi0 o0ilooi0 = o0iooo.I00000oIO;
/* 20 */            lII0I0I01I1l.I0001Ioi1lo("ticker", o0ilooi0);
                    switch (o0ilooi0.I00000oIO) {
                        case 0:
/* 32 */                    SystemClock.elapsedRealtimeNanos();
                            break;
                        default:
/* 28 */                    SystemClock.elapsedRealtime();
                            break;
                    }
/* 37 */            String strValueOf = String.valueOf(this.I00000oIO);
/* 41 */            Io1Oioii1111 io1Oioii1111 = this.I000O01llI0;
/* 45 */            String strConcat = "Update ".concat(strValueOf);
/* 49 */            io1Oioii1111.getClass();
/* 52 */            o0OI1ilol0l o0oi1ilol0lI00100l0 = Io1Oioii1111.I00100l0(strConcat);
                    try {
/* 58 */                I011IO1I11OI i011io1i11oiI00O0i0ii = this.I0001Ioi1lo.I00O0i0ii();
/* 62 */                IoloOio0I ioloOio0I = this.I0000O;
/* 66 */                i1IoOl i1iool = new i1IoOl();
/* 69 */                i1iool.I00iOIl = i011io1i11oiI00O0i0ii;
/* 71 */                VarHandle.storeStoreFence();
/* 74 */                Iii11Ooi iii11Ooi = Iii11Ooi.I00iOIl;
/* 76 */                ioloOio0I.I00OI1(i1iool, iii11Ooi);
/* 81 */                o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 84 */                o01l1iooo0.I00iOIl = this;
/* 86 */                o01l1iooo0.I00iiI = i011io1i11oiI00O0i0ii;
/* 88 */                o01l1iooo0.I00iiO = ll10ii1io1iI00000oOI;
/* 90 */                o01l1iooo0.I00iio = oI011o1;
/* 92 */                VarHandle.storeStoreFence();
/* 99 */                ListenableFuture listenableFutureI00OI1 = ioloOio0I.I00OI1(o0iOII1liI.I00000oIO(o01l1iooo0), iii11Ooi);
/* 103 */               IlloOoiiO.propagateCancellation(listenableFutureI00OI1, i011io1i11oiI00O0i0ii);
/* 108 */               IlloOoiiO.I0000O(this.I00000oOI);
/* 113 */               Illo11010 illo11010 = new Illo11010();
/* 116 */               VarHandle.storeStoreFence();
/* 119 */               int i = I01iIIO.I00li1OI;
/* 123 */               I01iI0l00O i01iI0l00O = new I01iI0l00O(listenableFutureI00OI1, illo11010);
/* 130 */               listenableFutureI00OI1.addListener(i01iI0l00O, l1i0oIO0.I00000oOI(iii11Ooi, i01iI0l00O));
/* 133 */               o0oi1ilol0lI00100l0.I00000oIO(i01iI0l00O);
/* 136 */               o0oi1ilol0lI00100l0.close();
/* 139 */               return i01iI0l00O;
                    } catch (Throwable th) {
                        try {
/* 141 */                   o0oi1ilol0lI00100l0.close();
                        } catch (Throwable th2) {
/* 146 */                   th.addSuppressed(th2);
                        }
/* 149 */               throw th;
                    }
                }
            }
