            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OoOilo0Oliii {
                public static final Il0oo01OllO0 I00000oIO = Il0ooiloI.I00000oOI(Il0ooO1IO.I00ll1, new String[0]);
                public static final Il0oo01OllO0 I00000oOI = Il0ooiloI.I00000oOI(Il0ooO1IO.I00l0I0l0lO1, new String[0]);
                public static final OoOill01OIO I0000Il00O = new OoOill01OIO("NO_EXPECTED_TYPE");
                public static final OoOill01OIO I0000O = new OoOill01OIO("UNIT_EXPECTED_TYPE");

                /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(int i) {
                    String str;
                    int i2;
/* 24 */            if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
                        switch (i) {
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                                break;
                            default:
/* 51 */                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break;
                        }
                    } else {
/* 54 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 57 */            if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
                        switch (i) {
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                                break;
                            default:
/* 84 */                        i2 = 3;
                                break;
                        }
                    } else {
/* 86 */                i2 = 2;
                    }
/* 87 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 4:
                        case 6:
                        case 7:
                        case 9:
                        case 11:
                        case 15:
                        case 17:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_KNEE:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                        case 48:
                        case 53:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
/* 216 */                   objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                            break;
                        case 5:
                        case 8:
                        case 10:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case 27:
                        case PoseLandmark.RIGHT_ANKLE:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
                        case 38:
                        case 40:
                        default:
/* 98 */                    objArr[0] = "type";
                            break;
                        case 12:
/* 213 */                   objArr[0] = "typeConstructor";
                            break;
                        case 13:
/* 208 */                   objArr[0] = "unsubstitutedMemberScope";
                            break;
                        case 14:
/* 203 */                   objArr[0] = "refinedTypeFactory";
                            break;
                        case 16:
/* 198 */                   objArr[0] = "parameters";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 193 */                   objArr[0] = "subType";
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 188 */                   objArr[0] = "superType";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 183 */                   objArr[0] = "substitutor";
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 178 */                   objArr[0] = "result";
                            break;
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 33:
/* 173 */                   objArr[0] = "clazz";
                            break;
                        case 32:
/* 168 */                   objArr[0] = "typeArguments";
                            break;
                        case 34:
/* 163 */                   objArr[0] = "projections";
                            break;
                        case 36:
/* 158 */                   objArr[0] = "a";
                            break;
                        case 37:
/* 153 */                   objArr[0] = "b";
                            break;
                        case 39:
/* 148 */                   objArr[0] = "typeParameters";
                            break;
                        case 41:
/* 143 */                   objArr[0] = "typeParameterConstructors";
                            break;
                        case 42:
/* 138 */                   objArr[0] = "specialType";
                            break;
                        case 43:
                        case 44:
/* 133 */                   objArr[0] = "isSpecialType";
                            break;
                        case BuildConfig.VERSION_CODE:
                        case 46:
/* 128 */                   objArr[0] = "parameterDescriptor";
                            break;
                        case 47:
                        case 51:
/* 122 */                   objArr[0] = "numberValueTypeConstructor";
                            break;
                        case 49:
                        case 50:
/* 116 */                   objArr[0] = "supertypes";
                            break;
                        case 52:
                        case 55:
/* 110 */                   objArr[0] = "expectedType";
                            break;
                        case 54:
/* 104 */                   objArr[0] = "literalTypeConstructor";
                            break;
                    }
