            package p000;
            
/* 10 */    public final class O1o01iO0liI0 extends Exception {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1o01iO0liI0(String str, int i) {
/* 6 */             super(str);
/* 3 */             lII0I0I000I.I0000oI00(str, "Provided message must not be empty.");
/* 9 */             this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public O1o01iO0liI0(int i, Exception exc, String str) {
                    super(str, exc);
/* 12 */            lII0I0I000I.I0000oI00(str, "Provided message must not be empty.");
                    this.I00iOIl = i;
                }
            }
