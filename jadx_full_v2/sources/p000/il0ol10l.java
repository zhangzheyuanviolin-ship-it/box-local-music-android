            package p000;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class il0ol10l {
                public static void I00000oIO(int i) {
/* 16 */            String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 28 */            Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 4:
                        case 8:
                        case 14:
                        case 16:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 33:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 86 */                    objArr[0] = "annotations";
                            break;
                        case 2:
                        case 5:
                        case 9:
/* 81 */                    objArr[0] = "parameterAnnotations";
                            break;
                        case 3:
                        case 7:
                        case 13:
                        case 15:
                        case 17:
                        default:
/* 38 */                    objArr[0] = "propertyDescriptor";
                            break;
                        case 6:
                        case 11:
                        case PoseLandmark.LEFT_INDEX:
/* 76 */                    objArr[0] = "sourceElement";
                            break;
                        case 10:
/* 71 */                    objArr[0] = "visibility";
                            break;
                        case 12:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.LEFT_KNEE:
/* 66 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 63 */                    objArr[0] = "containingClass";
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 58 */                    objArr[0] = "source";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.RIGHT_KNEE:
/* 53 */                    objArr[0] = "enumClass";
                            break;
                        case 27:
                        case PoseLandmark.RIGHT_ANKLE:
                        case PoseLandmark.LEFT_HEEL:
/* 48 */                    objArr[0] = "descriptor";
                            break;
                        case 30:
                        case 32:
                        case 34:
/* 43 */                    objArr[0] = "owner";
                            break;
                    }
/* 95 */            if (i == 12) {
/* 110 */               objArr[1] = "createSetter";
                    } else if (i == 23) {
/* 107 */               objArr[1] = "createEnumValuesMethod";
                    } else if (i != 25) {
/* 101 */               objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                    } else {
/* 104 */               objArr[1] = "createEnumValueOfMethod";
                    }
                    switch (i) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 176 */                   objArr[2] = "createSetter";
                            break;
                        case 12:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                            break;
                        case 13:
                        case 14:
/* 173 */                   objArr[2] = "createDefaultGetter";
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 168 */                   objArr[2] = "createGetter";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
/* 163 */                   objArr[2] = "createPrimaryConstructorForObject";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 158 */                   objArr[2] = "createEnumValuesMethod";
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 155 */                   objArr[2] = "createEnumValueOfMethod";
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 152 */                   objArr[2] = "createEnumEntriesProperty";
                            break;
                        case 27:
/* 147 */                   objArr[2] = "isEnumValuesMethod";
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 142 */                   objArr[2] = "isEnumValueOfMethod";
                            break;
                        case PoseLandmark.LEFT_HEEL:
/* 137 */                   objArr[2] = "isEnumSpecialMethod";
                            break;
                        case 30:
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 132 */                   objArr[2] = "createExtensionReceiverParameterForCallable";
                            break;
                        case 32:
                        case 33:
/* 127 */                   objArr[2] = "createContextReceiverParameterForCallable";
                            break;
                        case 34:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 122 */                   objArr[2] = "createContextReceiverParameterForClass";
                            break;
                        default:
/* 117 */                   objArr[2] = "createDefaultSetter";
                            break;
                    }
/* 178 */           String str2 = String.format(str, objArr);
/* 182 */           if (i != 12 && i != 23 && i != 25) {
/* 199 */               throw new IllegalArgumentException(str2);
                    }
