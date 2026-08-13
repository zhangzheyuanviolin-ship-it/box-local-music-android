            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.Set;
            
            final class zzbgs {
                final int zza;
                final long zzb;
                final Set zzc;

                public zzbgs(int i, long j, Set set) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = j;
/* 12 */            this.zzc = zzho.zzj(set);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && zzbgs.class == obj.getClass()) {
/* 17 */                zzbgs zzbgsVar = (zzbgs) obj;
/* 23 */                if (this.zza == zzbgsVar.zza && this.zzb == zzbgsVar.zzb && Objects.equals(this.zzc, zzbgsVar.zzc)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 19 */            return Objects.hash(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzb("maxAttempts", this.zza);
/* 16 */            zzgkVarZzb.zzc("hedgingDelayNanos", this.zzb);
/* 23 */            zzgkVarZzb.zzd("nonFatalStatusCodes", this.zzc);
/* 26 */            return zzgkVarZzb.toString();
                }
            }
