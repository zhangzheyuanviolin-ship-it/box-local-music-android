            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public final class I01io11il extends I01illiiIill {
                public final O1oO0lOoI1 I00iiO;
                public final I01l00l I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I01io11il(I01l00l i01l00l, O1I0OloI o1I0OloI) {
/* 7 */             super(o1I0OloI);
/* 1 */             O1oO0lOoI1 o1oO0lOoI1 = O1oO0lOoI1.I00io1l;
/* 3 */             if (o1I0OloI == null) {
/* 14 */                I000OiO(0);
/* 89 */                throw null;
                    }
/* 5 */             this.I00iio = i01l00l;
/* 10 */            this.I00iiO = o1oO0lOoI1;
                }

                public static void I000OiO(int i) {
/* 23 */            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 40 */            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 8:
/* 68 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                            break;
                        case 6:
/* 65 */                    objArr[0] = "type";
                            break;
                        case 7:
/* 60 */                    objArr[0] = "supertypes";
                            break;
                        case 9:
/* 55 */                    objArr[0] = "classifier";
                            break;
                        default:
/* 50 */                    objArr[0] = "storageManager";
                            break;
                    }
/* 72 */            if (i == 1) {
/* 112 */               objArr[1] = "computeSupertypes";
                    } else if (i == 2) {
/* 107 */               objArr[1] = "getParameters";
                    } else if (i == 3) {
/* 102 */               objArr[1] = "getDeclarationDescriptor";
                    } else if (i == 4) {
/* 97 */                objArr[1] = "getBuiltIns";
                    } else if (i == 5) {
/* 92 */                objArr[1] = "getSupertypeLoopChecker";
                    } else if (i != 8) {
/* 84 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    } else {
/* 87 */                objArr[1] = "processSupertypesWithoutCycles";
                    }
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 8:
                            break;
                        case 6:
/* 132 */                   objArr[2] = "reportSupertypeLoopError";
                            break;
                        case 7:
/* 127 */                   objArr[2] = "processSupertypesWithoutCycles";
                            break;
                        case 9:
/* 124 */                   objArr[2] = "isSameClassifier";
                            break;
                        default:
/* 119 */                   objArr[2] = "<init>";
                            break;
                    }
/* 134 */           String str2 = String.format(str, objArr);
/* 138 */           if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
/* 161 */               throw new IllegalArgumentException(str2);
                    }
/* 161 */           throw new IllegalStateException(str2);
                }

                @Override
                public final Collection I00000oIO() {
/* 3 */             List listI010ioo = this.I00iio.I010ioo();
/* 7 */             if (listI010ioo != null) {
/* 9 */                 return listI010ioo;
                    }
/* 11 */            I000OiO(1);
/* 29 */            throw null;
                }

                @Override
                public final O0iIl1 I00000oOI() {
/* 6 */             return Il0ooiloI.I00000oOI(Il0ooO1IO.I00io1l, new String[0]);
                }

                @Override
                public final O1oO0lOoI1 I0000Il00O() {
/* 1 */             O1oO0lOoI1 o1oO0lOoI1 = this.I00iiO;
/* 3 */             if (o1oO0lOoI1 != null) {
/* 5 */                 return o1oO0lOoI1;
                    }
/* 7 */             I000OiO(5);
/* 29 */            throw null;
                }

                @Override
                public final O0i1lI0o1io I0000O() {
/* 3 */             O0i1lI0o1io o0i1lI0o1ioI0000oI00 = IiOiOOIo.I0000oI00(this.I00iio);
/* 7 */             if (o0i1lI0o1ioI0000oI00 != null) {
/* 9 */                 return o0i1lI0o1ioI0000oI00;
                    }
/* 11 */            I000OiO(4);
/* 29 */            throw null;
                }

                @Override
                public final List I000II() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 7 */             I000OiO(2);
/* 29 */            throw null;
                }

                @Override
                public final boolean I000O01llI0(IOIiO1lIl0l iOIiO1lIl0l) {
/* 3 */             if (!(iOIiO1lIl0l instanceof OoOOiO)) {
/* 21 */                return false;
                    }
                    return O1oO0lOoI1.I00iiO.I00000oOI(this.I00iio, (OoOOiO) iOIiO1lIl0l, true, I00ilI0I1.I00iio);
                }

                @Override
                public final List I000OOo1O(List list) {
/* 3 */             List listI010iIIOlo = this.I00iio.I010iIIOlo(list);
/* 7 */             if (listI010iIIOlo != null) {
/* 9 */                 return listI010iIIOlo;
                    }
/* 12 */            I000OiO(8);
/* 49 */            throw null;
                }

                @Override
                public final IOIiO1lIl0l I00100o1O0lo() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final boolean I0010I0i() {
/* 1 */             return true;
                }

                public final String toString() {
/* 7 */             return this.I00iio.getName().I00iOIl;
                }
            }
