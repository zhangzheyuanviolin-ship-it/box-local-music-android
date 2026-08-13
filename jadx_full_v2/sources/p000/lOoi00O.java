            package p000;
            
            public abstract class lOoi00O {
                public static void I00000oIO(int i) {
/* 2 */             Object[] objArr = new Object[3];
                    switch (i) {
                        case 1:
                        case 4:
/* 40 */                    objArr[0] = "b";
                            break;
                        case 2:
                        case 7:
/* 35 */                    objArr[0] = "typeCheckingProcedure";
                            break;
                        case 3:
                        default:
/* 10 */                    objArr[0] = "a";
                            break;
                        case 5:
                        case 10:
/* 30 */                    objArr[0] = "subtype";
                            break;
                        case 6:
                        case 11:
/* 25 */                    objArr[0] = "supertype";
                            break;
                        case 8:
/* 20 */                    objArr[0] = "type";
                            break;
                        case 9:
/* 15 */                    objArr[0] = "typeProjection";
                            break;
                    }
/* 45 */            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
                    switch (i) {
                        case 3:
                        case 4:
/* 73 */                    objArr[2] = "assertEqualTypeConstructors";
                            break;
                        case 5:
                        case 6:
                        case 7:
/* 68 */                    objArr[2] = "assertSubtype";
                            break;
                        case 8:
                        case 9:
/* 63 */                    objArr[2] = "capture";
                            break;
                        case 10:
                        case 11:
/* 58 */                    objArr[2] = "noCorrespondingSupertype";
                            break;
                        default:
/* 53 */                    objArr[2] = "assertEqualTypes";
                            break;
                    }
/* 86 */            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }
            }
