            package p000;

            import java.util.Arrays;
            import java.util.List;
            
            public final class Ii1loIll001 {
                public final List I00000oIO;
                public final float[] I00000oOI;
                public final int I0000Il00O;

                public Ii1loIll001(List list, float[] fArr) {
/* 4 */             this.I00000oIO = list;
/* 6 */             this.I00000oOI = fArr;
/* 13 */            if (list.size() != fArr.length) {
/* 42 */                Ioll0IliO1l.I00000oIO("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + I1IoiO1l.I00IO1oi11O(fArr));
                    }
/* 46 */            this.I0000Il00O = fArr.length;
                }

                public final Object I00000oIO(float f) {
/* 1 */             float[] fArr = this.I00000oOI;
/* 3 */             int length = fArr.length;
/* 5 */             float f2 = Float.POSITIVE_INFINITY;
/* 7 */             int i = 0;
/* 8 */             int i2 = -1;
/* 9 */             int i3 = 0;
/* 10 */            while (i < length) {
/* 14 */                int i4 = i3 + 1;
/* 18 */                float fAbs = Math.abs(f - fArr[i]);
/* 24 */                if (fAbs <= f2) {
/* 26 */                    i2 = i3;
/* 27 */                    f2 = fAbs;
                        }
/* 28 */                i++;
/* 30 */                i3 = i4;
                    }
/* 32 */            if (i2 == -1) {
/* 34 */                return null;
                    }
/* 38 */            return this.I00000oIO.get(i2);
                }

                public final Object I00000oOI(float f, boolean z) {
/* 1 */             float[] fArr = this.I00000oOI;
/* 3 */             int length = fArr.length;
/* 7 */             int i = 0;
/* 8 */             int i2 = -1;
/* 9 */             float f2 = Float.POSITIVE_INFINITY;
/* 10 */            int i3 = 0;
/* 11 */            while (i < length) {
/* 13 */                float f3 = fArr[i];
/* 15 */                int i4 = i3 + 1;
/* 21 */                float f4 = z ? f3 - f : f - f3;
/* 26 */                if (f4 < 0.0f) {
/* 28 */                    f4 = Float.POSITIVE_INFINITY;
                        }
/* 31 */                if (f4 <= f2) {
/* 33 */                    i2 = i3;
/* 34 */                    f2 = f4;
                        }
/* 35 */                i++;
/* 37 */                i3 = i4;
                    }
/* 39 */            if (i2 == -1) {
/* 41 */                return null;
                    }
/* 45 */            return this.I00000oIO.get(i2);
                }

                public final boolean I0000Il00O(Object obj) {
                    return this.I00000oIO.indexOf(obj) != -1;
                }

                public final float I0000O() {
/* 1 */             float[] fArr = this.I00000oOI;
/* 4 */             if (fArr.length == 0) {
/* 6 */                 return Float.NaN;
                    }
/* 10 */            float fMax = fArr[0];
/* 13 */            int i = 1;
/* 14 */            int length = fArr.length - 1;
/* 15 */            if (1 <= length) {
                        while (true) {
/* 19 */                    fMax = Math.max(fMax, fArr[i]);
/* 23 */                    if (i == length) {
                                break;
                            }
/* 25 */                    i++;
                        }
                    }
/* 55 */            return fMax;
                }

                public final float I0000oI00() {
/* 1 */             float[] fArr = this.I00000oOI;
/* 4 */             if (fArr.length == 0) {
/* 6 */                 return Float.NaN;
                    }
/* 10 */            float fMin = fArr[0];
/* 13 */            int i = 1;
/* 14 */            int length = fArr.length - 1;
/* 15 */            if (1 <= length) {
                        while (true) {
/* 19 */                    fMin = Math.min(fMin, fArr[i]);
/* 23 */                    if (i == length) {
                                break;
                            }
/* 25 */                    i++;
                        }
                    }
/* 55 */            return fMin;
                }

                public final float I0001Ioi1lo(Object obj) {
/* 3 */             int iIndexOf = this.I00000oIO.indexOf(obj);
/* 7 */             I01OoIoio00O i01OoIoio00O = I0l0lIoOIoIi.I00000oOI;
/* 9 */             if (iIndexOf >= 0) {
/* 11 */                float[] fArr = this.I00000oOI;
/* 14 */                if (iIndexOf < fArr.length) {
/* 16 */                    return fArr[iIndexOf];
                        }
                    }
/* 23 */            i01OoIoio00O.invoke(Integer.valueOf(iIndexOf));
/* 26 */            return Float.NaN;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ii1loIll001)) {
/* 39 */                return false;
                    }
/* 9 */             Ii1loIll001 ii1loIll001 = (Ii1loIll001) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ii1loIll001.I00000oIO) && Arrays.equals(this.I00000oOI, ii1loIll001.I00000oOI) && this.I0000Il00O == ii1loIll001.I0000Il00O;
                }

                public final int hashCode() {
/* 20 */            return ((Arrays.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31)) * 31) + this.I0000Il00O;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    float f;
/* 5 */             StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 int i2 = this.I0000Il00O;
/* 11 */                if (i >= i2) {
/* 77 */                    sb.append("})");
/* 80 */                    return sb.toString();
                        }
/* 15 */                Object objI00II0oii1o = IOOi0Ool1i.I00II0oii1o(i, this.I00000oIO);
/* 19 */                I01OoIoio00O i01OoIoio00O = I0l0lIoOIoIi.I00000oOI;
/* 21 */                if (i >= 0) {
/* 23 */                    float[] fArr = this.I00000oOI;
/* 26 */                    if (i < fArr.length) {
/* 28 */                        f = fArr[i];
                            } else {
/* 35 */                        i01OoIoio00O.invoke(Integer.valueOf(i));
/* 38 */                        f = Float.NaN;
                            }
                        }
/* 60 */                sb.append(objI00II0oii1o + "=" + f);
/* 65 */                if (i < i2 - 1) {
/* 69 */                    sb.append(", ");
                        }
/* 72 */                i++;
                    }
                }
            }
