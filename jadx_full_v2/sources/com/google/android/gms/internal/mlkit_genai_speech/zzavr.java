            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzavr {
                private String zza;
                private zzavs zzb;
                private Long zzc;
                private zzawh zzd;

                public final zzavr zza(String str) {
/* 1 */             this.zza = str;
/* 29 */            return this;
                }

                public final zzavr zzb(zzavs zzavsVar) {
/* 1 */             this.zzb = zzavsVar;
/* 29 */            return this;
                }

                public final zzavr zzc(zzawh zzawhVar) {
/* 1 */             this.zzd = zzawhVar;
/* 29 */            return this;
                }

                public final zzavr zzd(long j) {
/* 5 */             this.zzc = Long.valueOf(j);
/* 29 */            return this;
                }

                public final zzavt zze() {
/* 5 */             zzgo.zzc(this.zza, "description");
/* 12 */            zzgo.zzc(this.zzb, "severity");
/* 19 */            zzgo.zzc(this.zzc, "timestampNanos");
/* 38 */            return new zzavt(this.zza, this.zzb, this.zzc.longValue(), null, this.zzd, null);
                }
            }
