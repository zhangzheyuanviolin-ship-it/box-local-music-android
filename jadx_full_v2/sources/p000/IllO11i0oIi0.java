            package p000;
            
            public final class IllO11i0oIi0 extends RuntimeException {
                public final IllO1ooiO I00iOIl;
                public final Throwable I00iiI;

                public IllO11i0oIi0(IllO1ooiO illO1ooiO, Throwable th) {
/* 1 */             super(th);
/* 4 */             this.I00iOIl = illO1ooiO;
/* 6 */             this.I00iiI = th;
                }

                @Override
                public final Throwable getCause() {
/* 1 */             return this.I00iiI;
                }
            }
