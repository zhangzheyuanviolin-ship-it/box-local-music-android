            package p000;

            import java.io.Closeable;
            import java.util.zip.Inflater;
            
/* 8 */     public final class OOll1l0ll implements Closeable {
                public final int I00iOIl = 1;
                public Object I00iiI;

                public OOll1l0ll(Iii1oi1l1II iii1oi1l1II) {
/* 7 */             this.I00iiI = iii1oi1l1II;
                }

                @Override
                public final void close() {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((Iii1oi1l1II) this.I00iiI).close();
                            break;
                        default:
/* 10 */                    ((Inflater) this.I00iiI).end();
                            break;
                    }
                }

/* 9 */         public OOll1l0ll() {
                }
            }
