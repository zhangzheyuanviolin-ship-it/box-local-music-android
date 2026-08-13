            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Objects;
            
            final class zzbjb {
                final Object zza;
                Collection zzb;
                zzazd zzc;
                final zzbjd zzd;

                public zzbjb(zzbjd zzbjdVar, zzbjc zzbjcVar) {
/* 1 */             Objects.requireNonNull(zzbjdVar);
/* 4 */             this.zzd = zzbjdVar;
/* 14 */            this.zza = new Object();
/* 21 */            this.zzb = new HashSet();
                }

                public final void zza(zzazd zzazdVar) {
                    synchronized (this.zza) {
                        try {
/* 6 */                     if (this.zzc != null) {
/* 9 */                         return;
                            }
/* 12 */                    this.zzc = zzazdVar;
/* 16 */                    boolean zIsEmpty = this.zzb.isEmpty();
/* 21 */                    if (zIsEmpty) {
/* 29 */                        this.zzd.zzK.zzr(zzazdVar);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
