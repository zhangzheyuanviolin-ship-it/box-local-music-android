            package p000;
            
/* 14 */    public final class OiIIoOll0Il extends IllegalStateException {
                public final Ii1olII1lO1 I00iOIl;
                public final Throwable I00iiI;
                public final String I00iiO;

                public OiIIoOll0Il(Ii1olII1lO1 ii1olII1lO1, Throwable th, String str, int i) {
/* 12 */            this((i & 1) != 0 ? null : ii1olII1lO1, (i & 2) != 0 ? null : th, str);
                }

                @Override
                public final Throwable getCause() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final String getMessage() {
/* 1 */             return this.I00iiO;
                }

/* 15 */        public OiIIoOll0Il(Ii1olII1lO1 ii1olII1lO1, Throwable th, String str) {
/* 17 */            this.I00iOIl = ii1olII1lO1;
/* 18 */            this.I00iiI = th;
/* 19 */            this.I00iiO = str;
                }
            }
