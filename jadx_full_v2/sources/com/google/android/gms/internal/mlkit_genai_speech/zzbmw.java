            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Map;
            import java.util.Objects;
            
            public final class zzbmw {
                private final String zza;
                private final Map zzb;

                public zzbmw(String str, Map map) {
/* 6 */             zzgo.zzc(str, "policyName");
/* 9 */             this.zza = str;
/* 13 */            zzgo.zzc(map, "rawConfigValue");
/* 16 */            this.zzb = map;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzbmw) {
/* 6 */                 zzbmw zzbmwVar = (zzbmw) obj;
/* 16 */                if (this.zza.equals(zzbmwVar.zza) && this.zzb.equals(zzbmwVar.zzb)) {
/* 28 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.zza, this.zzb);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("policyName", this.zza);
/* 16 */            zzgkVarZzb.zzd("rawConfigValue", this.zzb);
/* 19 */            return zzgkVarZzb.toString();
                }

                public final String zza() {
/* 1 */             return this.zza;
                }

                public final Map zzb() {
/* 1 */             return this.zzb;
                }
            }
