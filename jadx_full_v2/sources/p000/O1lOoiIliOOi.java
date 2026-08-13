            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class O1lOoiIliOOi implements OOiO01IO {
                public final int I00000oIO;
                public OOiO01IO I00000oOI;
                public OOiO01IO I0000Il00O;

                public O1lOoiIliOOi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 55 */                    Context context = (Context) ((Ii0O1OIO1i) this.I00000oOI).I00000oOI;
/* 67 */                    IOO000ilo iOO000ilo = (IOO000ilo) ((Ii0O1OIO1i) this.I0000Il00O).get();
/* 73 */                    IIlio101Io iIlio101Io = new IIlio101Io(18);
/* 77 */                    iIlio101Io.I00iiO = null;
/* 79 */                    iIlio101Io.I00iiI = context;
/* 81 */                    VarHandle.storeStoreFence();
/* 84 */                    O1lOoiIIliiI o1lOoiIIliiI = new O1lOoiIIliiI();
/* 92 */                    o1lOoiIIliiI.I0000Il00O = new HashMap();
/* 94 */                    o1lOoiIIliiI.I00000oIO = iIlio101Io;
/* 96 */                    o1lOoiIIliiI.I00000oOI = iOO000ilo;
/* 98 */                    VarHandle.storeStoreFence();
/* 101 */                   return o1lOoiIIliiI;
                        default:
/* 10 */                    loilIl10Ii loilil10ii = new loilIl10Ii(16);
/* 15 */                    iOloo0O0O ioloo0o0o = new iOloo0O0O(16);
/* 18 */                    I1l0OIO0Oio i1l0OIO0Oio = I1l0OIO0Oio.I0001Ioi1lo;
/* 22 */                    Object obj = this.I00000oOI.get();
/* 26 */                    OOiO01IO oOiO01IO = this.I0000Il00O;
/* 32 */                    OiIIilol0iO oiIIilol0iO = new OiIIilol0iO();
/* 35 */                    oiIIilol0iO.I00iOIl = (OiOIoliOiII) obj;
/* 37 */                    oiIIilol0iO.I00iiI = loilil10ii;
/* 39 */                    oiIIilol0iO.I00iiO = ioloo0o0o;
/* 41 */                    oiIIilol0iO.I00iio = i1l0OIO0Oio;
/* 43 */                    oiIIilol0iO.I00ilI0I1 = oOiO01IO;
/* 45 */                    VarHandle.storeStoreFence();
/* 48 */                    return oiIIilol0iO;
                    }
                }
            }
