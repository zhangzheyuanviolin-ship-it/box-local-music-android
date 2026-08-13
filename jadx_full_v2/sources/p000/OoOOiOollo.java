            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OoOOiOollo extends I01l00l {
                public ArrayList I00li1OI;
                public boolean I00ll1;

                public static void I00l0I0l0lO1(int i) {
/* 11 */            String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 21 */            Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 7:
                        case 13:
                        case PoseLandmark.RIGHT_INDEX:
/* 79 */                    objArr[0] = "annotations";
                            break;
                        case 2:
                        case 8:
                        case 14:
                        case PoseLandmark.LEFT_THUMB:
/* 74 */                    objArr[0] = "variance";
                            break;
                        case 3:
                        case 9:
                        case 15:
                        case PoseLandmark.RIGHT_THUMB:
/* 69 */                    objArr[0] = "name";
                            break;
                        case 4:
                        case 11:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_KNEE:
/* 64 */                    objArr[0] = "storageManager";
                            break;
                        case 5:
                        case PoseLandmark.RIGHT_ANKLE:
/* 59 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                            break;
                        case 6:
                        case 12:
                        case PoseLandmark.LEFT_INDEX:
                        default:
/* 31 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 10:
                        case 16:
                        case PoseLandmark.LEFT_HIP:
/* 56 */                    objArr[0] = "source";
                            break;
                        case 17:
/* 51 */                    objArr[0] = "supertypeLoopsResolver";
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 46 */                    objArr[0] = "supertypeLoopsChecker";
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 41 */                    objArr[0] = "bound";
                            break;
                        case 27:
/* 36 */                    objArr[0] = "type";
                            break;
                    }
/* 84 */            if (i == 5) {
/* 96 */                objArr[1] = "createWithDefaultBound";
                    } else if (i != 28) {
/* 88 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                    } else {
/* 93 */                objArr[1] = "resolveUpperBounds";
                    }
                    switch (i) {
                        case 5:
                        case PoseLandmark.RIGHT_ANKLE:
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
/* 121 */                   objArr[2] = "createForFurtherModification";
                            break;
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
/* 116 */                   objArr[2] = "<init>";
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 111 */                   objArr[2] = "addUpperBound";
                            break;
                        case 27:
/* 106 */                   objArr[2] = "reportSupertypeLoopError";
                            break;
                        default:
/* 101 */                   objArr[2] = "createWithDefaultBound";
                            break;
                    }
/* 123 */           String str2 = String.format(str, objArr);
/* 127 */           if (i != 5 && i != 28) {
/* 142 */               throw new IllegalArgumentException(str2);
                    }
/* 142 */           throw new IllegalStateException(str2);
                }

                public static OoOOiOollo I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, O1I0OloI o1I0OloI, OI1Iio0ii1 oI1Iio0ii1, Ooo0Ioii0o0 ooo0Ioii0o0, boolean z) {
/* 2 */             if (ii1Ool1 == null) {
/* 63 */                I00l0I0l0lO1(6);
/* 429 */               throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 58 */                I00l0I0l0lO1(7);
/* 61 */                throw null;
                    }
/* 6 */             if (ooo0Ioii0o0 == null) {
/* 53 */                I00l0I0l0lO1(8);
/* 56 */                throw null;
                    }
/* 8 */             if (oI1Iio0ii1 == null) {
/* 47 */                I00l0I0l0lO1(9);
/* 50 */                throw null;
                    }
/* 10 */            if (o1I0OloI == null) {
/* 41 */                I00l0I0l0lO1(11);
/* 44 */                throw null;
                    }
/* 21 */            OoOOiOollo ooOOiOollo = new OoOOiOollo(i, i11IlOOO, ii1Ool1, o1I0OloI, oI1Iio0ii1, ooo0Ioii0o0, z);
/* 30 */            ooOOiOollo.I00li1OI = new ArrayList(1);
/* 33 */            ooOOiOollo.I00ll1 = false;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            return ooOOiOollo;
                }

                public static OoOOiOollo I010l1O(I00lll10 i00lll10, Ooo0Ioii0o0 ooo0Ioii0o0, OI1Iio0ii1 oI1Iio0ii1, int i, O1I0OloI o1I0OloI) {
/* 1 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 4 */             if (o1I0OloI == null) {
/* 75 */                I00l0I0l0lO1(4);
/* 966 */               throw null;
                    }
/* 12 */            OoOOiOollo ooOOiOolloI010l10O = I010l10O(i, i11IiIloOo, i00lll10, o1I0OloI, oI1Iio0ii1, ooo0Ioii0o0, false);
/* 20 */            Ol0O0iI0l0O ol0O0iI0l0OI000oI1ioi = IiOiOOIo.I0000oI00(i00lll10).I000oI1ioi();
/* 28 */            if (ooOOiOolloI010l10O.I00ll1) {
/* 70 */                I000II.I001IO000("Type parameter descriptor is already initialized: ".concat(ooOOiOolloI010l10O.I010l1ol111()));
/* 3 */                 return null;
                    }
/* 34 */            if (!l0loOi1ol11o.I00000oIO(ol0O0iI0l0OI000oI1ioi)) {
/* 39 */                ooOOiOolloI010l10O.I00li1OI.add(ol0O0iI0l0OI000oI1ioi);
                    }
/* 44 */            if (ooOOiOolloI010l10O.I00ll1) {
/* 58 */                I000II.I001IO000("Type parameter descriptor is already initialized: ".concat(ooOOiOolloI010l10O.I010l1ol111()));
/* 3 */                 return null;
                    }
/* 47 */            ooOOiOolloI010l10O.I00ll1 = true;
/* 49 */            return ooOOiOolloI010l10O;
                }

                @Override
                public final List I010ioo() {
/* 4 */             if (!this.I00ll1) {
/* 27 */                I000II.I001IO000("Type parameter descriptor is not initialized: ".concat(I010l1ol111()));
/* 3 */                 return null;
                    }
/* 6 */             ArrayList arrayList = this.I00li1OI;
/* 8 */             if (arrayList != null) {
/* 10 */                return arrayList;
                    }
/* 13 */            I00l0I0l0lO1(28);
/* 16 */            throw null;
                }

                public final String I010l1ol111() {
/* 29 */            return getName() + " declared in " + IiOiIO0i1Oil.I0001Ioi1lo(I000lI());
                }
            }
