            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            
            public final class zzagb extends zzaeq {
                private final zzagg zza;

                public zzagb(zzagg zzaggVar) {
/* 4 */             this.zza = zzaggVar;
                }

                @Override
                public final Object zzb(zzafh zzafhVar, zzafr zzafrVar) throws zzagr {
/* 1 */             int i = zzagg.zzd;
/* 5 */             zzagg zzaggVarZzt = this.zza.zzt();
                    try {
/* 17 */                zzaia zzaiaVarZzb = zzahw.zza().zzb(zzaggVarZzt.getClass());
/* 25 */                zzaiaVarZzb.zzf(zzaggVarZzt, zzafi.zzq(zzafhVar), zzafrVar);
/* 28 */                zzaiaVarZzb.zzd(zzaggVarZzt);
/* 31 */                return zzaggVarZzt;
                    } catch (zzagr e) {
/* 82 */                if (e.zzb()) {
/* 89 */                    throw new zzagr(e);
                        }
/* 106 */               throw e;
                    } catch (zzail e2) {
/* 76 */                throw e2.zza();
                    } catch (IOException e3) {
/* 56 */                if (e3.getCause() instanceof zzagr) {
/* 64 */                    throw ((zzagr) e3.getCause());
                        }
/* 70 */                throw new zzagr(e3);
                    } catch (RuntimeException e4) {
/* 39 */                if (e4.getCause() instanceof zzagr) {
/* 47 */                    throw ((zzagr) e4.getCause());
                        }
/* 48 */                throw e4;
                    }
                }
            }
