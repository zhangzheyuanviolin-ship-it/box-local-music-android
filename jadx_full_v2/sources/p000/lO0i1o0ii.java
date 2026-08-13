            package p000;

            import android.os.Bundle;
            
            public abstract class lO0i1o0ii {
                public static final int I00000oIO(String str, Bundle bundle) {
/* 3 */             int i = bundle.getInt(str, Integer.MIN_VALUE);
/* 7 */             if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
/* 37 */                return i;
                    }
/* 19 */            lO0iIII0.I00000oIO(str);
/* 23 */            throw null;
                }

                public static final boolean I00000oOI(String str, Bundle bundle) {
                    return bundle.containsKey(str) && bundle.get(str) == null;
                }
            }
