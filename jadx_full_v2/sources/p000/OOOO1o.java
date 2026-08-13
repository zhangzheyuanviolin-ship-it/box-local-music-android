            package p000;

            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
/* 47 */    public class OOOO1o extends Ooo0IOOIl0 implements OOOO01l {
                public final boolean I00ilO0;
                public O1I01I0o I00io1l;
                public IllOOo00lI I00ioIO;
                public final O1oIIloii0 I00l0I0l0lO1;
                public IiOiOloo0 I00l0OO0IO;
                public Collection I00li1OI;
                public final OOOO01l I00ll1;
                public final int I00lli11;
                public final boolean I00lll10;
                public final boolean I00o0iI0io1;
                public final boolean I00o0l1o1o0;
                public final boolean I00o101lO;
                public final boolean I00oI0i;
                public List I00oII;
                public O0ioOi0Oo1ii I00oIiI10;
                public O0ioOi0Oo1ii I00oO101o;
                public ArrayList I00oOio10iI1;
                public OOOOI1ioIo I00ol1;
                public OOOOOO0O I00olI;
                public IlIO01Iil I00oli;
                public IlIO01Iil I00oliIiO01i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOOO1o(Ii1Ool1 ii1Ool1, OOOO01l oOOO01l, I11IlOOO i11IlOOO, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, boolean z, OI1Iio0ii1 oI1Iio0ii1, int i, OlI1o0ooI olI1o0ooI, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
/* 1 */             super(ii1Ool1, i11IlOOO, oI1Iio0ii1, null, olI1o0ooI);
                    if (ii1Ool1 == null) {
                        I00l0I0l0lO1(0);
                        throw null;
                    }
                    if (i11IlOOO == null) {
                        I00l0I0l0lO1(1);
                        throw null;
                    }
                    if (o1oIIloii0 == null) {
                        I00l0I0l0lO1(2);
                        throw null;
                    }
                    if (iiOiOloo0 == null) {
                        I00l0I0l0lO1(3);
                        throw null;
                    }
                    if (oI1Iio0ii1 == null) {
                        I00l0I0l0lO1(4);
                        throw null;
                    }
                    if (i == 0) {
                        I00l0I0l0lO1(5);
                        throw null;
                    }
                    if (olI1o0ooI == null) {
/* 14 */                I00l0I0l0lO1(6);
                        throw null;
                    }
/* 2 */             this.I00ilO0 = z;
/* 3 */             this.I00li1OI = null;
/* 4 */             this.I00oII = Collections.EMPTY_LIST;
/* 5 */             this.I00l0I0l0lO1 = o1oIIloii0;
/* 6 */             this.I00l0OO0IO = iiOiOloo0;
/* 7 */             this.I00ll1 = oOOO01l == null ? this : oOOO01l;
/* 8 */             this.I00lli11 = i;
/* 9 */             this.I00lll10 = z2;
/* 10 */            this.I00o0iI0io1 = z3;
/* 11 */            this.I00o0l1o1o0 = z4;
/* 12 */            this.I00o101lO = z5;
/* 13 */            this.I00oI0i = z6;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00l0I0l0lO1(int i) {
                    String str;
                    int i2;
/* 11 */            if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                        switch (i) {
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                                break;
                            default:
/* 24 */                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break;
                        }
                    } else {
/* 27 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 30 */            if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                        switch (i) {
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                                break;
                            default:
/* 43 */                        i2 = 3;
                                break;
                        }
                    } else {
/* 45 */                i2 = 2;
                    }
/* 46 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 8:
/* 156 */                   objArr[0] = "annotations";
                            break;
                        case 2:
                        case 9:
/* 151 */                   objArr[0] = "modality";
                            break;
                        case 3:
                        case 10:
                        case PoseLandmark.RIGHT_INDEX:
/* 146 */                   objArr[0] = "visibility";
                            break;
                        case 4:
                        case 11:
/* 141 */                   objArr[0] = "name";
                            break;
                        case 5:
                        case 12:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 136 */                   objArr[0] = "kind";
                            break;
                        case 6:
                        case 13:
                        case 37:
/* 131 */                   objArr[0] = "source";
                            break;
                        case 7:
                        default:
/* 56 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 14:
/* 126 */                   objArr[0] = "inType";
                            break;
                        case 15:
                        case 17:
/* 121 */                   objArr[0] = "outType";
                            break;
                        case 16:
                        case PoseLandmark.RIGHT_PINKY:
/* 116 */                   objArr[0] = "typeParameters";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 111 */                   objArr[0] = "contextReceiverParameters";
                            break;
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.RIGHT_KNEE:
                        case PoseLandmark.RIGHT_ANKLE:
                        case 38:
                        case 39:
                        case 41:
                        case 42:
/* 106 */                   objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                            break;
                        case 27:
/* 103 */                   objArr[0] = "originalSubstitutor";
                            break;
                        case PoseLandmark.LEFT_HEEL:
/* 98 */                    objArr[0] = "copyConfiguration";
                            break;
                        case 30:
/* 93 */                    objArr[0] = "substitutor";
                            break;
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 88 */                    objArr[0] = "accessorDescriptor";
                            break;
                        case 32:
/* 83 */                    objArr[0] = "newOwner";
                            break;
                        case 33:
/* 78 */                    objArr[0] = "newModality";
                            break;
                        case 34:
/* 73 */                    objArr[0] = "newVisibility";
                            break;
                        case 36:
/* 68 */                    objArr[0] = "newName";
                            break;
                        case 40:
/* 62 */                    objArr[0] = "overriddenDescriptors";
                            break;
                    }
/* 159 */           if (i == 28) {
/* 227 */               objArr[1] = "getSourceToUseForCopy";
                    } else if (i == 38) {
/* 222 */               objArr[1] = "getOriginal";
                    } else if (i == 39) {
/* 217 */               objArr[1] = "getKind";
                    } else if (i == 41) {
/* 212 */               objArr[1] = "getOverriddenDescriptors";
                    } else if (i != 42) {
                        switch (i) {
                            case PoseLandmark.LEFT_THUMB:
/* 202 */                       objArr[1] = "getTypeParameters";
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 197 */                       objArr[1] = "getContextReceiverParameters";
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 192 */                       objArr[1] = "getReturnType";
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 187 */                       objArr[1] = "getModality";
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 182 */                       objArr[1] = "getVisibility";
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 177 */                       objArr[1] = "getAccessors";
                                break;
                            default:
/* 172 */                       objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                                break;
                        }
                    } else {
/* 207 */               objArr[1] = "copy";
                    }
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
/* 279 */                   objArr[2] = "create";
                            break;
                        case 14:
/* 274 */                   objArr[2] = "setInType";
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 269 */                   objArr[2] = "setType";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 264 */                   objArr[2] = "setVisibility";
                            break;
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.RIGHT_KNEE:
                        case PoseLandmark.RIGHT_ANKLE:
                        case 38:
                        case 39:
                        case 41:
                        case 42:
                            break;
                        case 27:
/* 259 */                   objArr[2] = "substitute";
                            break;
                        case PoseLandmark.LEFT_HEEL:
/* 254 */                   objArr[2] = "doSubstitute";
                            break;
                        case 30:
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 249 */                   objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                            break;
                        case 32:
                        case 33:
                        case 34:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                        case 36:
                        case 37:
/* 244 */                   objArr[2] = "createSubstitutedCopy";
                            break;
                        case 40:
/* 239 */                   objArr[2] = "setOverriddenDescriptors";
                            break;
                        default:
/* 234 */                   objArr[2] = "<init>";
                            break;
                    }
