            package p000;

            import java.io.IOException;
            
            public abstract class Ill010O1l1 implements OlI1ii {
                public final OlI1ii I00iOIl;

                public Ill010O1l1(OlI1ii olI1ii) {
/* 4 */             this.I00iOIl = olI1ii;
                }

                @Override
                public void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final Oo11IoI timeout() {
/* 3 */             return this.I00iOIl.timeout();
                }

                public final String toString() {
/* 29 */            return getClass().getSimpleName() + '(' + this.I00iOIl + ')';
                }
            }
