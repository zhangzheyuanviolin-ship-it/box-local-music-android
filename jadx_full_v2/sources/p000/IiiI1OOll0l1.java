            package p000;
            
            public final class IiiI1OOll0l1 extends Exception {
                public final Throwable I00iOIl;

                public IiiI1OOll0l1(Throwable th, Ii00lIOoi ii00lIOoi, Ii00l101O ii00l101O) {
/* 23 */            super("Coroutine dispatcher " + ii00lIOoi + " threw an exception, context = " + ii00l101O, th);
/* 26 */            this.I00iOIl = th;
                }

                @Override
                public final Throwable getCause() {
/* 1 */             return this.I00iOIl;
                }
            }
