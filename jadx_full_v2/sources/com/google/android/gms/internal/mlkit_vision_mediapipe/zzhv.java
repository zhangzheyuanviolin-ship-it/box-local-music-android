            package com.google.android.gms.internal.mlkit_vision_mediapipe;
            
            public class zzhv {
                private long zza;

                private zzhv(long j) {
/* 4 */             this.zza = j;
                }

                public static zzhv zzd(long j) {
/* 3 */             return new zzhv(j);
                }

                private final native long zzf(long j);

                private final native long zzg(long j);

                private final native void zzh(long j);

                public long zza() {
/* 1 */             return this.zza;
                }

                public final long zzb() {
/* 3 */             return zzg(this.zza);
                }

                public final zzhv zzc() {
/* 9 */             return new zzhv(zzf(this.zza));
                }

                public void zze() {
/* 1 */             long j = this.zza;
/* 7 */             if (j != 0) {
/* 9 */                 zzh(j);
/* 12 */                this.zza = 0L;
                    }
                }
            }
