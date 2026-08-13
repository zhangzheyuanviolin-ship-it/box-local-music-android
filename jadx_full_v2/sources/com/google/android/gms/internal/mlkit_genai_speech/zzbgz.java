            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbgz implements Runnable {
                final zzbha zza;

                public zzbgz(zzbha zzbhaVar) {
/* 1 */             Objects.requireNonNull(zzbhaVar);
/* 4 */             this.zza = zzbhaVar;
                }

                @Override
                public final void run() {
/* 3 */             zzbhp zzbhpVar = this.zza.zzb;
/* 1 */             zzbjr zzbjrVar = zzbhpVar.zzq;
/* 1 */             zzbhpVar.zzp = null;
/* 1 */             zzbhpVar.zzq = null;
/* 24 */            zzbjrVar.zzr(zzazd.zzj.zze("InternalSubchannel closed transport due to address change"));
                }
            }
