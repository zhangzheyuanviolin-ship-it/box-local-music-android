            package p000;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            
            public abstract class i0OlOlO {
                public final int I00000oIO;

                public i0OlOlO(int i) {
/* 4 */             this.I00000oIO = i;
                }

                public static Status I000O01llI0(RemoteException remoteException) {
/* 35 */            return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
                }

                public abstract IlIII1l[] I00000oIO(i0Ol1Ool00 i0ol1ool00);

                public abstract boolean I00000oOI(i0Ol1Ool00 i0ol1ool00);

                public abstract int I0000Il00O(i0Ol1Ool00 i0ol1ool00);

                public abstract void I0000O(Status status);

                public abstract void I0000oI00(Exception exc);

                public abstract void I0001Ioi1lo(OoIol00Ool ooIol00Ool, boolean z);

                public abstract void I000II(i0Ol1Ool00 i0ol1ool00);
            }
