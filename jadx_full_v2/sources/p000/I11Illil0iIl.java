            package p000;

            import java.util.List;
            
            @Oili0O
            public final class I11Illil0iIl {
                public static final I11Iio00iI0O Companion = new I11Iio00iI0O();
                public static final O0ioIllo0i1[] I0000O = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new I01iOOoiOI(16)), null, null};
                public List I00000oIO;
                public Double I00000oOI;
                public String I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I11Illil0iIl)) {
/* 7 */                 return false;
                    }
/* 11 */            I11Illil0iIl i11Illil0iIl = (I11Illil0iIl) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i11Illil0iIl.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, i11Illil0iIl.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, i11Illil0iIl.I0000Il00O);
                }

                public final int hashCode() {
/* 1 */             List list = this.I00000oIO;
/* 12 */            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
/* 14 */            Double d = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
/* 27 */            String str = this.I0000Il00O;
/* 36 */            return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             List list = this.I00000oIO;
/* 3 */             Double d = this.I00000oOI;
/* 5 */             String str = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("Annotations(audience=");
/* 14 */            sb.append(list);
/* 19 */            sb.append(", priority=");
/* 22 */            sb.append(d);
/* 27 */            sb.append(", lastModified=");
/* 32 */            return IIl001iO0Io.I00100l0(sb, str, ")");
                }
            }
