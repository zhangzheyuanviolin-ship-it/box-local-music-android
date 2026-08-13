            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO010ilOIO {
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, Function1 function1) {
/* 3 */             OIi00Iloool oIi00Iloool = new OIi00Iloool();
/* 6 */             oIi00Iloool.I00000oIO = function1;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return o1ooiI111i.I0000O(oIi00Iloool);
                }
            }
