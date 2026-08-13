            package p000;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OoOilII0 {
                public static final OoOilII0 I00000oOI = new OoOilII0(OoOiiO01illo.I00000oIO);
                public final OoOiiO01illo I00000oIO;

                public OoOilII0(OoOiiO01illo ooOiiO01illo) {
/* 4 */             this.I00000oIO = ooOiiO01illo;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(int i) {
                    String str;
                    int i2;
/* 9 */             if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
/* 31 */                                                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                                        break;
                                                }
                                            case PoseLandmark.LEFT_HEEL:
                                            case 30:
                                            case PoseLandmark.LEFT_FOOT_INDEX:
                                            case 32:
                                                break;
                                        }
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.LEFT_THUMB:
                                    case PoseLandmark.RIGHT_THUMB:
                                    case PoseLandmark.LEFT_HIP:
                                    case PoseLandmark.RIGHT_HIP:
                                    case PoseLandmark.LEFT_KNEE:
                                        break;
                                }
                            case 11:
                            case 12:
                            case 13:
                                break;
                        }
                    } else {
/* 34 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 36 */            if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
/* 58 */                                                i2 = 3;
                                                        break;
                                                }
                                            case PoseLandmark.LEFT_HEEL:
                                            case 30:
                                            case PoseLandmark.LEFT_FOOT_INDEX:
                                            case 32:
                                                break;
                                        }
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.LEFT_THUMB:
                                    case PoseLandmark.RIGHT_THUMB:
                                    case PoseLandmark.LEFT_HIP:
                                    case PoseLandmark.RIGHT_HIP:
                                    case PoseLandmark.LEFT_KNEE:
                                        break;
                                }
                            case 11:
                            case 12:
                            case 13:
                                break;
                        }
                    } else {
/* 60 */                i2 = 2;
                    }
/* 61 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 2:
                        case 8:
                        case 11:
                        case 12:
                        case 13:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 32:
                        case 34:
                        case 37:
                        case 40:
                        case 41:
                        case 42:
/* 139 */                   objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                            break;
                        case 3:
/* 136 */                   objArr[0] = "first";
                            break;
                        case 4:
/* 131 */                   objArr[0] = "second";
                            break;
                        case 5:
/* 126 */                   objArr[0] = "substitutionContext";
                            break;
                        case 6:
/* 121 */                   objArr[0] = "context";
                            break;
                        case 7:
                        default:
/* 71 */                    objArr[0] = "substitution";
                            break;
                        case 9:
                        case 14:
/* 116 */                   objArr[0] = "type";
                            break;
                        case 10:
                        case 15:
/* 111 */                   objArr[0] = "howThisTypeIsUsed";
                            break;
                        case 16:
                        case 17:
                        case 36:
/* 106 */                   objArr[0] = "typeProjection";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.RIGHT_ANKLE:
/* 101 */                   objArr[0] = "originalProjection";
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 96 */                    objArr[0] = "originalType";
                            break;
                        case 27:
/* 91 */                    objArr[0] = "substituted";
                            break;
                        case 33:
/* 86 */                    objArr[0] = "annotations";
                            break;
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                        case 38:
/* 81 */                    objArr[0] = "typeParameterVariance";
                            break;
                        case 39:
/* 76 */                    objArr[0] = "projectionKind";
                            break;
                    }
