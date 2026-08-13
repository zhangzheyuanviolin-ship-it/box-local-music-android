            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1iooOO0;
            import p000.OOo0l0ii10l;
            import p000.OoiIlOl1iI;
            
            final class zzboa implements IlOil1iooOO0 {
                final OOo0l0ii10l zza;
                final IlOil1iooOO0 zzb;
                final String zzc = "request";
                final Object zzd;

                public zzboa(OOo0l0ii10l oOo0l0ii10l, IlOil1iooOO0 ilOil1iooOO0, String str, Object obj) {
/* 1 */             this.zza = oOo0l0ii10l;
/* 3 */             this.zzb = ilOil1iooOO0;
/* 9 */             this.zzd = obj;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws zzaze {
/* 1 */             OOo0l0ii10l oOo0l0ii10l = this.zza;
/* 5 */             if (!oOo0l0ii10l.I00iOIl) {
/* 8 */                 oOo0l0ii10l.I00iOIl = true;
/* 12 */                Object objEmit = this.zzb.emit(obj, iOoil1iiIilo);
                        return objEmit == Ii0111o.I00iOIl ? objEmit : OoiIlOl1iI.I00000oIO;
                    }
/* 24 */            String str = this.zzc;
/* 26 */            Object obj2 = this.zzd;
/* 106 */           throw new zzaze(zzazd.zzi.zze("Expected one " + str + " for " + obj2 + " but received two"), null);
                }
            }
