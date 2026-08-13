            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.Collection;
            import java.util.LinkedHashSet;
            
            public abstract class il10lII0iIi {
                public static void I00000oIO(int i) {
/* 8 */             String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
/* 16 */            Object[] objArr = new Object[i != 18 ? 3 : 2];
                    switch (i) {
                        case 1:
                        case 7:
                        case 13:
/* 59 */                    objArr[0] = "membersFromSupertypes";
                            break;
                        case 2:
                        case 8:
                        case 14:
/* 54 */                    objArr[0] = "membersFromCurrent";
                            break;
                        case 3:
                        case 9:
                        case 15:
/* 49 */                    objArr[0] = "classDescriptor";
                            break;
                        case 4:
                        case 10:
                        case 16:
/* 44 */                    objArr[0] = "errorReporter";
                            break;
                        case 5:
                        case 11:
                        case 17:
/* 39 */                    objArr[0] = "overridingUtil";
                            break;
                        case 6:
                        case 12:
                        case PoseLandmark.LEFT_INDEX:
                        default:
/* 26 */                    objArr[0] = "name";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 34 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 31 */                    objArr[0] = "annotationClass";
                            break;
                    }
/* 64 */            if (i != 18) {
/* 66 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                    } else {
/* 69 */                objArr[1] = "resolveOverrides";
                    }
                    switch (i) {
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 89 */                    objArr[2] = "resolveOverridesForStaticMembers";
                            break;
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
/* 84 */                    objArr[2] = "resolveOverrides";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
                            break;
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
/* 81 */                    objArr[2] = "getAnnotationParameterByName";
                            break;
                        default:
/* 76 */                    objArr[2] = "resolveOverridesForNonStaticMembers";
                            break;
                    }
/* 91 */            String str2 = String.format(str, objArr);
/* 95 */            if (i == 18) {
/* 108 */               throw new IllegalStateException(str2);
                    }
                }

                public static Ooo00oi0O I00000oOI(OI1Iio0ii1 oI1Iio0ii1, OI000ilOol oI000ilOol) {
/* 2 */             if (oI1Iio0ii1 == null) {
/* 68 */                I00000oIO(19);
/* 89 */                throw null;
                    }
/* 4 */             if (oI000ilOol == null) {
/* 62 */                I00000oIO(20);
/* 65 */                throw null;
                    }
/* 6 */             Collection collectionI000II = oI000ilOol.I000II();
/* 15 */            if (collectionI000II.size() != 1) {
/* 1 */                 return null;
                    }
/* 40 */            for (Ooo00oi0O ooo00oi0O : ((IOIO10lo) collectionI000II.iterator().next()).I00Iooi00oi()) {
/* 56 */                if (ooo00oi0O.getName().equals(oI1Iio0ii1)) {
/* 58 */                    return ooo00oi0O;
                        }
                    }
/* 1 */             return null;
                }

                public static LinkedHashSet I0000Il00O(OI1Iio0ii1 oI1Iio0ii1, Collection collection, Collection collection2, OI000ilOol oI000ilOol, Il0oiOlO1ooI il0oiOlO1ooI, OIlIlOllioi oIlIlOllioi, boolean z) {
/* 2 */             if (collection == null) {
/* 51 */                I00000oIO(13);
/* 429 */               throw null;
                    }
/* 4 */             if (oI000ilOol == null) {
/* 45 */                I00000oIO(15);
/* 48 */                throw null;
                    }
/* 6 */             if (oIlIlOllioi == null) {
/* 39 */                I00000oIO(17);
/* 42 */                throw null;
                    }
/* 10 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 21 */            IiOiIIOlI iiOiIIOlI = new IiOiIIOlI();
/* 24 */            iiOiIIOlI.I00000oIO = il0oiOlO1ooI;
/* 26 */            iiOiIIOlI.I00000oOI = linkedHashSet;
/* 28 */            iiOiIIOlI.I0000Il00O = z;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            oIlIlOllioi.I000O01llI0(oI1Iio0ii1, collection, collection2, oI000ilOol, iiOiIIOlI);
/* 36 */            return linkedHashSet;
                }

                public static LinkedHashSet I0000O(OI1Iio0ii1 oI1Iio0ii1, AbstractCollection abstractCollection, Collection collection, OI000ilOol oI000ilOol, Il0oiOlO1ooI il0oiOlO1ooI, OIlIlOllioi oIlIlOllioi) {
/* 2 */             if (oI000ilOol == null) {
/* 24 */                I00000oIO(3);
/* 1294 */              throw null;
                    }
/* 4 */             if (oIlIlOllioi != null) {
/* 13 */                return I0000Il00O(oI1Iio0ii1, abstractCollection, collection, oI000ilOol, il0oiOlO1ooI, oIlIlOllioi, false);
                    }
/* 19 */            I00000oIO(5);
/* 22 */            throw null;
                }

                public static LinkedHashSet I0000oI00(OI1Iio0ii1 oI1Iio0ii1, Collection collection, AbstractCollection abstractCollection, OI000ilOol oI000ilOol, OIlIlOllioi oIlIlOllioi) {
/* 1 */             iolOOiI iolooii = iolOOiI.I00ilO0;
/* 4 */             if (collection == null) {
/* 34 */                I00000oIO(7);
/* 966 */               throw null;
                    }
/* 6 */             if (oI000ilOol == null) {
/* 29 */                I00000oIO(9);
/* 32 */                throw null;
                    }
/* 8 */             if (oIlIlOllioi != null) {
/* 16 */                return I0000Il00O(oI1Iio0ii1, collection, abstractCollection, oI000ilOol, iolooii, oIlIlOllioi, true);
                    }
/* 23 */            I00000oIO(11);
/* 26 */            throw null;
                }
            }
