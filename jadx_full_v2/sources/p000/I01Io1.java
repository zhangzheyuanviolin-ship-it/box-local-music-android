            package p000;

            import java.util.Collection;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I01Io1 implements Function1 {
                public final int I00iOIl;
                public Collection I00iiI;

                @Override
                public final Object invoke(Object obj) {
                    boolean zContains;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Collection<?> collection = this.I00iiI;
                    switch (i) {
                        case 0:
/* 24 */                    zContains = collection.contains(obj);
                            break;
                        case 1:
/* 19 */                    zContains = collection.contains(obj);
                            break;
                        default:
/* 10 */                    zContains = ((List) obj).retainAll(collection);
                            break;
                    }
/* 14 */            return Boolean.valueOf(zContains);
                }
            }
