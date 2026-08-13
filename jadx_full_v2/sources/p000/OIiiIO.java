            package p000;
            
            public class OIiiIO extends Exception {
                public final Exception I00iOIl;

                public OIiiIO(String str, Exception exc) {
/* 1 */             super(str);
/* 4 */             this.I00iOIl = exc;
                }

                @Override
                public final Throwable getCause() {
/* 1 */             return this.I00iOIl;
                }
            }
