            package p000;

            import com.google.mlkit.genai.schema.guided.GenerableDetail;
            import com.google.mlkit.genai.schema.guided.GenerableProvider;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public abstract class o0ol0Oo {
                public static l0OoOooI01O I00000oIO(O0IOli0o0 o0IOli0o0) {
                    l0OoOooI01O l0oooooi01o;
                    l0OoOooI01O l0oooooi01o2;
                    l0OoOooI01O l0oooooi01oI00000oIO;
                    String[] enumValues;
/* 1 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 14 */            if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(String.class))) {
/* 18 */                l0oooooi01o = new l0OoOooI01O();
/* 22 */                l0oooooi01o.I000l1 = 2;
                    } else if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(Integer.TYPE))) {
/* 41 */                l0oooooi01o = new l0OoOooI01O();
/* 44 */                l0oooooi01o.I000l1 = 4;
/* 48 */                l0oooooi01o.I00000oIO = "int32";
                    } else if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(Long.TYPE))) {
/* 65 */                l0oooooi01o = new l0OoOooI01O();
/* 68 */                l0oooooi01o.I000l1 = 4;
/* 72 */                l0oooooi01o.I00000oIO = "int64";
                    } else if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(Boolean.TYPE))) {
/* 89 */                l0oooooi01o = new l0OoOooI01O();
/* 93 */                l0oooooi01o.I000l1 = 5;
                    } else if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(Float.TYPE))) {
/* 111 */               l0oooooi01o = new l0OoOooI01O();
/* 114 */               l0oooooi01o.I000l1 = 3;
/* 118 */               l0oooooi01o.I00000oIO = "float";
                    } else if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(Double.TYPE))) {
/* 135 */               l0oooooi01o = new l0OoOooI01O();
/* 138 */               l0oooooi01o.I000l1 = 3;
/* 142 */               l0oooooi01o.I00000oIO = "double";
                    } else {
/* 145 */               l0oooooi01o = null;
                    }
/* 146 */           if (l0oooooi01o != null) {
/* 1261 */              return l0oooooi01o;
                    }
/* 160 */           GenerableProvider generableProvider = (GenerableProvider) ((Map) o0oiiO1o.I00000oIO.getValue()).get(o0IOli0o0);
/* 162 */           if (generableProvider == null) {
/* 164 */               l0oooooi01o2 = null;
                    } else {
/* 167 */               GenerableDetail<?> generableDetail = generableProvider.getGenerableDetail();
/* 173 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 178 */               ArrayList arrayList = new ArrayList();
/* 193 */               for (GenerableDetail.GuideDetail guideDetail : generableDetail.getGuideDetails()) {
/* 201 */                   String name = guideDetail.getName();
/* 209 */                   if (guideDetail.isList()) {
/* 211 */                       O0IOli0o0 listItemType = guideDetail.getListItemType();
/* 215 */                       if (listItemType == null) {
/* 272 */                           String name2 = guideDetail.getName();
/* 276 */                           String strI000oI1ioi = o0IOli0o0.I000oI1ioi();
/* 303 */                           StringBuilder sb = new StringBuilder(String.valueOf(strI000oI1ioi).length() + String.valueOf(name2).length() + 72 + 62);
/* 310 */                           IIl001iO0Io.I001lIiIIo1O(sb, "List item type (listItemType) is null for list property '", name2, "' in schema of ", strI000oI1ioi);
/* 315 */                           sb.append(". This should have been populated by the annotation processor.");
/* 325 */                           throw new IllegalStateException(sb.toString());
                                }
/* 217 */                       l0OoOooI01O l0oooooi01oI00000oIO2 = I00000oIO(listItemType);
/* 231 */                       if (listItemType.equals(OOoOl0i.I00000oIO.I00000oOI(String.class)) && (enumValues = guideDetail.getEnumValues()) != null) {
/* 240 */                           if (enumValues.length == 0) {
/* 242 */                               enumValues = null;
                                    }
/* 243 */                           if (enumValues != null) {
/* 253 */                               l0oooooi01oI00000oIO2.I0000O = lOI1lll1l10.I000o00OoI0I(I1IoiO1l.I00IioO0OiOi(enumValues));
                                    }
                                }
/* 257 */                       l0oooooi01oI00000oIO = new l0OoOooI01O();
/* 261 */                       l0oooooi01oI00000oIO.I000l1 = 6;
/* 267 */                       l0oooooi01oI00000oIO.I0000oI00 = l0oooooi01oI00000oIO2.I00000oIO();
                            } else {
/* 330 */                       l0oooooi01oI00000oIO = I00000oIO(guideDetail.getType());
                            }
/* 334 */                   String description = guideDetail.getDescription();
/* 338 */                   if (description != null) {
/* 340 */                       l0oooooi01oI00000oIO.I00000oOI = description;
                            }
/* 346 */                   if (guideDetail.getMaxItems() != null) {
/* 357 */                       l0oooooi01oI00000oIO.I0001Ioi1lo = Long.valueOf(r9.intValue());
                            }
/* 363 */                   if (guideDetail.getMinItems() != null) {
/* 374 */                       l0oooooi01oI00000oIO.I000II = Long.valueOf(r9.intValue());
                            }
/* 380 */                   if (!guideDetail.isList()) {
/* 382 */                       Double maximum = guideDetail.getMaximum();
/* 386 */                       if (maximum != null) {
/* 396 */                           l0oooooi01oI00000oIO.I000iOII = Double.valueOf(maximum.doubleValue());
                                }
/* 398 */                       Double minimum = guideDetail.getMinimum();
/* 402 */                       if (minimum != null) {
/* 412 */                           l0oooooi01oI00000oIO.I000OiO = Double.valueOf(minimum.doubleValue());
                                }
/* 414 */                       String[] enumValues2 = guideDetail.getEnumValues();
/* 418 */                       if (enumValues2 != null) {
/* 421 */                           if (enumValues2.length == 0) {
/* 423 */                               enumValues2 = null;
                                    }
/* 424 */                           if (enumValues2 != null) {
/* 434 */                               l0oooooi01oI00000oIO.I0000O = lOI1lll1l10.I000o00OoI0I(I1IoiO1l.I00IioO0OiOi(enumValues2));
                                    }
                                }
                            }
/* 444 */                   l0oooooi01oI00000oIO.I0000Il00O = Boolean.valueOf(guideDetail.getNullable());
/* 450 */                   linkedHashMap.put(name, l0oooooi01oI00000oIO.I00000oIO());
/* 453 */                   arrayList.add(name);
                        }
/* 460 */               l0oooooi01o2 = new l0OoOooI01O();
/* 464 */               l0oooooi01o2.I000l1 = 7;
/* 470 */               l0oooooi01o2.I00000oOI = generableDetail.getDescription();
/* 476 */               l0oooooi01o2.I000OOo1O = lOliil.I00000oIO(linkedHashMap);
/* 482 */               l0oooooi01o2.I000O01llI0 = lOI1lll1l10.I000o00OoI0I(arrayList);
                    }
/* 484 */           if (l0oooooi01o2 != null) {
/* 486 */               return l0oooooi01o2;
                    }
/* 501 */           I000II.I000iOII(String.valueOf(o0IOli0o0.I000oI1ioi()).concat(" is neither a registered @Generable type nor a directly supported basic type (String, Int, Boolean, etc.)."));
/* 13 */            return null;
                }
            }
