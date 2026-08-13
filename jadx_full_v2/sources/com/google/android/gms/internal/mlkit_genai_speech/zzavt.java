            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            public final class zzavt {
                public final String zza;
                public final zzavs zzb;
                public final long zzc;
                public final zzawh zzd;
                public final zzawh zze;

                public zzavt(String str, zzavs zzavsVar, long j, zzawh zzawhVar, zzawh zzawhVar2, zzavu zzavuVar) {
/* 4 */             this.zza = str;
/* 8 */             zzgo.zzc(zzavsVar, "severity");
/* 11 */            this.zzb = zzavsVar;
/* 13 */            this.zzc = j;
/* 16 */            this.zzd = null;
/* 18 */            this.zze = zzawhVar2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzavt) {
/* 6 */                 zzavt zzavtVar = (zzavt) obj;
/* 16 */                if (Objects.equals(this.zza, zzavtVar.zza) && Objects.equals(this.zzb, zzavtVar.zzb) && this.zzc == zzavtVar.zzc && Objects.equals(this.zze, zzavtVar.zze)) {
/* 46 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 18 */            return Objects.hash(this.zza, this.zzb, Long.valueOf(this.zzc), null, this.zze);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("description", this.zza);
/* 16 */            zzgkVarZzb.zzd("severity", this.zzb);
/* 23 */            zzgkVarZzb.zzc("timestampNanos", this.zzc);
/* 29 */            zzgkVarZzb.zzd("channelRef", null);
/* 36 */            zzgkVarZzb.zzd("subchannelRef", this.zze);
/* 39 */            return zzgkVarZzb.toString();
                }
            }