/* 238 */           if (i == 4) {
/* 292 */               objArr[1] = "makeNullableAsSpecified";
                    } else if (i == 9) {
/* 289 */               objArr[1] = "makeNullableIfNeeded";
                    } else if (i == 11 || i == 15) {
/* 286 */               objArr[1] = "makeUnsubstitutedType";
                    } else if (i == 17) {
/* 283 */               objArr[1] = "getDefaultTypeProjections";
                    } else if (i == 19) {
/* 280 */               objArr[1] = "getImmediateSupertypes";
                    } else if (i == 26) {
/* 277 */               objArr[1] = "getAllSupertypes";
                    } else if (i == 35) {
/* 274 */               objArr[1] = "substituteProjectionsForParameters";
                    } else if (i == 48) {
/* 271 */               objArr[1] = "getDefaultPrimitiveNumberType";
                    } else if (i != 53) {
/* 258 */               if (i != 6 && i != 7) {
                            switch (i) {
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    break;
                                default:
/* 265 */                           objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    } else {
/* 268 */               objArr[1] = "getPrimitiveNumberType";
                    }
                    switch (i) {
                        case 1:
/* 435 */                   objArr[2] = "makeNullable";
                            break;
                        case 2:
/* 430 */                   objArr[2] = "makeNotNullable";
                            break;
                        case 3:
/* 425 */                   objArr[2] = "makeNullableAsSpecified";
                            break;
                        case 4:
                        case 6:
                        case 7:
                        case 9:
                        case 11:
                        case 15:
                        case 17:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_KNEE:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                        case 48:
                        case 53:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            break;
                        case 5:
                        case 8:
/* 422 */                   objArr[2] = "makeNullableIfNeeded";
                            break;
                        case 10:
/* 419 */                   objArr[2] = "canHaveSubtypes";
                            break;
                        case 12:
                        case 13:
                        case 14:
/* 414 */                   objArr[2] = "makeUnsubstitutedType";
                            break;
                        case 16:
/* 411 */                   objArr[2] = "getDefaultTypeProjections";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 408 */                   objArr[2] = "getImmediateSupertypes";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
/* 405 */                   objArr[2] = "createSubstitutedSupertype";
                            break;
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
/* 400 */                   objArr[2] = "collectAllSupertypes";
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 395 */                   objArr[2] = "getAllSupertypes";
                            break;
                        case 27:
/* 392 */                   objArr[2] = "isNullableType";
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 387 */                   objArr[2] = "acceptsNullable";
                            break;
                        case PoseLandmark.LEFT_HEEL:
/* 382 */                   objArr[2] = "hasNullableSuperType";
                            break;
                        case 30:
/* 377 */                   objArr[2] = "getClassDescriptor";
                            break;
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 32:
/* 372 */                   objArr[2] = "substituteParameters";
                            break;
                        case 33:
                        case 34:
/* 367 */                   objArr[2] = "substituteProjectionsForParameters";
                            break;
                        case 36:
                        case 37:
/* 364 */                   objArr[2] = "equalTypes";
                            break;
                        case 38:
                        case 39:
/* 359 */                   objArr[2] = "dependsOnTypeParameters";
                            break;
                        case 40:
                        case 41:
/* 354 */                   objArr[2] = "dependsOnTypeConstructors";
                            break;
                        case 42:
                        case 43:
                        case 44:
/* 349 */                   objArr[2] = "contains";
                            break;
                        case BuildConfig.VERSION_CODE:
                        case 46:
/* 343 */                   objArr[2] = "makeStarProjection";
                            break;
                        case 47:
                        case 49:
/* 337 */                   objArr[2] = "getDefaultPrimitiveNumberType";
                            break;
                        case 50:
/* 333 */                   objArr[2] = "findByFqName";
                            break;
                        case 51:
                        case 52:
                        case 54:
                        case 55:
/* 327 */                   objArr[2] = "getPrimitiveNumberType";
                            break;
                        case 60:
/* 323 */                   objArr[2] = "isTypeParameter";
                            break;
                        case 61:
/* 317 */                   objArr[2] = "isReifiedTypeParameter";
                            break;
                        case 62:
/* 311 */                   objArr[2] = "isNonReifiedTypeParameter";
                            break;
                        case 63:
/* 305 */                   objArr[2] = "getTypeParameterDescriptorOrNull";
                            break;
                        default:
/* 299 */                   objArr[2] = "noExpectedType";
                            break;
                    }
/* 437 */           String str2 = String.format(str, objArr);
/* 441 */           if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
                        switch (i) {
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                                break;
                            default:
/* 479 */                       throw new IllegalArgumentException(str2);
                        }
                    }
/* 479 */           throw new IllegalStateException(str2);
                }

                public static boolean I00000oOI(O0iIl1 o0iIl1) {
/* 1 */             if (o0iIl1 == null) {
/* 38 */                I00000oIO(28);
/* 49 */                throw null;
                    }
/* 7 */             if (o0iIl1.I00iiI()) {
/* 32 */                return true;
                    }
                    return (o0iIl1.I00l0OO0IO() instanceof IlOIOIi00io) && I00000oOI(((IlOIOIi00io) o0iIl1.I00l0OO0IO()).I00iiO);
                }

                public static boolean I0000Il00O(O0iIl1 o0iIl1, Function1 function1, Ol1OI1II0ll ol1OI1II0ll) {
/* 1 */             if (o0iIl1 == null) {
/* 177 */               return false;
                    }
/* 5 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 13 */            if (I000lI(o0iIl1)) {
/* 21 */                return ((Boolean) function1.invoke(ooioo0o1l0I00l0OO0IO)).booleanValue();
                    }
/* 26 */            if (ol1OI1II0ll != null && ol1OI1II0ll.contains(o0iIl1)) {
/* 177 */               return false;
                    }
/* 46 */            if (((Boolean) function1.invoke(ooioo0o1l0I00l0OO0IO)).booleanValue()) {
/* 175 */               return true;
                    }
/* 50 */            if (ol1OI1II0ll == null) {
/* 54 */                ol1OI1II0ll = new Ol1OI1II0ll();
                    }
/* 57 */            ol1OI1II0ll.add(o0iIl1);
/* 68 */            IlOIOIi00io ilOIOIi00io = ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io ? (IlOIOIi00io) ooioo0o1l0I00l0OO0IO : null;
/* 69 */            if (ilOIOIi00io != null && (I0000Il00O(ilOIOIi00io.I00iiI, function1, ol1OI1II0ll) || I0000Il00O(ilOIOIi00io.I00iiO, function1, ol1OI1II0ll))) {
/* 175 */               return true;
                    }
/* 90 */            if ((ooioo0o1l0I00l0OO0IO instanceof IiIiOIi0) && I0000Il00O(((IiIiOIi0) ooioo0o1l0I00l0OO0IO).I00iiI, function1, ol1OI1II0ll)) {
/* 175 */               return true;
                    }
/* 103 */           OoOIOoO1I ooOIOoO1II00iOIl = o0iIl1.I00iOIl();
/* 109 */           if (ooOIOoO1II00iOIl instanceof Iooo1o0oiOo) {
/* 115 */               Iterator it = ((Iooo1o0oiOo) ooOIOoO1II00iOIl).I00iiI.iterator();
/* 123 */               while (it.hasNext()) {
/* 135 */                   if (I0000Il00O((O0iIl1) it.next(), function1, ol1OI1II0ll)) {
/* 175 */                       return true;
                            }
                        }
/* 177 */               return false;
                    }
/* 150 */           for (OoOi1Ol ooOi1Ol : o0iIl1.I00OIl()) {
/* 162 */               if (!ooOi1Ol.I0000Il00O() && I0000Il00O(ooOi1Ol.I00000oOI(), function1, ol1OI1II0ll)) {
/* 175 */                   return true;
                        }
                    }
/* 177 */           return false;
                }

                public static List I0000O(List list) {
/* 1 */             if (list == null) {
/* 48 */                I00000oIO(16);
/* 186 */               throw null;
                    }
/* 9 */             ArrayList arrayList = new ArrayList(list.size());
/* 12 */            Iterator it = list.iterator();
/* 20 */            while (it.hasNext()) {
/* 37 */                arrayList.add(new OlIo1I(((OoOOiO) it.next()).I00Ol10()));
                    }
/* 41 */            return IOOi0Ool1i.I00iIi0i1o(arrayList);
                }

                public static boolean I0000oI00(O0iIl1 o0iIl1) {
/* 2 */             if (o0iIl1 == null) {
/* 198 */               I00000oIO(27);
/* 966 */               throw null;
                    }
/* 9 */             if (!o0iIl1.I00iiI() && (!(o0iIl1.I00l0OO0IO() instanceof IlOIOIi00io) || !I0000oI00(((IlOIOIi00io) o0iIl1.I00l0OO0IO()).I00iiO))) {
/* 44 */                if (!(o0iIl1.I00l0OO0IO() instanceof IiIiOIi0)) {
/* 52 */                    if (I0001Ioi1lo(o0iIl1)) {
/* 64 */                        if (!(o0iIl1.I00iOIl().I00100o1O0lo() instanceof OI000ilOol)) {
/* 67 */                            OoOilII0 ooOilII0I0000O = OoOilII0.I0000O(o0iIl1);
/* 75 */                            Collection<O0iIl1> collectionI0000oI00 = o0iIl1.I00iOIl().I0000oI00();
/* 85 */                            ArrayList arrayList = new ArrayList(collectionI0000oI00.size());
/* 96 */                            for (O0iIl1 o0iIl12 : collectionI0000oI00) {
/* 104 */                               if (o0iIl12 == null) {
/* 132 */                                   I00000oIO(21);
/* 135 */                                   throw null;
                                        }
/* 108 */                               O0iIl1 o0iIl1I000O01llI0 = ooOilII0I0000O.I000O01llI0(o0iIl12, Ooo0Ioii0o0.I00iiO);
/* 123 */                               O0iIl1 o0iIl1I000OOo1O = o0iIl1I000O01llI0 != null ? I000OOo1O(o0iIl1I000O01llI0, o0iIl1.I00iiI()) : null;
/* 124 */                               if (o0iIl1I000OOo1O != null) {
/* 126 */                                   arrayList.add(o0iIl1I000OOo1O);
                                        }
                                    }
/* 136 */                           Iterator it = arrayList.iterator();
/* 144 */                           while (it.hasNext()) {
/* 156 */                               if (I0000oI00((O0iIl1) it.next())) {
/* 8 */                                     return true;
                                        }
                                    }
                                }
/* 43 */                        return false;
                            }
/* 160 */                   OoOIOoO1I ooOIOoO1II00iOIl = o0iIl1.I00iOIl();
/* 166 */                   if (ooOIOoO1II00iOIl instanceof Iooo1o0oiOo) {
/* 172 */                       Iterator it2 = ((Iooo1o0oiOo) ooOIOoO1II00iOIl).I00iiI.iterator();
/* 180 */                       while (it2.hasNext()) {
/* 192 */                           if (I0000oI00((O0iIl1) it2.next())) {
                                    }
                                }
                            }
                        }
/* 43 */                return false;
                    }
/* 8 */             return true;
                }

                public static boolean I0001Ioi1lo(O0iIl1 o0iIl1) {
/* 2 */             if (o0iIl1 == null) {
/* 37 */                I00000oIO(60);
/* 49 */                throw null;
                    }
/* 26 */            if ((o0iIl1.I00iOIl().I00100o1O0lo() instanceof OoOOiO ? (OoOOiO) o0iIl1.I00iOIl().I00100o1O0lo() : null) != null) {
/* 33 */                return true;
                    }
/* 28 */            o0iIl1.I00iOIl();
/* 31 */            return false;
                }

                public static Ooioo0o1l0 I000II(O0iIl1 o0iIl1) {
/* 2 */             if (o0iIl1 != null) {
/* 4 */                 return I000O01llI0(o0iIl1, true);
                    }
/* 9 */             I00000oIO(1);
/* 49 */            throw null;
                }

                public static Ooioo0o1l0 I000O01llI0(O0iIl1 o0iIl1, boolean z) {
/* 2 */             if (o0iIl1 == null) {
/* 21 */                I00000oIO(3);
/* 89 */                throw null;
                    }
/* 8 */             Ooioo0o1l0 ooioo0o1l0I00li1OI = o0iIl1.I00l0OO0IO().I00li1OI(z);
/* 12 */            if (ooioo0o1l0I00li1OI != null) {
/* 14 */                return ooioo0o1l0I00li1OI;
                    }
/* 16 */            I00000oIO(4);
/* 19 */            throw null;
                }

                public static O0iIl1 I000OOo1O(O0iIl1 o0iIl1, boolean z) {
/* 1 */             if (o0iIl1 != null) {
                        return z ? I000O01llI0(o0iIl1, true) : o0iIl1;
                    }
/* 13 */            I00000oIO(8);
/* 89 */            throw null;
                }

                public static Ol0O0iI0l0O I000OiO(Ol0O0iI0l0O ol0O0iI0l0O, boolean z) {
/* 2 */             if (ol0O0iI0l0O == null) {
/* 21 */                I00000oIO(5);
/* 89 */                throw null;
                    }
/* 4 */             if (!z) {
/* 19 */                return ol0O0iI0l0O;
                    }
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0OI00li1OI = ol0O0iI0l0O.I00li1OI(true);
/* 11 */            if (ol0O0iI0l0OI00li1OI != null) {
/* 13 */                return ol0O0iI0l0OI00li1OI;
                    }
/* 15 */            I00000oIO(6);
/* 18 */            throw null;
                }

                public static OlIo1I I000iOII(OoOOiO ooOOiO) {
/* 1 */             if (ooOOiO != null) {
/* 5 */                 return new OlIo1I(ooOOiO);
                    }
/* 11 */            I00000oIO(45);
/* 49 */            throw null;
                }

                public static OoOi1Ol I000l1(OoOOiO ooOOiO, O00oiI0oo0ol o00oiI0oo0ol) {
/* 1 */             if (ooOOiO != null) {
                        return o00oiI0oo0ol.I00000oIO == OoOilOl1.I00iOIl ? new OlIo1I(lOOOl0OIioo0.I00000oOI(ooOOiO)) : new OlIo1I(ooOOiO);
                    }
/* 27 */            I00000oIO(46);
/* 89 */            throw null;
                }

                public static boolean I000lI(O0iIl1 o0iIl1) {
/* 2 */             if (o0iIl1 != null) {
                        return o0iIl1 == I0000Il00O || o0iIl1 == I0000O;
                    }
/* 16 */            I00000oIO(0);
/* 49 */            throw null;
                }
            }
