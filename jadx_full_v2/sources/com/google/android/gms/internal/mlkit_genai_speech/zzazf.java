            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import p000.I000II;
            
            public final class zzazf {
                private final zzazd zza;
                private final Object zzb;

                private zzazf(zzazd zzazdVar, Object obj) {
/* 4 */             this.zza = zzazdVar;
/* 6 */             this.zzb = obj;
                }

                public static zzazf zzb(zzazd zzazdVar) {
/* 5 */             zzgo.zzc(zzazdVar, "status");
/* 9 */             zzazf zzazfVar = new zzazf(zzazdVar, null);
/* 20 */            zzgo.zzj(!zzazdVar.zzj(), "cannot use OK status: %s", zzazdVar);
/* 29 */            return zzazfVar;
                }

                public static zzazf zzc(Object obj) {
/* 4 */             return new zzazf(null, obj);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzazf) {
/* 7 */                 zzazf zzazfVar = (zzazf) obj;
/* 17 */                if (zze() == zzazfVar.zze()) {
                            return zze() ? Objects.equals(this.zzb, zzazfVar.zzb) : this.zza == zzazfVar.zza;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.zza, this.zzb);
                }

                public final String toString() {
/* 1 */             zzazd zzazdVar = this.zza;
/* 3 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 7 */             if (zzazdVar == null) {
/* 13 */                zzgkVarZzb.zzd("value", this.zzb);
                    } else {
/* 19 */                zzgkVarZzb.zzd("error", zzazdVar);
                    }
/* 22 */            return zzgkVarZzb.toString();
                }

                public final zzazd zza() {
/* 1 */             zzazd zzazdVar = this.zza;
                    return zzazdVar == null ? zzazd.zza : zzazdVar;
                }

                public final Object zzd() {
/* 3 */             if (this.zza == null) {
/* 5 */                 return this.zzb;
                    }
/* 10 */            I000II.I001IO000("No value present.");
/* 13 */            return null;
                }

                public final boolean zze() {
                    return this.zza == null;
                }
            }
