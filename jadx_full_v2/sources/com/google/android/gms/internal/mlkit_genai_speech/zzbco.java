            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import p000.I000II;
            import p000.IlIi0I0;
            
            public final class zzbco {
                final zzbcu zza;
                private final zzawn zzb;
                private zzawx zzc;
                private zzawy zzd;

                public zzbco(zzbcu zzbcuVar, zzawn zzawnVar) {
/* 1 */             Objects.requireNonNull(zzbcuVar);
/* 4 */             this.zza = zzbcuVar;
/* 9 */             this.zzb = zzawnVar;
/* 19 */            zzawy zzawyVarZza = zzbcuVar.zza.zza(zzbcuVar.zzb);
/* 23 */            this.zzd = zzawyVarZza;
/* 25 */            if (zzawyVarZza != null) {
/* 31 */                this.zzc = zzawyVarZza.zza(zzawnVar);
                    } else {
/* 46 */                I000II.I001IO000(IlIi0I0.I000lI("Could not find policy '", zzbcuVar.zzb, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
/* 106 */               throw null;
                    }
                }

                public final zzawx zza() {
/* 1 */             return this.zzc;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final zzazd zzb(zzaws zzawsVar) {
/* 5 */             zzbmx zzbmxVar = (zzbmx) zzawsVar.zzc();
/* 7 */             zzbct zzbctVar = null;
/* 8 */             if (zzbmxVar == null) {
                        try {
/* 10 */                    zzbcu zzbcuVar = this.zza;
/* 24 */                    zzbmxVar = new zzbmx(zzbcu.zza(zzbcuVar, zzbcuVar.zzb, "using default policy"), null);
                        } catch (zzbcs e) {
/* 49 */                    this.zzb.zze(zzauv.TRANSIENT_FAILURE, new zzbcq(zzazd.zzi.zze(e.getMessage())));
/* 54 */                    this.zzc.zzc();
/* 57 */                    this.zzd = null;
/* 64 */                    this.zzc = new zzbcr(zzbctVar);
/* 66 */                    return zzazd.zza;
                        }
                    }
/* 69 */            zzawy zzawyVar = this.zzd;
/* 71 */            if (zzawyVar != null) {
/* 73 */                zzawy zzawyVar2 = zzbmxVar.zza;
/* 87 */                if (!zzawyVar2.zzd().equals(zzawyVar.zzd())) {
/* 89 */                    zzawn zzawnVar = this.zzb;
/* 98 */                    zzawnVar.zze(zzauv.CONNECTING, new zzbcp(zzbctVar));
/* 103 */                   this.zzc.zzc();
/* 106 */                   zzawy zzawyVar3 = zzbmxVar.zza;
/* 108 */                   this.zzd = zzawyVar3;
/* 110 */                   zzawx zzawxVar = this.zzc;
/* 116 */                   this.zzc = zzawyVar3.zza(zzawnVar);
/* 151 */                   ((zzbil) zzawnVar).zzb.zzT.zzb(2, "Load balancer changed from {0} to {1}", zzawxVar.getClass().getSimpleName(), this.zzc.getClass().getSimpleName());
                        }
                    }
/* 154 */           Object obj = zzbmxVar.zzb;
/* 156 */           if (obj != null) {
/* 175 */               ((zzbil) this.zzb).zzb.zzT.zzb(1, "Load-balancing config: {0}", obj);
                    }
/* 178 */           zzawx zzawxVar2 = this.zzc;
/* 180 */           zzawr zzawrVarZzb = zzaws.zzb();
/* 188 */           zzawrVarZzb.zza(zzawsVar.zzd());
/* 195 */           zzawrVarZzb.zzb(zzawsVar.zza());
/* 198 */           zzawrVarZzb.zzc(obj);
/* 205 */           return zzawxVar2.zza(zzawrVarZzb.zzd());
                }

                public final void zzc() {
/* 3 */             this.zzc.zzc();
/* 7 */             this.zzc = null;
                }
            }
