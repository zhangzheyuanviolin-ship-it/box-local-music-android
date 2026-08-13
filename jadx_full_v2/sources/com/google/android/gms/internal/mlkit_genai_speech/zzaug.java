            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzaug extends zzaua {
                private final zzaua zza;
                private final zzauf zzb;

                public zzaug(zzaua zzauaVar, zzauf zzaufVar, zzauh zzauhVar) {
/* 4 */             this.zza = zzauaVar;
/* 8 */             zzgo.zzc(zzaufVar, "interceptor");
/* 11 */            this.zzb = zzaufVar;
                }

                @Override
                public final zzaue zza(zzaxv zzaxvVar, zzatz zzatzVar) {
/* 5 */             return this.zzb.zza(zzaxvVar, zzatzVar, this.zza);
                }

                @Override
                public final String zzb() {
/* 3 */             return this.zza.zzb();
                }
            }
