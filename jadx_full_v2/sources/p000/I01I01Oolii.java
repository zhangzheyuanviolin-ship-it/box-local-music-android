            package p000;
            
            public abstract class I01I01Oolii extends I01l00l {
                public static void I00l0I0l0lO1(int i) {
/* 2 */             Object[] objArr = new Object[3];
                    switch (i) {
                        case 1:
/* 40 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 2:
/* 35 */                    objArr[0] = "annotations";
                            break;
                        case 3:
/* 30 */                    objArr[0] = "name";
                            break;
                        case 4:
/* 25 */                    objArr[0] = "variance";
                            break;
                        case 5:
/* 20 */                    objArr[0] = "source";
                            break;
                        case 6:
/* 15 */                    objArr[0] = "supertypeLoopChecker";
                            break;
                        default:
/* 10 */                    objArr[0] = "storageManager";
                            break;
                    }
/* 45 */            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
/* 50 */            objArr[2] = "<init>";
/* 63 */            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                @Override
                public final String toString() {
/* 3 */             String str = "";
/* 7 */             String str2 = this.I00ilO0 ? "reified " : "";
/* 17 */            if (I000l1() != Ooo0Ioii0o0.I00iiO) {
/* 37 */                str = I000l1() + " ";
                    }
/* 56 */            return str2 + str + getName();
                }
            }
