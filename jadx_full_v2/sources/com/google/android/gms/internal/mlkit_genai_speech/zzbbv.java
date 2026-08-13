            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.Parcel;
            import java.util.concurrent.Executor;
            import java.util.logging.Logger;
            
            public abstract class zzbbv {
                protected final IBinder zza;
                private static final Logger zzc = Logger.getLogger(zzbbv.class.getName());
                public static final zzbbr zzb = new Object() {
                };

                public zzbbv(IBinder iBinder) {
/* 4 */             this.zza = iBinder;
                }

                public static zzbbv zzb(IBinder iBinder, Executor executor) {
                    return iBinder instanceof Binder ? new zzbbt(iBinder, executor) : new zzbbu(iBinder);
                }

                public abstract void zza(int i, zzbbz zzbbzVar);

                public final boolean zzd(int i, Parcel parcel) {
                    try {
/* 5 */                 return this.zza.transact(i, parcel, null, 1);
                    } finally {
/* 14 */                parcel.recycle();
                    }
                }
            }
