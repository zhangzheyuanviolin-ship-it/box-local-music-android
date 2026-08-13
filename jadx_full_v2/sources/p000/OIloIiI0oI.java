            package p000;
            
/* 8 */     public class OIloIiI0oI extends OIlol0 {
                public static final String I00iio = "PrintField";
                private static final String I00ilI0I1 = "Role";
                private static final String I00ilO0 = "checked";
                private static final String I00io1l = "Desc";
                public static final String I00ioIO = "rb";
                public static final String I00l0I0l0lO1 = "cb";
                public static final String I00l0OO0IO = "pb";
                public static final String I00li1OI = "tv";
                public static final String I00ll1 = "on";
                public static final String I00lli11 = "off";
                public static final String I00lll10 = "neutral";

                public OIloIiI0oI() {
/* 6 */             I000iOII(I00iio);
                }

                public String I00IlilI0i0i() {
/* 3 */             return I001i1lo1io(I00io1l);
                }

                public String I00Io1o110i() {
/* 5 */             return I0010I0i(I00ilO0, I00lli11);
                }

                public String I00IoIO0lI() {
/* 3 */             return I00100o1O0lo(I00ilI0I1);
                }

                public void I00IoO0(String str) {
/* 3 */             I00IioO0OiOi(I00io1l, str);
                }

                public void I00IoiI(String str) {
/* 3 */             I00IO1(I00ilO0, str);
                }

                public void I00Iooi00oi(String str) {
/* 3 */             I00IO1(I00ilI0I1, str);
                }

                @Override
                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 19 */            if (I001iOo1i0O(I00ilI0I1)) {
/* 23 */                sb.append(", Role=");
/* 30 */                sb.append(I00IoIO0lI());
                    }
/* 39 */            if (I001iOo1i0O(I00ilO0)) {
/* 43 */                sb.append(", Checked=");
/* 50 */                sb.append(I00Io1o110i());
                    }
/* 59 */            if (I001iOo1i0O(I00io1l)) {
/* 63 */                sb.append(", Desc=");
/* 70 */                sb.append(I00IlilI0i0i());
                    }
/* 73 */            return sb.toString();
                }

/* 9 */         public OIloIiI0oI(IIOoi0ooOoO iIOoi0ooOoO) {
/* 10 */            super(iIOoi0ooOoO);
                }
            }
