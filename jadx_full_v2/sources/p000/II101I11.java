            package p000;

            import java.util.concurrent.locks.LockSupport;
            
            public final class II101I11 extends I010101Oo1lO {
                public Thread I00ilI0I1;

                @Override
                public final void I00100o1O0lo(Object obj) {
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 5 */             Thread thread = this.I00ilI0I1;
/* 11 */            if (O0000Ioio00.I0000O(threadCurrentThread, thread)) {
/* 49 */                return;
                    }
/* 13 */            LockSupport.unpark(thread);
                }
            }
