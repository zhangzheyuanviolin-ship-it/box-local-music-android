            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class O00loo1i111O extends Ol0IioOo implements O00l1iI0ol {
                public static final IiOlOI0o I0100o111I = new IiOlOI0o();
                public static final IiOlOI0o I010101Oo1lO = new IiOlOI0o();
                public int I00oooO;
                public final boolean I0100i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O00loo1i111O(Ii1Ool1 ii1Ool1, Ol0IioOo ol0IioOo, I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1, int i, OlI1o0ooI olI1o0ooI, boolean z) {
/* 11 */            super(ii1Ool1, ol0IioOo, i11IlOOO, oI1Iio0ii1, i, olI1o0ooI);
/* 3 */             if (ii1Ool1 == null) {
/* 34 */                I00l0I0l0lO1(0);
/* 429 */               throw null;
                    }
/* 5 */             if (i11IlOOO == null) {
/* 30 */                I00l0I0l0lO1(1);
/* 33 */                throw null;
                    }
/* 7 */             if (oI1Iio0ii1 == null) {
/* 25 */                I00l0I0l0lO1(2);
/* 28 */                throw null;
                    }
/* 9 */             if (i == 0) {
/* 20 */                I00l0I0l0lO1(3);
/* 23 */                throw null;
                    }
/* 14 */            this.I00oooO = 0;
/* 16 */            this.I0100i = z;
                }

                public static void I00l0I0l0lO1(int i) {
/* 16 */            String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 28 */            Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 6:
                        case 16:
/* 96 */                    objArr[0] = "annotations";
                            break;
                        case 2:
                        case 7:
/* 91 */                    objArr[0] = "name";
                            break;
                        case 3:
                        case 15:
/* 86 */                    objArr[0] = "kind";
                            break;
                        case 4:
                        case 8:
                        case 17:
/* 81 */                    objArr[0] = "source";
                            break;
                        case 5:
                        default:
/* 38 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 9:
/* 76 */                    objArr[0] = "contextReceiverParameters";
                            break;
                        case 10:
/* 71 */                    objArr[0] = "typeParameters";
                            break;
                        case 11:
/* 66 */                    objArr[0] = "unsubstitutedValueParameters";
                            break;
                        case 12:
/* 61 */                    objArr[0] = "visibility";
                            break;
                        case 13:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_THUMB:
/* 56 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                            break;
                        case 14:
/* 53 */                    objArr[0] = "newOwner";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 48 */                    objArr[0] = "enhancedValueParameterTypes";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 43 */                    objArr[0] = "enhancedReturnType";
                            break;
                    }
/* 105 */           if (i == 13) {
/* 120 */               objArr[1] = "initialize";
                    } else if (i == 18) {
/* 117 */               objArr[1] = "createSubstitutedCopy";
                    } else if (i != 21) {
/* 111 */               objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                    } else {
/* 114 */               objArr[1] = "enhance";
                    }
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
/* 141 */                   objArr[2] = "createJavaMethod";
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
/* 136 */                   objArr[2] = "initialize";
                            break;
                        case 13:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_THUMB:
                            break;
                        case 14:
                        case 15:
                        case 16:
                        case 17:
/* 133 */                   objArr[2] = "createSubstitutedCopy";
                            break;
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
/* 130 */                   objArr[2] = "enhance";
                            break;
                        default:
/* 127 */                   objArr[2] = "<init>";
                            break;
                    }
/* 143 */           String str2 = String.format(str, objArr);
/* 147 */           if (i != 13 && i != 18 && i != 21) {
/* 164 */               throw new IllegalArgumentException(str2);
                    }
/* 164 */           throw new IllegalStateException(str2);
                }

                public static O00loo1i111O I011IOil(Ii1Ool1 ii1Ool1, O0l1Ol1o o0l1Ol1o, OI1Iio0ii1 oI1Iio0ii1, OiII0Oi oiII0Oi, boolean z) {
/* 2 */             if (ii1Ool1 == null) {
/* 25 */                I00l0I0l0lO1(5);
/* 966 */               throw null;
                    }
/* 4 */             if (oI1Iio0ii1 != null) {
/* 15 */                return new O00loo1i111O(ii1Ool1, null, o0l1Ol1o, oI1Iio0ii1, 1, oiII0Oi, z);
                    }
/* 20 */            I00l0I0l0lO1(7);
/* 23 */            throw null;
                }

                @Override
                public final boolean I001lloI() {
/* 3 */             return IlIi0I0.I00000oIO(this.I00oooO);
                }

                @Override
                public final O00l1iI0ol I00ilO0(O0iIl1 o0iIl1, ArrayList arrayList, O0iIl1 o0iIl12, OIoi0IIoi oIoi0IIoi) {
/* 5 */             ArrayList arrayListI00000oIO = li0ol1IO.I00000oIO(arrayList, I00Iooi00oi(), this);
/* 16 */            O0ioOi0Oo1ii o0ioOi0Oo1iiI000O01llI0 = o0iIl1 == null ? null : il0ol10l.I000O01llI0(this, o0iIl1, i1i0olI.I00iiO);
/* 22 */            IllliloOi illliloOiI010o0o0oO = I010o0o0oO(OoOilII0.I00000oOI);
/* 26 */            illliloOiI010o0o0oO.I00io1l = arrayListI00000oIO;
/* 28 */            illliloOiI010o0o0oO.I00li1OI = o0iIl12;
/* 30 */            illliloOiI010o0o0oO.I00l0I0l0lO1 = o0ioOi0Oo1iiI000O01llI0;
/* 33 */            illliloOiI010o0o0oO.I00o0l1o1o0 = true;
/* 35 */            illliloOiI010o0o0oO.I00o0iI0io1 = true;
/* 43 */            O00loo1i111O o00loo1i111O = (O00loo1i111O) illliloOiI010o0o0oO.I00olI.I010l1O(illliloOiI010o0o0oO);
/* 45 */            if (oIoi0IIoi != null) {
/* 49 */                IiOlOI0o iiOlOI0o = (IiOlOI0o) oIoi0IIoi.I00iOIl;
/* 51 */                Object obj = oIoi0IIoi.I00iiI;
/* 53 */                Map linkedHashMap = o00loo1i111O.I00ooiO1I;
/* 55 */                if (linkedHashMap == null) {
/* 59 */                    linkedHashMap = new LinkedHashMap();
/* 62 */                    o00loo1i111O.I00ooiO1I = linkedHashMap;
                        }
/* 64 */                linkedHashMap.put(iiOlOI0o, obj);
                    }
/* 67 */            if (o00loo1i111O != null) {
/* 69 */                return o00loo1i111O;
                    }
/* 72 */            I00l0I0l0lO1(21);
/* 483 */           throw null;
                }

                @Override
                public final Illll0i I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 2 */             if (ii1Ool1 == null) {
/* 71 */                I00l0I0l0lO1(14);
/* 1294 */              throw null;
                    }
