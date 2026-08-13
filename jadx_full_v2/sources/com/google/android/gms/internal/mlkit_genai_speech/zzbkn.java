            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            final class zzbkn extends zzawu {
                final zzbkp zza;
                private final AtomicBoolean zzb;

                public zzbkn(zzbkp zzbkpVar, zzbko zzbkoVar) {
/* 1 */             Objects.requireNonNull(zzbkpVar);
/* 4 */             this.zza = zzbkpVar;
/* 15 */            this.zzb = new AtomicBoolean(false);
                }

                @Override
                public final zzawp zza(zzawq zzawqVar) {
/* 9 */             if (this.zzb.compareAndSet(false, true)) {
/* 11 */                final zzbkp zzbkpVar = this.zza;
/* 17 */                zzazm zzazmVarZzb = zzbkpVar.zzf.zzb();
/* 21 */                Objects.requireNonNull(zzbkpVar);
/* 29 */                zzazmVarZzb.zzc(new Runnable() {
                            @Override
                            public final void run() {
/* 3 */                         zzbkpVar.zzf();
                            }
                        });
/* 32 */                zzazmVarZzb.zzb();
                    }
/* 35 */            return zzawp.zzc();
                }
            }
