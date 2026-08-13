            package p000;

            import android.graphics.Rect;
            
/* 41 */    public final class II1i0o0 {
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;

                static {
/* 4 */             new II1i0o0(0, 0, 0, 0);
                }

                public II1i0o0(int i, int i2, int i3, int i4) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = i3;
/* 10 */            this.I0000O = i4;
/* 12 */            if (i > i3) {
/* 38 */                I000II.I0010I0i(IIl001iO0Io.I000l1(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
/* 204 */               throw null;
                    }
/* 14 */            if (i2 <= i4) {
/* 16 */                return;
                    }
/* 25 */            I000II.I0010I0i(IIl001iO0Io.I000l1(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
/* 29 */            throw null;
                }

                public final int I00000oIO() {
/* 5 */             return this.I0000O - this.I00000oOI;
                }

                public final int I00000oOI() {
/* 5 */             return this.I0000Il00O - this.I00000oIO;
                }

                public final Rect I0000Il00O() {
/* 11 */            return new Rect(this.I00000oIO, this.I00000oOI, this.I0000Il00O, this.I0000O);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!II1i0o0.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            II1i0o0 iI1i0o0 = (II1i0o0) obj;
                    return this.I00000oIO == iI1i0o0.I00000oIO && this.I00000oOI == iI1i0o0.I00000oOI && this.I0000Il00O == iI1i0o0.I0000Il00O && this.I0000O == iI1i0o0.I0000O;
                }

                public final int hashCode() {
/* 17 */            return (((((this.I00000oIO * 31) + this.I00000oOI) * 31) + this.I0000Il00O) * 31) + this.I0000O;
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder(II1i0o0.class.getSimpleName());
/* 14 */            sb.append(" { [");
/* 19 */            sb.append(this.I00000oIO);
/* 24 */            sb.append(',');
/* 29 */            sb.append(this.I00000oOI);
/* 32 */            sb.append(',');
/* 37 */            sb.append(this.I0000Il00O);
/* 40 */            sb.append(',');
/* 47 */            return IIl001iO0Io.I000lI(this.I0000O, "] }", sb);
                }

/* 42 */        public II1i0o0(Rect rect) {
/* 43 */            this(rect.left, rect.top, rect.right, rect.bottom);
                }
            }
