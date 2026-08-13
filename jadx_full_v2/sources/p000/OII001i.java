            package p000;
            
            public final class OII001i extends OII01iooio {
                public Class I000lI;

                @Override
                public final String I00000oOI() {
/* 3 */             return this.I000lI.getName();
                }

                @Override
                public final Enum I0000Il00O(String str) {
                    Object obj;
/* 1 */             Class cls = this.I000lI;
/* 3 */             Object[] enumConstants = cls.getEnumConstants();
/* 7 */             int length = enumConstants.length;
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 if (i >= length) {
/* 31 */                    obj = null;
                            break;
                        }
/* 11 */                obj = enumConstants[i];
/* 25 */                if (OlOolloIIOl0.I000O01llI0(((Enum) obj).name(), str, true)) {
                            break;
                        }
/* 28 */                i++;
                    }
/* 32 */            Enum r3 = (Enum) obj;
/* 34 */            if (r3 != null) {
/* 36 */                return r3;
                    }
/* 43 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Enum value ", str, " not found for type ");
/* 51 */            sbI001IIilI0O.append(cls.getName());
/* 56 */            sbI001IIilI0O.append('.');
/* 77 */            throw new IllegalArgumentException(sbI001IIilI0O.toString());
                }
            }
