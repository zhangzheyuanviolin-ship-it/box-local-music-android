            package com.google.mlkit.vision.segmentation.subject.internal;

            import android.content.Context;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.O0l10o00l;
            import p000.O1o0111OI00;
            import p000.OloOII1ioI1l;
            import p000.lOio11O;
            import p000.loi1ool;
            import p000.loiOiI01lli;
            import p000.lolIlO00;
            
            public final class zze extends O0l10o00l {
                private final O1o0111OI00 zza;

                public zze(O1o0111OI00 o1o0111OI00) {
/* 4 */             this.zza = o1o0111OI00;
                }

                @Override
                public final Object create(Object obj) {
/* 1 */             O1o0111OI00 o1o0111OI00 = this.zza;
/* 7 */             loi1ool loi1oolVarI00000oIO = lolIlO00.I00000oIO();
/* 11 */            Context contextI00000oOI = o1o0111OI00.I00000oOI();
/* 17 */            loiOiI01lli loioii01lli = new loiOiI01lli();
/* 27 */            loioii01lli.I00000oOI = new AtomicLong(-1L);
/* 31 */            OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 36 */            oloOII1ioI1l.I00000oOI = "mlkit:vision";
/* 38 */            VarHandle.storeStoreFence();
/* 45 */            loioii01lli.I00000oIO = lOio11O.I00000oIO(contextI00000oOI, oloOII1ioI1l);
/* 47 */            VarHandle.storeStoreFence();
/* 52 */            return new zzj(this.zza, (SubjectSegmenterOptions) obj, loi1oolVarI00000oIO, loioii01lli);
                }
            }
