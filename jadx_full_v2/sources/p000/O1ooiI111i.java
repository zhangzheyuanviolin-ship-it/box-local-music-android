            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public interface O1ooiI111i {
                Object I00000oIO(IlliIl1l11O illiIl1l11O, Object obj);

                boolean I00000oOI(Function1 function1);

                default O1ooiI111i I0000O(O1ooiI111i o1ooiI111i) {
/* 3 */             if (o1ooiI111i == O1ooIo101ll.I00000oIO) {
/* 5 */                 return this;
                    }
/* 8 */             IOOooiIi iOOooiIi = new IOOooiIi();
/* 11 */            iOOooiIi.I00000oIO = this;
/* 13 */            iOOooiIi.I00000oOI = o1ooiI111i;
/* 15 */            VarHandle.storeStoreFence();
/* 29 */            return iOOooiIi;
                }
            }
