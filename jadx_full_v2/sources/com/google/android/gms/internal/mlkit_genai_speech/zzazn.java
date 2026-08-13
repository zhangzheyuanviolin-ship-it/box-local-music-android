            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            final class zzazn extends zzava {
                private static final Logger zzb = Logger.getLogger(zzazn.class.getName());
                static final ThreadLocal zza = new ThreadLocal();

                @Override
                public final zzavb zza() {
/* 7 */             zzavb zzavbVar = (zzavb) zza.get();
                    return zzavbVar == null ? zzavb.zzb : zzavbVar;
                }

                @Override
                public final zzavb zzb(zzavb zzavbVar) {
/* 1 */             zzavb zzavbVarZza = zza();
/* 7 */             zza.set(zzavbVar);
/* 29 */            return zzavbVarZza;
                }

                @Override
                public final void zzc(zzavb zzavbVar, zzavb zzavbVar2) {
/* 5 */             if (zza() != zzavbVar) {
/* 26 */                zzb.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
                    }
/* 31 */            if (zzavbVar2 != zzavb.zzb) {
/* 35 */                zza.set(zzavbVar2);
                    } else {
/* 42 */                zza.set(null);
                    }
                }
            }
