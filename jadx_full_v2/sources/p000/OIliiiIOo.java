            package p000;
            
/* 6 */     public class OIliiiIOo extends OIllioIilO {
                public static final String I01Ol1o0 = "XML-1.00";
                public static final String I01OlIoIl = "HTML-3.2";
                public static final String I01OlOoii0 = "HTML-4.01";
                public static final String I01Olioli = "OEB-1.00";
                public static final String I01OoIoio00O = "RTF-1.05";
                public static final String I01OoOi = "CSS-1.00";
                public static final String I01OooO0o0o = "CSS-2.00";

                public OIliiiIOo(String str) {
/* 4 */             I000iOII(str);
                }

                public int I01II10() {
/* 4 */             return I00100l0("ColSpan", 1);
                }

                public String[] I01IO0oio() {
/* 3 */             return I000lI("Headers");
                }

                public String I01IO1il() {
/* 5 */             return I0010I0i("ListNumbering", "None");
                }

                public int I01Ii0ll10O() {
/* 4 */             return I00100l0("RowSpan", 1);
                }

                public String I01IiOO() {
/* 3 */             return I00100o1O0lo("Scope");
                }

                public String I01Iio10lo() {
/* 3 */             return I001i1lo1io("Summary");
                }

                public void I01IlIoOI(int i) {
/* 3 */             I00II0oii1o("ColSpan", i);
                }

                public void I01Ilioliio(String[] strArr) {
/* 3 */             I001lllioOl("Headers", strArr);
                }

                public void I01Ilo0i(String str) {
/* 3 */             I00IO1("ListNumbering", str);
                }

                public void I01Io000(int i) {
/* 3 */             I00II0oii1o("RowSpan", i);
                }

                public void I01Io001O(String str) {
/* 3 */             I00IO1("Scope", str);
                }

                public void I01Io1(String str) {
/* 3 */             I00IioO0OiOi("Summary", str);
                }

                @Override
                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 19 */            if (I001iOo1i0O("ListNumbering")) {
/* 23 */                sb.append(", ListNumbering=");
/* 30 */                sb.append(I01IO1il());
                    }
/* 39 */            if (I001iOo1i0O("RowSpan")) {
/* 43 */                sb.append(", RowSpan=");
/* 50 */                sb.append(I01Ii0ll10O());
                    }
/* 59 */            if (I001iOo1i0O("ColSpan")) {
/* 63 */                sb.append(", ColSpan=");
/* 70 */                sb.append(I01II10());
                    }
/* 79 */            if (I001iOo1i0O("Headers")) {
/* 83 */                sb.append(", Headers=");
/* 94 */                sb.append(OIlOiIo.I0000Il00O(I01IO0oio()));
                    }
/* 103 */           if (I001iOo1i0O("Scope")) {
/* 107 */               sb.append(", Scope=");
/* 114 */               sb.append(I01IiOO());
                    }
/* 123 */           if (I001iOo1i0O("Summary")) {
/* 127 */               sb.append(", Summary=");
/* 134 */               sb.append(I01Iio10lo());
                    }
/* 137 */           return sb.toString();
                }

/* 7 */         public OIliiiIOo(IIOoi0ooOoO iIOoi0ooOoO) {
/* 8 */             super(iIOoi0ooOoO);
                }
            }
