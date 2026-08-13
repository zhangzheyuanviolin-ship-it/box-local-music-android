            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1ii;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            public final class zzbnq extends zzbns {
                private final IlOil1ii zza;

                public zzbnq(IlOil1ii ilOil1ii) {
/* 2 */             super(null);
/* 5 */             this.zza = ilOil1ii;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
                
                    if (r6.I00000oIO(r9, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object zza(zzaue zzaueVar, zzbof zzbofVar, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    zzbno zzbnoVar;
/* 3 */             if (iOoil1iiIilo instanceof zzbno) {
/* 6 */                 zzbnoVar = (zzbno) iOoil1iiIilo;
/* 8 */                 int i = zzbnoVar.zzd;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzbnoVar.zzd = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzbnoVar = new zzbno(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = zzbnoVar.zzb;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = zzbnoVar.zzd;
/* 34 */            if (i2 == 0) {
/* 60 */                lIoii1l01l0i.I00000oOI(obj);
/* 63 */                zzbnoVar.zza = zzaueVar;
/* 65 */                zzbnoVar.zze = zzbofVar;
/* 67 */                zzbnoVar.zzd = 1;
/* 73 */                if (zzbofVar.zza(zzbnoVar) != ii0111o) {
                        }
/* 98 */                return ii0111o;
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 == 2) {
/* 40 */                    lIoii1l01l0i.I00000oOI(obj);
/* 95 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 50 */            zzbofVar = zzbnoVar.zze;
/* 54 */            zzaueVar = (zzaue) zzbnoVar.zza;
/* 56 */            lIoii1l01l0i.I00000oOI(obj);
/* 75 */            IlOil1ii ilOil1ii = this.zza;
/* 79 */            zzbnp zzbnpVar = new zzbnp(zzaueVar, zzbofVar);
/* 82 */            zzbnoVar.zza = null;
/* 84 */            zzbnoVar.zze = null;
/* 86 */            zzbnoVar.zzd = 2;
                }
            }
