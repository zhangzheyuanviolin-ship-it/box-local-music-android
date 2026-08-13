            package p000;

            import kotlin.jvm.functions.Function1;
            
            public interface O1ooIoIolOli extends O1ooiI111i {
                @Override
                default Object I00000oIO(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                default boolean I00000oOI(Function1 function1) {
/* 7 */             return ((Boolean) function1.invoke(this)).booleanValue();
                }
            }
