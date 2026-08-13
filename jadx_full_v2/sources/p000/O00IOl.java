            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O00IOl extends O010olO {
                public static final long I00ilO0 = I1Ioolli0l0o.I00000oIO.objectFieldOffset(O00IOl.class.getDeclaredField("_invoked$volatile"));
                public Function1 I00ilI0I1;
                private volatile int _invoked$volatile;

                @Override
                public final boolean I000o00OoI0I() {
/* 1 */             return true;
                }

                @Override
                public final void I000oI1ioi(Throwable th) {
/* 12 */            if (I1Ioolli0l0o.I00000oIO.compareAndSwapInt(this, I00ilO0, 0, 1)) {
/* 16 */                this.I00ilI0I1.invoke(th);
                    }
                }
            }
