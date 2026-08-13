            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public class Ol0IioOo extends Illll0i {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol0IioOo(Ii1Ool1 ii1Ool1, Ol0IioOo ol0IioOo, I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1, int i, OlI1o0ooI olI1o0ooI) {
/* 18 */            super(i, i11IlOOO, ii1Ool1, ol0IioOo, oI1Iio0ii1, olI1o0ooI);
/* 2 */             if (ii1Ool1 == null) {
/* 43 */                I00l0I0l0lO1(0);
/* 1294 */              throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 38 */                I00l0I0l0lO1(1);
/* 41 */                throw null;
                    }
/* 6 */             if (oI1Iio0ii1 == null) {
/* 33 */                I00l0I0l0lO1(2);
/* 36 */                throw null;
                    }
/* 8 */             if (i == 0) {
/* 28 */                I00l0I0l0lO1(3);
/* 31 */                throw null;
                    }
/* 10 */            if (olI1o0ooI != null) {
                    } else {
/* 23 */                I00l0I0l0lO1(4);
/* 26 */                throw null;
                    }
                }

                public static void I00l0I0l0lO1(int i) {
/* 28 */            String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 46 */            Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 6:
                        case 27:
/* 104 */                   objArr[0] = "annotations";
                            break;
                        case 2:
                        case 7:
/* 99 */                    objArr[0] = "name";
                            break;
                        case 3:
                        case 8:
                        case PoseLandmark.RIGHT_KNEE:
/* 94 */                    objArr[0] = "kind";
                            break;
                        case 4:
                        case 9:
                        case PoseLandmark.RIGHT_ANKLE:
/* 89 */                    objArr[0] = "source";
                            break;
                        case 5:
                        default:
/* 56 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 10:
                        case 15:
                        case PoseLandmark.RIGHT_INDEX:
/* 84 */                    objArr[0] = "typeParameters";
                            break;
                        case 11:
                        case 16:
                        case PoseLandmark.LEFT_THUMB:
/* 79 */                    objArr[0] = "unsubstitutedValueParameters";
                            break;
                        case 12:
                        case 17:
                        case PoseLandmark.RIGHT_THUMB:
/* 74 */                    objArr[0] = "visibility";
                            break;
                        case 13:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
/* 69 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                            break;
                        case 14:
                        case PoseLandmark.LEFT_INDEX:
/* 66 */                    objArr[0] = "contextReceiverParameters";
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 61 */                    objArr[0] = "newOwner";
                            break;
                    }
/* 109 */           if (i == 13 || i == 18 || i == 23) {
/* 139 */               objArr[1] = "initialize";
                    } else if (i == 24) {
/* 136 */               objArr[1] = "getOriginal";
                    } else if (i == 29) {
/* 131 */               objArr[1] = "copy";
                    } else if (i != 30) {
/* 121 */               objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                    } else {
/* 126 */               objArr[1] = "newCopyBuilder";
                    }
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
/* 159 */                   objArr[2] = "create";
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
/* 154 */                   objArr[2] = "initialize";
                            break;
                        case 13:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
                            break;
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
                        case PoseLandmark.RIGHT_ANKLE:
/* 151 */                   objArr[2] = "createSubstitutedCopy";
                            break;
                        default:
/* 146 */                   objArr[2] = "<init>";
                            break;
                    }
/* 161 */           String str2 = String.format(str, objArr);
/* 165 */           if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
/* 188 */               throw new IllegalArgumentException(str2);
                    }
