            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IOoil1iiIilo;
            import p000.Ii0110;
            import p000.Ii0111o;
            import p000.IlliIl1l11O;
            import p000.O010OIi;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzbnv extends Oll0io implements IlliIl1l11O {
                int zza;
                final O010OIi zzb;
                final Exception zzc;
                final zzaue zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbnv(O010OIi o010OIi, Exception exc, zzaue zzaueVar, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.zzb = o010OIi;
/* 3 */             this.zzc = exc;
/* 5 */             this.zzd = zzaueVar;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new zzbnv(this.zzb, this.zzc, this.zzd, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbnv) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 7 */             lIoii1l01l0i.I00000oOI(obj);
/* 10 */            if (i == 0) {
/* 13 */                O010OIi o010OIi = this.zzb;
/* 15 */                Exception exc = this.zzc;
/* 18 */                this.zza = 1;
/* 24 */                if (zzboc.zza(o010OIi, "Collection of responses completed exceptionally", exc, this) == ii0111o) {
/* 26 */                    return ii0111o;
                        }
                    }
/* 31 */            this.zzd.zza("Collection of responses completed exceptionally", this.zzc);
/* 34 */            return OoiIlOl1iI.I00000oIO;
                }
            }
