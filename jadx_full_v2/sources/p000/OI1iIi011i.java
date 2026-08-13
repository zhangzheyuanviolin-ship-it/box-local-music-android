            package p000;

            import android.os.Bundle;
            import kotlin.jvm.functions.Function1;
            
            public final class OI1iIi011i implements Function1 {
                public final int I00iOIl;
                public Bundle I00iiI;

                @Override
                public final Object invoke(Object obj) {
                    boolean zContainsKey;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Bundle bundle = this.I00iiI;
/* 5 */             String str = (String) obj;
                    switch (i) {
                        case 0:
/* 21 */                    zContainsKey = bundle.containsKey(str);
                            break;
                        default:
/* 10 */                    zContainsKey = bundle.containsKey(str);
                            break;
                    }
/* 16 */            return Boolean.valueOf(!zContainsKey);
                }
            }
