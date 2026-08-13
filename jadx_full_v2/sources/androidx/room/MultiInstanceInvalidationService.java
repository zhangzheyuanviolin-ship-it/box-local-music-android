            package androidx.room;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            import java.util.LinkedHashMap;
            import p000.OI0O10il;
            import p000.OI0OII10i1oI;
            
            public final class MultiInstanceInvalidationService extends Service {
                public int I00iOIl;
                public final LinkedHashMap I00iiI = new LinkedHashMap();
                public final OI0OII10i1oI I00iiO = new OI0OII10i1oI(this);
                public final OI0O10il I00iio = new OI0O10il(this);

                @Override
                public final IBinder onBind(Intent intent) {
/* 1 */             return this.I00iio;
                }
            }
