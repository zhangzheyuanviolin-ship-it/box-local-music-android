            package com.google.mlkit.genai.speechrecognition;

            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1ii;
            import p000.IlOil1iooOO0;
            import p000.IlliIl1l11O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            public final class zzf extends Oll0io implements IlliIl1l11O {
                int zza;
                final IlOil1ii zzb;
                final AtomicBoolean zzc;
                private Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzf(IlOil1ii ilOil1ii, IOoil1iiIilo iOoil1iiIilo, AtomicBoolean atomicBoolean) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.zzb = ilOil1ii;
/* 3 */             this.zzc = atomicBoolean;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             zzf zzfVar = new zzf(this.zzb, iOoil1iiIilo, this.zzc);
/* 10 */            zzfVar.zzd = obj;
/* 89 */            return zzfVar;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzf) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (i == 0) {
/* 13 */                IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.zzd;
/* 15 */                IlOil1ii ilOil1ii = this.zzb;
/* 21 */                zze zzeVar = new zze(ilOil1iooOO0, this.zzc);
/* 25 */                this.zza = 1;
/* 31 */                if (ilOil1ii.I00000oIO(zzeVar, this) == ii0111o) {
/* 33 */                    return ii0111o;
                        }
                    }
/* 34 */            return OoiIlOl1iI.I00000oIO;
                }
            }
