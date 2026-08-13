            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzbkg {
                private final zzawt zza;
                private zzauv zzb;
                private boolean zzc = false;
                private zzauw zzd = zzauw.zzb(zzauv.IDLE);

                public zzbkg(zzawt zzawtVar, zzauv zzauvVar) {
/* 15 */            this.zza = zzawtVar;
/* 17 */            this.zzb = zzauvVar;
                }

                public static void zzh(zzbkg zzbkgVar, zzauv zzauvVar) {
                    boolean z;
/* 1 */             zzbkgVar.zzb = zzauvVar;
/* 5 */             if (zzauvVar == zzauv.READY || zzauvVar == zzauv.TRANSIENT_FAILURE) {
/* 20 */                z = true;
                    } else if (zzauvVar != zzauv.IDLE) {
/* 19 */                return;
                    } else {
/* 16 */                z = false;
                    }
/* 17 */            zzbkgVar.zzc = z;
                }

                public final zzauv zzc() {
/* 1 */             return this.zzb;
                }

                public final zzawt zzf() {
/* 1 */             return this.zza;
                }

                public final boolean zzi() {
/* 1 */             return this.zzc;
                }
            }
