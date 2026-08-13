            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Binder;
            import android.os.Parcel;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.Oi010OO0;
            
            public final class zzbbn extends Binder {
                private static final Logger zza = Logger.getLogger(zzbbn.class.getName());
                private zzbbm zzb;

                public zzbbn(zzbbm zzbbmVar) {
/* 4 */             this.zzb = zzbbmVar;
                }

                @Override
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 3 */             zzbbm zzbbmVar = this.zzb;
/* 6 */             if (zzbbmVar != null) {
                        try {
/* 10 */                    if ((i2 & 1) != 0) {
/* 40 */                        return zzbbmVar.zza(i, parcel);
                            }
/* 32 */                    zza.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "ignoring non-oneway transaction. flags=" + i2);
/* 5 */                     return false;
                        } catch (RuntimeException e) {
/* 59 */                    zza.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", Oi010OO0.I000oI1ioi(i, "failure sending transaction "), (Throwable) e);
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final boolean pingBinder() {
                    return this.zzb != null;
                }

                public final zzbbm zza() {
/* 1 */             return this.zzb;
                }

                public final void zzb(zzbbm zzbbmVar) {
/* 1 */             this.zzb = zzbbmVar;
                }
            }
