            package p000;
            
/* 6 */     public abstract class i0Oi011IO0 implements Runnable {
                public final OloIlI0ll I00iOIl;

                public i0Oi011IO0() {
/* 5 */             this.I00iOIl = null;
                }

                public abstract void I00000oIO();

                @Override
                public final void run() {
                    try {
/* 1 */                 I00000oIO();
                    } catch (Exception e) {
/* 6 */                 OloIlI0ll oloIlI0ll = this.I00iOIl;
/* 8 */                 if (oloIlI0ll != null) {
/* 10 */                    oloIlI0ll.I0000Il00O(e);
                        }
                    }
                }

/* 7 */         public i0Oi011IO0(OloIlI0ll oloIlI0ll) {
                    this.I00iOIl = oloIlI0ll;
                }
            }
