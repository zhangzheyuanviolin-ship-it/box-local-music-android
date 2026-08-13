            package p000;
            
            public final class II0o0I1O10ii extends OIoOo11 {
                public final I0oO00o I00ilI0I1;
                public final long I00ilO0;
                public int I00io1l = 1;
                public final long I00ioIO;
                public float I00l0I0l0lO1;
                public IOOil0 I00l0OO0IO;

                public II0o0I1O10ii(I0oO00o i0oO00o, long j) {
                    int i;
/* 4 */             this.I00ilI0I1 = i0oO00o;
/* 6 */             this.I00ilO0 = j;
/* 15 */            int i2 = (int) (j >> 32);
/* 16 */            if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > i0oO00o.I00000oIO.getWidth() || i > i0oO00o.I00000oIO.getHeight()) {
/* 52 */                I000II.I000iOII("Failed requirement.");
/* 106 */               throw null;
                    }
/* 43 */            this.I00ioIO = j;
/* 47 */            this.I00l0I0l0lO1 = 1.0f;
                }

                @Override
                public final void I00000oIO(float f) {
/* 1 */             this.I00l0I0l0lO1 = f;
                }

                @Override
                public final void I0000Il00O(IOOil0 iOOil0) {
/* 1 */             this.I00l0OO0IO = iOOil0;
                }

                @Override
                public final long I000OOo1O() {
/* 3 */             return l000O1l.I00000oOI(this.I00ioIO);
                }

                @Override
                public final void I000OiO(IilloIOOO0i iilloIOOO0i) {
/* 67 */            IilloIOOO0i.I00Ol1ll1(iilloIOOO0i, this.I00ilI0I1, 0L, this.I00ilO0, 0L, (Math.round(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L))) & 4294967295L), this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00io1l, 328);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 6 */             if (!(obj instanceof II0o0I1O10ii)) {
/* 50 */                return false;
                    }
/* 9 */             II0o0I1O10ii iI0o0I1O10ii = (II0o0I1O10ii) obj;
                    return O0000Ioio00.I0000O(this.I00ilI0I1, iI0o0I1O10ii.I00ilI0I1) && IooO0O.I0000Il00O(0L, 0L) && IooOl0ol01.I0000Il00O(this.I00ilO0, iI0o0I1O10ii.I00ilO0) && this.I00io1l == iI0o0I1O10ii.I00io1l;
                }

                public final int hashCode() {
/* 28 */            return Integer.hashCode(this.I00io1l) + IIlIOloOOO.I0000O(this.I00ilO0, IIlIOloOOO.I0000O(0L, this.I00ilI0I1.hashCode() * 31, 31), 31);
                }

                public final String toString() {
/* 3 */             String strI0001Ioi1lo = IooO0O.I0001Ioi1lo(0L);
/* 9 */             String strI0000O = IooOl0ol01.I0000O(this.I00ilO0);
/* 13 */            int i = this.I00io1l;
/* 38 */            String str = i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown";
/* 44 */            StringBuilder sb = new StringBuilder("BitmapPainter(image=");
/* 49 */            sb.append(this.I00ilI0I1);
/* 54 */            sb.append(", srcOffset=");
/* 57 */            sb.append(strI0001Ioi1lo);
/* 62 */            sb.append(", srcSize=");
/* 69 */            return IIl001iO0Io.I00100o1O0lo(sb, strI0000O, ", filterQuality=", str, ")");
                }
            }
