            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.Oi010OO0;
            
            public final class zzauw {
                private final zzauv zza;
                private final zzazd zzb;

                private zzauw(zzauv zzauvVar, zzazd zzazdVar) {
/* 6 */             zzgo.zzc(zzauvVar, "state is null");
/* 9 */             this.zza = zzauvVar;
/* 13 */            zzgo.zzc(zzazdVar, "status is null");
/* 16 */            this.zzb = zzazdVar;
                }

                public static zzauw zzb(zzauv zzauvVar) {
/* 10 */            zzgo.zzf(zzauvVar != zzauv.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
/* 17 */            return new zzauw(zzauvVar, zzazd.zza);
                }

                public static zzauw zzc(zzazd zzazdVar) {
/* 9 */             zzgo.zzf(!zzazdVar.zzj(), "The error status must not be OK");
/* 16 */            return new zzauw(zzauv.TRANSIENT_FAILURE, zzazdVar);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzauw)) {
/* 3 */                 return false;
                    }
/* 7 */             zzauw zzauwVar = (zzauw) obj;
                    return this.zza.equals(zzauwVar.zza) && this.zzb.equals(zzauwVar.zzb);
                }

                public final int hashCode() {
/* 13 */            return this.zza.hashCode() ^ this.zzb.hashCode();
                }

                public final String toString() {
/* 1 */             zzazd zzazdVar = this.zzb;
/* 3 */             boolean zZzj = zzazdVar.zzj();
/* 7 */             zzauv zzauvVar = this.zza;
                    return zZzj ? zzauvVar.toString() : Oi010OO0.I001IIilI0O(zzauvVar.toString(), "(", zzazdVar.toString(), ")");
                }

                public final zzauv zza() {
/* 1 */             return this.zza;
                }

                public final zzazd zzd() {
/* 1 */             return this.zzb;
                }
            }
