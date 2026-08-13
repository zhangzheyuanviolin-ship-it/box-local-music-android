            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.util.Log;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class lIO0IIIo extends BroadcastReceiver {
                public final AtomicBoolean I00000oIO;
                public final Context I00000oOI;
                public final Oio0llilli I0000Il00O;
                public final i11I1Ili I0000O;
                public final Executor I0000oI00;

                public lIO0IIIo(AtomicBoolean atomicBoolean, Context context, Oio0llilli oio0llilli, i11I1Ili i11i1ili, Executor executor) {
/* 1 */             this.I00000oIO = atomicBoolean;
/* 3 */             this.I00000oOI = context;
/* 5 */             this.I0000Il00O = oio0llilli;
/* 7 */             this.I0000O = i11i1ili;
/* 9 */             this.I0000oI00 = executor;
                }

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 9 */             if (this.I00000oIO.compareAndSet(false, true)) {
                        try {
/* 13 */                    this.I00000oOI.unregisterReceiver(this);
                        } catch (IllegalArgumentException e) {
/* 22 */                    Log.w("DirectBootUtils", "Failed to unregister receiver", e);
                        }
/* 25 */                Oio0llilli oio0llilli = this.I0000Il00O;
/* 27 */                i11I1Ili i11i1ili = this.I0000O;
/* 29 */                Executor executor = this.I0000oI00;
/* 33 */                OoIlol ooIlol = new OoIlol();
/* 41 */                ooIlol.I00l0I0l0lO1 = new OoIlliloii0(ooIlol, i11i1ili);
/* 43 */                executor.execute(ooIlol);
/* 46 */                oio0llilli.I000o00OoI0I(ooIlol);
                    }
                }
            }
