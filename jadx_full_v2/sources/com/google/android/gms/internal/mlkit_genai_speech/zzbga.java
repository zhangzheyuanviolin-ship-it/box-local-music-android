            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Random;
            
            public final class zzbga {
                private final Random zza = new Random();
                private final long zzb = 1000000000;
                private final long zzc = 120000000000L;
                private long zzd = 1000000000;

                public final long zza() {
/* 1 */             long j = this.zzd;
                    double d = j;
/* 17 */            this.zzd = Math.min((long) (1.6d * d), this.zzc);
/* 24 */            double d2 = 0.2d * d;
/* 30 */            double d3 = d * (-0.2d);
/* 38 */            zzgo.zze(d2 >= d3);
/* 51 */            return j + ((long) ((this.zza.nextDouble() * (d2 - d3)) + d3));
                }
            }
