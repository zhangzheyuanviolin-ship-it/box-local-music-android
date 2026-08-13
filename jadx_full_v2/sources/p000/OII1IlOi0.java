            package p000;

            import java.util.LinkedHashMap;
            
            public final class OII1IlOi0 {
                public static final LinkedHashMap I00000oOI = new LinkedHashMap();
                public LinkedHashMap I00000oIO;

                public final void I00000oIO(OII1Il1IlOO oII1Il1IlOO) {
/* 5 */             String strI00000oIO = l1iOoIO.I00000oIO(oII1Il1IlOO.getClass());
/* 9 */             LinkedHashMap linkedHashMap = this.I00000oIO;
/* 15 */            if (strI00000oIO.length() <= 0) {
/* 65 */                I000II.I000iOII("navigator name cannot be an empty string");
/* 77 */                return;
                    }
/* 21 */            OII1Il1IlOO oII1Il1IlOO2 = (OII1Il1IlOO) linkedHashMap.get(strI00000oIO);
/* 27 */            if (O0000Ioio00.I0000O(oII1Il1IlOO2, oII1Il1IlOO)) {
/* 29 */                return;
                    }
/* 32 */            if (oII1Il1IlOO2 != null && oII1Il1IlOO2.I00000oOI) {
/* 42 */                IoOOl0iOl1io.I001IO000("Navigator ", oII1Il1IlOO, " is replacing an already attached ", oII1Il1IlOO2);
                    } else if (oII1Il1IlOO.I00000oOI) {
/* 59 */                IOOlIIilOl0.I0001Ioi1lo(oII1Il1IlOO, "Navigator ", " is already attached to another NavController");
                    }
                }

                public final OII1Il1IlOO I00000oOI(String str) {
/* 6 */             if (str.length() <= 0) {
/* 33 */                I000II.I000iOII("navigator name cannot be an empty string");
/* 5 */                 return null;
                    }
/* 14 */            OII1Il1IlOO oII1Il1IlOO = (OII1Il1IlOO) this.I00000oIO.get(str);
/* 16 */            if (oII1Il1IlOO != null) {
/* 18 */                return oII1Il1IlOO;
                    }
/* 27 */            I000II.I001IO000(IlIi0I0.I000lI("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
/* 5 */             return null;
                }
            }
