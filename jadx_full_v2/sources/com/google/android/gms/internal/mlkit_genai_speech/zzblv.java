            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzblv implements Runnable {
                final zzblt zza;
                final zzbmj zzb;

                public zzblv(zzbmj zzbmjVar, zzblt zzbltVar) {
/* 1 */             Objects.requireNonNull(zzbmjVar);
/* 4 */             this.zzb = zzbmjVar;
/* 9 */             this.zza = zzbltVar;
                }

                @Override
                public final void run() {
/* 1 */             zzbmj zzbmjVar = this.zzb;
/* 1 */             zzbmh zzbmhVarZzae = zzbmjVar.zzae(zzbmjVar.zzt.zze, false, true);
/* 15 */            if (zzbmhVarZzae == null) {
/* 17 */                return;
                    }
/* 27 */            zzbmjVar.zzg.execute(new zzblu(this, zzbmhVarZzae));
                }
            }
