            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class IiI01I implements OII1lIlol {
                public OIoIoIO0oI1O I00iOIl;
                public O0iOOoiioO I00iiI;

                @Override
                public final Object I001lllioOl(long j, long j2, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             OIilII oIilII = OIilII.I00iOIl;
/* 3 */             OIilII oIilII2 = OIilII.I00iOIl;
/* 11 */            return OooIOilolOo.I00000oIO(OooIOilolOo.I00000oOI(j2, 0.0f, 0.0f, 1));
                }

                @Override
                public final long I00IoIO0lI(int i, long j) {
/* 1 */             OIilII oIilII = OIilII.I00iOIl;
/* 3 */             OIoIoIO0oI1O oIoIoIO0oI1O = this.I00iOIl;
/* 6 */             if (i != 1 || Math.abs(oIoIoIO0oI1O.I000l1()) <= 1.0E-6d) {
/* 145 */               return 0L;
                    }
/* 30 */            int i2 = (int) (j >> 32);
/* 42 */            if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
/* 145 */               return 0L;
                    }
/* 44 */            OIoI1lIli oIoI1lIliI000lI = oIoIoIO0oI1O.I000lI();
/* 57 */            float fI000l1 = oIoIoIO0oI1O.I000l1() * oIoIoIO0oI1O.I000oI1ioi();
/* 74 */            float f = ((oIoI1lIliI000lI.I00000oOI + oIoI1lIliI000lI.I0000Il00O) * (-Math.signum(oIoIoIO0oI1O.I000l1()))) + fI000l1;
/* 81 */            if (oIoIoIO0oI1O.I000l1() > 0.0f) {
/* 84 */                fI000l1 = f;
/* 85 */                f = fI000l1;
                    }
/* 90 */            float fI00000oOI = lIiioliIlo.I00000oOI(Float.intBitsToFloat(i2), fI000l1, f);
/* 98 */            boolean z = this.I00iiI == O0iOOoiioO.I00iiI;
/* 102 */           IiI11iIOlOo1 iiI11iIOlOo1 = oIoIoIO0oI1O.I000iOII;
/* 116 */           float fI0000oI00 = z ? iiI11iIOlOo1.I0000oI00(fI00000oOI) : -iiI11iIOlOo1.I0000oI00(-fI00000oOI);
/* 117 */           OIilII oIilII2 = OIilII.I00iOIl;
/* 143 */           return (Float.floatToRawIntBits(fI0000oI00) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L);
                }

                @Override
                public final long I00ioIO(int i, long j, long j2) {
/* 2 */             if (i != 2) {
/* 29 */                return 0L;
                    }
/* 4 */             OIilII oIilII = OIilII.I00iOIl;
/* 18 */            if (Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
/* 29 */                return 0L;
                    }
/* 28 */            throw new CancellationException("Scroll cancelled");
                }
            }
