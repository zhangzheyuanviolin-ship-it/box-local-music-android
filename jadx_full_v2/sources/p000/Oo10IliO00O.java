            package p000;

            import android.os.Handler;
            import android.util.Log;
            import java.util.concurrent.Executor;
            import kotlin.jvm.functions.Function1;
            
            public final class Oo10IliO00O {
                public Ii0110 I00000oIO;
                public Ii0110 I00000oOI;
                public Ii00lIOoi I0000Il00O;
                public Ii00lIOoi I0000O;
                public Executor I0000oI00;
                public Ii00lIOoi I0001Ioi1lo;
                public OllO00oiil I000II;
                public OllO00oiil I000O01llI0;

                public final Handler I00000oIO() {
/* 7 */             return (Handler) this.I000II.getValue();
                }

                public final Object I00000oOI(long j, Function1 function1) {
                    try {
/* 12 */                return iOi1IOoIO0l.I00000oIO(this.I0000Il00O, new IO0IOi1Oi(this, function1, j, (IOoil1iiIilo) null));
                    } catch (InterruptedException e) {
/* 23 */                Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
/* 26 */                return null;
                    }
                }
            }
