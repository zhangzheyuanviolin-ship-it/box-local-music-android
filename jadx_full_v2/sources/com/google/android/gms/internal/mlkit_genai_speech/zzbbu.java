            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.IBinder;
            import android.os.RemoteException;
            import p000.IIlIOloOOO;
            
            final class zzbbu extends zzbbv {
                public zzbbu(IBinder iBinder) {
/* 1 */             super(iBinder);
                }

                @Override
                public final void zza(int i, zzbbz zzbbzVar) throws RemoteException {
/* 9 */             if (!zzd(i, zzbbzVar.zzb())) {
/* 37 */                throw new RemoteException(IIlIOloOOO.I00100l0("BinderProxy#transact(", i, ", FLAG_ONEWAY) returned false"));
                    }
                }
            }
