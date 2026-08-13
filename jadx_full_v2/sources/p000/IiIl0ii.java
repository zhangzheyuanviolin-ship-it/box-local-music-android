            package p000;
            
            public final class IiIl0ii implements Runnable {
                public final int I00iOIl;
                public Runnable I00iiI;
                public iiOlilo0IIIl I00iiO;

                public IiIl0ii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws Exception {
                    switch (this.I00iOIl) {
                        case 0:
/* 44 */                    Runnable runnable = this.I00iiI;
/* 46 */                    iiOlilo0IIIl iiolilo0iiil = this.I00iiO;
                            try {
/* 48 */                        runnable.run();
/* 51 */                        return;
                            } catch (Exception e) {
/* 57 */                        ((IiIlIiO0) iiolilo0iiil.I00iOIl).I000OiO(e);
/* 60 */                        throw e;
                            }
                        case 1:
/* 27 */                    Runnable runnable2 = this.I00iiI;
/* 29 */                    iiOlilo0IIIl iiolilo0iiil2 = this.I00iiO;
                            try {
/* 31 */                        runnable2.run();
/* 43 */                        return;
                            } catch (Exception e2) {
/* 40 */                        ((IiIlIiO0) iiolilo0iiil2.I00iOIl).I000OiO(e2);
/* 43 */                        return;
                            }
                        default:
/* 6 */                     Runnable runnable3 = this.I00iiI;
/* 12 */                    IiIlIiO0 iiIlIiO0 = (IiIlIiO0) this.I00iiO.I00iOIl;
                            try {
/* 14 */                        runnable3.run();
/* 18 */                        iiIlIiO0.I000OOo1O(null);
/* 26 */                        return;
                            } catch (Exception e3) {
/* 23 */                        iiIlIiO0.I000OiO(e3);
/* 26 */                        return;
                            }
                    }
                }
            }