/* 281 */           String str2 = String.format(str, objArr);
/* 285 */           if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                        switch (i) {
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                                break;
                            default:
/* 309 */                       throw new IllegalArgumentException(str2);
                        }
                    }
/* 309 */           throw new IllegalStateException(str2);
                }

                public static OOOO1o I010ioo(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, boolean z, OI1Iio0ii1 oI1Iio0ii1, int i, OlI1o0ooI olI1o0ooI) {
/* 1 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 3 */             IiOiOloo0 iiOiOloo0 = IiOiioI.I0000oI00;
/* 6 */             if (ii1Ool1 == null) {
/* 56 */                I00l0I0l0lO1(7);
/* 1294 */              throw null;
                    }
/* 8 */             if (oI1Iio0ii1 == null) {
/* 51 */                I00l0I0l0lO1(11);
/* 54 */                throw null;
                    }
/* 10 */            if (i == 0) {
/* 45 */                I00l0I0l0lO1(12);
/* 48 */                throw null;
                    }
/* 12 */            if (olI1o0ooI != null) {
/* 33 */                return new OOOO1o(ii1Ool1, null, i11IiIloOo, o1oIIloii0, iiOiOloo0, z, oI1Iio0ii1, i, olI1o0ooI, false, false, false, false, false);
                    }
/* 39 */            I00l0I0l0lO1(13);
/* 42 */            throw null;
                }

                public static Illlil I010l1O(OoOilII0 ooOilII0, OOOIoo1o1 oOOIoo1o1) {
/* 2 */             if (oOOIoo1o1 == null) {
/* 16 */                I00l0I0l0lO1(31);
/* 89 */                throw null;
                    }
/* 4 */             Illlil illlil = oOOIoo1o1.I00ll1;
/* 6 */             if (illlil != null) {
/* 8 */                 return illlil.I0000oI00(ooOilII0);
                    }
/* 1 */             return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1, types: [OOOO01l] */
                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6 */
                @Override
                public final OOOO01l I010i10l() {
/* 1 */             OOOO01l oOOO01l = this.I00ll1;
                    ?? I010i10l = this;
/* 3 */             if (oOOO01l != this) {
/* 6 */                 I010i10l = oOOO01l.I010i10l();
                    }
/* 10 */            if (I010i10l != 0) {
/* 12 */                return I010i10l;
                    }
/* 15 */            I00l0I0l0lO1(38);
/* 29 */            throw null;
                }

                @Override
                public final OOOOI1ioIo I00000oOI() {
/* 1 */             return this.I00ol1;
                }

                @Override
                public final OOOOOO0O I0000Il00O() {
/* 1 */             return this.I00olI;
                }

                @Override
                public final OOOO01l I0000oI00(OoOilII0 ooOilII0) {
/* 1 */             if (ooOilII0 == null) {
/* 31 */                I00l0I0l0lO1(27);
/* 49 */                throw null;
                    }
/* 3 */             OoOiiO01illo ooOiiO01illo = ooOilII0.I00000oIO;
/* 9 */             if (ooOiiO01illo.I0000oI00()) {
/* 11 */                return this;
                    }
/* 12 */            OOOO1OIoi10O oOOO1OIoi10OI010lI0oi = I010lI0oi();
/* 16 */            oOOO1OIoi10OI010lI0oi.I0001Ioi1lo = ooOiiO01illo;
/* 22 */            oOOO1OIoi10OI010lI0oi.I0000O = I010i10l();
/* 24 */            return oOOO1OIoi10OI010lI0oi.I00000oIO();
                }

                @Override
                public final O0iIl1 I0001Ioi1lo() {
/* 1 */             O0iIl1 type = getType();
/* 5 */             if (type != null) {
/* 7 */                 return type;
                    }
/* 10 */            I00l0I0l0lO1(23);
/* 29 */            throw null;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             IiOiOloo0 iiOiOloo0 = this.I00l0OO0IO;
/* 3 */             if (iiOiOloo0 != null) {
/* 5 */                 return iiOiOloo0;
                    }
/* 8 */             I00l0I0l0lO1(25);
/* 29 */            throw null;
                }

                @Override
                public final Collection I000o00OoI0I() {
/* 1 */             Collection collection = this.I00li1OI;
/* 3 */             if (collection == null) {
/* 6 */                 collection = Collections.EMPTY_LIST;
                    }
/* 8 */             if (collection != null) {
/* 10 */                return collection;
                    }
/* 13 */            I00l0I0l0lO1(41);
/* 29 */            throw null;
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             int i = this.I00lli11;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 8 */             I00l0I0l0lO1(39);
/* 29 */            throw null;
                }

                @Override
                public final ArrayList I0010o() {
/* 4 */             ArrayList arrayList = new ArrayList(2);
/* 7 */             OOOOI1ioIo oOOOI1ioIo = this.I00ol1;
/* 9 */             if (oOOOI1ioIo != null) {
/* 11 */                arrayList.add(oOOOI1ioIo);
                    }
/* 14 */            OOOOOO0O oooooo0o = this.I00olI;
/* 16 */            if (oooooo0o != null) {
/* 18 */                arrayList.add(oooooo0o);
                    }
/* 29 */            return arrayList;
                }

                public Object I00111O(IiOlOI0o iiOlOI0o) {
/* 1 */             return null;
                }

                public boolean I001IIilI0O() {
/* 1 */             return this.I00o101lO;
                }

                @Override
                public final O1oIIloii0 I001IO000() {
/* 1 */             O1oIIloii0 o1oIIloii0 = this.I00l0I0l0lO1;
/* 3 */             if (o1oIIloii0 != null) {
/* 5 */                 return o1oIIloii0;
                    }
/* 8 */             I00l0I0l0lO1(24);
/* 29 */            throw null;
                }

                public boolean I001i1lo1io() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final boolean I00IO1() {
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final boolean I00IO1oi11O() {
/* 1 */             return this.I00oI0i;
                }

                @Override
                public final IOo0i1 I00Io1lO() {
/* 1 */             O1I01I0o o1I01I0o = this.I00io1l;
/* 3 */             if (o1I01I0o != null) {
/* 9 */                 return (IOo0i1) o1I01I0o.invoke();
                    }
/* 12 */            return null;
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I001l0I00(this, obj);
                }

                @Override
                public final O0ioOi0Oo1ii I00OI1() {
/* 1 */             return this.I00oIiI10;
                }

                @Override
                public final boolean I00OIo() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final O0ioOi0Oo1ii I00OOll1() {
/* 1 */             return this.I00oO101o;
                }

                @Override
                public final IlIO01Iil I00OilO00Il() {
/* 1 */             return this.I00oliIiO01i;
                }

                @Override
                public final IlIO01Iil I00Ol00() {
/* 1 */             return this.I00oli;
                }

                @Override
                public final List I00Ol1ll1() {
/* 1 */             List list = this.I00oII;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             I00l0I0l0lO1(22);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00i01iIIliI() {
/* 1 */             return this.I00lll10;
                }

                @Override
                public final void I00iIi0i1o(Collection collection) {
/* 1 */             if (collection != null) {
/* 3 */                 this.I00li1OI = collection;
                    } else {
/* 8 */                 I00l0I0l0lO1(40);
/* 49 */                throw null;
                    }
                }

                @Override
                public final boolean I00ilI0I1() {
/* 1 */             return false;
                }

                @Override
                public final OOOO1o I00Io1o110i(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0) {
/* 1 */             OOOO1OIoi10O oOOO1OIoi10OI010lI0oi = I010lI0oi();
/* 5 */             oOOO1OIoi10OI010lI0oi.I00000oIO = ii1Ool1;
/* 8 */             oOOO1OIoi10OI010lI0oi.I0000O = null;
/* 10 */            oOOO1OIoi10OI010lI0oi.I00000oOI = o1oIIloii0;
/* 12 */            oOOO1OIoi10OI010lI0oi.I0000Il00O = iiOiOloo0;
/* 15 */            oOOO1OIoi10OI010lI0oi.I0000oI00 = 2;
/* 18 */            oOOO1OIoi10OI010lI0oi.I000II = false;
/* 20 */            OOOO1o oOOO1oI00000oIO = oOOO1OIoi10OI010lI0oi.I00000oIO();
/* 24 */            if (oOOO1oI00000oIO != null) {
/* 26 */                return oOOO1oI00000oIO;
                    }
/* 29 */            I00l0I0l0lO1(42);
/* 215 */           throw null;
                }

                public OOOO1o I010l10O(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, OOOO01l oOOO01l, int i, OI1Iio0ii1 oI1Iio0ii1) {
/* 4 */             if (ii1Ool1 == null) {
/* 82 */                I00l0I0l0lO1(32);
/* 1294 */              throw null;
                    }
/* 6 */             if (o1oIIloii0 == null) {
/* 76 */                I00l0I0l0lO1(33);
/* 79 */                throw null;
                    }
/* 8 */             if (iiOiOloo0 == null) {
/* 70 */                I00l0I0l0lO1(34);
/* 73 */                throw null;
                    }
/* 10 */            if (i == 0) {
/* 64 */                I00l0I0l0lO1(35);
/* 67 */                throw null;
                    }
/* 12 */            if (oI1Iio0ii1 == null) {
/* 58 */                I00l0I0l0lO1(36);
/* 61 */                throw null;
                    }
/* 52 */            return new OOOO1o(ii1Ool1, oOOO01l, getAnnotations(), o1oIIloii0, iiOiOloo0, this.I00ilO0, oI1Iio0ii1, i, OlI1o0ooI.I00IO1, this.I00lll10, I001i1lo1io(), this.I00o0l1o1o0, I001IIilI0O(), this.I00oI0i);
                }

                public final void I010l1ol111(OOOOI1ioIo oOOOI1ioIo, OOOOOO0O oooooo0o, IlIO01Iil ilIO01Iil, IlIO01Iil ilIO01Iil2) {
/* 1 */             this.I00ol1 = oOOOI1ioIo;
/* 3 */             this.I00olI = oooooo0o;
/* 5 */             this.I00oli = ilIO01Iil;
/* 7 */             this.I00oliIiO01i = ilIO01Iil2;
                }

                public final OOOO1OIoi10O I010lI0oi() {
/* 3 */             OOOO1OIoi10O oOOO1OIoi10O = new OOOO1OIoi10O();
/* 6 */             oOOO1OIoi10O.I000iOII = this;
/* 12 */            oOOO1OIoi10O.I00000oIO = I000lI();
/* 18 */            oOOO1OIoi10O.I00000oOI = I001IO000();
/* 24 */            oOOO1OIoi10O.I0000Il00O = I000OiO();
/* 27 */            oOOO1OIoi10O.I0000O = null;
/* 33 */            oOOO1OIoi10O.I0000oI00 = I000oI1ioi();
/* 37 */            oOOO1OIoi10O.I0001Ioi1lo = OoOiiO01illo.I00000oIO;
/* 40 */            oOOO1OIoi10O.I000II = true;
/* 44 */            oOOO1OIoi10O.I000O01llI0 = this.I00oIiI10;
/* 50 */            oOOO1OIoi10O.I000OOo1O = getName();
/* 56 */            oOOO1OIoi10O.I000OiO = getType();
/* 58 */            VarHandle.storeStoreFence();
/* 113 */           return oOOO1OIoi10O;
                }

                public final void I010o0o0oO(O1I01I0o o1I01I0o, IllOOo00lI illOOo00lI) {
/* 1 */             if (illOOo00lI == null) {
/* 89 */                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
                    }
/* 3 */             this.I00ioIO = illOOo00lI;
/* 5 */             if (o1I01I0o == null) {
/* 12 */                o1I01I0o = (O1I01I0o) illOOo00lI.invoke();
                    }
/* 14 */            this.I00io1l = o1I01I0o;
                }

                public final void I01101IOlO(O0iIl1 o0iIl1, List list, O0ioOi0Oo1ii o0ioOi0Oo1ii, O0ioOi0Oo1ii o0ioOi0Oo1ii2, List list2) {
/* 2 */             if (o0iIl1 == null) {
/* 38 */                I00l0I0l0lO1(17);
/* 966 */               throw null;
                    }
/* 4 */             if (list == null) {
/* 32 */                I00l0I0l0lO1(18);
/* 35 */                throw null;
                    }
/* 6 */             if (list2 == null) {
/* 26 */                I00l0I0l0lO1(19);
/* 29 */                throw null;
                    }
/* 8 */             this.I00ilI0I1 = o0iIl1;
/* 15 */            this.I00oOio10iI1 = new ArrayList(list);
/* 17 */            this.I00oO101o = o0ioOi0Oo1ii2;
/* 19 */            this.I00oIiI10 = o0ioOi0Oo1ii;
/* 21 */            this.I00oII = list2;
                }

                @Override
                public final List getTypeParameters() {
/* 1 */             ArrayList arrayList = this.I00oOio10iI1;
/* 3 */             if (arrayList != null) {
/* 5 */                 return arrayList;
                    }
/* 8 */             IoOOl0iOl1io.I000OOo1O("typeParameters == null for ", this);
/* 11 */            return null;
                }

/* 48 */        public void I010oio1OO0(O0iIl1 o0iIl1) {
                }
            }
