            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Objects;
            
            final class zzbjp {
                private final zzbjm zza;
                private final Map zzb;
                private final Map zzc;
                private final zzbmi zzd;
                private final Object zze;
                private final Map zzf;

                public zzbjp(zzbjm zzbjmVar, Map map, Map map2, zzbmi zzbmiVar, Object obj, Map map3) {
/* 4 */             this.zza = zzbjmVar;
/* 15 */            this.zzb = Collections.unmodifiableMap(new HashMap(map));
/* 26 */            this.zzc = Collections.unmodifiableMap(new HashMap(map2));
/* 28 */            this.zzd = zzbmiVar;
/* 30 */            this.zze = obj;
/* 45 */            this.zzf = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && zzbjp.class == obj.getClass()) {
/* 17 */                zzbjp zzbjpVar = (zzbjp) obj;
/* 27 */                if (Objects.equals(this.zza, zzbjpVar.zza) && Objects.equals(this.zzb, zzbjpVar.zzb) && Objects.equals(this.zzc, zzbjpVar.zzc) && Objects.equals(this.zzd, zzbjpVar.zzd) && Objects.equals(this.zze, zzbjpVar.zze)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 15 */            return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("defaultMethodConfig", this.zza);
/* 16 */            zzgkVarZzb.zzd("serviceMethodMap", this.zzb);
/* 23 */            zzgkVarZzb.zzd("serviceMap", this.zzc);
/* 30 */            zzgkVarZzb.zzd("retryThrottling", this.zzd);
/* 37 */            zzgkVarZzb.zzd("loadBalancingConfig", this.zze);
/* 40 */            return zzgkVarZzb.toString();
                }

                public final zzavz zza() {
/* 8 */             if (this.zzc.isEmpty() && this.zzb.isEmpty() && this.zza == null) {
/* 7 */                 return null;
                    }
/* 25 */            return new zzbjn(this, null);
                }

                public final zzbjm zzb(zzaxv zzaxvVar) {
/* 11 */            zzbjm zzbjmVar = (zzbjm) this.zzb.get(zzaxvVar.zzf());
/* 13 */            if (zzbjmVar == null) {
/* 26 */                zzbjmVar = (zzbjm) this.zzc.get(zzaxvVar.zzg());
                    }
                    return zzbjmVar == null ? this.zza : zzbjmVar;
                }

                public final zzbmi zzc() {
/* 1 */             return this.zzd;
                }

                public final Object zzd() {
/* 1 */             return this.zze;
                }

                public final Map zze() {
/* 1 */             return this.zzf;
                }
            }
