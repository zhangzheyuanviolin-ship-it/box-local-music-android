            package p000;
            
/* 47 */    public final class IOiII1I implements IOoil1iiIilo {
                public static final IOiII1I I00iiI = new IOiII1I(0);
                public static final IOiII1I I00iiO = new IOiII1I(1);
                public final int I00iOIl;

                public IOiII1I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Il00o11 il00o11 = Il00o11.I00iOIl;
                    switch (i) {
                        case 0:
/* 16 */                    throw new IllegalStateException("This continuation is already complete");
                        case 1:
                        default:
/* 8 */                     return il00o11;
                    }
                }

                @Override
                public final void resumeWith(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 14 */                    throw new IllegalStateException("This continuation is already complete");
                        case 1:
                        default:
/* 6 */                     return;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return "This continuation is already complete";
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 48 */        private final void I00000oIO(Object obj) {
                }

/* 48 */        private final void I00000oOI(Object obj) {
                }
            }