/* 188 */           throw new IllegalStateException(str2);
                }

                public static Ol0IioOo I0110OiO(Ii1Ool1 ii1Ool1, OI1Iio0ii1 oI1Iio0ii1, int i, OlI1o0ooI olI1o0ooI) {
/* 1 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 4 */             if (oI1Iio0ii1 == null) {
/* 34 */                I00l0I0l0lO1(7);
/* 483 */               throw null;
                    }
/* 6 */             if (i == 0) {
/* 29 */                I00l0I0l0lO1(8);
/* 32 */                throw null;
                    }
/* 8 */             if (olI1o0ooI != null) {
/* 17 */                return new Ol0IioOo(ii1Ool1, null, i11IiIloOo, oI1Iio0ii1, i, olI1o0ooI);
                    }
/* 23 */            I00l0I0l0lO1(9);
/* 26 */            throw null;
                }

                @Override
                public Illli0oiOOi I00iio() {
/* 3 */             return I010o0o0oO(OoOilII0.I00000oOI);
                }

                @Override
                public Illll0i I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 2 */             if (ii1Ool1 == null) {
/* 45 */                I00l0I0l0lO1(25);
/* 1294 */              throw null;
                    }
/* 4 */             if (i == 0) {
/* 39 */                I00l0I0l0lO1(26);
/* 42 */                throw null;
                    }
/* 6 */             if (i11IlOOO == null) {
/* 33 */                I00l0I0l0lO1(27);
/* 36 */                throw null;
                    }
/* 11 */            Ol0IioOo ol0IioOo = (Ol0IioOo) illlil;
/* 13 */            if (oI1Iio0ii1 == null) {
/* 22 */                oI1Iio0ii1 = getName();
                    }
/* 27 */            return new Ol0IioOo(ii1Ool1, ol0IioOo, i11IlOOO, oI1Iio0ii1, i, olI1o0ooI);
                }

                @Override
                public final Ol0IioOo I010i10l() {
/* 5 */             Ol0IioOo ol0IioOo = (Ol0IioOo) super.I010i10l();
/* 7 */             if (ol0IioOo != null) {
/* 9 */                 return ol0IioOo;
                    }
/* 12 */            I00l0I0l0lO1(24);
/* 29 */            throw null;
                }

                @Override
                public final Ol0IioOo I010lI0oi(O0ioOi0Oo1ii o0ioOi0Oo1ii, O0ioOi0Oo1ii o0ioOi0Oo1ii2, List list, List list2, List list3, O0iIl1 o0iIl1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0) {
/* 2 */             if (list == null) {
/* 49 */                I00l0I0l0lO1(14);
/* 294 */               throw null;
                    }
/* 4 */             if (list2 == null) {
/* 43 */                I00l0I0l0lO1(15);
/* 46 */                throw null;
                    }
/* 6 */             if (list3 == null) {
/* 37 */                I00l0I0l0lO1(16);
/* 40 */                throw null;
                    }
/* 8 */             if (iiOiOloo0 != null) {
/* 24 */                return I011IO1I11OI(o0ioOi0Oo1ii, o0ioOi0Oo1ii2, list, list2, list3, o0iIl1, o1oIIloii0, iiOiOloo0, null);
                    }
/* 31 */            I00l0I0l0lO1(17);
/* 34 */            throw null;
                }

                public Ol0IioOo I011IO1I11OI(O0ioOi0Oo1ii o0ioOi0Oo1ii, O0ioOi0Oo1ii o0ioOi0Oo1ii2, List list, List list2, List list3, O0iIl1 o0iIl1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, Map map) {
/* 2 */             if (list == null) {
/* 49 */                I00l0I0l0lO1(19);
/* 338 */               throw null;
                    }
/* 4 */             if (list2 == null) {
/* 43 */                I00l0I0l0lO1(20);
/* 46 */                throw null;
                    }
/* 6 */             if (list3 == null) {
/* 37 */                I00l0I0l0lO1(21);
/* 40 */                throw null;
                    }
/* 8 */             if (iiOiOloo0 == null) {
/* 31 */                I00l0I0l0lO1(22);
/* 34 */                throw null;
                    }
/* 10 */            super.I010lI0oi(o0ioOi0Oo1ii, o0ioOi0Oo1ii2, list, list2, list3, o0iIl1, o1oIIloii0, iiOiOloo0);
/* 13 */            if (map != null && !map.isEmpty()) {
/* 26 */                this.I00ooiO1I = new LinkedHashMap(map);
                    }
/* 28 */            return this;
                }
            }
