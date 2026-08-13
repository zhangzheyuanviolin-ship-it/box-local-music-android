            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO0111o {
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, Function1 function1) {
/* 3 */             OIi01l1OlI oIi01l1OlI = new OIi01l1OlI();
/* 6 */             oIi01l1OlI.I00000oIO = function1;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return o1ooiI111i.I0000O(oIi01l1OlI);
                }
            }
