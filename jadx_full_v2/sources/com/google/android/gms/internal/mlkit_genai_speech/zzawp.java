            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            public final class zzawp {
                private static final zzawp zza = new zzawp(null, null, zzazd.zza, false);
                private final zzawt zzb;
                private final zzauj zzc = null;
                private final zzazd zzd;
                private final boolean zze;

                private zzawp(zzawt zzawtVar, zzauj zzaujVar, zzazd zzazdVar, boolean z) {
/* 4 */             this.zzb = zzawtVar;
/* 11 */            zzgo.zzc(zzazdVar, "status");
/* 14 */            this.zzd = zzazdVar;
/* 16 */            this.zze = z;
                }

                public static zzawp zza(zzazd zzazdVar) {
/* 9 */             zzgo.zzf(!zzazdVar.zzj(), "drop status shouldn't be OK");
/* 15 */            return new zzawp(null, null, zzazdVar, true);
                }

                public static zzawp zzb(zzazd zzazdVar) {
/* 9 */             zzgo.zzf(!zzazdVar.zzj(), "error status shouldn't be OK");
/* 16 */            return new zzawp(null, null, zzazdVar, false);
                }

                public static zzawp zzc() {
/* 1 */             return zza;
                }

                public static zzawp zzd(zzawt zzawtVar, zzauj zzaujVar) {
/* 7 */             return new zzawp(zzawtVar, null, zzazd.zza, false);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzawp)) {
/* 3 */                 return false;
                    }
/* 7 */             zzawp zzawpVar = (zzawp) obj;
                    return Objects.equals(this.zzb, zzawpVar.zzb) && this.zzd == zzawpVar.zzd && this.zze == zzawpVar.zze;
                }

                public final int hashCode() {
/* 16 */            return Objects.hash(this.zzb, this.zzd, null, Boolean.valueOf(this.zze));
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("subchannel", this.zzb);
/* 15 */            zzgkVarZzb.zzd("streamTracerFactory", null);
/* 22 */            zzgkVarZzb.zzd("status", this.zzd);
/* 29 */            zzgkVarZzb.zze("drop", this.zze);
/* 34 */            zzgkVarZzb.zzd("authority-override", null);
/* 37 */            return zzgkVarZzb.toString();
                }

                public final zzawt zze() {
/* 1 */             return this.zzb;
                }

                public final zzazd zzf() {
/* 1 */             return this.zzd;
                }

                public final boolean zzg() {
                    return (this.zzb == null && this.zzd.zzj()) ? false : true;
                }

                public final boolean zzh() {
/* 1 */             return this.zze;
                }
            }
