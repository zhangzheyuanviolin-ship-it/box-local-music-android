            package p000;

            import java.util.ArrayList;
            
            public final class IiiO11O extends O1ooOo implements Iillo1il11l {
                public O0li0o I00o0iI0io1;

                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
/* 1 */             IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 5 */             ArrayList arrayList = this.I00o0iI0io1.I000OOo1O;
/* 7 */             int size = arrayList.size();
/* 12 */            for (int i = 0; i < size; i++) {
/* 18 */                O0lOll0I0o00 o0lOll0I0o00 = (O0lOll0I0o00) arrayList.get(i);
/* 20 */                Io10IOI io10IOI = o0lOll0I0o00.I000oI1ioi;
/* 22 */                if (io10IOI != null) {
/* 25 */                    long j = o0lOll0I0o00.I000lI;
/* 41 */                    long j2 = io10IOI.I00111O;
/* 47 */                    float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
/* 51 */                    float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
/* 58 */                    ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(f, f2);
                            try {
/* 61 */                        illII1oO.I00000oIO(o0iiliOio, io10IOI);
                            } finally {
/* 87 */                        ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(-f, -f2);
                            }
                        }
                    }
/* 91 */            o0iiliOio.I00000oOI();
                }

                @Override
                public final void I010101Oo1lO() {
/* 3 */             this.I00o0iI0io1.I000OiO = this;
                }

                @Override
                public final void I010I0() {
/* 1 */             O0li0o o0li0o = this.I00o0iI0io1;
/* 3 */             o0li0o.I0000oI00();
/* 7 */             o0li0o.I00000oOI = null;
/* 10 */            o0li0o.I0000Il00O = -1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IiiO11O) && O0000Ioio00.I0000O(this.I00o0iI0io1, ((IiiO11O) obj).I00o0iI0io1);
                }

                public final int hashCode() {
/* 3 */             return this.I00o0iI0io1.hashCode();
                }

                public final String toString() {
/* 18 */            return "DisplayingDisappearingItemsNode(animator=" + this.I00o0iI0io1 + ")";
                }
            }
