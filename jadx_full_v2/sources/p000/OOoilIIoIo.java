            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            
            public final class OOoilIIoIo implements OoO00iO0OOl0 {
                public IIlio101Io I00iOIl;
                public int I00iiI;
                public Il11i1 I00iiO;
                public O011oOIoO00O I00iio;
                public List I00ilI0I1;

                public static void I00000oOI(Class cls, String str, Field field, Field field2) {
/* 483 */           throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + OOoi0l1.I0000Il00O(field) + " and " + OOoi0l1.I0000Il00O(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
                }

                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) throws NoSuchMethodException, SecurityException {
/* 1 */             Class cls = ooOilO.I00000oIO;
/* 9 */             if (!Object.class.isAssignableFrom(cls)) {
/* 11 */                return null;
                    }
/* 13 */            lIo000I lio000i = OOoi0l1.I00000oIO;
/* 23 */            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
/* 39 */                return new OOoiOil();
                    }
/* 45 */            lIlo0lli01.I00000oIO(this.I00ilI0I1);
/* 48 */            lIo000I lio000i2 = OOoi0l1.I00000oIO;
/* 56 */            if (!lio000i2.I0000O(cls)) {
/* 140 */               OIOi0l1il oIOi0l1ilI00o0l1o1o0 = this.I00iOIl.I00o0l1o1o0(ooOilO, true);
/* 150 */               OOoii0IoiII oOoii0IoiII = new OOoii0IoiII(I0000Il00O(ooIlIoo1oiOo, ooOilO, cls, false));
/* 153 */               oOoii0IoiII.I00000oOI = oIOi0l1ilI00o0l1o1o0;
/* 155 */               VarHandle.storeStoreFence();
/* 551 */               return oOoii0IoiII;
                    }
/* 64 */            OOoil00 oOoil00 = new OOoil00(I0000Il00O(ooIlIoo1oiOo, ooOilO, cls, true));
/* 72 */            oOoil00.I0000O = new HashMap();
/* 74 */            Constructor constructorI00000oOI = lio000i2.I00000oOI(cls);
/* 78 */            oOoil00.I00000oOI = constructorI00000oOI;
/* 80 */            OOoi0l1.I0001Ioi1lo(constructorI00000oOI);
/* 83 */            String[] strArrI0000Il00O = lio000i2.I0000Il00O(cls);
/* 89 */            for (int i = 0; i < strArrI0000Il00O.length; i++) {
/* 99 */                oOoil00.I0000O.put(strArrI0000Il00O[i], Integer.valueOf(i));
                    }
/* 107 */           Class<?>[] parameterTypes = oOoil00.I00000oOI.getParameterTypes();
/* 114 */           oOoil00.I0000Il00O = new Object[parameterTypes.length];
/* 117 */           for (int i2 = 0; i2 < parameterTypes.length; i2++) {
/* 129 */               oOoil00.I0000Il00O[i2] = OOoil00.I0000oI00.get(parameterTypes[i2]);
                    }
/* 134 */           VarHandle.storeStoreFence();
/* 137 */           return oOoil00;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x017d  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01bc  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x01cd  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01ee  */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r14v8 */
                /* JADX WARN: Type inference failed for: r2v19 */
                /* JADX WARN: Type inference failed for: r2v3 */
                /* JADX WARN: Type inference failed for: r2v4, types: [int] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OOoiiiilO I0000Il00O(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO, Class cls, boolean z) throws SecurityException {
                    boolean z2;
                    Method methodI00000oIO;
                    OiliO0I oiliO0I;
                    List listAsList;
                    String name;
                    boolean z3;
                    ?? SingletonList;
                    ?? r2;
                    O011liOil o011liOil;
                    boolean z4;
                    Field field;
                    Field[] fieldArr;
                    int i;
                    List<String> list;
                    boolean z5;
                    boolean z6;
                    Method method;
                    String str;
                    OoIlIoo1oiOo ooIlIoo1oiOo2;
                    OoO00O1IiOl ooO00O1IiOlI0000O;
                    OOoiOl101 oOoiOl101;
/* 1 */             OOoilIIoIo oOoilIIoIo = this;
/* 9 */             if (cls.isInterface()) {
/* 11 */                return OOoiiiilO.I0000Il00O;
                    }
/* 16 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 21 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 24 */            OoOilO ooOilO2 = ooOilO;
/* 26 */            Class cls2 = cls;
                    while (true) {
/* 27 */                Type type = ooOilO2.I00000oOI;
/* 31 */                if (cls2 == Object.class) {
/* 592 */                   return new OOoiiiilO(new ArrayList(linkedHashMap2.values()), linkedHashMap);
                        }
/* 33 */                Field[] declaredFields = cls2.getDeclaredFields();
/* 37 */                if (cls2 != cls && declaredFields.length > 0) {
/* 44 */                    lIlo0lli01.I00000oIO(oOoilIIoIo.I00ilI0I1);
                        }
/* 47 */                int length = declaredFields.length;
/* 48 */                boolean z7 = false;
/* 49 */                int i2 = 0;
/* 50 */                while (i2 < length) {
/* 52 */                    Field field2 = declaredFields[i2];
/* 55 */                    boolean zI0000O = oOoilIIoIo.I0000O(field2, true);
/* 59 */                    boolean zI0000O2 = oOoilIIoIo.I0000O(field2, z7);
/* 63 */                    if (zI0000O || zI0000O2) {
/* 81 */                        if (!z) {
/* 141 */                           z2 = zI0000O2;
                                } else if (Modifier.isStatic(field2.getModifiers())) {
/* 93 */                            z2 = z7;
                                } else {
/* 100 */                           methodI00000oIO = OOoi0l1.I00000oIO.I00000oIO(cls2, field2);
/* 104 */                           OOoi0l1.I0001Ioi1lo(methodI00000oIO);
/* 111 */                           if (methodI00000oIO.getAnnotation(OiliO0I.class) != null && field2.getAnnotation(OiliO0I.class) == null) {
/* 137 */                               throw new O01Oo001(IlIi0I0.I000lI("@SerializedName on ", OOoi0l1.I0000O(methodI00000oIO, z7), " is not supported"));
                                    }
/* 138 */                           z2 = zI0000O2;
/* 144 */                           if (methodI00000oIO == null) {
/* 146 */                               OOoi0l1.I0001Ioi1lo(field2);
                                    }
/* 158 */                           Type typeI000II = iIllolOO.I000II(type, cls2, field2.getGenericType(), new HashMap());
/* 162 */                           int i3 = oOoilIIoIo.I00iiI;
/* 168 */                           oiliO0I = (OiliO0I) field2.getAnnotation(OiliO0I.class);
/* 170 */                           if (oiliO0I != null) {
                                        switch (i3) {
                                            case 1:
/* 265 */                                       name = field2.getName();
                                                break;
                                            case 2:
/* 260 */                                       name = IIl001iO0Io.I0000Il00O(field2.getName());
                                                break;
                                            case 3:
/* 251 */                                       name = IIl001iO0Io.I0000Il00O(IIl001iO0Io.I00000oOI(field2.getName(), ' '));
                                                break;
                                            case 4:
/* 236 */                                       name = IIl001iO0Io.I00000oOI(field2.getName(), '_').toUpperCase(Locale.ENGLISH);
                                                break;
                                            case 5:
/* 221 */                                       name = IIl001iO0Io.I00000oOI(field2.getName(), '_').toLowerCase(Locale.ENGLISH);
                                                break;
                                            case 6:
/* 206 */                                       name = IIl001iO0Io.I00000oOI(field2.getName(), '-').toLowerCase(Locale.ENGLISH);
                                                break;
                                            default:
/* 189 */                                       name = IIl001iO0Io.I00000oOI(field2.getName(), '.').toLowerCase(Locale.ENGLISH);
                                                break;
                                        }
/* 269 */                               listAsList = Collections.EMPTY_LIST;
                                    } else {
/* 272 */                               String strValue = oiliO0I.value();
/* 280 */                               listAsList = Arrays.asList(oiliO0I.alternate());
/* 287 */                               name = strValue;
                                    }
/* 293 */                           if (listAsList.isEmpty()) {
/* 304 */                               z3 = true;
/* 314 */                               ArrayList arrayList = new ArrayList(listAsList.size() + 1);
/* 317 */                               arrayList.add(name);
/* 320 */                               arrayList.addAll(listAsList);
/* 323 */                               SingletonList = arrayList;
/* 324 */                               r2 = 0;
                                    } else {
/* 299 */                               z3 = true;
/* 301 */                               r2 = z7;
/* 295 */                               SingletonList = Collections.singletonList(name);
                                    }
/* 329 */                           String str2 = (String) SingletonList.get(r2);
/* 334 */                           OoOilO ooOilO3 = new OoOilO(typeI000II);
/* 337 */                           Class cls3 = ooOilO3.I00000oIO;
/* 350 */                           boolean z8 = (cls3 == null && cls3.isPrimitive()) ? z3 : r2;
/* 351 */                           int modifiers = field2.getModifiers();
/* 370 */                           boolean z9 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r2 : z3;
/* 378 */                           o011liOil = (O011liOil) field2.getAnnotation(O011liOil.class);
/* 380 */                           if (o011liOil == null) {
/* 384 */                               O011oOIoO00O o011oOIoO00O = oOoilIIoIo.I00iio;
/* 389 */                               IIlio101Io iIlio101Io = oOoilIIoIo.I00iOIl;
/* 394 */                               i = length;
/* 396 */                               field = field2;
/* 398 */                               str = str2;
/* 400 */                               z5 = false;
/* 402 */                               z4 = z3;
/* 404 */                               fieldArr = declaredFields;
/* 406 */                               method = methodI00000oIO;
/* 408 */                               list = SingletonList;
/* 410 */                               z6 = z8;
/* 411 */                               ooIlIoo1oiOo2 = ooIlIoo1oiOo;
/* 413 */                               ooO00O1IiOlI0000O = o011oOIoO00O.I00000oOI(iIlio101Io, ooIlIoo1oiOo2, ooOilO3, o011liOil, false);
                                    } else {
/* 418 */                               z4 = z3;
/* 420 */                               field = field2;
/* 421 */                               fieldArr = declaredFields;
/* 423 */                               i = length;
/* 425 */                               list = SingletonList;
/* 427 */                               z5 = false;
/* 429 */                               z6 = z8;
/* 430 */                               method = methodI00000oIO;
/* 431 */                               str = str2;
/* 432 */                               ooIlIoo1oiOo2 = ooIlIoo1oiOo;
/* 434 */                               ooO00O1IiOlI0000O = null;
                                    }
/* 441 */                           boolean z10 = ooO00O1IiOlI0000O == null ? z4 : z5;
/* 443 */                           if (ooO00O1IiOlI0000O == null) {
/* 445 */                               ooO00O1IiOlI0000O = ooIlIoo1oiOo2.I0000O(ooOilO3);
                                    }
/* 462 */                           OoO00O1IiOl o00o1oIoiO = (zI0000O || z10) ? ooO00O1IiOlI0000O : new O00o1oIoiO(ooIlIoo1oiOo2, ooO00O1IiOlI0000O, ooOilO3.I00000oOI);
/* 465 */                           OOoiOl101 oOoiOl1012 = new OOoiOl101();
/* 468 */                           oOoiOl1012.I0000O = method;
/* 470 */                           oOoiOl1012.I0000oI00 = o00o1oIoiO;
/* 472 */                           oOoiOl1012.I0001Ioi1lo = ooO00O1IiOlI0000O;
/* 474 */                           oOoiOl1012.I000II = z6;
/* 478 */                           oOoiOl1012.I000O01llI0 = z9;
/* 480 */                           oOoiOl1012.I00000oIO = str;
/* 482 */                           oOoiOl1012.I00000oOI = field;
/* 488 */                           oOoiOl1012.I0000Il00O = field.getName();
/* 490 */                           VarHandle.storeStoreFence();
/* 493 */                           if (z2) {
/* 503 */                               for (String str3 : list) {
/* 515 */                                   OOoiOl101 oOoiOl1013 = (OOoiOl101) linkedHashMap.put(str3, oOoiOl1012);
/* 517 */                                   if (oOoiOl1013 != null) {
/* 522 */                                       I00000oOI(cls, str3, oOoiOl1013.I00000oOI, field);
/* 525 */                                       throw null;
                                            }
                                        }
                                    }
/* 526 */                           if (zI0000O && (oOoiOl101 = (OOoiOl101) linkedHashMap2.put(str, oOoiOl1012)) != null) {
/* 539 */                               I00000oOI(cls, str, oOoiOl101.I00000oOI, field);
/* 542 */                               throw null;
                                    }
                                }
/* 95 */                        methodI00000oIO = null;
/* 144 */                       if (methodI00000oIO == null) {
                                }
/* 158 */                       Type typeI000II2 = iIllolOO.I000II(type, cls2, field2.getGenericType(), new HashMap());
/* 162 */                       int i32 = oOoilIIoIo.I00iiI;
/* 168 */                       oiliO0I = (OiliO0I) field2.getAnnotation(OiliO0I.class);
/* 170 */                       if (oiliO0I != null) {
                                }
/* 293 */                       if (listAsList.isEmpty()) {
                                }
/* 329 */                       String str22 = (String) SingletonList.get(r2);
/* 334 */                       OoOilO ooOilO32 = new OoOilO(typeI000II2);
/* 337 */                       Class cls32 = ooOilO32.I00000oIO;
/* 350 */                       if (cls32 == null) {
/* 351 */                           int modifiers2 = field2.getModifiers();
/* 370 */                           if (Modifier.isStatic(modifiers2)) {
/* 378 */                               o011liOil = (O011liOil) field2.getAnnotation(O011liOil.class);
/* 380 */                               if (o011liOil == null) {
                                        }
/* 441 */                               if (ooO00O1IiOlI0000O == null) {
                                        }
/* 443 */                               if (ooO00O1IiOlI0000O == null) {
                                        }
/* 462 */                               if (zI0000O) {
/* 465 */                                   OOoiOl101 oOoiOl10122 = new OOoiOl101();
/* 468 */                                   oOoiOl10122.I0000O = method;
/* 470 */                                   oOoiOl10122.I0000oI00 = o00o1oIoiO;
/* 472 */                                   oOoiOl10122.I0001Ioi1lo = ooO00O1IiOlI0000O;
/* 474 */                                   oOoiOl10122.I000II = z6;
/* 478 */                                   oOoiOl10122.I000O01llI0 = z9;
/* 480 */                                   oOoiOl10122.I00000oIO = str;
/* 482 */                                   oOoiOl10122.I00000oOI = field;
/* 488 */                                   oOoiOl10122.I0000Il00O = field.getName();
/* 490 */                                   VarHandle.storeStoreFence();
/* 493 */                                   if (z2) {
                                            }
/* 526 */                                   if (zI0000O) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 69 */                        fieldArr = declaredFields;
/* 71 */                        i = length;
/* 73 */                        z5 = z7;
                            }
/* 543 */                   i2++;
/* 545 */                   oOoilIIoIo = this;
/* 547 */                   declaredFields = fieldArr;
/* 549 */                   length = i;
/* 551 */                   z7 = z5;
                        }
/* 572 */               ooOilO2 = new OoOilO(iIllolOO.I000II(type, cls2, cls2.getGenericSuperclass(), new HashMap()));
/* 575 */               cls2 = ooOilO2.I00000oIO;
/* 577 */               oOoilIIoIo = this;
                    }
                }

                public final boolean I0000O(Field field, boolean z) {
                    boolean z2;
/* 1 */             Il11i1 il11i1 = this.I00iiO;
/* 3 */             il11i1.getClass();
/* 14 */            if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || il11i1.I00000oOI(field.getType(), z)) {
/* 16 */                z2 = true;
                    } else {
/* 41 */                List list = z ? il11i1.I00iOIl : il11i1.I00iiI;
/* 47 */                if (!list.isEmpty()) {
/* 49 */                    Iterator it = list.iterator();
/* 57 */                    if (it.hasNext()) {
/* 64 */                        throw IIlIOloOOO.I000lI(it);
                            }
                        }
/* 65 */                z2 = false;
                    }
/* 66 */            return !z2;
                }
            }
