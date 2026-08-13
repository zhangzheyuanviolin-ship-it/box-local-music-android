            package p000;
            
/* 8 */     public class OIlllOo01 extends OIlol0 {
                public static final String I00iio = "List";
                protected static final String I00ilI0I1 = "ListNumbering";
                public static final String I00ilO0 = "Circle";
                public static final String I00io1l = "Decimal";
                public static final String I00ioIO = "Disc";
                public static final String I00l0I0l0lO1 = "LowerAlpha";
                public static final String I00l0OO0IO = "LowerRoman";
                public static final String I00li1OI = "None";
                public static final String I00ll1 = "Square";
                public static final String I00lli11 = "UpperAlpha";
                public static final String I00lll10 = "UpperRoman";

                public OIlllOo01() {
/* 6 */             I000iOII(I00iio);
                }

                public String I00IlilI0i0i() {
/* 5 */             return I0010I0i(I00ilI0I1, "None");
                }

                public void I00Io1o110i(String str) {
/* 3 */             I00IO1(I00ilI0I1, str);
                }

                @Override
                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 19 */            if (I001iOo1i0O(I00ilI0I1)) {
/* 23 */                sb.append(", ListNumbering=");
/* 30 */                sb.append(I00IlilI0i0i());
                    }
/* 33 */            return sb.toString();
                }

/* 9 */         public OIlllOo01(IIOoi0ooOoO iIOoi0ooOoO) {
/* 10 */            super(iIOoi0ooOoO);
                }
            }