/* 151 */           if (i == 1) {
/* 203 */               objArr[1] = "replaceWithNonApproximatingSubstitution";
                    } else if (i == 2) {
/* 198 */               objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                    } else if (i == 8) {
/* 193 */               objArr[1] = "getSubstitution";
                    } else if (i == 34) {
/* 188 */               objArr[1] = "filterOutUnsafeVariance";
                    } else if (i != 37) {
                        switch (i) {
                            case 11:
                            case 12:
                            case 13:
/* 182 */                       objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.LEFT_THUMB:
                                    case PoseLandmark.RIGHT_THUMB:
                                    case PoseLandmark.LEFT_HIP:
                                    case PoseLandmark.RIGHT_HIP:
                                    case PoseLandmark.LEFT_KNEE:
/* 179 */                               objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i) {
                                            case PoseLandmark.LEFT_HEEL:
                                            case 30:
                                            case PoseLandmark.LEFT_FOOT_INDEX:
                                            case 32:
/* 176 */                                       objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
/* 185 */                                               objArr[1] = "combine";
                                                        break;
                                                    default:
/* 173 */                                               objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    switch (i) {
                        case 1:
                        case 2:
                        case 8:
                        case 11:
                        case 12:
                        case 13:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 32:
                        case 34:
                        case 37:
                        case 40:
                        case 41:
                        case 42:
                            break;
                        case 3:
                        case 4:
/* 245 */                   objArr[2] = "createChainedSubstitutor";
                            break;
                        case 5:
                        case 6:
                        default:
/* 210 */                   objArr[2] = "create";
                            break;
                        case 7:
/* 240 */                   objArr[2] = "<init>";
                            break;
                        case 9:
                        case 10:
/* 235 */                   objArr[2] = "safeSubstitute";
                            break;
                        case 14:
                        case 15:
                        case 16:
/* 232 */                   objArr[2] = "substitute";
                            break;
                        case 17:
/* 227 */                   objArr[2] = "substituteWithoutApproximation";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 222 */                   objArr[2] = "unsafeSubstitute";
                            break;
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
                        case PoseLandmark.RIGHT_ANKLE:
/* 219 */                   objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                            break;
                        case 33:
/* 216 */                   objArr[2] = "filterOutUnsafeVariance";
                            break;
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                        case 36:
                        case 38:
                        case 39:
/* 213 */                   objArr[2] = "combine";
                            break;
                    }
/* 247 */           String str2 = String.format(str, objArr);
/* 251 */           if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                        switch (i) {
                            case 11:
                            case 12:
                            case 13:
                                break;
                            default:
                                switch (i) {
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.LEFT_THUMB:
                                    case PoseLandmark.RIGHT_THUMB:
                                    case PoseLandmark.LEFT_HIP:
                                    case PoseLandmark.RIGHT_HIP:
                                    case PoseLandmark.LEFT_KNEE:
                                        break;
                                    default:
                                        switch (i) {
                                            case PoseLandmark.LEFT_HEEL:
                                            case 30:
                                            case PoseLandmark.LEFT_FOOT_INDEX:
                                            case 32:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
/* 284 */                                               throw new IllegalArgumentException(str2);
                                                }
                                        }
                                }
                        }
                    }
