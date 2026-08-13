            package p000;
            
/* 8 */     public class OIloo1iol0o extends OIlol0 {
                public static final String I00iio = "Table";
                protected static final String I00ilI0I1 = "RowSpan";
                protected static final String I00ilO0 = "ColSpan";
                protected static final String I00io1l = "Headers";
                protected static final String I00ioIO = "Scope";
                protected static final String I00l0I0l0lO1 = "Summary";
                public static final String I00l0OO0IO = "Both";
                public static final String I00li1OI = "Column";
                public static final String I00ll1 = "Row";

                public OIloo1iol0o() {
/* 6 */             I000iOII("Table");
                }

                public int I00IlilI0i0i() {
/* 4 */             return I00100l0(I00ilO0, 1);
                }

                public String[] I00Io1o110i() {
/* 3 */             return I000lI(I00io1l);
                }

                public int I00IoIO0lI() {
/* 4 */             return I00100l0(I00ilI0I1, 1);
                }

                public String I00IoO0() {
/* 3 */             return I00100o1O0lo(I00ioIO);
                }

                public String I00IoiI() {
/* 3 */             return I001i1lo1io(I00l0I0l0lO1);
                }

                public void I00Iooi00oi(int i) {
/* 3 */             I00II0oii1o(I00ilO0, i);
                }

                public void I00O0i0ii(String[] strArr) {
/* 3 */             I001lllioOl(I00io1l, strArr);
                }

                public void I00O0o1oo(int i) {
/* 3 */             I00II0oii1o(I00ilI0I1, i);
                }

                public void I00O10llo(String str) {
/* 3 */             I00IO1(I00ioIO, str);
                }

                public void I00OI1(String str) {
/* 3 */             I00IioO0OiOi(I00l0I0l0lO1, str);
                }

                @Override
                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 19 */            if (I001iOo1i0O(I00ilI0I1)) {
/* 23 */                sb.append(", RowSpan=");
/* 30 */                sb.append(I00IoIO0lI());
                    }
/* 39 */            if (I001iOo1i0O(I00ilO0)) {
/* 43 */                sb.append(", ColSpan=");
/* 50 */                sb.append(I00IlilI0i0i());
                    }
/* 59 */            if (I001iOo1i0O(I00io1l)) {
/* 63 */                sb.append(", Headers=");
/* 74 */                sb.append(OIlOiIo.I0000Il00O(I00Io1o110i()));
                    }
/* 83 */            if (I001iOo1i0O(I00ioIO)) {
/* 87 */                sb.append(", Scope=");
/* 94 */                sb.append(I00IoO0());
                    }
/* 103 */           if (I001iOo1i0O(I00l0I0l0lO1)) {
/* 107 */               sb.append(", Summary=");
/* 114 */               sb.append(I00IoiI());
                    }
/* 117 */           return sb.toString();
                }

/* 9 */         public OIloo1iol0o(IIOoi0ooOoO iIOoi0ooOoO) {
/* 10 */            super(iIOoi0ooOoO);
                }
            }
