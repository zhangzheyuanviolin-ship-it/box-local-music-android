            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            final class zzbkf extends zzawu {
                final zzbki zza;
                private final zzbki zzb;
                private final AtomicBoolean zzc;

                public zzbkf(zzbki zzbkiVar, zzbki zzbkiVar2) {
/* 1 */             Objects.requireNonNull(zzbkiVar);
/* 4 */             this.zza = zzbkiVar;
/* 15 */            this.zzc = new AtomicBoolean(false);
/* 17 */            this.zzb = zzbkiVar2;
                }

                @Override
                public final zzawp zza(zzawq zzawqVar) {
/* 9 */             if (this.zzc.compareAndSet(false, true)) {
/* 17 */                zzazm zzazmVarZzb = this.zza.zzh.zzb();
/* 21 */                final zzbki zzbkiVar = this.zzb;
/* 23 */                Objects.requireNonNull(zzbkiVar);
/* 31 */                zzazmVarZzb.zzc(new Runnable() {
                            @Override
                            public final void run() {
/* 3 */                         zzbkiVar.zzl();
                            }
                        });
/* 34 */                zzazmVarZzb.zzb();
                    }
/* 37 */            return zzawp.zzc();
                }
            }
