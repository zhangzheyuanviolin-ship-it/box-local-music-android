            package p000;
            
            public abstract class O01O1110 {
                public static final Iolii1loo1 I00000oIO = iollIlI01II.I00000oIO(OlOlllO.I00000oIO, "kotlinx.serialization.json.JsonUnquotedLiteral");

                public static final O01lO1iO I00000oIO(Number number) {
/* 5 */             return new O01i0Iiil(number, false, null);
                }

                public static final O01lO1iO I00000oOI(String str) {
                    return str == null ? O01iI0i0.INSTANCE : new O01i0Iiil(str, true, null);
                }

                public static final void I0000Il00O(O01O0o1iI o01O0o1iI, String str) {
/* 89 */            throw new IllegalArgumentException("Element " + OOoOl0i.I00000oIO.I00000oOI(o01O0o1iI.getClass()) + " is not a " + str);
                }

                public static final O01ioO1o0i11 I0000O(O01O0o1iI o01O0o1iI) {
/* 10 */            O01ioO1o0i11 o01ioO1o0i11 = o01O0o1iI instanceof O01ioO1o0i11 ? (O01ioO1o0i11) o01O0o1iI : null;
/* 11 */            if (o01ioO1o0i11 != null) {
/* 13 */                return o01ioO1o0i11;
                    }
/* 16 */            I0000Il00O(o01O0o1iI, "JsonObject");
/* 49 */            throw null;
                }

                public static final O01lO1iO I0000oI00(O01O0o1iI o01O0o1iI) {
/* 10 */            O01lO1iO o01lO1iO = o01O0o1iI instanceof O01lO1iO ? (O01lO1iO) o01O0o1iI : null;
/* 11 */            if (o01lO1iO != null) {
/* 13 */                return o01lO1iO;
                    }
/* 16 */            I0000Il00O(o01O0o1iI, "JsonPrimitive");
/* 49 */            throw null;
                }

                public static final long I0001Ioi1lo(O01lO1iO o01lO1iO) {
/* 7 */             I11l01l i11l01lI00000oIO = lOOoOlo1ili.I00000oIO(O011OoiO1.I0000O, o01lO1iO.I00000oOI());
/* 13 */            String str = (String) i11l01lI00000oIO.I000II;
/* 15 */            long jI00100o1O0lo = i11l01lI00000oIO.I00100o1O0lo();
/* 25 */            if (i11l01lI00000oIO.I000o00OoI0I() == 10) {
/* 186 */               return jI00100o1O0lo;
                    }
/* 27 */            int i = i11l01lI00000oIO.I00000oOI;
/* 34 */            int i2 = i > 0 ? i - 1 : i;
/* 65 */            I11l01l.I001IO000(i11l01lI00000oIO, IlIi0I0.I000lI("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
/* 68 */            throw null;
                }
            }
