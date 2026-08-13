            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.Set;
            
            final class zzbmk {
                final int zza;
                final long zzb;
                final long zzc;
                final double zzd;
                final Long zze;
                final Set zzf;

                public zzbmk(int i, long j, long j2, double d, Long l, Set set) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = j;
/* 8 */             this.zzc = j2;
/* 10 */            this.zzd = d;
/* 12 */            this.zze = l;
/* 18 */            this.zzf = zzho.zzj(set);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzbmk)) {
/* 3 */                 return false;
                    }
/* 7 */             zzbmk zzbmkVar = (zzbmk) obj;
                    return this.zza == zzbmkVar.zza && this.zzb == zzbmkVar.zzb && this.zzc == zzbmkVar.zzc && Double.compare(this.zzd, zzbmkVar.zzd) == 0 && Objects.equals(this.zze, zzbmkVar.zze) && Objects.equals(this.zzf, zzbmkVar.zzf);
                }

                public final int hashCode() {
/* 33 */            return Objects.hash(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), Double.valueOf(this.zzd), this.zze, this.zzf);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzb("maxAttempts", this.zza);
/* 16 */            zzgkVarZzb.zzc("initialBackoffNanos", this.zzb);
/* 23 */            zzgkVarZzb.zzc("maxBackoffNanos", this.zzc);
/* 30 */            zzgkVarZzb.zza("backoffMultiplier", this.zzd);
/* 37 */            zzgkVarZzb.zzd("perAttemptRecvTimeoutNanos", this.zze);
/* 44 */            zzgkVarZzb.zzd("retryableStatusCodes", this.zzf);
/* 47 */            return zzgkVarZzb.toString();
                }
            }
