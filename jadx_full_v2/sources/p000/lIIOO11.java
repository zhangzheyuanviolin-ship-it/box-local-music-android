            package p000;

            import android.content.Context;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public abstract class lIIOO11 {
                public static IO0oo1I0oIO I00000oIO(Context context) {
                    ListenableFuture listenableFutureI0000oI00;
/* 3 */             IOiOol0 iOiOol0 = OOIl1Io0.I00000oOI.I00000oIO;
                    synchronized (iOiOol0.I00iiO) {
/* 8 */                 Object obj = IOoiioOI.I00000oIO;
/* 18 */                iOiOol0.I00ioIO = O0oOo111Ill.I00000oIO(context.getDeviceId());
/* 22 */                listenableFutureI0000oI00 = (Illo1O1o) iOiOol0.I00iio;
/* 24 */                if (listenableFutureI0000oI00 == null) {
/* 31 */                    IIoIloi0 iIoIloi0 = new IIoIloi0(context, null);
/* 38 */                    Illo1O1o illo1O1oI00000oIO = Illo1O1o.I00000oIO((ListenableFuture) iOiOol0.I00ilO0);
/* 46 */                    O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(8);
/* 49 */                    o0l0IlolloIO.I00iiI = iIoIloi0;
/* 51 */                    VarHandle.storeStoreFence();
/* 58 */                    I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(18);
/* 61 */                    i0IOIlIOIII.I00iiI = o0l0IlolloIO;
/* 63 */                    VarHandle.storeStoreFence();
/* 70 */                    IO0oo1I0oIO iO0oo1I0oIOI000O01llI0 = iIllIoiiIO.I000O01llI0(illo1O1oI00000oIO, i0IOIlIOIII, Iii11l.I00000oIO());
/* 78 */                    I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(27);
/* 81 */                    i01oIoOI01l.I00iiI = iOiOol0;
/* 83 */                    i01oIoOI01l.I00iiO = iIoIloi0;
/* 85 */                    i01oIoOI01l.I00iio = context;
/* 87 */                    VarHandle.storeStoreFence();
/* 92 */                    int i = 19;
/* 94 */                    I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(i);
/* 97 */                    i0IOIlIOIII2.I00iiI = i01oIoOI01l;
/* 99 */                    VarHandle.storeStoreFence();
/* 106 */                   IO0oo1I0oIO iO0oo1I0oIOI000II = iIllIoiiIO.I000II(iO0oo1I0oIOI000O01llI0, i0IOIlIOIII2, Iii11l.I00000oIO());
/* 110 */                   iOiOol0.I00iio = iO0oo1I0oIOI000II;
/* 114 */                   IIloOI iIloOI = new IIloOI(i);
/* 117 */                   iIloOI.I00iiI = iOiOol0;
/* 119 */                   VarHandle.storeStoreFence();
/* 126 */                   iIllIoiiIO.I00000oIO(iO0oo1I0oIOI000II, iIloOI, Iii11l.I00000oIO());
/* 129 */                   listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(iO0oo1I0oIOI000II);
                        }
                    }
/* 137 */           OIiilo1Ool0o oIiilo1Ool0o = new OIiilo1Ool0o(4);
/* 140 */           VarHandle.storeStoreFence();
/* 147 */           return iIllIoiiIO.I000II(listenableFutureI0000oI00, oIiilo1Ool0o, Iii11l.I00000oIO());
                }
            }
