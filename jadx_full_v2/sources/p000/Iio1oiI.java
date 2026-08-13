            package p000;
            
            public final class Iio1oiI {
                public static final Iio1oiI I0000Il00O = new Iio1oiI(0, 0);
                public static final Iio1oiI I0000O = new Iio1oiI(1, 8);
                public static final Iio1oiI I0000oI00 = new Iio1oiI(3, 10);
                public static final Iio1oiI I0001Ioi1lo = new Iio1oiI(4, 10);
                public static final Iio1oiI I000II = new Iio1oiI(5, 10);
                public static final Iio1oiI I000O01llI0 = new Iio1oiI(6, 10);
                public static final Iio1oiI I000OOo1O = new Iio1oiI(6, 8);
                public final int I00000oIO;
                public final int I00000oOI;

                public Iio1oiI(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
                }

                public final boolean I00000oIO() {
                    return I00000oOI() && this.I00000oIO != 1 && this.I00000oOI == 10;
                }

                public final boolean I00000oOI() {
/* 1 */             int i = this.I00000oIO;
                    return (i == 0 || i == 2 || this.I00000oOI == 0) ? false : true;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof Iio1oiI) {
/* 10 */                Iio1oiI iio1oiI = (Iio1oiI) obj;
/* 16 */                if (this.I00000oIO == iio1oiI.I00000oIO && this.I00000oOI == iio1oiI.I00000oOI) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oOI ^ ((this.I00000oIO ^ 1000003) * 1000003);
                }

                public final String toString() {
                    String str;
/* 5 */             StringBuilder sb = new StringBuilder("DynamicRange@");
/* 16 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */            sb.append("{encoding=");
                    switch (this.I00000oIO) {
                        case 0:
/* 50 */                    str = "UNSPECIFIED";
                            break;
                        case 1:
/* 47 */                    str = "SDR";
                            break;
                        case 2:
/* 44 */                    str = "HDR_UNSPECIFIED";
                            break;
                        case 3:
/* 41 */                    str = "HLG";
                            break;
                        case 4:
/* 38 */                    str = "HDR10";
                            break;
                        case 5:
/* 35 */                    str = "HDR10_PLUS";
                            break;
                        case 6:
/* 32 */                    str = "DOLBY_VISION";
                            break;
                        default:
/* 29 */                    str = "<Unknown>";
                            break;
                    }
/* 52 */            sb.append(str);
/* 57 */            sb.append(", bitDepth=");
/* 64 */            return IIl001iO0Io.I000lI(this.I00000oOI, "}", sb);
                }
            }
