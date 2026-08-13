            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class Oo11Oo extends CancellationException implements IOollIi1OO0I {
                public final transient O010OIi I00iOIl;

                public Oo11Oo(String str, O010OIi o010OIi) {
/* 1 */             super(str);
/* 4 */             this.I00iOIl = o010OIi;
                }

                @Override
                public final Throwable I00000oIO() {
/* 3 */             String message = getMessage();
/* 7 */             if (message == null) {
/* 9 */                 message = "";
                    }
/* 13 */            Oo11Oo oo11Oo = new Oo11Oo(message, this.I00iOIl);
/* 16 */            oo11Oo.initCause(this);
/* 29 */            return oo11Oo;
                }
            }
