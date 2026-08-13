            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1ii;
            import p000.IlOil1iooOO0;
            import p000.IlliIl1l11O;
            import p000.OOo0l0ii10l;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzbob extends Oll0io implements IlliIl1l11O {
                int zza;
                final IlOil1ii zzb;
                final String zzc = "request";
                final Object zzd;
                private Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbob(IlOil1ii ilOil1ii, String str, Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.zzb = ilOil1ii;
/* 7 */             this.zzd = obj;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             zzbob zzbobVar = new zzbob(this.zzb, this.zzc, this.zzd, iOoil1iiIilo);
/* 12 */            zzbobVar.zze = obj;
/* 37 */            return zzbobVar;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbob) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OOo0l0ii10l oOo0l0ii10l;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             if (this.zza != 0) {
/* 9 */                 oOo0l0ii10l = (OOo0l0ii10l) this.zze;
/* 11 */                lIoii1l01l0i.I00000oOI(obj);
                    } else {
/* 15 */                lIoii1l01l0i.I00000oOI(obj);
/* 20 */                IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.zze;
/* 24 */                OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 27 */                IlOil1ii ilOil1ii = this.zzb;
/* 35 */                zzboa zzboaVar = new zzboa(oOo0l0ii10l2, ilOil1iooOO0, this.zzc, this.zzd);
/* 38 */                this.zze = oOo0l0ii10l2;
/* 41 */                this.zza = 1;
/* 47 */                if (ilOil1ii.I00000oIO(zzboaVar, this) == ii0111o) {
/* 168 */                   return ii0111o;
                        }
/* 49 */                oOo0l0ii10l = oOo0l0ii10l2;
                    }
/* 52 */            if (oOo0l0ii10l.I00iOIl) {
/* 54 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 57 */            String str = this.zzc;
/* 59 */            Object obj2 = this.zzd;
/* 100 */           throw new zzaze(zzazd.zzi.zze("Expected one " + str + " for " + obj2 + " but received none"), null);
                }
            }
