            package p000;

            import android.os.StrictMode;
            import com.google.firebase.concurrent.ExecutorsRegistrar;
            import java.util.Collections;
            import java.util.concurrent.Executors;
            
            public final class IOiOoIO1OI implements OOiO0Il {
                public final int I00000oIO;

                public IOiOoIO1OI(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 135 */                   return Collections.EMPTY_SET;
                        case 1:
/* 91 */                    O0ioIo1O0lO o0ioIo1O0lO = ExecutorsRegistrar.I00000oIO;
/* 98 */                    StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
/* 102 */                   builderDetectNetwork.detectResourceMismatches();
/* 105 */                   builderDetectNetwork.detectUnbufferedIo();
/* 130 */                   return ExecutorsRegistrar.I00000oIO(Executors.newFixedThreadPool(4, new Ii0l1oioII("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
                        case 2:
/* 43 */                    O0ioIo1O0lO o0ioIo1O0lO2 = ExecutorsRegistrar.I00000oIO;
/* 86 */                    return ExecutorsRegistrar.I00000oIO(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new Ii0l1oioII("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
                        case 3:
/* 23 */                    O0ioIo1O0lO o0ioIo1O0lO3 = ExecutorsRegistrar.I00000oIO;
/* 38 */                    return ExecutorsRegistrar.I00000oIO(Executors.newCachedThreadPool(new Ii0l1oioII("Firebase Blocking", 11, null)));
                        case 4:
/* 9 */                     O0ioIo1O0lO o0ioIo1O0lO4 = ExecutorsRegistrar.I00000oIO;
/* 18 */                    return Executors.newSingleThreadScheduledExecutor(new Ii0l1oioII("Firebase Scheduler", 0, null));
                        case 5:
                        default:
/* 4 */                     return null;
                    }
                }
            }
