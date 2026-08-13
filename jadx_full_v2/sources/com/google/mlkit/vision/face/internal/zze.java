            package com.google.mlkit.vision.face.internal;

            import android.content.Context;
            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import p000.Io0iI1l01il;
            import p000.Io0ii0lOoi;
            import p000.O0l10o00l;
            import p000.O1o0111OI00;
            import p000.li10lI1;
            import p000.liIl1O0ollo;
            
            public final class zze extends O0l10o00l {
                private final O1o0111OI00 zza;

                public zze(O1o0111OI00 o1o0111OI00) {
/* 4 */             this.zza = o1o0111OI00;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object create(Object obj) {
                    zzb zzaVar;
/* 1 */             FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
/* 5 */             Context contextI00000oOI = this.zza.I00000oOI();
/* 13 */            li10lI1 li10li1I00000oOI = liIl1O0ollo.I00000oOI(zzj.zzb());
/* 21 */            if (!zza.zzc(contextI00000oOI)) {
/* 25 */                Io0iI1l01il.I00000oOI.getClass();
/* 46 */                zzaVar = Io0ii0lOoi.I00000oIO(contextI00000oOI) >= 204500000 ? new zza(contextI00000oOI, faceDetectorOptions, li10li1I00000oOI) : new zzm(contextI00000oOI, faceDetectorOptions, li10li1I00000oOI);
                    }
/* 59 */            return new zzh(liIl1O0ollo.I00000oOI(zzj.zzb()), faceDetectorOptions, zzaVar);
                }
            }
