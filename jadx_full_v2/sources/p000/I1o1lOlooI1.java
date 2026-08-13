            package p000;
            
/* 12 */    public final class I1o1lOlooI1 extends Exception {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1o1lOlooI1(String str) {
/* 10 */            super("Bad Content-Type format: ".concat(str));
/* 2 */             this.I00iOIl = 0;
                }

                @Override
                public Throwable fillInStackTrace() {
                    switch (this.I00iOIl) {
                        case 11:
                        case 14:
/* 10 */                    return this;
                        default:
/* 6 */                     return super.fillInStackTrace();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public I1o1lOlooI1(String str, int i) {
                    super(str);
/* 14 */            this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public I1o1lOlooI1(String str, Throwable th, int i) {
                    super(str, th);
/* 15 */            this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public I1o1lOlooI1(Throwable th) {
                    super(th);
/* 16 */            this.I00iOIl = 4;
                }
            }
