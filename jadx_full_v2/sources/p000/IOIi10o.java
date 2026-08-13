            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public final class IOIi10o extends I00o0iI0io1 {
                public final OI000ilOol I00iiO;
                public final List I00iio;
                public final Collection I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOIi10o(OI000ilOol oI000ilOol, List list, Collection collection, O1I0OloI o1I0OloI) {
/* 8 */             super(o1I0OloI);
/* 2 */             if (list == null) {
/* 42 */                I000OiO(1);
/* 483 */               throw null;
                    }
/* 4 */             if (collection == null) {
/* 37 */                I000OiO(2);
/* 40 */                throw null;
                    }
/* 6 */             if (o1I0OloI == null) {
/* 32 */                I000OiO(3);
/* 35 */                throw null;
                    }
/* 11 */            this.I00iiO = oI000ilOol;
/* 22 */            this.I00iio = Collections.unmodifiableList(new ArrayList(list));
/* 28 */            this.I00ilI0I1 = Collections.unmodifiableCollection(collection);
                }

                public static void I000OiO(int i) {
/* 16 */            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 30 */            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
                    switch (i) {
                        case 1:
/* 58 */                    objArr[0] = "parameters";
                            break;
                        case 2:
/* 53 */                    objArr[0] = "supertypes";
                            break;
                        case 3:
/* 48 */                    objArr[0] = "storageManager";
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
/* 43 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                            break;
                        default:
/* 40 */                    objArr[0] = "classDescriptor";
                            break;
                    }
/* 61 */            if (i == 4) {
/* 89 */                objArr[1] = "getParameters";
                    } else if (i == 5) {
/* 84 */                objArr[1] = "getDeclarationDescriptor";
                    } else if (i == 6) {
/* 79 */                objArr[1] = "computeSupertypes";
                    } else if (i != 7) {
/* 69 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                    } else {
/* 74 */                objArr[1] = "getSupertypeLoopChecker";
                    }
/* 91 */            if (i != 4 && i != 5 && i != 6 && i != 7) {
/* 101 */               objArr[2] = "<init>";
                    }
/* 103 */           String str2 = String.format(str, objArr);
/* 107 */           if (i != 4 && i != 5 && i != 6 && i != 7) {
/* 126 */               throw new IllegalArgumentException(str2);
                    }
/* 126 */           throw new IllegalStateException(str2);
                }

                @Override
                public final Collection I00000oIO() {
/* 1 */             Collection collection = this.I00ilI0I1;
/* 3 */             if (collection != null) {
/* 5 */                 return collection;
                    }
/* 7 */             I000OiO(6);
/* 29 */            throw null;
                }

                @Override
                public final O1oO0lOoI1 I0000Il00O() {
/* 1 */             return O1oO0lOoI1.I00io1l;
                }

                @Override
                public final List I000II() {
/* 1 */             List list = this.I00iio;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 7 */             I000OiO(4);
/* 29 */            throw null;
                }

                @Override
                public final OI000ilOol I00100o1O0lo() {
/* 1 */             OI000ilOol oI000ilOol = this.I00iiO;
/* 3 */             if (oI000ilOol != null) {
/* 5 */                 return oI000ilOol;
                    }
/* 7 */             I000OiO(5);
/* 29 */            throw null;
                }

                @Override
                public final boolean I0010I0i() {
/* 1 */             return true;
                }

                public final String toString() {
/* 7 */             return IiOiIO0i1Oil.I0001Ioi1lo(this.I00iiO).I00000oIO;
                }
            }
