            package p000;

            import android.util.Log;
            
/* 18 */    public final class IIoo0Io1I implements Oi01Ooii1Ol, Io0o0l0i1Il {
                public long I00iOIl;
                public I1OooI1 I00iiI;
                public Io0oO1OiI I00iiO;

                @Override
                public final void I00000oIO() {
                    long j;
/* 1 */             I1OooI1 i1OooI1 = this.I00iiI;
/* 20 */            do {
/* 3 */                 j = i1OooI1.I00000oIO;
/* 20 */            } while (!I1OooI1.I00000oOI.compareAndSet(i1OooI1, j, j != -1 ? 0L : -1L));
/* 25 */            this.I00iiO.I00IioO0OiOi(false);
/* 61 */            Log.w("CXCP", "Capture processing has been disabled for " + this.I00iiO + " until " + this.I00iOIl + " frames have been completed.");
                }

                @Override
                public final void I00000oOI() {
/* 5 */             this.I00iiI.I00000oIO = -1L;
/* 10 */            this.I00iiO.I00IioO0OiOi(false);
                }

                @Override
                public final void I00OIl(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
                    long j2;
                    long j3;
/* 1 */             I1OooI1 i1OooI1 = this.I00iiI;
/* 23 */            do {
/* 3 */                 j2 = i1OooI1.I00000oIO;
/* 15 */                j3 = j2 != -1 ? 1 + j2 : -1L;
/* 23 */            } while (!I1OooI1.I00000oOI.compareAndSet(i1OooI1, j2, j3));
/* 29 */            if (j3 == this.I00iOIl) {
/* 62 */                Log.w("CXCP", "Capture processing is now enabled for " + this.I00iiO + " after " + j3 + " frames.");
/* 68 */                this.I00iiO.I00IioO0OiOi(true);
                    }
                }

                @Override
/* 19 */        public final void I0000O() {
                }
            }
