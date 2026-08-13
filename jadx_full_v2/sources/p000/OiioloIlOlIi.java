            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OiioloIlOlIi {
                public static final AtomicInteger I00000oIO = new AtomicInteger(0);

                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, Function1 function1) {
/* 3 */             IOIl01OlIo iOIl01OlIo = new IOIl01OlIo();
/* 6 */             iOIl01OlIo.I00000oIO = function1;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return o1ooiI111i.I0000O(iOIl01OlIo);
                }

                public static final O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i, boolean z, Function1 function1) {
/* 3 */             I1IOI10 i1ioi10 = new I1IOI10();
/* 6 */             i1ioi10.I00000oIO = z;
/* 8 */             i1ioi10.I00000oOI = function1;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            return o1ooiI111i.I0000O(i1ioi10);
                }
            }
