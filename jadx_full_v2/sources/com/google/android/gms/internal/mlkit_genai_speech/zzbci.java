            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Binder;
            import android.os.Parcel;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.IIl001iO0Io;
            
            final class zzbci implements zzbbm {
                final int zza;
                final Logger zzb;
                final zzbbm zzc;

                public zzbci(int i, Logger logger, zzbbm zzbbmVar) {
/* 1 */             this.zza = i;
/* 3 */             this.zzb = logger;
/* 5 */             this.zzc = zzbbmVar;
                }

                @Override
                public final boolean zza(int i, Parcel parcel) {
/* 1 */             int callingUid = Binder.getCallingUid();
/* 5 */             int i2 = this.zza;
/* 7 */             if (callingUid == i2) {
/* 32 */                return this.zzc.zza(i, parcel);
                    }
/* 25 */            this.zzb.logp(Level.WARNING, "io.grpc.binder.internal.TransactionUtils$1", "handleTransaction", IIl001iO0Io.I000l1(callingUid, i2, "dropped txn from ", " !="));
/* 28 */            return false;
                }
            }
