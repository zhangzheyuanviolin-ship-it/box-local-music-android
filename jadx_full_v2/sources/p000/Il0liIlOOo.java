            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class Il0liIlOOo extends O1iio0 {
                public O1I00llOi I00000oOI;
                public O1I00llOi I0000Il00O;
                public O1I0II11i I0000O;
                public Il0liOool0 I0000oI00;

                /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I000O01llI0(int i) {
                    String str;
                    int i2;
/* 7 */             if (i != 3 && i != 7 && i != 9 && i != 12) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                                break;
                            default:
/* 18 */                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break;
                        }
                    } else {
/* 21 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 24 */            if (i != 3 && i != 7 && i != 9 && i != 12) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                                break;
                            default:
/* 35 */                        i2 = 3;
                                break;
                        }
                    } else {
/* 37 */                i2 = 2;
                    }
/* 38 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 4:
                        case 5:
                        case 8:
                        case 10:
/* 81 */                    objArr[0] = "name";
                            break;
                        case 2:
                        case 6:
/* 76 */                    objArr[0] = "location";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
/* 71 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                        case 11:
/* 68 */                    objArr[0] = "fromSupertypes";
                            break;
                        case 13:
/* 63 */                    objArr[0] = "kindFilter";
                            break;
                        case 14:
/* 58 */                    objArr[0] = "nameFilter";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 53 */                    objArr[0] = "p";
                            break;
                        default:
/* 48 */                    objArr[0] = "storageManager";
                            break;
                    }
/* 92 */            if (i == 3) {
/* 140 */               objArr[1] = "getContributedVariables";
                    } else if (i == 7) {
/* 137 */               objArr[1] = "getContributedFunctions";
                    } else if (i == 9) {
/* 134 */               objArr[1] = "getSupertypeScope";
                    } else if (i != 12) {
                        switch (i) {
                            case 15:
/* 126 */                       objArr[1] = "getContributedDescriptors";
                                break;
                            case 16:
/* 123 */                       objArr[1] = "computeAllDeclarations";
                                break;
                            case 17:
/* 118 */                       objArr[1] = "getFunctionNames";
                                break;
                            case PoseLandmark.RIGHT_PINKY:
/* 113 */                       objArr[1] = "getClassifierNames";
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 108 */                       objArr[1] = "getVariableNames";
                                break;
                            default:
/* 103 */                       objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                break;
                        }
                    } else {
/* 129 */               objArr[1] = "resolveFakeOverrides";
                    }
                    switch (i) {
                        case 1:
                        case 2:
/* 174 */                   objArr[2] = "getContributedVariables";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                            break;
                        case 4:
/* 171 */                   objArr[2] = "computeProperties";
                            break;
                        case 5:
                        case 6:
/* 166 */                   objArr[2] = "getContributedFunctions";
                            break;
                        case 8:
/* 163 */                   objArr[2] = "computeFunctions";
                            break;
                        case 10:
                        case 11:
/* 158 */                   objArr[2] = "resolveFakeOverrides";
                            break;
                        case 13:
                        case 14:
/* 155 */                   objArr[2] = "getContributedDescriptors";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 152 */                   objArr[2] = "printScopeStructure";
                            break;
                        default:
/* 147 */                   objArr[2] = "<init>";
                            break;
                    }
/* 176 */           String str2 = String.format(str, objArr);
/* 180 */           if (i != 3 && i != 7 && i != 9 && i != 12) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                                break;
                            default:
/* 202 */                       throw new IllegalArgumentException(str2);
                        }
                    }
/* 202 */           throw new IllegalStateException(str2);
                }

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             if (oI1Iio0ii1 != null) {
/* 9 */                 return (Collection) this.I00000oOI.invoke(oI1Iio0ii1);
                    }
/* 13 */            I000O01llI0(5);
/* 89 */            throw null;
                }

                @Override
                public final Set I00000oOI() {
/* 9 */             Set set = (Set) this.I0000oI00.I00l0I0l0lO1.invoke();
/* 11 */            if (set != null) {
/* 13 */                return set;
                    }
/* 16 */            I000O01llI0(17);
/* 29 */            throw null;
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 2 */             if (iiOOioIIO0 == null) {
/* 23 */                I000O01llI0(13);
/* 89 */                throw null;
                    }
/* 10 */            Collection collection = (Collection) this.I0000O.invoke();
/* 12 */            if (collection != null) {
/* 14 */                return collection;
                    }
/* 17 */            I000O01llI0(15);
/* 20 */            throw null;
                }

                @Override
                public final Set I0000O() {
/* 1 */             Set set = Collections.EMPTY_SET;
/* 3 */             if (set != null) {
/* 5 */                 return set;
                    }
/* 8 */             I000O01llI0(18);
/* 29 */            throw null;
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             if (oI1Iio0ii1 != null) {
/* 9 */                 return (Collection) this.I0000Il00O.invoke(oI1Iio0ii1);
                    }
/* 13 */            I000O01llI0(1);
/* 89 */            throw null;
                }

                @Override
                public final Set I000II() {
/* 9 */             Set set = (Set) this.I0000oI00.I00l0I0l0lO1.invoke();
/* 11 */            if (set != null) {
/* 13 */                return set;
                    }
/* 16 */            I000O01llI0(19);
/* 29 */            throw null;
                }

                public final O1iil1I01o I000OOo1O() {
/* 25 */            O1iil1I01o o1iil1I01oI00IoiI = ((O0iIl1) ((I01illiiIill) this.I0000oI00.I000OOo1O()).I0000oI00().iterator().next()).I00IoiI();
/* 29 */            if (o1iil1I01oI00IoiI != null) {
/* 31 */                return o1iil1I01oI00IoiI;
                    }
/* 34 */            I000O01llI0(9);
/* 113 */           throw null;
                }

                public final LinkedHashSet I000OiO(OI1Iio0ii1 oI1Iio0ii1, Collection collection) {
/* 1 */             if (collection == null) {
/* 33 */                I000O01llI0(11);
/* 89 */                throw null;
                    }
/* 5 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */             OIlIlOllioi oIlIlOllioi = OIlIlOllioi.I0000Il00O;
/* 10 */            Set set = Collections.EMPTY_SET;
/* 12 */            Il0liOool0 il0liOool0 = this.I0000oI00;
/* 17 */            IiOl10OlO0 iiOl10OlO0 = new IiOl10OlO0(1);
/* 20 */            iiOl10OlO0.I00000oOI = linkedHashSet;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            oIlIlOllioi.I000O01llI0(oI1Iio0ii1, collection, set, il0liOool0, iiOl10OlO0);
/* 30 */            return linkedHashSet;
                }
            }
