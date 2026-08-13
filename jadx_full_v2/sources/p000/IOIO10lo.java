            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            
            public class IOIO10lo extends Illll0i implements IOo1IIOOiO1o {
                public final boolean I00oooO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOIO10lo(OI000ilOol oI000ilOol, IOo1IIOOiO1o iOo1IIOOiO1o, I11IlOOO i11IlOOO, boolean z, int i, OlI1o0ooI olI1o0ooI) {
/* 18 */            super(i, i11IlOOO, oI000ilOol, iOo1IIOOiO1o, OlIIoO0Ol0o1.I0000oI00, olI1o0ooI);
/* 2 */             if (oI000ilOol == null) {
/* 40 */                I00l0I0l0lO1(0);
/* 1294 */              throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 35 */                I00l0I0l0lO1(1);
/* 38 */                throw null;
                    }
/* 6 */             if (i == 0) {
/* 30 */                I00l0I0l0lO1(2);
/* 33 */                throw null;
                    }
/* 8 */             if (olI1o0ooI == null) {
/* 25 */                I00l0I0l0lO1(3);
/* 28 */                throw null;
                    }
/* 21 */            this.I00oooO = z;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00l0I0l0lO1(int i) {
                    String str;
                    int i2;
/* 5 */             if (i != 21 && i != 27) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                                break;
                            default:
/* 12 */                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break;
                        }
                    } else {
/* 15 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 18 */            if (i != 21 && i != 27) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                                break;
                            default:
/* 25 */                        i2 = 3;
                                break;
                        }
                    } else {
/* 27 */                i2 = 2;
                    }
/* 28 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 5:
                        case 8:
                        case PoseLandmark.LEFT_KNEE:
/* 86 */                    objArr[0] = "annotations";
                            break;
                        case 2:
                        case PoseLandmark.RIGHT_HIP:
/* 81 */                    objArr[0] = "kind";
                            break;
                        case 3:
                        case 6:
                        case 9:
                        case PoseLandmark.RIGHT_KNEE:
/* 76 */                    objArr[0] = "source";
                            break;
                        case 4:
                        case 7:
                        default:
/* 38 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 10:
                        case 13:
/* 71 */                    objArr[0] = "unsubstitutedValueParameters";
                            break;
                        case 11:
                        case 14:
/* 66 */                    objArr[0] = "visibility";
                            break;
                        case 12:
/* 61 */                    objArr[0] = "typeParameterDescriptors";
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case 27:
/* 56 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 53 */                    objArr[0] = "originalSubstitutor";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 48 */                    objArr[0] = "overriddenDescriptors";
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 43 */                    objArr[0] = "newOwner";
                            break;
                    }
/* 89 */            if (i == 21) {
/* 126 */               objArr[1] = "getOverriddenDescriptors";
                    } else if (i != 27) {
                        switch (i) {
                            case 15:
                            case 16:
/* 116 */                       objArr[1] = "calculateContextReceiverParameters";
                                break;
                            case 17:
/* 111 */                       objArr[1] = "getContainingDeclaration";
                                break;
                            case PoseLandmark.RIGHT_PINKY:
/* 106 */                       objArr[1] = "getConstructedClass";
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 101 */                       objArr[1] = "getOriginal";
                                break;
                            default:
/* 96 */                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                                break;
                        }
                    } else {
/* 121 */               objArr[1] = "copy";
                    }
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
/* 163 */                   objArr[2] = "create";
                            break;
                        case 7:
                        case 8:
                        case 9:
/* 158 */                   objArr[2] = "createSynthesized";
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
/* 153 */                   objArr[2] = "initialize";
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case 27:
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 148 */                   objArr[2] = "substitute";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 143 */                   objArr[2] = "setOverriddenDescriptors";
                            break;
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.RIGHT_KNEE:
/* 138 */                   objArr[2] = "createSubstitutedCopy";
                            break;
                        default:
/* 133 */                   objArr[2] = "<init>";
                            break;
                    }
/* 165 */           String str2 = String.format(str, objArr);
/* 169 */           if (i != 21 && i != 27) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                                break;
                            default:
/* 187 */                       throw new IllegalArgumentException(str2);
                        }
                    }
