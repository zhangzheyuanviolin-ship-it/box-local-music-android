            package p000;

            import android.os.IInterface;
            import android.os.RemoteCallbackList;
            import androidx.room.MultiInstanceInvalidationService;
            
            public final class OI0OII10i1oI extends RemoteCallbackList {
                public final MultiInstanceInvalidationService I00000oIO;

                public OI0OII10i1oI(MultiInstanceInvalidationService multiInstanceInvalidationService) {
/* 1 */             this.I00000oIO = multiInstanceInvalidationService;
                }

                @Override
                public final void onCallbackDied(IInterface iInterface, Object obj) {
/* 9 */             this.I00000oIO.I00iiI.remove((Integer) obj);
                }
            }
