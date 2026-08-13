            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            public final class zzbdo {
                private String zza = "unknown-authority";
                private zzatu zzb = zzatu.zza;
                private String zzc;
                private zzavq zzd;

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzbdo)) {
/* 3 */                 return false;
                    }
/* 7 */             zzbdo zzbdoVar = (zzbdo) obj;
                    return this.zza.equals(zzbdoVar.zza) && this.zzb.equals(zzbdoVar.zzb) && Objects.equals(this.zzd, zzbdoVar.zzd);
                }

                public final int hashCode() {
/* 12 */            return Objects.hash(this.zza, this.zzb, null, this.zzd);
                }

                public final zzatu zza() {
/* 1 */             return this.zzb;
                }

                public final zzbdo zzb(String str) {
/* 3 */             zzgo.zzc(str, "authority");
/* 6 */             this.zza = str;
/* 29 */            return this;
                }

                public final zzbdo zzc(zzatu zzatuVar) {
/* 1 */             this.zzb = zzatuVar;
/* 29 */            return this;
                }

                public final zzbdo zzd(zzavq zzavqVar) {
/* 1 */             this.zzd = zzavqVar;
/* 29 */            return this;
                }

                public final zzbdo zze(String str) {
/* 2 */             this.zzc = null;
/* 29 */            return this;
                }

                public final String zzf() {
/* 1 */             return this.zza;
                }
            }
