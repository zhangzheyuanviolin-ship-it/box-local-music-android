            package p000;

            import android.view.KeyEvent;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class O0O1loIl extends O1ooOo implements O0O1ll1l1o10 {
                public Function1 I00o0iI0io1;
                public Function1 I00o0l1o1o0;

                @Override
                public final boolean I000OOo1O(KeyEvent keyEvent) {
/* 1 */             Function1 function1 = this.I00o0l1o1o0;
/* 3 */             if (function1 == null) {
/* 26 */                return false;
                    }
/* 7 */             O0O1l0ilO o0O1l0ilO = new O0O1l0ilO();
/* 10 */            o0O1l0ilO.I00000oIO = keyEvent;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return ((Boolean) function1.invoke(o0O1l0ilO)).booleanValue();
                }

                @Override
                public final boolean I00II0oii1o(KeyEvent keyEvent) {
/* 1 */             Function1 function1 = this.I00o0iI0io1;
/* 3 */             if (function1 == null) {
/* 26 */                return false;
                    }
/* 7 */             O0O1l0ilO o0O1l0ilO = new O0O1l0ilO();
/* 10 */            o0O1l0ilO.I00000oIO = keyEvent;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return ((Boolean) function1.invoke(o0O1l0ilO)).booleanValue();
                }
            }
