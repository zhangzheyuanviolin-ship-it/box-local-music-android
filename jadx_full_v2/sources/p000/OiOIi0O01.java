            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class OiOIi0O01 implements OOiO01IO {
                public final int I00000oIO;
                public OOiO01IO I00000oOI;
                public OOiO01IO I0000Il00O;
                public OOiO01IO I0000O;

                public OiOIi0O01(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 90 */                    Context context = (Context) this.I00000oOI.get();
/* 98 */                    OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) this.I0000Il00O.get();
/* 108 */                   I1lIl000I1lI i1lIl000I1lI = (I1lIl000I1lI) ((Il11lOl) this.I0000O).get();
/* 114 */                   IOO000ilo iOO000ilo = new IOO000ilo(17);
/* 117 */                   iOO000ilo.I00iiI = context;
/* 119 */                   iOO000ilo.I00iiO = oiIIilol0iO;
/* 121 */                   iOO000ilo.I00iio = i1lIl000I1lI;
/* 123 */                   VarHandle.storeStoreFence();
/* 126 */                   return iOO000ilo;
                        default:
/* 10 */                    loilIl10Ii loilil10ii = new loilIl10Ii(16);
/* 15 */                    iOloo0O0O ioloo0o0o = new iOloo0O0O(16);
/* 26 */                    IiI101Oo iiI101Oo = (IiI101Oo) ((IiI10I1IlO) this.I00000oOI).get();
/* 36 */                    IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) ((Ool0Ilo1OO) this.I0000Il00O).get();
/* 46 */                    o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) ((i01IiIoioll) this.I0000O).get();
/* 50 */                    OoIOlo1001I ooIOlo1001I = new OoIOlo1001I();
/* 53 */                    ooIOlo1001I.I00000oIO = loilil10ii;
/* 55 */                    ooIOlo1001I.I00000oOI = ioloo0o0o;
/* 57 */                    ooIOlo1001I.I0000Il00O = iiI101Oo;
/* 59 */                    ooIOlo1001I.I0000O = iiOili0lOO1;
/* 63 */                    Executor executor = (Executor) o01l1iooo0.I00iOIl;
/* 69 */                    OOIl1i1 oOIl1i1 = new OOIl1i1(18);
/* 72 */                    oOIl1i1.I00iiI = o01l1iooo0;
/* 74 */                    VarHandle.storeStoreFence();
/* 77 */                    executor.execute(oOIl1i1);
/* 80 */                    VarHandle.storeStoreFence();
/* 83 */                    return ooIOlo1001I;
                    }
                }
            }