/* 4 */             if (i == 0) {
/* 65 */                I00l0I0l0lO1(15);
/* 68 */                throw null;
                    }
/* 6 */             if (i11IlOOO == null) {
/* 59 */                I00l0I0l0lO1(16);
/* 62 */                throw null;
                    }
/* 11 */            Ol0IioOo ol0IioOo = (Ol0IioOo) illlil;
/* 13 */            if (oI1Iio0ii1 == null) {
/* 17 */                oI1Iio0ii1 = getName();
                    }
/* 28 */            O00loo1i111O o00loo1i111O = new O00loo1i111O(ii1Ool1, ol0IioOo, i11IlOOO, oI1Iio0ii1, i, olI1o0ooI, this.I0100i);
/* 31 */            int i2 = this.I00oooO;
/* 33 */            boolean z = false;
/* 35 */            if (i2 != 1) {
/* 38 */                if (i2 == 2) {
/* 46 */                    z = true;
                        } else if (i2 != 3) {
/* 44 */                    if (i2 != 4) {
/* 48 */                        throw null;
                            }
/* 46 */                    z = true;
                        }
                    }
/* 53 */            o00loo1i111O.I011Ill(z, IlIi0I0.I00000oIO(i2));
/* 56 */            return o00loo1i111O;
                }

                @Override
                public final Ol0IioOo I011IO1I11OI(O0ioOi0Oo1ii o0ioOi0Oo1ii, O0ioOi0Oo1ii o0ioOi0Oo1ii2, List list, List list2, List list3, O0iIl1 o0iIl1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, Map map) {
                    IOI01lOO1 iOI01lOO1;
/* 2 */             if (list == null) {
/* 150 */               I00l0I0l0lO1(9);
/* 338 */               throw null;
                    }
/* 4 */             if (list2 == null) {
/* 144 */               I00l0I0l0lO1(10);
/* 147 */               throw null;
                    }
/* 6 */             if (list3 == null) {
/* 138 */               I00l0I0l0lO1(11);
/* 141 */               throw null;
                    }
/* 8 */             if (iiOiOloo0 == null) {
/* 132 */               I00l0I0l0lO1(12);
/* 135 */               throw null;
                    }
/* 10 */            super.I011IO1I11OI(o0ioOi0Oo1ii, o0ioOi0Oo1ii2, list, list2, list3, o0iIl1, o1oIIloii0, iiOiOloo0, map);
/* 23 */            for (IOI0llolI0 iOI0llolI0 : OIiiIIO0lII.I00000oIO) {
/* 31 */                OOoiliiIoloI oOoiliiIoloI = iOI0llolI0.I00000oOI;
/* 33 */                OI1Iio0ii1 oI1Iio0ii1 = iOI0llolI0.I00000oIO;
/* 35 */                if (oI1Iio0ii1 == null || O0000Ioio00.I0000O(getName(), oI1Iio0ii1)) {
/* 48 */                    if (oOoiliiIoloI == null || oOoiliiIoloI.I0000O(getName().I00000oOI())) {
/* 65 */                        Collection collection = iOI0llolI0.I0000Il00O;
/* 67 */                        if (collection == null || collection.contains(getName())) {
/* 80 */                            IOI01O1[] ioi01o1Arr = iOI0llolI0.I0000oI00;
/* 82 */                            int length = ioi01o1Arr.length;
/* 84 */                            int i = 0;
                                    while (true) {
/* 85 */                                if (i >= length) {
/* 120 */                                   iOI01lOO1 = ((String) iOI0llolI0.I0000O.invoke(this)) != null ? new IOI01lOO1(false) : IOI01lOO1.I0000Il00O;
                                        } else {
/* 93 */                                    if (ioi01o1Arr[i].I00000oOI(this) != null) {
/* 97 */                                        iOI01lOO1 = new IOI01lOO1(false);
                                                break;
                                            }
/* 101 */                                   i++;
                                        }
                                    }
/* 127 */                           this.I00lli11 = iOI01lOO1.I00000oIO;
/* 129 */                           return this;
                                }
                            }
                        }
                    }
/* 123 */           iOI01lOO1 = IOI01lOO1.I00000oOI;
/* 127 */           this.I00lli11 = iOI01lOO1.I00000oIO;
/* 129 */           return this;
                }

                public final void I011Ill(boolean z, boolean z2) {
/* 14 */            this.I00oooO = z ? z2 ? 4 : 2 : z2 ? 3 : 1;
                }
            }
