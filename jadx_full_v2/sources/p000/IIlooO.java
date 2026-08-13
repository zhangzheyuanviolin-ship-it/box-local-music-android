            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            
            public abstract class IIlooO {
                public static final I1OollilIo I00000oIO = iOOOIOoiIlII.I00000oOI(0);

                public static final IIloOiil I00000oIO(IIloIII11 iIloIII11) {
                    try {
/* 3 */                 Trace.beginSection("CameraPipe");
/* 10 */                IoloOio0I ioloOio0I = new IoloOio0I(9);
/* 16 */                IIloOI iIloOI = new IIloOI(0);
/* 19 */                iIloOI.I00iiI = iIloIII11;
/* 21 */                VarHandle.storeStoreFence();
/* 24 */                ioloOio0I.I00iiI = iIloOI;
/* 28 */                IIloIo1I0i iIloIo1I0i = iIloIII11.I00000oOI;
/* 30 */                Oo0olliOi1 oo0olliOi1 = new Oo0olliOi1();
/* 33 */                oo0olliOi1.I0001Ioi1lo = iIloIo1I0i;
/* 50 */                oo0olliOi1.I00000oOI = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
/* 52 */                oo0olliOi1.I0000Il00O = 4;
/* 55 */                oo0olliOi1.I0000O = -3;
/* 58 */                oo0olliOi1.I0000oI00 = -1;
/* 60 */                VarHandle.storeStoreFence();
/* 63 */                ioloOio0I.I00iiO = oo0olliOi1;
/* 65 */                Ii10oo ii10ooI00100o1O0lo = ioloOio0I.I00100o1O0lo();
/* 69 */                Trace.endSection();
/* 74 */                IIloOiil iIloOiil = new IIloOiil();
/* 77 */                iIloOiil.I00000oIO = ii10ooI00100o1O0lo;
/* 79 */                I1OollilIo i1OollilIo = I00000oIO;
/* 81 */                i1OollilIo.getClass();
/* 90 */                iIloOiil.I00000oOI = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 97 */                iIloOiil.I0000Il00O = new Object();
/* 99 */                VarHandle.storeStoreFence();
/* 102 */               return iIloOiil;
                    } catch (Throwable th) {
/* 104 */               Trace.endSection();
/* 168 */               throw th;
                    }
                }
            }
