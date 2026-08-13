            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.IBinder;
            import android.os.Parcel;
            import java.util.concurrent.Executor;
            import java.util.logging.Level;
            
            final class zzbbt extends zzbbv {
                private final zzbmv zzc;

                public zzbbt(IBinder iBinder, Executor executor) {
/* 1 */             super(iBinder);
/* 9 */             this.zzc = new zzbmv(executor);
                }

                @Override
                public final void zza(final int i, zzbbz zzbbzVar) {
/* 1 */             final Parcel parcelZza = zzbbzVar.zza();
/* 12 */            this.zzc.execute(new Runnable() {
                        @Override
                        public final void run() {
                            try {
/* 11 */                        if (this.zza.zzd(i, parcelZza)) {
/* 28 */                            return;
                                }
/* 25 */                        zzbbv.zzc.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                            } catch (Exception e) {
/* 44 */                        zzbbv.zzc.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
                            }
                        }
                    });
/* 15 */            zzbbzVar.zzb();
                }
            }
