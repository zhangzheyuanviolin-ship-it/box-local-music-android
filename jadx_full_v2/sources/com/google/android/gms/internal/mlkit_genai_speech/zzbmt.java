            package com.google.android.gms.internal.mlkit_genai_speech;
            
/* 4 */     final class zzbmt extends zzbmr {
                public zzbmt(zzbmu zzbmuVar) {
/* 2 */             super(null);
                }

                @Override
                public final void zza(zzbmv zzbmvVar, int i) {
                    synchronized (zzbmvVar) {
/* 1 */                 zzbmvVar.zze = 0;
                    }
                }

                @Override
                public final boolean zzb(zzbmv zzbmvVar, int i, int i2) {
                    synchronized (zzbmvVar) {
                        try {
/* 6 */                     if (zzbmvVar.zze != 0) {
/* 18 */                        return false;
                            }
/* 1 */                     zzbmvVar.zze = -1;
/* 13 */                    return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

/* 5 */         private zzbmt() {
/* 6 */             throw null;
                }
            }