/* 187 */           throw new IllegalStateException(str2);
                }

                @Override
                public final Collection I000o00OoI0I() {
/* 1 */             Set set = Collections.EMPTY_SET;
/* 3 */             if (set != null) {
/* 5 */                 return set;
                    }
/* 8 */             I00l0I0l0lO1(21);
/* 29 */            throw null;
                }

                @Override
                public final boolean I001iOo1i0O() {
/* 1 */             return this.I00oooO;
                }

                @Override
                public final OI000ilOol I001l0I00() {
/* 1 */             OI000ilOol oI000ilOolI000lI = I000lI();
/* 5 */             if (oI000ilOolI000lI != null) {
/* 7 */                 return oI000ilOolI000lI;
                    }
/* 10 */            I00l0I0l0lO1(18);
/* 29 */            throw null;
                }

                @Override
                public final IIiO00o1o I00Io1o110i(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0) {
/* 5 */             return (IOIO10lo) I010iIIOlo(ii1Ool1, o1oIIloii0, iiOiOloo0);
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I00IoIO0lI(this, obj);
                }

                @Override
                public final void I00iIi0i1o(Collection collection) {
/* 1 */             if (collection != null) {
/* 3 */                 return;
                    }
/* 6 */             I00l0I0l0lO1(22);
/* 49 */            throw null;
                }

                @Override
                public IOIO10lo I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 2 */             if (ii1Ool1 == null) {
/* 71 */                I00l0I0l0lO1(23);
/* 1294 */              throw null;
                    }
/* 4 */             if (i == 0) {
/* 65 */                I00l0I0l0lO1(24);
/* 68 */                throw null;
                    }
/* 6 */             if (i11IlOOO == null) {
/* 59 */                I00l0I0l0lO1(25);
/* 62 */                throw null;
                    }
/* 9 */             if (i == 1 || i == 4) {
/* 53 */                return new IOIO10lo((OI000ilOol) ii1Ool1, this, i11IlOOO, this.I00oooO, 1, olI1o0ooI);
                    }
/* 19 */            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
/* 22 */            sb.append(this);
/* 27 */            sb.append("\nnewOwner: ");
/* 30 */            sb.append(ii1Ool1);
/* 39 */            IoOOl0iOl1io.I000lI(sb, "\nkind: ", IIlIOloOOO.I001lllioOl(i));
/* 1 */             return null;
                }

                @Override
                public final OI000ilOol I000lI() {
/* 5 */             OI000ilOol oI000ilOol = (OI000ilOol) super.I000lI();
/* 7 */             if (oI000ilOol != null) {
/* 9 */                 return oI000ilOol;
                    }
/* 12 */            I00l0I0l0lO1(17);
/* 29 */            throw null;
                }

                @Override
                public final IOIO10lo I010i10l() {
/* 5 */             IOIO10lo iOIO10lo = (IOIO10lo) super.I010i10l();
/* 7 */             if (iOIO10lo != null) {
/* 9 */                 return iOIO10lo;
                    }
/* 12 */            I00l0I0l0lO1(19);
/* 29 */            throw null;
                }

                public final void I011IO1I11OI(List list, IiOiOloo0 iiOiOloo0) {
/* 1 */             if (list != null) {
/* 11 */                I011IOil(list, iiOiOloo0, I000lI().I00io1l());
                    } else {
/* 17 */                I00l0I0l0lO1(13);
/* 89 */                throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I011IOil(List list, IiOiOloo0 iiOiOloo0, List list2) {
                    O0ioOi0Oo1ii o0ioOi0Oo1iiI00iiI;
                    List listI001i1O0Ol;
/* 2 */             if (list == null) {
/* 92 */                I00l0I0l0lO1(10);
/* 215 */               throw null;
                    }
/* 4 */             if (list2 == null) {
/* 86 */                I00l0I0l0lO1(12);
/* 89 */                throw null;
                    }
/* 6 */             OI000ilOol oI000ilOolI000lI = I000lI();
/* 14 */            if (oI000ilOolI000lI.I000iOII()) {
/* 16 */                Ii1Ool1 ii1Ool1I000lI = oI000ilOolI000lI.I000lI();
/* 32 */                o0ioOi0Oo1iiI00iiI = ii1Ool1I000lI instanceof OI000ilOol ? ((OI000ilOol) ii1Ool1I000lI).I00iiI() : null;
                    }
/* 33 */            OI000ilOol oI000ilOolI000lI2 = I000lI();
/* 45 */            if (oI000ilOolI000lI2.I001i1O0Ol().isEmpty()) {
/* 61 */                listI001i1O0Ol = Collections.EMPTY_LIST;
/* 63 */                if (listI001i1O0Ol == null) {
/* 80 */                    I00l0I0l0lO1(16);
/* 83 */                    throw null;
                        }
                    } else {
/* 47 */                listI001i1O0Ol = oI000ilOolI000lI2.I001i1O0Ol();
/* 51 */                if (listI001i1O0Ol == null) {
/* 57 */                    I00l0I0l0lO1(15);
/* 60 */                    throw null;
                        }
                    }
/* 74 */            I010lI0oi(null, o0ioOi0Oo1iiI00iiI, listI001i1O0Ol, list2, list, null, O1oIIloii0.I00iiI, iiOiOloo0);
                }

                @Override
                public final IOIO10lo I0000oI00(OoOilII0 ooOilII0) {
/* 1 */             if (ooOilII0 != null) {
/* 7 */                 return (IOIO10lo) super.I0000oI00(ooOilII0);
                    }
/* 12 */            I00l0I0l0lO1(20);
/* 49 */            throw null;
                }
            }
