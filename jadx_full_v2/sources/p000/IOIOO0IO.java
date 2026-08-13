            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            
            public class IOIOO0IO extends IOIOIo {
                public final O1oIIloii0 I00io1l;
                public final IOIOllO1oli I00ioIO;
                public final IOIi10o I00l0I0l0lO1;
                public O1iil1I01o I00l0OO0IO;
                public Set I00li1OI;
                public IOIO10lo I00ll1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOIOO0IO(Ii1Ool1 ii1Ool1, OI1Iio0ii1 oI1Iio0ii1, O1oIIloii0 o1oIIloii0, IOIOllO1oli iOIOllO1oli, Collection collection, O1I0OloI o1I0OloI) {
/* 10 */            super(o1I0OloI, ii1Ool1, oI1Iio0ii1, OlI1o0ooI.I00IO1);
/* 2 */             if (ii1Ool1 == null) {
/* 38 */                I00oI0i(0);
/* 1294 */              throw null;
                    }
/* 4 */             if (oI1Iio0ii1 == null) {
/* 33 */                I00oI0i(1);
/* 36 */                throw null;
                    }
/* 6 */             if (o1I0OloI == null) {
/* 28 */                I00oI0i(6);
/* 31 */                throw null;
                    }
/* 13 */            this.I00io1l = o1oIIloii0;
/* 15 */            this.I00ioIO = iOIOllO1oli;
/* 24 */            this.I00l0I0l0lO1 = new IOIi10o(this, Collections.EMPTY_LIST, collection, o1I0OloI);
                }

                public static void I00oI0i(int i) {
                    String str;
                    int i2;
                    switch (i) {
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 7 */                     str = "@NotNull method %s.%s must not return null";
                            break;
                        case 12:
                        default:
/* 4 */                     str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                    switch (i) {
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 15 */                    i2 = 2;
                            break;
                        case 12:
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
/* 74 */                    objArr[0] = "name";
                            break;
                        case 2:
/* 69 */                    objArr[0] = "modality";
                            break;
                        case 3:
/* 64 */                    objArr[0] = "kind";
                            break;
                        case 4:
/* 59 */                    objArr[0] = "supertypes";
                            break;
                        case 5:
/* 54 */                    objArr[0] = "source";
                            break;
                        case 6:
/* 49 */                    objArr[0] = "storageManager";
                            break;
                        case 7:
/* 44 */                    objArr[0] = "unsubstitutedMemberScope";
                            break;
                        case 8:
/* 39 */                    objArr[0] = "constructors";
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 34 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                            break;
                        case 12:
/* 31 */                    objArr[0] = "kotlinTypeRefiner";
                            break;
                        default:
/* 26 */                    objArr[0] = "containingDeclaration";
                            break;
                    }
                    switch (i) {
                        case 9:
/* 130 */                   objArr[1] = "getAnnotations";
                            break;
                        case 10:
/* 125 */                   objArr[1] = "getTypeConstructor";
                            break;
                        case 11:
/* 120 */                   objArr[1] = "getConstructors";
                            break;
                        case 12:
                        default:
/* 82 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                            break;
                        case 13:
/* 115 */                   objArr[1] = "getUnsubstitutedMemberScope";
                            break;
                        case 14:
/* 112 */                   objArr[1] = "getStaticScope";
                            break;
                        case 15:
/* 107 */                   objArr[1] = "getKind";
                            break;
                        case 16:
/* 102 */                   objArr[1] = "getModality";
                            break;
                        case 17:
/* 97 */                    objArr[1] = "getVisibility";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 92 */                    objArr[1] = "getDeclaredTypeParameters";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 87 */                    objArr[1] = "getSealedSubclasses";
                            break;
                    }
                    switch (i) {
                        case 7:
                        case 8:
/* 145 */                   objArr[2] = "initialize";
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                            break;
                        case 12:
/* 140 */                   objArr[2] = "getUnsubstitutedMemberScope";
                            break;
                        default:
/* 137 */                   objArr[2] = "<init>";
                            break;
                    }
/* 147 */           String str2 = String.format(str, objArr);
                    switch (i) {
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 165 */                   throw new IllegalStateException(str2);
                        case 12:
                        default:
/* 165 */                   throw new IllegalArgumentException(str2);
                    }
                }

                @Override
                public final Collection I000II() {
/* 1 */             Set set = this.I00li1OI;
/* 3 */             if (set != null) {
/* 5 */                 return set;
                    }
/* 8 */             I00oI0i(11);
/* 29 */            throw null;
                }

                @Override
                public final OoOIOoO1I I000OOo1O() {
/* 1 */             IOIi10o iOIi10o = this.I00l0I0l0lO1;
/* 3 */             if (iOIi10o != null) {
/* 5 */                 return iOIi10o;
                    }
/* 8 */             I00oI0i(10);
/* 29 */            throw null;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             return IiOiioI.I0000oI00;
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
/* 1 */             O1oIIloii0 o1oIIloii0 = this.I00io1l;
/* 3 */             if (o1oIIloii0 != null) {
/* 5 */                 return o1oIIloii0;
                    }
/* 8 */             I00oI0i(16);
/* 29 */            throw null;
                }

                @Override
                public final IOIOllO1oli I00II0oii1o() {
/* 1 */             IOIOllO1oli iOIOllO1oli = this.I00ioIO;
/* 3 */             if (iOIOllO1oli != null) {
/* 5 */                 return iOIOllO1oli;
                    }
/* 8 */             I00oI0i(15);
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
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             I00oI0i(18);
/* 29 */            throw null;
                }

                @Override
                public final O1iil1I01o I00li1OI(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 1 */             O1iil1I01o o1iil1I01o = this.I00l0OO0IO;
/* 3 */             if (o1iil1I01o != null) {
/* 5 */                 return o1iil1I01o;
                    }
/* 8 */             I00oI0i(13);
/* 49 */            throw null;
                }

                @Override
                public final IOIO10lo I00ll1() {
/* 1 */             return this.I00ll1;
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

                public final void I00oIiI10(O1iil1I01o o1iil1I01o, Set set, IOIO10lo iOIO10lo) {
/* 1 */             this.I00l0OO0IO = o1iil1I01o;
/* 3 */             this.I00li1OI = set;
/* 5 */             this.I00ll1 = iOIO10lo;
                }

                @Override
                public final I11IlOOO getAnnotations() {
/* 1 */             return i1i0olI.I00iiO;
                }

                public String toString() {
/* 15 */            return "class " + getName();
                }
            }