/* 199 */           throw new IllegalStateException(str2);
                }

                public static O0ioOi0Oo1ii I00000oOI(IIiIoIl11IO iIiIoIl11IO, O0iIl1 o0iIl1, OI1Iio0ii1 oI1Iio0ii1, I11IlOOO i11IlOOO, int i) {
/* 2 */             if (iIiIoIl11IO == null) {
/* 57 */                I00000oIO(32);
/* 966 */               throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 51 */                I00000oIO(33);
/* 54 */                throw null;
                    }
/* 6 */             if (o0iIl1 == null) {
/* 1 */                 return null;
                    }
/* 14 */            IOoi1I11 iOoi1I11 = new IOoi1I11(iIiIoIl11IO, o0iIl1, oI1Iio0ii1, 1);
/* 17 */            OOoiliiIoloI oOoiliiIoloI = OI1Ioo0OiIl.I00000oIO;
/* 45 */            return new O0ioOi0Oo1ii(iIiIoIl11IO, iOoi1I11, i11IlOOO, OI1Iio0ii1.I0000oI00(OI1Ioo0OiIl.I00000oOI + '_' + i));
                }

                public static OOOOI1ioIo I0000Il00O(OOOO01l oOOO01l, I11IlOOO i11IlOOO) {
/* 6 */             return I000OOo1O(oOOO01l, i11IlOOO, true, oOOO01l.I0010I0i());
                }

                public static OOOOOO0O I0000O(OOOO01l oOOO01l, I11IlOOO i11IlOOO) {
/* 1 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 3 */             OlI1o0ooI olI1o0ooII0010I0i = oOOO01l.I0010I0i();
/* 7 */             if (olI1o0ooII0010I0i != null) {
/* 16 */                return I000OiO(oOOO01l, i11IlOOO, i11IiIloOo, true, oOOO01l.I000OiO(), olI1o0ooII0010I0i);
                    }
/* 22 */            I00000oIO(6);
/* 89 */            throw null;
                }

                public static OOOO1o I0000oI00(OI000ilOol oI000ilOol) {
/* 2 */             if (oI000ilOol == null) {
/* 113 */               I00000oIO(26);
/* 186 */               throw null;
                    }
/* 4 */             OI0010oo1o oI0010oo1oI0000Il00O = IiOiIO0i1Oil.I0000Il00O(oI000ilOol);
/* 18 */            OI000ilOol oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1oI0000Il00O, OlIl1I0oO1IO.I001i1lo1io);
/* 22 */            if (oI000ilOolI00000oIO == null) {
/* 1 */                 return null;
                    }
