            package p000;
            
            public abstract class li1IIilIo1 {
                public static final String I00000oIO(OoOIOoO1I ooOIOoO1I) {
/* 17 */            StringBuilder sb = new StringBuilder("type: " + ooOIOoO1I);
/* 22 */            sb.append('\n');
/* 43 */            sb.append("hashCode: " + ooOIOoO1I.hashCode());
/* 46 */            sb.append('\n');
/* 71 */            sb.append("javaClass: " + ooOIOoO1I.getClass().getCanonicalName());
/* 74 */            sb.append('\n');
/* 81 */            for (Ii1Ool1 ii1Ool1I00100o1O0lo = ooOIOoO1I.I00100o1O0lo(); ii1Ool1I00100o1O0lo != null; ii1Ool1I00100o1O0lo = ii1Ool1I00100o1O0lo.I000lI()) {
/* 95 */                sb.append("fqName: ".concat(IiOOllOI0io.I0000Il00O.I001IIilI0O(ii1Ool1I00100o1O0lo)));
/* 98 */                sb.append('\n');
/* 121 */               sb.append("javaClass: " + ii1Ool1I00100o1O0lo.getClass().getCanonicalName());
/* 124 */               sb.append('\n');
                    }
/* 132 */           return sb.toString();
                }
            }
