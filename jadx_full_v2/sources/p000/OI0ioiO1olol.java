            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            
            public final class OI0ioiO1olol extends IOIOIo {
                public IOIOllO1oli I00io1l;
                public O1oIIloii0 I00ioIO;
                public IiOiOloo0 I00l0I0l0lO1;
                public IOIi10o I00l0OO0IO;
                public ArrayList I00li1OI;

                public static void I00oI0i(int i) {
                    String str;
                    int i2;
                    switch (i) {
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 15:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 7 */                     str = "@NotNull method %s.%s must not return null";
                            break;
                        case 6:
                        case 9:
                        case 12:
                        case 14:
                        case 16:
                        default:
/* 4 */                     str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                    switch (i) {
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 15:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 15 */                    i2 = 2;
                            break;
                        case 6:
                        case 9:
                        case 12:
                        case 14:
                        case 16:
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
/* 74 */                    objArr[0] = "kind";
                            break;
                        case 2:
/* 69 */                    objArr[0] = "name";
                            break;
                        case 3:
/* 64 */                    objArr[0] = "source";
                            break;
                        case 4:
/* 59 */                    objArr[0] = "storageManager";
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 15:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 54 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                            break;
                        case 6:
/* 51 */                    objArr[0] = "modality";
                            break;
                        case 9:
/* 46 */                    objArr[0] = "visibility";
                            break;
                        case 12:
/* 41 */                    objArr[0] = "supertype";
                            break;
                        case 14:
/* 36 */                    objArr[0] = "typeParameters";
                            break;
                        case 16:
/* 31 */                    objArr[0] = "kotlinTypeRefiner";
                            break;
                        default:
/* 26 */                    objArr[0] = "containingDeclaration";
                            break;
                    }
                    switch (i) {
                        case 5:
/* 130 */                   objArr[1] = "getAnnotations";
                            break;
                        case 6:
                        case 9:
                        case 12:
                        case 14:
                        case 16:
                        default:
/* 82 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                            break;
                        case 7:
/* 125 */                   objArr[1] = "getModality";
                            break;
                        case 8:
/* 120 */                   objArr[1] = "getKind";
                            break;
                        case 10:
/* 115 */                   objArr[1] = "getVisibility";
                            break;
                        case 11:
/* 110 */                   objArr[1] = "getTypeConstructor";
                            break;
                        case 13:
/* 105 */                   objArr[1] = "getConstructors";
                            break;
                        case 15:
/* 100 */                   objArr[1] = "getDeclaredTypeParameters";
                            break;
                        case 17:
/* 95 */                    objArr[1] = "getUnsubstitutedMemberScope";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 92 */                    objArr[1] = "getStaticScope";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 87 */                    objArr[1] = "getSealedSubclasses";
                            break;
                    }
                    switch (i) {
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 15:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                            break;
                        case 6:
/* 160 */                   objArr[2] = "setModality";
                            break;
                        case 9:
/* 155 */                   objArr[2] = "setVisibility";
                            break;
                        case 12:
/* 150 */                   objArr[2] = "addSupertype";
                            break;
                        case 14:
/* 145 */                   objArr[2] = "setTypeParameterDescriptors";
                            break;
                        case 16:
/* 140 */                   objArr[2] = "getUnsubstitutedMemberScope";
                            break;
                        default:
/* 137 */                   objArr[2] = "<init>";
                            break;
                    }
/* 162 */           String str2 = String.format(str, objArr);
                    switch (i) {
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 15:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 180 */                   throw new IllegalStateException(str2);
                        case 6:
                        case 9:
                        case 12:
                        case 14:
                        case 16:
                        default:
/* 180 */                   throw new IllegalArgumentException(str2);
                    }
                }

                @Override
                public final Collection I000II() {
/* 1 */             Set set = Collections.EMPTY_SET;
/* 3 */             if (set != null) {
/* 5 */                 return set;
                    }
/* 8 */             I00oI0i(13);
/* 29 */            throw null;
                }

                @Override
                public final OoOIOoO1I I000OOo1O() {
/* 1 */             IOIi10o iOIi10o = this.I00l0OO0IO;
/* 3 */             if (iOIi10o != null) {
/* 5 */                 return iOIi10o;
                    }
/* 8 */             I00oI0i(11);
/* 29 */            throw null;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             IiOiOloo0 iiOiOloo0 = this.I00l0I0l0lO1;
/* 3 */             if (iiOiOloo0 != null) {
/* 5 */                 return iiOiOloo0;
                    }
/* 8 */             I00oI0i(10);
/* 29 */            throw null;
                }

                @Override
                public final boolean I000iOII() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final O1oIIloii0 I001IO000() {
/* 1 */             O1oIIloii0 o1oIIloii0 = this.I00ioIO;
/* 3 */             if (o1oIIloii0 != null) {
/* 5 */                 return o1oIIloii0;
                    }
/* 7 */             I00oI0i(7);
/* 29 */            throw null;
                }

                @Override
                public final IOIOllO1oli I00II0oii1o() {
/* 1 */             IOIOllO1oli iOIOllO1oli = this.I00io1l;
/* 3 */             if (iOIOllO1oli != null) {
/* 5 */                 return iOIOllO1oli;
                    }
/* 8 */             I00oI0i(8);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00IO1() {
/* 1 */             return false;
                }

                @Override
                public final O1iil1I01o I00iOIl() {
/* 1 */             return O1iii1olO.I00000oOI;
                }

                @Override
                public final boolean I00ilI0I1() {
/* 1 */             return false;
                }

                @Override
                public final List I00io1l() {
/* 1 */             ArrayList arrayList = this.I00li1OI;
/* 3 */             if (arrayList != null) {
/* 5 */                 return arrayList;
                    }
/* 8 */             I00oI0i(15);
/* 29 */            throw null;
                }

                @Override
                public final O1iil1I01o I00li1OI(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 1 */             return O1iii1olO.I00000oOI;
                }

                @Override
                public final IOIO10lo I00ll1() {
/* 1 */             return null;
                }

                @Override
                public final OoloOii00O I00lli11() {
/* 1 */             return null;
                }

                @Override
                public final boolean I00lll10() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00o0iI0io1() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00o0l1o1o0() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00o101lO() {
/* 1 */             return false;
                }

                @Override
                public final I11IlOOO getAnnotations() {
/* 1 */             return i1i0olI.I00iiO;
                }

                public final String toString() {
/* 1 */             return Ii1Ooli.I010OIo1l(this);
                }
            }
