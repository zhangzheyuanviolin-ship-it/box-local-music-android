            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaul {
                private final zzatz zza;
                private final int zzb;
                private final boolean zzc;
                private final boolean zzd;

                public zzaul(zzatz zzatzVar, int i, boolean z, boolean z2) {
/* 6 */             zzgo.zzc(zzatzVar, "callOptions");
/* 9 */             this.zza = zzatzVar;
/* 11 */            this.zzb = i;
/* 13 */            this.zzc = z;
/* 15 */            this.zzd = z2;
                }

                public static zzauk zza() {
/* 3 */             return new zzauk();
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("callOptions", this.zza);
/* 16 */            zzgkVarZzb.zzb("previousAttempts", this.zzb);
/* 23 */            zzgkVarZzb.zze("isTransparentRetry", this.zzc);
/* 30 */            zzgkVarZzb.zze("isHedging", this.zzd);
/* 33 */            return zzgkVarZzb.toString();
                }
            }