/* 25 */            I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 27 */            O1oIIloii0 o1oIIloii0 = O1oIIloii0.I00iiI;
/* 29 */            IiOiOloo0 iiOiOloo0 = IiOiioI.I0000oI00;
/* 42 */            OOOO1o oOOO1oI010ioo = OOOO1o.I010ioo(oI000ilOol, o1oIIloii0, false, OlIlllOI1.I00000oOI, 4, oI000ilOol.I0010I0i());
/* 58 */            OOOOI1ioIo oOOOI1ioIo = new OOOOI1ioIo(oOOO1oI010ioo, i11IiIloOo, o1oIIloii0, iiOiOloo0, false, false, false, 4, null, oI000ilOol.I0010I0i());
/* 61 */            oOOO1oI010ioo.I010l1ol111(oOOOI1ioIo, null, null, null);
/* 66 */            OoOI1i1i.I00iiI.getClass();
/* 89 */            Ol0O0iI0l0O ol0O0iI0l0OI0000Il00O = l0loOIIo0iOo.I0000Il00O(OoOI1i1i.I00iiO, oI000ilOolI00000oIO.I000OOo1O(), Collections.singletonList(new OlIo1I(oI000ilOol.I00Ol10())), false);
/* 93 */            List list = Collections.EMPTY_LIST;
/* 100 */           oOOO1oI010ioo.I01101IOlO(ol0O0iI0l0OI0000Il00O, list, null, null, list);
/* 107 */           oOOOI1ioIo.I010l10O(oOOO1oI010ioo.I0001Ioi1lo());
/* 110 */           return oOOO1oI010ioo;
                }

                public static Ol0IioOo I0001Ioi1lo(OI000ilOol oI000ilOol) {
/* 1 */             if (oI000ilOol == null) {
/* 70 */                I00000oIO(24);
/* 186 */               throw null;
                    }
/* 3 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 12 */            Ol0IioOo ol0IioOoI0110OiO = Ol0IioOo.I0110OiO(oI000ilOol, OlIlllOI1.I0000Il00O, 4, oI000ilOol.I0010I0i());
/* 42 */            Ooo00oi0O ooo00oi0O = new Ooo00oi0O(ol0IioOoI0110OiO, null, 0, i11IiIloOo, OI1Iio0ii1.I0000oI00("value"), IiOiOOIo.I0000oI00(oI000ilOol).I001IIilI0O(), false, false, false, null, oI000ilOol.I0010I0i());
/* 45 */            List list = Collections.EMPTY_LIST;
/* 63 */            return ol0IioOoI0110OiO.I010lI0oi(null, null, list, list, Collections.singletonList(ooo00oi0O), oI000ilOol.I00Ol10(), O1oIIloii0.I00iiI, IiOiioI.I0000oI00);
                }

                public static Ol0IioOo I000II(OI000ilOol oI000ilOol) {
/* 1 */             if (oI000ilOol == null) {
/* 45 */                I00000oIO(22);
/* 49 */                throw null;
                    }
/* 10 */            Ol0IioOo ol0IioOoI0110OiO = Ol0IioOo.I0110OiO(oI000ilOol, OlIlllOI1.I00000oIO, 4, oI000ilOol.I0010I0i());
/* 14 */            List list = Collections.EMPTY_LIST;
/* 16 */            O0i1lI0o1io o0i1lI0o1ioI0000oI00 = IiOiOOIo.I0000oI00(oI000ilOol);
/* 20 */            Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 38 */            return ol0IioOoI0110OiO.I010lI0oi(null, null, list, list, list, o0i1lI0o1ioI0000oI00.I000O01llI0(oI000ilOol.I00Ol10()), O1oIIloii0.I00iiI, IiOiioI.I0000oI00);
                }

                public static O0ioOi0Oo1ii I000O01llI0(IIiIoIl11IO iIiIoIl11IO, O0iIl1 o0iIl1, I11IlOOO i11IlOOO) {
/* 1 */             if (o0iIl1 == null) {
/* 3 */                 return null;
                    }
/* 12 */            return new O0ioOi0Oo1ii(iIiIoIl11IO, new Il1lIi(iIiIoIl11IO, o0iIl1), i11IlOOO);
                }

                public static OOOOI1ioIo I000OOo1O(OOOO01l oOOO01l, I11IlOOO i11IlOOO, boolean z, OlI1o0ooI olI1o0ooI) {
/* 2 */             if (i11IlOOO == null) {
/* 36 */                I00000oIO(18);
/* 483 */               throw null;
                    }
/* 4 */             if (olI1o0ooI != null) {
/* 24 */                return new OOOOI1ioIo(oOOO01l, i11IlOOO, oOOO01l.I001IO000(), oOOO01l.I000OiO(), z, false, false, 1, null, olI1o0ooI);
                    }
/* 30 */            I00000oIO(19);
/* 33 */            throw null;
                }

                public static OOOOOO0O I000OiO(OOOO01l oOOO01l, I11IlOOO i11IlOOO, I11IlOOO i11IlOOO2, boolean z, IiOiOloo0 iiOiOloo0, OlI1o0ooI olI1o0ooI) {
/* 2 */             if (i11IlOOO == null) {
/* 61 */                I00000oIO(8);
/* 1294 */              throw null;
                    }
/* 4 */             if (i11IlOOO2 == null) {
/* 55 */                I00000oIO(9);
/* 58 */                throw null;
                    }
/* 6 */             if (iiOiOloo0 == null) {
/* 49 */                I00000oIO(10);
/* 52 */                throw null;
                    }
/* 8 */             if (olI1o0ooI == null) {
/* 43 */                I00000oIO(11);
/* 46 */                throw null;
                    }
/* 27 */            OOOOOO0O oooooo0o = new OOOOOO0O(oOOO01l, i11IlOOO, oOOO01l.I001IO000(), iiOiOloo0, z, false, false, 1, null, olI1o0ooI);
/* 38 */            oooooo0o.I00lli11 = OOOOOO0O.I010ioo(oooooo0o, oOOO01l.getType(), i11IlOOO2);
/* 40 */            return oooooo0o;
                }
            }
