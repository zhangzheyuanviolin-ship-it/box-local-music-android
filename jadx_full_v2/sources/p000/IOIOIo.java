            package p000;
            
            public abstract class IOIOIo extends I00lll10 {
                public final Ii1Ool1 I00ilI0I1;
                public final OlI1o0ooI I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOIOIo(O1I0OloI o1I0OloI, Ii1Ool1 ii1Ool1, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 8 */             super(o1I0OloI, oI1Iio0ii1);
/* 2 */             if (o1I0OloI == null) {
/* 27 */                I00oI0i(0);
/* 483 */               throw null;
                    }
/* 4 */             if (ii1Ool1 == null) {
/* 22 */                I00oI0i(1);
/* 25 */                throw null;
                    }
/* 6 */             if (oI1Iio0ii1 == null) {
/* 17 */                I00oI0i(2);
/* 20 */                throw null;
                    }
/* 11 */            this.I00ilI0I1 = ii1Ool1;
/* 13 */            this.I00ilO0 = olI1o0ooI;
                }

                public static void I00oI0i(int i) {
/* 10 */            String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 21 */            Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
/* 27 */            if (i == 1) {
/* 57 */                objArr[0] = "containingDeclaration";
                    } else if (i == 2) {
/* 52 */                objArr[0] = "name";
                    } else if (i == 3) {
/* 47 */                objArr[0] = "source";
                    } else if (i == 4 || i == 5) {
/* 42 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    } else {
/* 39 */                objArr[0] = "storageManager";
                    }
/* 59 */            if (i == 4) {
/* 73 */                objArr[1] = "getContainingDeclaration";
                    } else if (i != 5) {
/* 63 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    } else {
/* 68 */                objArr[1] = "getSource";
                    }
/* 75 */            if (i != 4 && i != 5) {
/* 81 */                objArr[2] = "<init>";
                    }
/* 83 */            String str2 = String.format(str, objArr);
/* 87 */            if (i != 4 && i != 5) {
/* 186 */               throw new IllegalArgumentException(str2);
                    }
/* 186 */           throw new IllegalStateException(str2);
                }

                @Override
                public final Ii1Ool1 I000lI() {
/* 1 */             Ii1Ool1 ii1Ool1 = this.I00ilI0I1;
/* 3 */             if (ii1Ool1 != null) {
/* 5 */                 return ii1Ool1;
                    }
/* 7 */             I00oI0i(4);
/* 29 */            throw null;
                }

                @Override
                public final OlI1o0ooI I0010I0i() {
/* 1 */             OlI1o0ooI olI1o0ooI = this.I00ilO0;
/* 3 */             if (olI1o0ooI != null) {
/* 5 */                 return olI1o0ooI;
                    }
/* 7 */             I00oI0i(5);
/* 29 */            throw null;
                }

                @Override
                public boolean I001IIilI0O() {
/* 1 */             return false;
                }
            }
