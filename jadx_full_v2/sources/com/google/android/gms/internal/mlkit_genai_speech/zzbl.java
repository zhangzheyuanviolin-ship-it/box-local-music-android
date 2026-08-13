            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.lIoii1l01l0i;
            
            public final class zzbl extends zzbnn {
                public zzbl(zzaua zzauaVar, zzatz zzatzVar) {
/* 1 */             super(zzauaVar, zzatzVar);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object zza(zzcc zzccVar, zzaxq zzaxqVar, IOoil1iiIilo iOoil1iiIilo) {
                    zzbk zzbkVar;
/* 3 */             if (iOoil1iiIilo instanceof zzbk) {
/* 6 */                 zzbkVar = (zzbk) iOoil1iiIilo;
/* 8 */                 int i = zzbkVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzbkVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    zzbkVar = new zzbk(this, iOoil1iiIilo);
                        }
                    }
/* 19 */            zzbk zzbkVar2 = zzbkVar;
/* 27 */            Object objZzc = zzbkVar2.zza;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = zzbkVar2.zzc;
/* 34 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objZzc);
/* 52 */                zzaua zzauaVarZzc = zzc();
/* 57 */                zzaxv zzaxvVarZza = zzbj.zza();
/* 61 */                zzatz zzatzVarZzb = zzb();
/* 65 */                zzbkVar2.zzc = 1;
/* 69 */                objZzc = zzbnz.zzc(zzauaVarZzc, zzaxvVarZza, zzccVar, zzatzVarZzb, zzaxqVar, zzbkVar2);
/* 73 */                if (objZzc == ii0111o) {
/* 75 */                    return ii0111o;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 38 */                lIoii1l01l0i.I00000oOI(objZzc);
                    }
/* 98 */            return objZzc;
                }
            }
