            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IOoil1iiIilo;
            import p000.Ii0110;
            import p000.Ii0111o;
            import p000.IlliIl1l11O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzbnw extends Oll0io implements IlliIl1l11O {
                int zza;
                final zzbns zzb;
                final zzaue zzc;
                final zzbof zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbnw(zzbns zzbnsVar, zzaue zzaueVar, zzbof zzbofVar, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.zzb = zzbnsVar;
/* 3 */             this.zzc = zzaueVar;
/* 5 */             this.zzd = zzbofVar;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new zzbnw(this.zzb, this.zzc, this.zzd, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbnw) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
                    try {
/* 5 */                 if (this.zza != 0) {
/* 7 */                     lIoii1l01l0i.I00000oOI(obj);
                        } else {
/* 13 */                    lIoii1l01l0i.I00000oOI(obj);
/* 16 */                    zzbns zzbnsVar = this.zzb;
/* 18 */                    zzaue zzaueVar = this.zzc;
/* 20 */                    zzbof zzbofVar = this.zzd;
/* 23 */                    this.zza = 1;
/* 29 */                    if (zzbnsVar.zza(zzaueVar, zzbofVar, this) == ii0111o) {
/* 31 */                        return ii0111o;
                            }
                        }
/* 34 */                this.zzc.zzb();
/* 37 */                return OoiIlOl1iI.I00000oIO;
                    } catch (Exception e) {
/* 44 */                this.zzc.zza("Collection of requests completed exceptionally", e);
/* 77 */                throw e;
                    }
                }
            }
