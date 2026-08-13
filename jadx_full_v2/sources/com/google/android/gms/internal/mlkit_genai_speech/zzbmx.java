            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            public final class zzbmx {
                final zzawy zza;
                final Object zzb;

                public zzbmx(zzawy zzawyVar, Object obj) {
/* 4 */             this.zza = zzawyVar;
/* 6 */             this.zzb = obj;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && zzbmx.class == obj.getClass()) {
/* 17 */                zzbmx zzbmxVar = (zzbmx) obj;
/* 27 */                if (Objects.equals(this.zza, zzbmxVar.zza) && Objects.equals(this.zzb, zzbmxVar.zzb)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.zza, this.zzb);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("provider", this.zza);
/* 16 */            zzgkVarZzb.zzd("config", this.zzb);
/* 19 */            return zzgkVarZzb.toString();
                }
            }
