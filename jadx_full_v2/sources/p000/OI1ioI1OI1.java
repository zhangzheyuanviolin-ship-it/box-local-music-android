            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public abstract class OI1ioI1OI1 {
                public final OII1Il1IlOO I00000oIO;
                public final String I00000oOI;
                public final LinkedHashMap I0000Il00O = new LinkedHashMap();
                public final ArrayList I0000O = new ArrayList();
                public final LinkedHashMap I0000oI00 = new LinkedHashMap();

                public OI1ioI1OI1(OII1Il1IlOO oII1Il1IlOO, String str) {
/* 4 */             this.I00000oIO = oII1Il1IlOO;
/* 6 */             this.I00000oOI = str;
                }

                public OI1ilOI1ioo0 I00000oIO() {
/* 1 */             OI1ilOI1ioo0 oI1ilOI1ioo0I00000oOI = I00000oOI();
/* 5 */             oI1ilOI1ioo0I00000oOI.getClass();
/* 8 */             I11l01l i11l01l = oI1ilOI1ioo0I00000oOI.I00iiI;
/* 24 */            for (Map.Entry entry : this.I0000Il00O.entrySet()) {
/* 48 */                ((LinkedHashMap) i11l01l.I0000oI00).put((String) entry.getKey(), (OI1Oi1) entry.getValue());
                    }
/* 54 */            Iterator it = this.I0000O.iterator();
/* 62 */            while (it.hasNext()) {
/* 68 */                OI1iiIoI0OOi oI1iiIoI0OOi = (OI1iiIoI0OOi) it.next();
/* 72 */                LinkedHashMap linkedHashMap = (LinkedHashMap) i11l01l.I0000oI00;
/* 77 */                OI1ioI1iI oI1ioI1iI = new OI1ioI1iI(0);
/* 80 */                oI1ioI1iI.I00iiI = oI1iiIoI0OOi;
/* 82 */                VarHandle.storeStoreFence();
/* 85 */                ArrayList arrayListI00000oIO = l1iIIII1.I00000oIO(linkedHashMap, oI1ioI1iI);
/* 93 */                if (!arrayListI00000oIO.isEmpty()) {
/* 148 */                   throw new IllegalArgumentException(("Deep link " + oI1iiIoI0OOi.I00000oIO + " can't be used to open destination " + ((OI1ilOI1ioo0) i11l01l.I0000Il00O) + ".\nFollowing required arguments are missing: " + arrayListI00000oIO).toString());
                        }
/* 99 */                ((ArrayList) i11l01l.I0000O).add(oI1iiIoI0OOi);
                    }
/* 155 */           Iterator it2 = this.I0000oI00.entrySet().iterator();
/* 164 */           if (it2.hasNext()) {
/* 297 */               Map.Entry entry2 = (Map.Entry) it2.next();
/* 305 */               ((Number) entry2.getKey()).intValue();
/* 312 */               entry2.getValue().getClass();
/* 315 */               OIiilo1Ool0o.I00000oIO();
/* 163 */               return null;
                    }
/* 166 */           String str = this.I00000oOI;
/* 168 */           if (str != null) {
/* 170 */               i11l01l.getClass();
/* 177 */               if (OlOoOIi0o.I001l0I00(str)) {
/* 288 */                   I000II.I000iOII("Cannot have an empty route");
/* 163 */                   return null;
                        }
/* 181 */               String strConcat = "android-app://androidx.navigation/".concat(str);
/* 187 */               Io1lOlI io1lOlI = new Io1lOlI();
/* 190 */               io1lOlI.I00000oOI = strConcat;
/* 192 */               OI1iiIoI0OOi oI1iiIoI0OOiI00000oIO = io1lOlI.I00000oIO();
/* 198 */               LinkedHashMap linkedHashMap2 = (LinkedHashMap) i11l01l.I0000oI00;
/* 203 */               OI1ioI1iI oI1ioI1iI2 = new OI1ioI1iI(1);
/* 206 */               oI1ioI1iI2.I00iiI = oI1iiIoI0OOiI00000oIO;
/* 208 */               VarHandle.storeStoreFence();
/* 211 */               ArrayList arrayListI00000oIO2 = l1iIIII1.I00000oIO(linkedHashMap2, oI1ioI1iI2);
/* 219 */               if (!arrayListI00000oIO2.isEmpty()) {
/* 253 */                   StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Cannot set route \"", str, "\" for destination ");
/* 261 */                   sbI001IIilI0O.append((OI1ilOI1ioo0) i11l01l.I0000Il00O);
/* 266 */                   sbI001IIilI0O.append(". Following required arguments are missing: ");
/* 269 */                   sbI001IIilI0O.append(arrayListI00000oIO2);
/* 285 */                   throw new IllegalArgumentException(sbI001IIilI0O.toString().toString());
                        }
/* 225 */               IlIi0Il ilIi0Il = new IlIi0Il(24);
/* 228 */               ilIi0Il.I00iiI = strConcat;
/* 230 */               VarHandle.storeStoreFence();
/* 238 */               i11l01l.I000II = new OllO00oiil(ilIi0Il);
/* 244 */               i11l01l.I00000oOI = strConcat.hashCode();
/* 246 */               i11l01l.I0001Ioi1lo = str;
                    }
/* 292 */           return oI1ilOI1ioo0I00000oOI;
                }

                public OI1ilOI1ioo0 I00000oOI() {
/* 3 */             return this.I00000oIO.I00000oIO();
                }
            }
