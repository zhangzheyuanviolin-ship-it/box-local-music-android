            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function1;
            
            public final class O1I00llOi extends I1ooIoloo0 {
                public final int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1I00llOi(O1I0OloI o1I0OloI, ConcurrentHashMap concurrentHashMap, Function1 function1, int i) {
/* 3 */             super(o1I0OloI, concurrentHashMap, function1);
/* 1 */             this.I00ilI0I1 = i;
                }

                public Object I000II(Object obj, IllOOo00lI illOOo00lI) throws Throwable {
/* 3 */             O1I00oo o1I00oo = new O1I00oo();
/* 6 */             o1I00oo.I00000oIO = obj;
/* 8 */             o1I00oo.I00000oOI = illOOo00lI;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            Object objInvoke = invoke(o1I00oo);
/* 17 */            if (objInvoke != null) {
/* 19 */                return objInvoke;
                    }
/* 89 */            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction", "computeIfAbsent"));
                }

                @Override
                public Object invoke(Object obj) throws Throwable {
                    switch (this.I00ilI0I1) {
                        case 1:
/* 11 */                    Object objInvoke = super.invoke(obj);
/* 15 */                    if (objInvoke != null) {
/* 17 */                        return objInvoke;
                            }
/* 42 */                    throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
                        default:
/* 6 */                     return super.invoke(obj);
                    }
                }
            }
