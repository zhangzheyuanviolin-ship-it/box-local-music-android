            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.IOoil1iiIilo;
            import p000.IlOil1ii;
            import p000.ilOl0O00Il0i;
            import p000.ilOoO00;
            
            public final class zzbnz {
                public static final IlOil1ii zza(zzaua zzauaVar, zzaxv zzaxvVar, IlOil1ii ilOil1ii, zzatz zzatzVar, zzaxq zzaxqVar) {
/* 7 */             if (zzaxvVar.zzb() == zzaxt.BIDI_STREAMING) {
/* 14 */                return zzd(zzauaVar, zzaxvVar, zzatzVar, zzaxqVar, new zzbnq(ilOil1ii));
                    }
/* 19 */            zzaxvVar.toString();
/* 32 */            I000II.I001IO000("Expected a bidi streaming method, but got ".concat(zzaxvVar.toString()));
/* 35 */            return null;
                }

                public static final IlOil1ii zzb(zzaua zzauaVar, zzaxv zzaxvVar, Object obj, zzatz zzatzVar, zzaxq zzaxqVar) {
/* 7 */             if (zzaxvVar.zzb() == zzaxt.SERVER_STREAMING) {
/* 14 */                return zzd(zzauaVar, zzaxvVar, zzatzVar, zzaxqVar, new zzbnr(obj));
                    }
/* 19 */            zzaxvVar.toString();
/* 32 */            I000II.I000iOII("Expected a server streaming RPC method, but got ".concat(zzaxvVar.toString()));
/* 35 */            return null;
                }

                public static final Object zzc(zzaua zzauaVar, zzaxv zzaxvVar, Object obj, zzatz zzatzVar, zzaxq zzaxqVar, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             if (zzaxvVar.zzb() == zzaxt.UNARY) {
/* 30 */                return ilOoO00.I0000O(ilOl0O00Il0i.I00000oOI(new zzbob(zzd(zzauaVar, zzaxvVar, zzatzVar, zzaxqVar, new zzbnr(obj)), "request", zzaxvVar, null)), iOoil1iiIilo);
                    }
/* 35 */            zzaxvVar.toString();
/* 48 */            I000II.I000iOII("Expected a unary RPC method, but got ".concat(zzaxvVar.toString()));
/* 7 */             return null;
                }

                private static final IlOil1ii zzd(zzaua zzauaVar, zzaxv zzaxvVar, zzatz zzatzVar, zzaxq zzaxqVar, zzbns zzbnsVar) {
/* 12 */            return ilOl0O00Il0i.I00000oOI(new zzbny(zzatzVar, zzauaVar, zzaxvVar, zzaxqVar, zzbnsVar, null));
                }
            }
