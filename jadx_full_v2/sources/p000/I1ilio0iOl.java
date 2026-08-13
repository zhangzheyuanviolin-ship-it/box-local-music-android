            package p000;

            import android.util.Range;
            import android.util.Size;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I1ilio0iOl {
                public Olio00O I00000oIO;
                public int I00000oOI;
                public Size I0000Il00O;
                public Iio1oiI I0000O;
                public List I0000oI00;
                public IOlOo1ll1l1 I0001Ioi1lo;
                public int I000II;
                public Range I000O01llI0;
                public boolean I000OOo1O;
                public int I000OiO;

                public static I1ilio0iOl I00000oIO(Olio00O olio00O, int i, Size size, Iio1oiI iio1oiI, List list, IOlOo1ll1l1 iOlOo1ll1l1, int i2, Range range, boolean z, int i3) {
/* 3 */             I1ilio0iOl i1ilio0iOl = new I1ilio0iOl();
/* 6 */             i1ilio0iOl.I00000oIO = olio00O;
/* 8 */             i1ilio0iOl.I00000oOI = i;
/* 10 */            i1ilio0iOl.I0000Il00O = size;
/* 13 */            if (iio1oiI == null) {
/* 43 */                IOOlIIilOl0.I000II("Null dynamicRange");
/* 12 */                return null;
                    }
/* 15 */            i1ilio0iOl.I0000O = iio1oiI;
/* 17 */            i1ilio0iOl.I0000oI00 = list;
/* 19 */            i1ilio0iOl.I0001Ioi1lo = iOlOo1ll1l1;
/* 21 */            i1ilio0iOl.I000II = i2;
/* 23 */            if (range == null) {
/* 37 */                IOOlIIilOl0.I000II("Null targetFrameRate");
/* 12 */                return null;
                    }
/* 25 */            i1ilio0iOl.I000O01llI0 = range;
/* 27 */            i1ilio0iOl.I000OOo1O = z;
/* 29 */            i1ilio0iOl.I000OiO = i3;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            return i1ilio0iOl;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1ilio0iOl) {
/* 10 */                I1ilio0iOl i1ilio0iOl = (I1ilio0iOl) obj;
/* 20 */                if (this.I00000oIO.equals(i1ilio0iOl.I00000oIO) && this.I00000oOI == i1ilio0iOl.I00000oOI && this.I0000Il00O.equals(i1ilio0iOl.I0000Il00O) && this.I0000O.equals(i1ilio0iOl.I0000O) && this.I0000oI00.equals(i1ilio0iOl.I0000oI00)) {
/* 58 */                    IOlOo1ll1l1 iOlOo1ll1l1 = this.I0001Ioi1lo;
/* 60 */                    IOlOo1ll1l1 iOlOo1ll1l12 = i1ilio0iOl.I0001Ioi1lo;
/* 62 */                    if (iOlOo1ll1l1 != null ? iOlOo1ll1l1.equals(iOlOo1ll1l12) : iOlOo1ll1l12 == null) {
/* 77 */                        if (this.I000II == i1ilio0iOl.I000II && this.I000O01llI0.equals(i1ilio0iOl.I000O01llI0) && this.I000OOo1O == i1ilio0iOl.I000OOo1O && this.I000OiO == i1ilio0iOl.I000OiO) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 39 */            int iHashCode = (((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003) ^ this.I0000O.hashCode()) * 1000003) ^ this.I0000oI00.hashCode()) * 1000003;
/* 40 */            IOlOo1ll1l1 iOlOo1ll1l1 = this.I0001Ioi1lo;
/* 77 */            return this.I000OiO ^ ((((((((iHashCode ^ (iOlOo1ll1l1 == null ? 0 : iOlOo1ll1l1.hashCode())) * 1000003) ^ this.I000II) * 1000003) ^ this.I000O01llI0.hashCode()) * 1000003) ^ (this.I000OOo1O ? 1231 : 1237)) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", imageFormat=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", size=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", dynamicRange=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", captureTypes=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", implementationOptions=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", sessionType=");
/* 70 */            sb.append(this.I000II);
/* 75 */            sb.append(", targetFrameRate=");
/* 80 */            sb.append(this.I000O01llI0);
/* 85 */            sb.append(", strictFrameRateRequired=");
/* 90 */            sb.append(this.I000OOo1O);
/* 95 */            sb.append(", customMaxFrameRate=");
/* 102 */           return IIl001iO0Io.I000lI(this.I000OiO, "}", sb);
                }
            }
