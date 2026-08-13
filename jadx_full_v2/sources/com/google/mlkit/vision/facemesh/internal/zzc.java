            package com.google.mlkit.vision.facemesh.internal;

            import android.content.Context;
            import com.google.mlkit.vision.facemesh.FaceMeshDetectorOptions;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.O0l10o00l;
            import p000.O1o0111OI00;
            import p000.OloOII1ioI1l;
            import p000.lOio11O;
            import p000.loiI0oIOO;
            import p000.loiOiiIIo00l;
            import p000.lolI1l0OO;
            
            public final class zzc extends O0l10o00l {
                @Override
                public final Object create(Object obj) {
/* 5 */             loiI0oIOO loii0oiooI00000oIO = lolI1l0OO.I00000oIO();
/* 13 */            Context contextI00000oOI = O1o0111OI00.I0000Il00O().I00000oOI();
/* 19 */            loiOiiIIo00l loioiiiio00l = new loiOiiIIo00l();
/* 29 */            loioiiiio00l.I00000oOI = new AtomicLong(-1L);
/* 33 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 38 */            oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 40 */            VarHandle.storeStoreFence();
/* 47 */            loioiiiio00l.I00000oIO = lOio11O.I00000oIO(contextI00000oOI, oloOII1ioI1l);
/* 49 */            VarHandle.storeStoreFence();
/* 52 */            return new zzf((FaceMeshDetectorOptions) obj, loii0oiooI00000oIO, loioiiiio00l);
                }
            }
