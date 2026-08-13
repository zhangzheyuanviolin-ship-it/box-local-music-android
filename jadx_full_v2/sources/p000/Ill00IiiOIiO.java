            package p000;
            
            public abstract class Ill00IiiOIiO implements Ol0i0olI {
                private final Ol0i0olI delegate;

                public Ill00IiiOIiO(Ol0i0olI ol0i0olI) {
/* 4 */             this.delegate = ol0i0olI;
                }

                @IiO0I1oi0
                public final Ol0i0olI m32deprecated_delegate() {
/* 1 */             return this.delegate;
                }

                @Override
                public void close() {
/* 3 */             this.delegate.close();
                }

                public final Ol0i0olI delegate() {
/* 1 */             return this.delegate;
                }

                @Override
                public void flush() {
/* 3 */             this.delegate.flush();
                }

                @Override
                public Oo11IoI timeout() {
/* 3 */             return this.delegate.timeout();
                }

                public String toString() {
/* 29 */            return getClass().getSimpleName() + '(' + this.delegate + ')';
                }

                @Override
                public void write(III1o0lOio0 iII1o0lOio0, long j) {
/* 3 */             this.delegate.write(iII1o0lOio0, j);
                }
            }
