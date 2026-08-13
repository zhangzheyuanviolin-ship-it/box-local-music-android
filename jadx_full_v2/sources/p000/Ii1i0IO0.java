            package p000;
            
/* 27 */    public abstract class Ii1i0IO0 extends Ii1Ooli implements Ii1i01oO10 {
                public final Ii1Ool1 I00iiO;
                public final OlI1o0ooI I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1i0IO0(Ii1Ool1 ii1Ool1, I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 10 */            super(i11IlOOO, oI1Iio0ii1);
/* 2 */             if (ii1Ool1 == null) {
/* 34 */                I00l0I0l0lO1(0);
/* 483 */               throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 29 */                I00l0I0l0lO1(1);
/* 32 */                throw null;
                    }
/* 6 */             if (oI1Iio0ii1 == null) {
/* 24 */                I00l0I0l0lO1(2);
/* 27 */                throw null;
                    }
/* 8 */             if (olI1o0ooI == null) {
/* 19 */                I00l0I0l0lO1(3);
/* 22 */                throw null;
                    }
/* 13 */            this.I00iiO = ii1Ool1;
/* 15 */            this.I00iio = olI1o0ooI;
                }

                public static void I00l0I0l0lO1(int i) {
/* 13 */            String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 25 */            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
                    switch (i) {
                        case 1:
/* 53 */                    objArr[0] = "annotations";
                            break;
                        case 2:
/* 48 */                    objArr[0] = "name";
                            break;
                        case 3:
/* 43 */                    objArr[0] = "source";
                            break;
                        case 4:
                        case 5:
                        case 6:
/* 38 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                            break;
                        default:
/* 35 */                    objArr[0] = "containingDeclaration";
                            break;
                    }
/* 56 */            if (i == 4) {
/* 77 */                objArr[1] = "getOriginal";
                    } else if (i == 5) {
/* 72 */                objArr[1] = "getContainingDeclaration";
                    } else if (i != 6) {
/* 62 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                    } else {
/* 67 */                objArr[1] = "getSource";
                    }
/* 79 */            if (i != 4 && i != 5 && i != 6) {
/* 87 */                objArr[2] = "<init>";
                    }
/* 89 */            String str2 = String.format(str, objArr);
/* 93 */            if (i != 4 && i != 5 && i != 6) {
/* 110 */               throw new IllegalArgumentException(str2);
                    }
/* 110 */           throw new IllegalStateException(str2);
                }

                public Ii1Ool1 I000lI() {
/* 1 */             Ii1Ool1 ii1Ool1 = this.I00iiO;
/* 3 */             if (ii1Ool1 != null) {
/* 5 */                 return ii1Ool1;
                    }
/* 7 */             I00l0I0l0lO1(5);
/* 29 */            throw null;
                }

                @Override
                public OlI1o0ooI I0010I0i() {
/* 1 */             OlI1o0ooI olI1o0ooI = this.I00iio;
/* 3 */             if (olI1o0ooI != null) {
/* 5 */                 return olI1o0ooI;
                    }
/* 7 */             I00l0I0l0lO1(6);
/* 29 */            throw null;
                }

                @Override
/* 28 */        public Ii1i01oO10 I010i10l() {
/* 29 */            return this;
                }
            }
