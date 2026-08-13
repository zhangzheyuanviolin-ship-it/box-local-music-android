            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.logging.Level;
            
            final class zzbjz implements zzawv {
                final zzbki zza;
                private zzbkg zzb;

                public zzbjz(zzbki zzbkiVar, zzbkh zzbkhVar) {
/* 1 */             Objects.requireNonNull(zzbkiVar);
/* 4 */             this.zza = zzbkiVar;
                }

                @Override
                public final void zza(zzauw zzauwVar) {
/* 1 */             zzbki zzbkiVar = this.zza;
/* 7 */             if (zzbkiVar.zzp) {
/* 31 */                zzbki.zzf.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{zzauwVar, this.zzb.zza});
/* 34 */                return;
                    }
/* 57 */            zzbki.zzf.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{zzauwVar, this.zzb.zza});
/* 1 */             this.zzb.zzd = zzauwVar;
/* 73 */            if (zzbkiVar.zzj.zzh() && this.zzb == zzbkiVar.zzi.get(zzbkiVar.zzj.zzc())) {
/* 1 */                 zzbkiVar.zzs(this.zzb);
                    }
                }
            }
