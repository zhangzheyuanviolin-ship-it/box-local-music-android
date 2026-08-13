            package p000;

            import java.io.Closeable;
            
            public final class Iii1oi1l1II implements Closeable {
                public Iii1lol I00iOIl;
                public boolean I00iiI;
                public IiiI0l01O I00iiO;

                @Override
                public final void close() {
/* 3 */             if (this.I00iiI) {
/* 55 */                return;
                    }
/* 6 */             this.I00iiI = true;
/* 8 */             IiiI0l01O iiiI0l01O = this.I00iiO;
                    synchronized (iiiI0l01O) {
/* 11 */                Iii1lol iii1lol = this.I00iOIl;
                        int i = iii1lol.I000O01llI0 - 1;
/* 17 */                iii1lol.I000O01llI0 = i;
/* 19 */                if (i == 0 && iii1lol.I0001Ioi1lo) {
/* 25 */                    OOoiliiIoloI oOoiliiIoloI = IiiI0l01O.I00o101lO;
/* 27 */                    iiiI0l01O.I00IOO(iii1lol);
                        }
                    }
                }
            }
