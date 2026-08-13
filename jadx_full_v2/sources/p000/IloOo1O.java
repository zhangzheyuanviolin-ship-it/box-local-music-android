            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class IloOo1O implements Runnable {
                public Context I00iOIl;
                public O0oiOi I00iiI;
                public IIo0l1 I00iiO;
                public OOIIooi I00iio;
                public Executor I00ilI0I1;
                public OI10i0Il I00ilO0;
                public long[] I00io1l;
                public OI10i0Il I00ioIO;
                public OI10i0Il I00l0I0l0lO1;

                @Override
                public final void run() {
/* 1 */             Context context = this.I00iOIl;
/* 3 */             O0oiOi o0oiOi = this.I00iiI;
/* 5 */             IIo0l1 iIo0l1 = this.I00iiO;
/* 7 */             OOIIooi oOIIooi = this.I00iio;
/* 9 */             Executor executor = this.I00ilI0I1;
/* 11 */            OI10i0Il oI10i0Il = this.I00ilO0;
/* 13 */            long[] jArr = this.I00io1l;
/* 15 */            OI10i0Il oI10i0Il2 = this.I00ioIO;
/* 17 */            OI10i0Il oI10i0Il3 = this.I00l0I0l0lO1;
/* 19 */            OOIl1Io0 oOIl1Io0 = OOIl1Io0.I00000oOI;
/* 29 */            OOIl1Io0 oOIl1Io02 = (OOIl1Io0) lIIOO11.I00000oIO(context).get();
/* 37 */            OOIIOiolI oOIIOiolII00000oOI = new IIl0lo1oi(1).I00000oOI();
/* 45 */            oOIIOiolII00000oOI.I00IO1oi11O(oOIIooi.getSurfaceProvider());
/* 50 */            IIoO01O1 iIoO01O1 = new IIoO01O1(1);
/* 62 */            iIoO01O1.I00iOIl.I0010I0i(Ioi0OoiI.I00iiI, 0);
/* 65 */            Ioi0OoiI ioi0OoiII00100o1O0lo = iIoO01O1.I00100o1O0lo();
/* 69 */            IoiIli1i0Oil.I001lllioOl(ioi0OoiII00100o1O0lo);
/* 74 */            Ioi01I0 ioi01I0 = new Ioi01I0(ioi0OoiII00100o1O0lo);
/* 82 */            ioi01I0.I0010I0i = new Object();
/* 84 */            VarHandle.storeStoreFence();
/* 89 */            IloOolOII iloOolOII = new IloOolOII(0);
/* 92 */            iloOolOII.I00iiI = oI10i0Il;
/* 94 */            iloOolOII.I00ilI0I1 = jArr;
/* 96 */            iloOolOII.I00iiO = oI10i0Il2;
/* 98 */            iloOolOII.I00iio = oI10i0Il3;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           ioi01I0.I00IioO0OiOi(executor, iloOolOII);
                    try {
/* 106 */               oOIl1Io02.I00000oOI();
/* 116 */               oOIl1Io02.I00000oIO(o0oiOi, iIo0l1, oOIIOiolII00000oOI, ioi01I0);
                    } catch (Exception e) {
/* 129 */               IIlIOloOOO.I001iOo1i0O("Camera bind failed: ", e.getMessage(), "GeminiNanoHub");
                    }
                }
            }
