            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.Arrays;
            
            public abstract class O01IIoOl implements O0O01001OOII {
                public final O0IOli0o0 I00000oIO;
                public final OilOoi I00000oOI;

                public O01IIoOl(O0IOli0o0 o0IOli0o0) {
/* 4 */             this.I00000oIO = o0IOli0o0;
/* 38 */            this.I00000oOI = lO1o10lllO0I.I00000oOI("JsonContentPolymorphicSerializer<" + o0IOli0o0.I000oI1ioi() + '>', OO1l1i.I0000Il00O, new OilOloI[0], new OiioI1Io0o(5));
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             O01IlO o01IlOI00000oIO = l0I00OIIlII.I00000oIO(ii1iO1O);
/* 5 */             O01O0o1iI o01O0o1iII000OiO = o01IlOI00000oIO.I000OiO();
/* 21 */            return o01IlOI00000oIO.I001i1lo1io().I00000oIO(I0000oI00(o01O0o1iII000OiO), o01O0o1iII000OiO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
                
                    r4 = null;
                 */
                /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x01dd  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0198 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0125 A[PHI: r4
                  0x0125: PHI (r4v27 O0O01001OOII) = (r4v2 O0O01001OOII), (r4v13 O0O01001OOII) binds: [B:62:0x0123, B:106:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x017e A[Catch: NoSuchFieldException -> 0x0196, TryCatch #2 {NoSuchFieldException -> 0x0196, blocks: (B:83:0x0174, B:85:0x017e, B:96:0x019e, B:90:0x0192), top: B:134:0x0174 }] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x019e A[Catch: NoSuchFieldException -> 0x0196, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x0196, blocks: (B:83:0x0174, B:85:0x017e, B:96:0x019e, B:90:0x0192), top: B:134:0x0174 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    Object obj2;
                    O0O01001OOII o0o01001ooiiI00000oIO;
                    Field field;
                    Object obj3;
                    OO1lO1i00 oO1lO1i00;
                    int length;
                    int i;
                    Class<?> cls;
                    Object obj4;
                    OO1lO1i00 oO1lO1i002;
                    O0O01001OOII il0lloiOlO;
                    Field field2;
                    Method method;
/* 3 */             i1i0olI i1i0oliI00000oIO = il0I1ii.I00000oIO();
/* 9 */             O0IOli0o0 o0IOli0o0 = this.I00000oIO;
/* 11 */            i1i0oliI00000oIO.I000oI1ioi(o0IOli0o0, obj);
/* 14 */            Class<?> cls2 = obj.getClass();
/* 18 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 20 */            O0IOli0o0 o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(cls2);
/* 30 */            Class clsI001l0I00 = ((IOIO10iOi1) o0IOli0o0I00000oOI).I001l0I00();
/* 38 */            O0O01001OOII[] o0o01001ooiiArr = (O0O01001OOII[]) Arrays.copyOf(new O0O01001OOII[0], 0);
/* 48 */            if (clsI001l0I00.isEnum() && clsI001l0I00.getAnnotation(Oili0O.class) == null && clsI001l0I00.getAnnotation(OO1l10.class) == null) {
/* 74 */                il0lloiOlO = new Il0lloiOlO(clsI001l0I00.getCanonicalName(), (Enum[]) clsI001l0I00.getEnumConstants());
                    } else {
/* 84 */                O0O01001OOII[] o0o01001ooiiArr2 = (O0O01001OOII[]) Arrays.copyOf(o0o01001ooiiArr, o0o01001ooiiArr.length);
                        try {
/* 90 */                    Field declaredField = clsI001l0I00.getDeclaredField("Companion");
/* 94 */                    declaredField.setAccessible(true);
/* 97 */                    obj2 = declaredField.get(null);
                        } catch (Throwable unused) {
/* 102 */                   obj2 = null;
                        }
/* 114 */               O0O01001OOII o0o01001ooiiI00000oIO2 = obj2 == null ? null : lI10OoOI.I00000oIO(obj2, (O0O01001OOII[]) Arrays.copyOf(o0o01001ooiiArr2, o0o01001ooiiArr2.length));
/* 118 */               if (o0o01001ooiiI00000oIO2 != null) {
/* 120 */                   il0lloiOlO = o0o01001ooiiI00000oIO2;
                        } else {
/* 123 */                   String canonicalName = clsI001l0I00.getCanonicalName();
/* 129 */                   if (canonicalName == null || OlOolloIIOl0.I000l1(canonicalName, "java.", false) || OlOolloIIOl0.I000l1(canonicalName, "kotlin.", false)) {
/* 279 */                       o0o01001ooiiI00000oIO = null;
/* 292 */                       if (o0o01001ooiiI00000oIO == null) {
/* 294 */                           il0lloiOlO = o0o01001ooiiI00000oIO;
                                } else {
/* 302 */                           O0O01001OOII[] o0o01001ooiiArr3 = (O0O01001OOII[]) Arrays.copyOf(o0o01001ooiiArr, o0o01001ooiiArr.length);
/* 304 */                           Field[] declaredFields = clsI001l0I00.getDeclaredFields();
/* 308 */                           int length2 = declaredFields.length;
/* 309 */                           int i2 = 0;
                                    while (true) {
/* 310 */                               if (i2 >= length2) {
/* 340 */                                   field = null;
                                            break;
                                        }
/* 312 */                               field = declaredFields[i2];
/* 322 */                               if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(OI1Ioolo0lI.class) != null) {
                                            break;
                                        } else {
/* 337 */                                   i2++;
                                        }
                                    }
/* 341 */                           if (field != null) {
                                        try {
/* 347 */                                   field.setAccessible(true);
/* 351 */                                   obj3 = field.get(null);
                                        } catch (Throwable unused2) {
                                        }
/* 356 */                               if (obj3 != null || (o0o01001ooiiI00000oIO = lI10OoOI.I00000oIO(obj3, (O0O01001OOII[]) Arrays.copyOf(o0o01001ooiiArr3, o0o01001ooiiArr3.length))) == null) {
                                            try {
/* 373 */                                       Class<?>[] declaredClasses = clsI001l0I00.getDeclaredClasses();
/* 377 */                                       length = declaredClasses.length;
/* 378 */                                       i = 0;
/* 379 */                                       boolean z = false;
/* 380 */                                       Class<?> cls3 = null;
                                                while (true) {
/* 381 */                                           if (i >= length) {
/* 383 */                                               Class<?> cls4 = declaredClasses[i];
/* 395 */                                               if (cls4.getSimpleName().equals("$serializer")) {
/* 397 */                                                   if (z) {
                                                                break;
                                                            }
/* 401 */                                                   cls3 = cls4;
/* 402 */                                                   z = true;
                                                        }
/* 403 */                                               i++;
                                                    } else if (z) {
/* 412 */                                               cls = cls3;
                                                    }
                                                }
/* 399 */                                       cls = null;
                                            } catch (NoSuchFieldException unused3) {
/* 407 */                                       oO1lO1i00 = null;
                                            }
/* 413 */                                   if (cls == null) {
/* 415 */                                       Field field3 = cls.getField("INSTANCE");
/* 419 */                                       if (field3 != null) {
/* 421 */                                           oO1lO1i00 = null;
                                                    try {
/* 422 */                                               obj4 = field3.get(null);
                                                    } catch (NoSuchFieldException unused4) {
                                                    }
                                                } else {
/* 427 */                                           oO1lO1i00 = null;
/* 428 */                                           obj4 = null;
                                                }
/* 436 */                                       o0o01001ooiiI00000oIO = obj4 instanceof O0O01001OOII ? (O0O01001OOII) obj4 : oO1lO1i00;
                                            }
                                        } else {
/* 371 */                                   oO1lO1i00 = null;
                                        }
/* 437 */                               if (o0o01001ooiiI00000oIO == null) {
/* 445 */                                   if (clsI001l0I00.getAnnotation(OO1l10.class) == null) {
/* 452 */                                       Oili0O oili0O = (Oili0O) clsI001l0I00.getAnnotation(Oili0O.class);
/* 454 */                                       if (oili0O != null) {
/* 456 */                                           Class clsWith = oili0O.with();
/* 460 */                                           OOoOl1001II oOoOl1001II2 = OOoOl0i.I00000oIO;
/* 476 */                                           if (oOoOl1001II2.I00000oOI(clsWith).equals(oOoOl1001II2.I00000oOI(OO1lO1i00.class))) {
/* 482 */                                               O0IOli0o0 o0IOli0o0I00000oOI2 = OOoOl0i.I00000oIO.I00000oOI(clsI001l0I00);
/* 486 */                                               oO1lO1i002 = new OO1lO1i00();
/* 489 */                                               oO1lO1i002.I00000oIO = o0IOli0o0I00000oOI2;
/* 491 */                                               O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 496 */                                               OIOo1iiI oIOo1iiI = new OIOo1iiI(2);
/* 499 */                                               oIOo1iiI.I00iiI = oO1lO1i002;
/* 501 */                                               VarHandle.storeStoreFence();
/* 508 */                                               oO1lO1i002.I00000oOI = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oIOo1iiI);
/* 510 */                                               VarHandle.storeStoreFence();
                                                    }
/* 515 */                                           il0lloiOlO = oO1lO1i002;
                                                }
/* 514 */                                       oO1lO1i002 = oO1lO1i00;
/* 515 */                                       il0lloiOlO = oO1lO1i002;
                                            }
                                        }
                                    }
/* 344 */                           obj3 = null;
/* 356 */                           if (obj3 != null) {
/* 373 */                               Class<?>[] declaredClasses2 = clsI001l0I00.getDeclaredClasses();
/* 377 */                               length = declaredClasses2.length;
/* 378 */                               i = 0;
/* 379 */                               boolean z2 = false;
/* 380 */                               Class<?> cls32 = null;
                                        while (true) {
/* 381 */                                   if (i >= length) {
                                            }
/* 403 */                                   i++;
                                        }
/* 399 */                               cls = null;
/* 413 */                               if (cls == null) {
                                        }
                                    }
                                }
                            } else {
/* 149 */                       Field[] declaredFields2 = clsI001l0I00.getDeclaredFields();
/* 153 */                       int length3 = declaredFields2.length;
/* 154 */                       int i3 = 0;
/* 155 */                       boolean z3 = false;
/* 156 */                       Field field4 = null;
                                while (true) {
/* 158 */                           if (i3 < length3) {
/* 160 */                               Field field5 = declaredFields2[i3];
/* 170 */                               if (O0000Ioio00.I0000O(field5.getName(), "INSTANCE") && O0000Ioio00.I0000O(field5.getType(), clsI001l0I00) && Modifier.isStatic(field5.getModifiers())) {
/* 192 */                                   if (z3) {
                                                break;
                                            }
/* 196 */                                   z3 = true;
/* 197 */                                   field4 = field5;
                                        }
/* 199 */                               i3++;
                                    } else if (!z3) {
                                        break;
                                    } else {
/* 206 */                               field2 = field4;
                                    }
                                }
/* 208 */                       if (field2 == null) {
/* 210 */                           o0o01001ooiiI00000oIO = null;
                                } else {
/* 212 */                           Object obj5 = field2.get(null);
/* 216 */                           Method[] methods = clsI001l0I00.getMethods();
/* 220 */                           int length4 = methods.length;
/* 221 */                           Method method2 = null;
/* 223 */                           int i4 = 0;
/* 224 */                           boolean z4 = false;
                                    while (true) {
/* 225 */                               if (i4 < length4) {
/* 227 */                                   Method method3 = methods[i4];
/* 239 */                                   if (O0000Ioio00.I0000O(method3.getName(), "serializer") && method3.getParameterTypes().length == 0 && O0000Ioio00.I0000O(method3.getReturnType(), O0O01001OOII.class)) {
/* 260 */                                       if (z4) {
                                                    break;
                                                }
/* 264 */                                       method2 = method3;
/* 266 */                                       z4 = true;
                                            }
/* 267 */                                   i4++;
                                        } else if (!z4) {
                                            break;
                                        } else {
/* 275 */                                   method = method2;
                                        }
                                    }
/* 262 */                           method = null;
/* 277 */                           if (method != null) {
/* 282 */                               Object objInvoke = method.invoke(obj5, null);
/* 288 */                               if (objInvoke instanceof O0O01001OOII) {
/* 290 */                                   o0o01001ooiiI00000oIO = (O0O01001OOII) objInvoke;
                                        }
                                    }
                                }
/* 292 */                       if (o0o01001ooiiI00000oIO == null) {
                                }
                            }
                        }
                    }
/* 516 */           if (il0lloiOlO == null) {
/* 525 */               il0lloiOlO = (O0O01001OOII) OOIio001.I00000oIO.get(o0IOli0o0I00000oOI);
                    }
/* 527 */           if (il0lloiOlO != null) {
/* 535 */               il0lloiOlO.I0000Il00O(il0I1ii, obj);
/* 538 */               return;
                    }
/* 543 */           O0IOli0o0 o0IOli0o0I00000oOI3 = oOoOl1001II.I00000oOI(obj.getClass());
/* 547 */           String strI000oI1ioi = o0IOli0o0I00000oOI3.I000oI1ioi();
/* 551 */           if (strI000oI1ioi == null) {
/* 553 */               strI000oI1ioi = String.valueOf(o0IOli0o0I00000oOI3);
                    }
/* 2988 */          throw new Oili1O(Oi010OO0.I001IO000("Class '", strI000oI1ioi, "' is not registered for polymorphic serialization ", "in the scope of '" + o0IOli0o0.I000oI1ioi() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return this.I00000oOI;
                }

                public abstract O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI);
            }
