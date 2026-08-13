            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O00IOlo0IoO extends O010olO {
                public final Function1 I00ilI0I1;

                public O00IOlo0IoO(Function1 function1) {
/* 4 */             this.I00ilI0I1 = function1;
                }

                @Override
                public final boolean I000o00OoI0I() {
/* 1 */             return false;
                }

                @Override
                public final void I000oI1ioi(Throwable th) {
/* 3 */             this.I00ilI0I1.invoke(th);
                }
            }
