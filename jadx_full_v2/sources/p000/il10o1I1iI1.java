            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class il10o1I1iI1 {
                public static void I00000oIO(int i) {
/* 7 */             String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
/* 15 */            Object[] objArr = new Object[i != 4 ? 3 : 2];
                    switch (i) {
                        case 1:
                        case 6:
/* 43 */                    objArr[0] = "originalSubstitution";
                            break;
                        case 2:
                        case 7:
/* 38 */                    objArr[0] = "newContainingDeclaration";
                            break;
                        case 3:
                        case 8:
/* 33 */                    objArr[0] = "result";
                            break;
                        case 4:
/* 28 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                            break;
                        case 5:
                        default:
/* 25 */                    objArr[0] = "typeParameters";
                            break;
                    }
/* 48 */            if (i != 4) {
/* 50 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                    } else {
/* 53 */                objArr[1] = "substituteTypeParameters";
                    }
/* 55 */            if (i != 4) {
/* 57 */                objArr[2] = "substituteTypeParameters";
                    }
/* 59 */            String str2 = String.format(str, objArr);
/* 63 */            if (i == 4) {
/* 76 */                throw new IllegalStateException(str2);
                    }
                }

                public static OoOilII0 I00000oOI(List list, OoOiiO01illo ooOiiO01illo, Ii1Ool1 ii1Ool1, ArrayList arrayList) {
/* 2 */             if (ooOiiO01illo == null) {
/* 32 */                I00000oIO(1);
/* 483 */               throw null;
                    }
/* 4 */             if (ii1Ool1 == null) {
/* 27 */                I00000oIO(2);
/* 30 */                throw null;
                    }
/* 6 */             if (arrayList == null) {
/* 22 */                I00000oIO(3);
/* 25 */                throw null;
                    }
/* 8 */             OoOilII0 ooOilII0I0000Il00O = I0000Il00O(list, ooOiiO01illo, ii1Ool1, arrayList, null);
/* 12 */            if (ooOilII0I0000Il00O != null) {
/* 14 */                return ooOilII0I0000Il00O;
                    }
/* 17 */            I000II.I000O01llI0("Substitution failed");
/* 1 */             return null;
                }

                public static OoOilII0 I0000Il00O(List list, OoOiiO01illo ooOiiO01illo, Ii1Ool1 ii1Ool1, List list2, boolean[] zArr) {
/* 6 */             if (ooOiiO01illo == null) {
/* 265 */               I00000oIO(6);
/* 966 */               throw null;
                    }
/* 8 */             if (ii1Ool1 == null) {
/* 260 */               I00000oIO(7);
/* 263 */               throw null;
                    }
/* 10 */            if (list2 == null) {
/* 255 */               I00000oIO(8);
/* 258 */               throw null;
                    }
/* 14 */            HashMap map = new HashMap();
/* 19 */            HashMap map2 = new HashMap();
/* 22 */            Iterator it = list.iterator();
/* 27 */            int i = 0;
/* 32 */            while (it.hasNext()) {
/* 39 */                OoOOiO ooOOiO = (OoOOiO) it.next();
/* 57 */                int i2 = i + 1;
/* 65 */                OoOOiOollo ooOOiOolloI010l10O = OoOOiOollo.I010l10O(i, ooOOiO.getAnnotations(), ii1Ool1, ooOOiO.I00OIO1(), ooOOiO.getName(), ooOOiO.I000l1(), ooOOiO.I001lllioOl());
/* 82 */                map.put(ooOOiO.I000OOo1O(), new OlIo1I(ooOOiOolloI010l10O.I00Ol10()));
/* 85 */                map2.put(ooOOiO, ooOOiOolloI010l10O);
/* 88 */                list2.add(ooOOiOolloI010l10O);
/* 91 */                i = i2;
                    }
/* 96 */            OlIo1o0I0iIo olIo1o0I0iIo = new OlIo1o0I0iIo(1);
/* 99 */            olIo1o0I0iIo.I0000O = map;
/* 101 */           VarHandle.storeStoreFence();
/* 104 */           OoOilII0 ooOilII0I0000oI00 = OoOilII0.I0000oI00(ooOiiO01illo, olIo1o0I0iIo);
/* 110 */           IO0OiIIOi iO0OiIIOi = new IO0OiIIOi(1);
/* 113 */           iO0OiIIOi.I0000Il00O = ooOiiO01illo;
/* 115 */           VarHandle.storeStoreFence();
/* 118 */           OoOilII0 ooOilII0I0000oI002 = OoOilII0.I0000oI00(iO0OiIIOi, olIo1o0I0iIo);
/* 122 */           Iterator it2 = list.iterator();
/* 130 */           while (it2.hasNext()) {
/* 136 */               OoOOiO ooOOiO2 = (OoOOiO) it2.next();
/* 142 */               OoOOiOollo ooOOiOollo = (OoOOiOollo) map2.get(ooOOiO2);
/* 158 */               for (O0iIl1 o0iIl1 : ooOOiO2.getUpperBounds()) {
/* 170 */                   IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 191 */                   O0iIl1 o0iIl1I000O01llI0 = (((iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) && lOoliOIOlIO0.I0001Ioi1lo((OoOOiO) iOIiO1lIl0lI00100o1O0lo, null, null)) ? ooOilII0I0000oI00 : ooOilII0I0000oI002).I000O01llI0(o0iIl1, Ooo0Ioii0o0.I00ilI0I1);
/* 195 */                   if (o0iIl1I000O01llI0 == null) {
/* 5 */                         return null;
                            }
/* 198 */                   if (o0iIl1I000O01llI0 != o0iIl1 && zArr != null) {
/* 202 */                       zArr[0] = true;
                            }
/* 206 */                   if (ooOOiOollo.I00ll1) {
/* 229 */                       I000II.I001IO000("Type parameter descriptor is already initialized: ".concat(ooOOiOollo.I010l1ol111()));
/* 5 */                         return null;
                            }
/* 212 */                   if (!l0loOi1ol11o.I00000oIO(o0iIl1I000O01llI0)) {
/* 217 */                       ooOOiOollo.I00li1OI.add(o0iIl1I000O01llI0);
                            }
                        }
/* 235 */               if (ooOOiOollo.I00ll1) {
/* 248 */                   I000II.I001IO000("Type parameter descriptor is already initialized: ".concat(ooOOiOollo.I010l1ol111()));
/* 5 */                     return null;
                        }
/* 237 */               ooOOiOollo.I00ll1 = true;
                    }
/* 252 */           return ooOilII0I0000oI00;
                }
            }