/* 284 */           throw new IllegalStateException(str2);
                }

                public static Ooo0Ioii0o0 I00000oOI(Ooo0Ioii0o0 ooo0Ioii0o0, Ooo0Ioii0o0 ooo0Ioii0o02) {
/* 2 */             if (ooo0Ioii0o0 == null) {
/* 82 */                I00000oIO(38);
/* 89 */                throw null;
                    }
/* 4 */             if (ooo0Ioii0o02 == null) {
/* 76 */                I00000oIO(39);
/* 79 */                throw null;
                    }
/* 6 */             Ooo0Ioii0o0 ooo0Ioii0o03 = Ooo0Ioii0o0.I00iiO;
/* 8 */             if (ooo0Ioii0o0 == ooo0Ioii0o03) {
/* 10 */                if (ooo0Ioii0o02 != null) {
/* 12 */                    return ooo0Ioii0o02;
                        }
/* 15 */                I00000oIO(40);
/* 18 */                throw null;
                    }
/* 19 */            if (ooo0Ioii0o02 == ooo0Ioii0o03) {
/* 21 */                if (ooo0Ioii0o0 != null) {
/* 23 */                    return ooo0Ioii0o0;
                        }
/* 26 */                I00000oIO(41);
/* 29 */                throw null;
                    }
/* 30 */            if (ooo0Ioii0o0 == ooo0Ioii0o02) {
/* 32 */                if (ooo0Ioii0o02 != null) {
/* 34 */                    return ooo0Ioii0o02;
                        }
/* 37 */                I00000oIO(42);
/* 40 */                throw null;
                    }
/* 73 */            throw new AssertionError("Variance conflict: type parameter variance '" + ooo0Ioii0o0 + "' and projection kind '" + ooo0Ioii0o02 + "' cannot be combined");
                }

                public static int I0000Il00O(Ooo0Ioii0o0 ooo0Ioii0o0, Ooo0Ioii0o0 ooo0Ioii0o02) {
/* 1 */             Ooo0Ioii0o0 ooo0Ioii0o03 = Ooo0Ioii0o0.I00iio;
/* 3 */             if (ooo0Ioii0o0 == ooo0Ioii0o03 && ooo0Ioii0o02 == Ooo0Ioii0o0.I00ilI0I1) {
/* 9 */                 return 3;
                    }
                    return (ooo0Ioii0o0 == Ooo0Ioii0o0.I00ilI0I1 && ooo0Ioii0o02 == ooo0Ioii0o03) ? 2 : 1;
                }

                public static OoOilII0 I0000O(O0iIl1 o0iIl1) {
/* 1 */             if (o0iIl1 == null) {
/* 24 */                I00000oIO(6);
/* 49 */                throw null;
                    }
/* 19 */            return new OoOilII0(OoOIlIi1.I00000oOI.I000O01llI0(o0iIl1.I00iOIl(), o0iIl1.I00OIl()));
                }

                public static OoOilII0 I0000oI00(OoOiiO01illo ooOiiO01illo, OoOiiO01illo ooOiiO01illo2) {
/* 2 */             if (ooOiiO01illo == null) {
/* 46 */                I00000oIO(3);
/* 89 */                throw null;
                    }
/* 4 */             if (ooOiiO01illo2 == null) {
/* 41 */                I00000oIO(4);
/* 44 */                throw null;
                    }
/* 10 */            if (ooOiiO01illo.I0000oI00()) {
/* 12 */                ooOiiO01illo = ooOiiO01illo2;
                    } else if (!ooOiiO01illo2.I0000oI00()) {
/* 23 */                Iii1i10OIli1 iii1i10OIli1 = new Iii1i10OIli1();
/* 26 */                iii1i10OIli1.I00000oOI = ooOiiO01illo;
/* 28 */                iii1i10OIli1.I0000Il00O = ooOiiO01illo2;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                ooOiiO01illo = iii1i10OIli1;
                    }
/* 36 */            return new OoOilII0(ooOiiO01illo);
                }

                public static String I000II(Object obj) {
                    try {
/* 1 */                 return obj.toString();
                    } catch (Throwable th) {
/* 11 */                if (ilIiIlIII0.I00000oIO(th)) {
/* 49 */                    throw th;
                        }
/* 28 */                return "[Exception while computing toString(): " + th + "]";
                    }
                }

                public final O0iIl1 I0001Ioi1lo(O0iIl1 o0iIl1, Ooo0Ioii0o0 ooo0Ioii0o0) {
/* 2 */             if (o0iIl1 == null) {
/* 54 */                I00000oIO(9);
/* 89 */                throw null;
                    }
/* 10 */            if (this.I00000oIO.I0000oI00()) {
/* 12 */                return o0iIl1;
                    }
                    try {
/* 23 */                O0iIl1 o0iIl1I00000oOI = I000OOo1O(new OlIo1I(o0iIl1, ooo0Ioii0o0), null, 0).I00000oOI();
/* 27 */                if (o0iIl1I00000oOI != null) {
/* 29 */                    return o0iIl1I00000oOI;
                        }
/* 32 */                I00000oIO(12);
/* 35 */                throw null;
                    } catch (OoOilI10l e) {
/* 47 */                return Il0ooiloI.I00000oOI(Il0ooO1IO.I00li1OI, e.getMessage());
                    }
                }

                public final O0iIl1 I000O01llI0(O0iIl1 o0iIl1, Ooo0Ioii0o0 ooo0Ioii0o0) {
/* 2 */             if (o0iIl1 == null) {
/* 148 */               I00000oIO(14);
/* 551 */               throw null;
                    }
/* 4 */             if (ooo0Ioii0o0 == null) {
/* 142 */               I00000oIO(15);
/* 145 */               throw null;
                    }
/* 8 */             OoOiiO01illo ooOiiO01illo = this.I00000oIO;
/* 14 */            OoOi1Ol olIo1I = new OlIo1I(ooOiiO01illo.I0001Ioi1lo(o0iIl1, ooo0Ioii0o0), ooo0Ioii0o0);
/* 22 */            if (!ooOiiO01illo.I0000oI00()) {
                        try {
/* 25 */                    olIo1I = I000OOo1O(olIo1I, null, 0);
                        } catch (OoOilI10l unused) {
/* 30 */                    olIo1I = null;
                        }
                    }
/* 35 */            if (ooOiiO01illo.I00000oIO() || ooOiiO01illo.I00000oOI()) {
/* 44 */                boolean zI00000oOI = ooOiiO01illo.I00000oOI();
/* 48 */                if (olIo1I == null) {
/* 50 */                    olIo1I = null;
                        } else if (!olIo1I.I0000Il00O()) {
/* 59 */                    O0iIl1 o0iIl1I00000oOI = olIo1I.I00000oOI();
/* 69 */                    if (OoOilo0Oliii.I0000Il00O(o0iIl1I00000oOI, I0ollliOo0.I00o0iI0io1, null)) {
/* 72 */                        Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO = olIo1I.I00000oIO();
/* 78 */                        if (ooo0Ioii0o0I00000oIO == Ooo0Ioii0o0.I00ilI0I1) {
/* 90 */                            olIo1I = new OlIo1I((O0iIl1) iOl0o00I.I00000oIO(o0iIl1I00000oOI).I00000oOI, ooo0Ioii0o0I00000oIO);
                                } else if (zI00000oOI) {
/* 106 */                           olIo1I = new OlIo1I((O0iIl1) iOl0o00I.I00000oIO(o0iIl1I00000oOI).I00000oIO, ooo0Ioii0o0I00000oIO);
                                } else {
/* 112 */                           IO0OI1iO iO0OI1iO = new IO0OI1iO();
/* 117 */                           OoOilII0 ooOilII0 = new OoOilII0(iO0OI1iO);
/* 124 */                           if (!iO0OI1iO.I0000oI00()) {
                                        try {
/* 127 */                                   olIo1I = ooOilII0.I000OOo1O(olIo1I, null, 0);
                                        } catch (OoOilI10l unused2) {
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 132 */           if (olIo1I == null) {
/* 1 */                 return null;
                    }
/* 135 */           return olIo1I.I00000oOI();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0247  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OoOi1Ol I000OOo1O(OoOi1Ol ooOi1Ol, OoOOiO ooOOiO, int i) throws OoOilI10l {
                    char c;
/* 7 */             O0iIl1 o0iIl1I000O01llI0 = null;
/* 8 */             if (ooOi1Ol == null) {
/* 762 */               I00000oIO(18);
/* 2160 */              throw null;
                    }
/* 12 */            OoOiiO01illo ooOiiO01illo = this.I00000oIO;
/* 14 */            if (i > 100) {
/* 756 */               OoOil11Ol1o.I000l1("Recursion too deep. Most likely infinite loop while substituting ", I000II(ooOi1Ol), "; substitution: ", I000II(ooOiiO01illo));
/* 7 */                 return null;
                    }
/* 20 */            if (!ooOi1Ol.I0000Il00O()) {
/* 24 */                O0iIl1 o0iIl1I00000oOI = ooOi1Ol.I00000oOI();
/* 31 */                if (o0iIl1I00000oOI instanceof OoOiol0) {
/* 33 */                    OoOiol0 ooOiol0 = (OoOiol0) o0iIl1I00000oOI;
/* 35 */                    Ooioo0o1l0 ooioo0o1l0I00IoO0 = ooOiol0.I00IoO0();
/* 39 */                    O0iIl1 o0iIl1I000II = ooOiol0.I000II();
/* 53 */                    OoOi1Ol ooOi1OlI000OOo1O = I000OOo1O(new OlIo1I(ooioo0o1l0I00IoO0, ooOi1Ol.I00000oIO()), ooOOiO, i + 1);
                            return ooOi1OlI000OOo1O.I0000Il00O() ? ooOi1OlI000OOo1O : new OlIo1I(lOoll01ll0I.I00000oOI(ooOi1OlI000OOo1O.I00000oOI().I00l0OO0IO(), I000O01llI0(o0iIl1I000II, ooOi1Ol.I00000oIO())), ooOi1OlI000OOo1O.I00000oIO());
                        }
/* 94 */                o0iIl1I00000oOI.I00l0OO0IO();
/* 103 */               if (!(o0iIl1I00000oOI.I00l0OO0IO() instanceof OOlIIOoli)) {
/* 107 */                   OoOi1Ol ooOi1OlI0000O = ooOiiO01illo.I0000O(o0iIl1I00000oOI);
/* 111 */                   if (ooOi1OlI0000O == null) {
/* 191 */                       ooOi1OlI0000O = null;
                            } else if (o0iIl1I00000oOI.getAnnotations().I001l0I00(OlIllOO11lOl.I001iOo1i0O)) {
/* 130 */                       OoOIOoO1I ooOIOoO1II00iOIl = ooOi1OlI0000O.I00000oOI().I00iOIl();
/* 136 */                       if (ooOIOoO1II00iOIl instanceof OIIOli0) {
/* 141 */                           OoOi1Ol ooOi1Ol2 = ((OIIOli0) ooOIOoO1II00iOIl).I00iOIl;
/* 143 */                           Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO = ooOi1Ol2.I00000oIO();
/* 156 */                           if (I0000Il00O(ooOi1Ol.I00000oIO(), ooo0Ioii0o0I00000oIO) == 3) {
/* 164 */                               ooOi1OlI0000O = new OlIo1I(ooOi1Ol2.I00000oOI());
                                    } else if (ooOOiO != null && I0000Il00O(ooOOiO.I000l1(), ooo0Ioii0o0I00000oIO) == 3) {
/* 187 */                               ooOi1OlI0000O = new OlIo1I(ooOi1Ol2.I00000oOI());
                                    }
                                }
                            }
/* 192 */                   Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO2 = ooOi1Ol.I00000oIO();
/* 197 */                   if (ooOi1OlI0000O == null && (o0iIl1I00000oOI.I00l0OO0IO() instanceof IlOIOIi00io)) {
/* 207 */                       O0iIo0i1 o0iIo0i1I00l0OO0IO = o0iIl1I00000oOI.I00l0OO0IO();
/* 218 */                       Ii0lIOIlO ii0lIOIlO = o0iIo0i1I00l0OO0IO instanceof Ii0lIOIlO ? (Ii0lIOIlO) o0iIo0i1I00l0OO0IO : null;
/* 227 */                       if (!(ii0lIOIlO != null ? ii0lIOIlO.I00II0oii1o() : false)) {
/* 233 */                           IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) o0iIl1I00000oOI.I00l0OO0IO();
/* 235 */                           Ol0O0iI0l0O ol0O0iI0l0O = ilOIOIi00io.I00iiO;
/* 237 */                           Ol0O0iI0l0O ol0O0iI0l0O2 = ilOIOIi00io.I00iiI;
/* 244 */                           int i2 = i + 1;
/* 245 */                           OoOi1Ol ooOi1OlI000OOo1O2 = I000OOo1O(new OlIo1I(ol0O0iI0l0O2, ooo0Ioii0o0I00000oIO2), ooOOiO, i2);
/* 254 */                           OoOi1Ol ooOi1OlI000OOo1O3 = I000OOo1O(new OlIo1I(ol0O0iI0l0O, ooo0Ioii0o0I00000oIO2), ooOOiO, i2);
/* 258 */                           Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO3 = ooOi1OlI000OOo1O2.I00000oIO();
/* 266 */                           if (ooOi1OlI000OOo1O2.I00000oOI() != ol0O0iI0l0O2 || ooOi1OlI000OOo1O3.I00000oOI() != ol0O0iI0l0O) {
/* 298 */                               return new OlIo1I(l0loOIIo0iOo.I00000oIO(lOoil0Io0Io.I00000oIO(ooOi1OlI000OOo1O2.I00000oOI()), lOoil0Io0Io.I00000oIO(ooOi1OlI000OOo1O3.I00000oOI())), ooo0Ioii0o0I00000oIO3);
                                    }
                                }
                            } else if (!O0i1lI0o1io.I00II0oii1o(o0iIl1I00000oOI) && !l0loOi1ol11o.I00000oIO(o0iIl1I00000oOI)) {
/* 317 */                       if (ooOi1OlI0000O != null) {
/* 323 */                           int iI0000Il00O = I0000Il00O(ooo0Ioii0o0I00000oIO2, ooOi1OlI0000O.I00000oIO());
/* 333 */                           if (!(o0iIl1I00000oOI.I00iOIl() instanceof IO0OIooI)) {
/* 335 */                               int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iI0000Il00O);
/* 339 */                               if (iI001lIiIIo1O == 1) {
/* 368 */                                   return new OlIo1I(o0iIl1I00000oOI.I00iOIl().I0000O().I000oI1ioi(), Ooo0Ioii0o0.I00ilI0I1);
                                        }
/* 341 */                               if (iI001lIiIIo1O == 2) {
/* 351 */                                   throw new OoOilI10l("Out-projection in in-position");
                                        }
                                    }
/* 372 */                           O0iIo0i1 o0iIo0i1I00l0OO0IO2 = o0iIl1I00000oOI.I00l0OO0IO();
/* 383 */                           Ii0lIOIlO ii0lIOIlO2 = o0iIo0i1I00l0OO0IO2 instanceof Ii0lIOIlO ? (Ii0lIOIlO) o0iIo0i1I00l0OO0IO2 : null;
/* 384 */                           if (ii0lIOIlO2 == null || !ii0lIOIlO2.I00II0oii1o()) {
/* 393 */                               ii0lIOIlO2 = null;
                                    }
/* 398 */                           if (ooOi1OlI0000O.I0000Il00O()) {
/* 400 */                               return ooOi1OlI0000O;
                                    }
/* 420 */                           O0iIl1 o0iIl1I001i1O0Ol = ii0lIOIlO2 != null ? ii0lIOIlO2.I001i1O0Ol(ooOi1OlI0000O.I00000oOI()) : OoOilo0Oliii.I000OOo1O(ooOi1OlI0000O.I00000oOI(), o0iIl1I00000oOI.I00iiI());
/* 432 */                           if (!o0iIl1I00000oOI.getAnnotations().isEmpty()) {
/* 438 */                               I11IlOOO i11IlOOOI0000Il00O = ooOiiO01illo.I0000Il00O(o0iIl1I00000oOI.getAnnotations());
/* 442 */                               if (i11IlOOOI0000Il00O == null) {
/* 495 */                                   I00000oIO(33);
/* 498 */                                   throw null;
                                        }
/* 450 */                               if (i11IlOOOI0000Il00O.I001l0I00(OlIllOO11lOl.I001iOo1i0O)) {
/* 459 */                                   OoOi1I011O ooOi1I011O = new OoOi1I011O(17);
/* 462 */                                   IlIlo10 ilIlo10 = new IlIlo10();
/* 465 */                                   ilIlo10.I00iOIl = i11IlOOOI0000Il00O;
/* 467 */                                   ilIlo10.I00iiI = ooOi1I011O;
/* 469 */                                   VarHandle.storeStoreFence();
/* 472 */                                   i11IlOOOI0000Il00O = ilIlo10;
                                        }
/* 488 */                               o0iIl1I001i1O0Ol = lOoliOIOlIO0.I000II(o0iIl1I001i1O0Ol, new I11Io0oil0i0(new I11IlOOO[]{o0iIl1I001i1O0Ol.getAnnotations(), i11IlOOOI0000Il00O}));
                                    }
/* 499 */                           if (iI0000Il00O == 1) {
/* 505 */                               ooo0Ioii0o0I00000oIO2 = I00000oOI(ooo0Ioii0o0I00000oIO2, ooOi1OlI0000O.I00000oIO());
                                    }
/* 511 */                           return new OlIo1I(o0iIl1I001i1O0Ol, ooo0Ioii0o0I00000oIO2);
                                }
/* 515 */                       O0iIl1 o0iIl1I00000oOI2 = ooOi1Ol.I00000oOI();
/* 519 */                       Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO4 = ooOi1Ol.I00000oIO();
/* 533 */                       if (!(o0iIl1I00000oOI2.I00iOIl().I00100o1O0lo() instanceof OoOOiO)) {
/* 537 */                           Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1I00000oOI2.I00l0OO0IO();
/* 548 */                           I00i0O i00i0O = ooioo0o1l0I00l0OO0IO instanceof I00i0O ? (I00i0O) ooioo0o1l0I00l0OO0IO : null;
/* 554 */                           Ol0O0iI0l0O ol0O0iI0l0O3 = i00i0O != null ? i00i0O.I00iiO : null;
/* 555 */                           if (ol0O0iI0l0O3 != null) {
/* 559 */                               if (ooOiiO01illo instanceof Iol0l0Oo0i) {
/* 562 */                                   Iol0l0Oo0i iol0l0Oo0i = (Iol0l0Oo0i) ooOiiO01illo;
/* 584 */                                   OoOilII0 ooOilII0 = !iol0l0Oo0i.I0000O ? this : new OoOilII0(new Iol0l0Oo0i(iol0l0Oo0i.I00000oOI, iol0l0Oo0i.I0000Il00O, false));
/* 587 */                                   o0iIl1I000O01llI0 = ooOilII0.I000O01llI0(ol0O0iI0l0O3, Ooo0Ioii0o0.I00iiO);
                                        }
                                    }
/* 595 */                           List listI000II = o0iIl1I00000oOI2.I00iOIl().I000II();
/* 599 */                           List listI00OIl = o0iIl1I00000oOI2.I00OIl();
/* 609 */                           ArrayList arrayList = new ArrayList(listI000II.size());
/* 612 */                           boolean z = false;
/* 617 */                           for (int i3 = 0; i3 < listI000II.size(); i3++) {
/* 623 */                               OoOOiO ooOOiO2 = (OoOOiO) listI000II.get(i3);
/* 629 */                               OoOi1Ol ooOi1Ol3 = (OoOi1Ol) listI00OIl.get(i3);
/* 633 */                               OoOi1Ol ooOi1OlI000OOo1O4 = I000OOo1O(ooOi1Ol3, ooOOiO2, i + 1);
/* 649 */                               int iI001lIiIIo1O2 = IIlIOloOOO.I001lIiIIo1O(I0000Il00O(ooOOiO2.I000l1(), ooOi1OlI000OOo1O4.I00000oIO()));
/* 653 */                               if (iI001lIiIIo1O2 != 0) {
/* 656 */                                   if (iI001lIiIIo1O2 != 1) {
/* 658 */                                       c = 2;
/* 659 */                                       if (iI001lIiIIo1O2 == 2) {
                                                }
                                            } else {
/* 662 */                                       c = 2;
                                            }
/* 663 */                                   ooOi1OlI000OOo1O4 = OoOilo0Oliii.I000iOII(ooOOiO2);
                                        } else {
/* 668 */                                   c = 2;
/* 669 */                                   Ooo0Ioii0o0 ooo0Ioii0o0I000l1 = ooOOiO2.I000l1();
/* 673 */                                   Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 675 */                                   if (ooo0Ioii0o0I000l1 != ooo0Ioii0o0 && !ooOi1OlI000OOo1O4.I0000Il00O()) {
/* 689 */                                       ooOi1OlI000OOo1O4 = new OlIo1I(ooOi1OlI000OOo1O4.I00000oOI(), ooo0Ioii0o0);
                                            }
                                        }
/* 693 */                               if (ooOi1OlI000OOo1O4 != ooOi1Ol3) {
/* 695 */                                   z = true;
                                        }
/* 696 */                               arrayList.add(ooOi1OlI000OOo1O4);
                                    }
/* 704 */                           if (z) {
/* 707 */                               listI00OIl = arrayList;
                                    }
/* 717 */                           O0iIl1 o0iIl1I0000Il00O = lOoil0Io0Io.I0000Il00O(o0iIl1I00000oOI2, listI00OIl, ooOiiO01illo.I0000Il00O(o0iIl1I00000oOI2.getAnnotations()), 4);
/* 723 */                           if ((o0iIl1I0000Il00O instanceof Ol0O0iI0l0O) && (o0iIl1I000O01llI0 instanceof Ol0O0iI0l0O)) {
/* 733 */                               o0iIl1I0000Il00O = lOOIol01.I0000Il00O((Ol0O0iI0l0O) o0iIl1I0000Il00O, (Ol0O0iI0l0O) o0iIl1I000O01llI0);
                                    }
/* 739 */                           return new OlIo1I(o0iIl1I0000Il00O, ooo0Ioii0o0I00000oIO4);
                                }
                            }
                        }
                    }
/* 743 */           return ooOi1Ol;
                }
            }
