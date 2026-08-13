            package p000;
            
            public final class OIoiIo0o1O {
                public I0oilIol11i I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public float I0001Ioi1lo;
                public float I000II;

                public final OOo0IO I00000oIO(OOo0IO oOo0IO) {
/* 1 */             float f = this.I0001Ioi1lo;
/* 24 */            return oOo0IO.I000OiO((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                }

                public final long I00000oOI(long j, boolean z) {
/* 1 */             if (z) {
/* 3 */                 long j2 = Oo0lI00l.I00000oOI;
/* 9 */                 if (Oo0lI00l.I0000Il00O(j, j2)) {
/* 11 */                    return j2;
                        }
                    }
/* 12 */            int i = Oo0lI00l.I0000Il00O;
/* 19 */            int i2 = this.I00000oOI;
/* 30 */            return lOliOi0Oi.I00000oIO(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
                }

                public final OOo0IO I0000Il00O(OOo0IO oOo0IO) {
/* 3 */             float f = -this.I0001Ioi1lo;
/* 25 */            return oOo0IO.I000OiO((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                }

                public final int I0000O(int i) {
/* 1 */             int i2 = this.I00000oOI;
/* 9 */             return lIiioliIlo.I0000Il00O(i, i2, this.I0000Il00O) - i2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 69 */                return true;
                    }
/* 7 */             if (obj instanceof OIoiIo0o1O) {
/* 10 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) obj;
/* 16 */                if (this.I00000oIO == oIoiIo0o1O.I00000oIO && this.I00000oOI == oIoiIo0o1O.I00000oOI && this.I0000Il00O == oIoiIo0o1O.I0000Il00O && this.I0000O == oIoiIo0o1O.I0000O && this.I0000oI00 == oIoiIo0o1O.I0000oI00 && Float.compare(this.I0001Ioi1lo, oIoiIo0o1O.I0001Ioi1lo) == 0 && Float.compare(this.I000II, oIoiIo0o1O.I000II) == 0) {
/* 69 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 46 */            return Float.hashCode(this.I000II) + OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.I0000oI00, IIl001iO0Io.I0000O(this.I0000O, IIl001iO0Io.I0000O(this.I0000Il00O, IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31), 31), 31), 31, this.I0001Ioi1lo);
                }

                public final String toString() {
/* 1 */             I0oilIol11i i0oilIol11i = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 5 */             int i2 = this.I0000Il00O;
/* 7 */             int i3 = this.I0000O;
/* 9 */             int i4 = this.I0000oI00;
/* 11 */            float f = this.I0001Ioi1lo;
/* 13 */            float f2 = this.I000II;
/* 19 */            StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
/* 22 */            sb.append(i0oilIol11i);
/* 27 */            sb.append(", startIndex=");
/* 30 */            sb.append(i);
/* 35 */            sb.append(", endIndex=");
/* 38 */            sb.append(i2);
/* 43 */            sb.append(", startLineIndex=");
/* 46 */            sb.append(i3);
/* 51 */            sb.append(", endLineIndex=");
/* 54 */            sb.append(i4);
/* 59 */            sb.append(", top=");
/* 62 */            sb.append(f);
/* 67 */            sb.append(", bottom=");
/* 72 */            return Oi010OO0.I001i1O0Ol(sb, f2, ")");
                }
            }
