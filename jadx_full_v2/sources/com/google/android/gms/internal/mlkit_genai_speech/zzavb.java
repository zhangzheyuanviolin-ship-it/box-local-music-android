            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.Executor;
            import java.util.logging.Logger;
            import p000.IOOlIIilOl0;
            
            public final class zzavb {
                static final Logger zza = Logger.getLogger(zzavb.class.getName());
                public static final zzavb zzb = new zzavb();

                private zzavb() {
                }

                public static zzauy zza(String str) {
/* 4 */             return new zzauy(str, null);
                }

                public static zzavb zzc() {
/* 3 */             zzavb zzavbVarZza = zzauz.zza.zza();
                    return zzavbVarZza == null ? zzb : zzavbVarZza;
                }

                public static Object zzd(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj;
                    }
/* 6 */             IOOlIIilOl0.I000II((String) obj2);
/* 9 */             return null;
                }

                public final zzavb zzb() {
/* 3 */             zzavb zzavbVarZzb = zzauz.zza.zzb(this);
                    return zzavbVarZzb == null ? zzb : zzavbVarZzb;
                }

                public final void zze(zzaux zzauxVar, Executor executor) {
/* 3 */             zzd(executor, "executor");
                }

                public final void zzf(zzavb zzavbVar) {
/* 3 */             zzd(zzavbVar, "toAttach");
/* 8 */             zzauz.zza.zzc(this, zzavbVar);
                }
            }
