            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
/* 24 */    public final class zzaye {
                private final zzazd zza;
                private final Object zzb;

                private zzaye(zzazd zzazdVar) {
/* 5 */             this.zzb = null;
/* 9 */             zzgo.zzc(zzazdVar, "status");
/* 12 */            this.zza = zzazdVar;
/* 22 */            zzgo.zzj(!zzazdVar.zzj(), "cannot use OK status: %s", zzazdVar);
                }

                public static zzaye zza(Object obj) {
/* 3 */             return new zzaye(obj);
                }

                public static zzaye zzb(zzazd zzazdVar) {
/* 3 */             return new zzaye(zzazdVar);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && zzaye.class == obj.getClass()) {
/* 17 */                zzaye zzayeVar = (zzaye) obj;
/* 23 */                if (this.zza == zzayeVar.zza && Objects.equals(this.zzb, zzayeVar.zzb)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.zza, this.zzb);
                }

                public final String toString() {
/* 1 */             Object obj = this.zzb;
/* 3 */             if (obj != null) {
/* 5 */                 zzgk zzgkVarZzb = zzgm.zzb(this);
/* 11 */                zzgkVarZzb.zzd("config", obj);
/* 14 */                return zzgkVarZzb.toString();
                    }
/* 19 */            zzgk zzgkVarZzb2 = zzgm.zzb(this);
/* 27 */            zzgkVarZzb2.zzd("error", this.zza);
/* 30 */            return zzgkVarZzb2.toString();
                }

                public final zzazd zzc() {
/* 1 */             return this.zza;
                }

                public final Object zzd() {
/* 1 */             return this.zzb;
                }

/* 25 */        private zzaye(Object obj) {
                    this.zzb = obj;
                    this.zza = null;
                }
            }
