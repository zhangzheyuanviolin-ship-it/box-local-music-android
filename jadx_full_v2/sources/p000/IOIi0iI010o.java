            package p000;

            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            
            public final class IOIi0iI010o {
                public String I00000oIO;
                public List I00000oOI;
                public ArrayList I0000Il00O;
                public HashSet I0000O;
                public ArrayList I0000oI00;
                public ArrayList I0001Ioi1lo;
                public ArrayList I000II;

                public static void I00000oIO(IOIi0iI010o iOIi0iI010o, String str, OilOloI oilOloI) {
/* 7 */             if (!iOIi0iI010o.I0000O.add(str)) {
/* 41 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Element with name '", str, "' is already registered in ");
/* 47 */                sbI001IIilI0O.append(iOIi0iI010o.I00000oIO);
/* 215 */               throw new IllegalArgumentException(sbI001IIilI0O.toString().toString());
                    }
/* 11 */            iOIi0iI010o.I0000Il00O.add(str);
/* 16 */            iOIi0iI010o.I0000oI00.add(oilOloI);
/* 23 */            iOIi0iI010o.I0001Ioi1lo.add(Il01100l.I00iOIl);
/* 33 */            iOIi0iI010o.I000II.add(false);
                }
            }
