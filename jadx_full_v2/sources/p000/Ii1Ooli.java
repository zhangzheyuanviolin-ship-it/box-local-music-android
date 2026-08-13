            package p000;
            
/* 27 */    public abstract class Ii1Ooli extends I01O1lIi implements Ii1Ool1 {
                public final OI1Iio0ii1 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1Ooli(I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1) {
/* 6 */             super(i11IlOOO);
/* 2 */             if (i11IlOOO == null) {
/* 18 */                I00l0I0l0lO1(0);
/* 89 */                throw null;
                    }
/* 4 */             if (oI1Iio0ii1 == null) {
/* 13 */                I00l0I0l0lO1(1);
/* 16 */                throw null;
                    }
/* 9 */             this.I00iiI = oI1Iio0ii1;
                }

                public static void I00l0I0l0lO1(int i) {
/* 16 */            String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 29 */            Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
                    switch (i) {
                        case 1:
/* 52 */                    objArr[0] = "name";
                            break;
                        case 2:
                        case 3:
                        case 5:
                        case 6:
/* 47 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                            break;
                        case 4:
/* 44 */                    objArr[0] = "descriptor";
                            break;
                        default:
/* 39 */                    objArr[0] = "annotations";
                            break;
                    }
/* 57 */            if (i == 2) {
/* 78 */                objArr[1] = "getName";
                    } else if (i == 3) {
/* 73 */                objArr[1] = "getOriginal";
                    } else if (i == 5 || i == 6) {
/* 68 */                objArr[1] = "toString";
                    } else {
/* 65 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                    }
/* 80 */            if (i != 2 && i != 3) {
/* 85 */                if (i == 4) {
/* 96 */                    objArr[2] = "toString";
                        } else if (i != 5 && i != 6) {
/* 93 */                    objArr[2] = "<init>";
                        }
                    }
/* 98 */            String str2 = String.format(str, objArr);
/* 102 */           if (i != 2 && i != 3 && i != 5 && i != 6) {
/* 121 */               throw new IllegalArgumentException(str2);
                    }
/* 121 */           throw new IllegalStateException(str2);
                }

                public static String I010OIo1l(Ii1Ool1 ii1Ool1) {
                    try {
/* 52 */                return IiOOllOI0io.I0000oI00.I001IIilI0O(ii1Ool1) + "[" + ii1Ool1.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(ii1Ool1)) + "]";
                    } catch (Throwable unused) {
/* 82 */                return ii1Ool1.getClass().getSimpleName() + " " + ii1Ool1.getName();
                    }
                }

                @Override
                public final OI1Iio0ii1 getName() {
/* 1 */             OI1Iio0ii1 oI1Iio0ii1 = this.I00iiI;
/* 3 */             if (oI1Iio0ii1 != null) {
/* 5 */                 return oI1Iio0ii1;
                    }
/* 7 */             I00l0I0l0lO1(2);
/* 29 */            throw null;
                }

                public String toString() {
/* 1 */             return I010OIo1l(this);
                }

/* 28 */        public Ii1Ool1 I010i10l() {
/* 29 */            return this;
                }
            }
