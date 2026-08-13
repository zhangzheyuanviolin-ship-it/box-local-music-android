            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbhd implements Runnable {
                final zzbdr zza;
                final boolean zzb;
                final zzbhp zzc;

                public zzbhd(zzbhp zzbhpVar, zzbdr zzbdrVar, boolean z) {
/* 1 */             this.zza = zzbdrVar;
/* 3 */             this.zzb = z;
/* 5 */             Objects.requireNonNull(zzbhpVar);
/* 8 */             this.zzc = zzbhpVar;
                }

                @Override
                public final void run() {
/* 11 */            this.zzc.zzs.zzc(this.zza, this.zzb);
                }
            }
