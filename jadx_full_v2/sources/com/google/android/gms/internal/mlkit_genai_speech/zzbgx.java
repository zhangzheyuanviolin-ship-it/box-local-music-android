            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbgx implements Runnable {
                final zzbhp zza;

                public zzbgx(zzbhp zzbhpVar) {
/* 1 */             Objects.requireNonNull(zzbhpVar);
/* 4 */             this.zza = zzbhpVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbhp zzbhpVar = this.zza;
/* 2 */             zzbhpVar.zzo = null;
/* 14 */            zzbhpVar.zzh.zza(2, "CONNECTING after backoff");
/* 19 */            zzbhp.zzD(zzbhpVar, zzauv.CONNECTING);
/* 22 */            zzbhp.zzH(zzbhpVar);
                }
            }
