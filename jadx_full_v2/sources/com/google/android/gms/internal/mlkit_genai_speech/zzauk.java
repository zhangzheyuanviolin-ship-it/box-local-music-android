            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzauk {
                private zzatz zza = zzatz.zza;
                private int zzb;
                private boolean zzc;
                private boolean zzd;

                public final zzauk zza(zzatz zzatzVar) {
/* 3 */             zzgo.zzc(zzatzVar, "callOptions cannot be null");
/* 6 */             this.zza = zzatzVar;
/* 29 */            return this;
                }

                public final zzauk zzb(boolean z) {
/* 1 */             this.zzd = z;
/* 29 */            return this;
                }

                public final zzauk zzc(boolean z) {
/* 1 */             this.zzc = z;
/* 29 */            return this;
                }

                public final zzauk zzd(int i) {
/* 1 */             this.zzb = i;
/* 29 */            return this;
                }

                public final zzaul zze() {
/* 11 */            return new zzaul(this.zza, this.zzb, this.zzc, this.zzd);
                }
            }
