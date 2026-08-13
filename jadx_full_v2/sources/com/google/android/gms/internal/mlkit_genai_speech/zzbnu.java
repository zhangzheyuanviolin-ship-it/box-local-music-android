            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.IO1010;
            import p000.IO10l0l0;
            import p000.IO10lIoiO;
            
            public final class zzbnu extends zzaud {
                final IO1010 zza;
                final zzbof zzb;

                public zzbnu(IO1010 io1010, zzbof zzbofVar) {
/* 1 */             this.zza = io1010;
/* 3 */             this.zzb = zzbofVar;
                }

                @Override
                public final void zza(zzazd zzazdVar, zzaxq zzaxqVar) {
/* 17 */            this.zza.I0001Ioi1lo(zzazdVar.zzj() ? null : new zzaze(zzazdVar, zzaxqVar));
                }

                @Override
                public final void zzc(Object obj) throws Throwable {
/* 3 */             Object objI000lI = this.zza.I000lI(obj);
/* 9 */             if (objI000lI instanceof IO10l0l0) {
/* 13 */                Throwable thI00000oOI = IO10lIoiO.I00000oOI((IO10l0l0) objI000lI);
/* 17 */                if (thI00000oOI != null) {
/* 25 */                    throw thI00000oOI;
                        }
/* 21 */                I000II.I000O01llI0("onMessage should never be called until responses is ready");
                    }
                }

                @Override
                public final void zzd() throws Throwable {
/* 3 */             this.zzb.zzb();
                }
            }
