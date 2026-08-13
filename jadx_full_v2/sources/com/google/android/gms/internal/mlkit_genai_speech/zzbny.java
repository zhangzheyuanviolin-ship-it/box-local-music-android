            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1iooOO0;
            import p000.IlliIl1l11O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.il001oo1;
            import p000.lIoii1l01l0i;
            
            final class zzbny extends Oll0io implements IlliIl1l11O {
                int zza;
                final zzatz zzb;
                final zzaua zzc;
                final zzaxv zzd;
                final zzaxq zze;
                final zzbns zzf;
                private Object zzg;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbny(zzatz zzatzVar, zzaua zzauaVar, zzaxv zzaxvVar, zzaxq zzaxqVar, zzbns zzbnsVar, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.zzb = zzatzVar;
/* 3 */             this.zzc = zzauaVar;
/* 5 */             this.zzd = zzaxvVar;
/* 7 */             this.zze = zzaxqVar;
/* 9 */             this.zzf = zzbnsVar;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            zzbny zzbnyVar = new zzbny(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, iOoil1iiIilo);
/* 17 */            zzbnyVar.zzg = obj;
/* 37 */            return zzbnyVar;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbny) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (i == 0) {
/* 29 */                zzbnx zzbnxVar = new zzbnx(this.zzb, this.zzc, this.zzd, this.zze, (IlOil1iooOO0) this.zzg, this.zzf, null);
/* 33 */                this.zza = 1;
/* 39 */                if (il001oo1.I0000Il00O(zzbnxVar, this) == ii0111o) {
/* 41 */                    return ii0111o;
                        }
                    }
/* 42 */            return OoiIlOl1iI.I00000oIO;
                }
            }
