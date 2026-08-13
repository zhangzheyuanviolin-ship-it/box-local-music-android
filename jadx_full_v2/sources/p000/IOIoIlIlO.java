            package p000;
            
/* 33 */    public class IOIoIlIlO extends IllegalStateException {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOIoIlIlO(Ii1olII1lO1 ii1olII1lO1, String str) {
/* 31 */            super("Bad response: " + ii1olII1lO1 + ". Text: \"" + str + '\"');
/* 2 */             this.I00iOIl = 6;
                }

                @Override
                public Throwable getCause() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return null;
                        default:
/* 6 */                     return super.getCause();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 34 */        public IOIoIlIlO(String str, Throwable th, int i) {
                    super(str, th);
/* 35 */            this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 35 */        public IOIoIlIlO(String str, int i) {
                    super(str);
/* 36 */            this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 36 */        public IOIoIlIlO(String str, Throwable th) {
/* 39 */            super(IlIi0I0.I000lI("Concurrent ", str, " attempts"), th);
                    this.I00iOIl = 2;
                }
            }
