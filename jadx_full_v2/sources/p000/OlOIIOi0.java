            package p000;

            import java.util.Set;
            
            public final class OlOIIOi0 implements Runnable {
                public final OOIo1i0 I00iOIl;
                public final OlO0000lIOII I00iiI;
                public final boolean I00iiO;
                public final int I00iio;

                public OlOIIOi0(OOIo1i0 oOIo1i0, OlO0000lIOII olO0000lIOII, boolean z, int i) {
/* 4 */             this.I00iOIl = oOIo1i0;
/* 6 */             this.I00iiI = olO0000lIOII;
/* 8 */             this.I00iiO = z;
/* 10 */            this.I00iio = i;
                }

                @Override
                public final void run() {
                    i01ilO i01iloI00000oOI;
/* 1 */             boolean z = this.I00iiO;
/* 3 */             OOIo1i0 oOIo1i0 = this.I00iOIl;
/* 5 */             OlO0000lIOII olO0000lIOII = this.I00iiI;
/* 7 */             if (z) {
/* 9 */                 int i = this.I00iio;
/* 11 */                oOIo1i0.getClass();
/* 16 */                String str = olO0000lIOII.I00000oIO.I00000oIO;
                        synchronized (oOIo1i0.I000iOII) {
/* 21 */                    i01iloI00000oOI = oOIo1i0.I00000oOI(str);
                        }
/* 26 */                OOIo1i0.I0000O(i01iloI00000oOI, i);
                    } else {
/* 33 */                int i2 = this.I00iio;
/* 35 */                oOIo1i0.getClass();
/* 40 */                String str2 = olO0000lIOII.I00000oIO.I00000oIO;
                        synchronized (oOIo1i0.I000iOII) {
                            try {
/* 51 */                        if (oOIo1i0.I0001Ioi1lo.get(str2) != null) {
/* 57 */                            IIi0oIl.I000II().getClass();
                                } else {
/* 70 */                            Set set = (Set) oOIo1i0.I000O01llI0.get(str2);
/* 72 */                            if (set != null && set.contains(olO0000lIOII)) {
/* 86 */                                OOIo1i0.I0000O(oOIo1i0.I00000oOI(str2), i2);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
/* 91 */            IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 97 */            IIi0oIl.I000OiO("StopWorkRunnable");
/* 104 */           String str3 = this.I00iiI.I00000oIO.I00000oIO;
/* 106 */           iIi0oIlI000II.getClass();
                }
            }
