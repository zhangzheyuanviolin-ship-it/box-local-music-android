            package p000;

            import java.io.Closeable;
            
            public final class i1iIO0I1I00 implements Closeable {
                public static final I0OiiiO I00iiI = new I0OiiiO(13);
                public int I00iOIl;

                @Override
                public final void close() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i > 0) {
/* 7 */                 this.I00iOIl = i - 1;
                    } else {
/* 12 */                I000II.I000O01llI0("Mismatched calls to RecursionDepth (possible error in core library)");
                    }
                }
            }
