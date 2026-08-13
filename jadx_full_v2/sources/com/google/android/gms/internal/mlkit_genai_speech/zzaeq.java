            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public abstract class zzaeq implements zzahv {
                static {
/* 1 */             int i = zzafr.zzb;
/* 3 */             int i2 = zzaes.zza;
                }

                @Override
                public final Object zza(zzafh zzafhVar, zzafr zzafrVar) throws zzagr {
                    zzail zzailVar;
/* 5 */             zzahn zzahnVar = (zzahn) zzb(zzafhVar, zzafrVar);
/* 7 */             if (zzahnVar == null || zzahnVar.zzs()) {
/* 106 */               return zzahnVar;
                    }
/* 17 */            if (zzahnVar instanceof zzaeo) {
/* 37 */                zzailVar = new zzail((zzaeo) zzahnVar);
                    } else {
/* 21 */                if (zzahnVar instanceof zzaep) {
/* 26 */                    throw null;
                        }
/* 29 */                zzailVar = new zzail(zzahnVar);
                    }
/* 44 */            throw zzailVar.zza();
                }
            }
