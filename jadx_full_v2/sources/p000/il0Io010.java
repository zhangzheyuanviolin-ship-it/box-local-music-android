            package p000;
            
            public abstract class il0Io010 {
                public static String I00000oIO(int i) {
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 43 */                    return "float";
                        case 1:
/* 40 */                    return "int";
                        case 2:
                        case 7:
/* 37 */                    return "byte";
                        case 3:
/* 34 */                    return "long";
                        case 4:
/* 31 */                    return "string";
                        case 5:
/* 28 */                    return "bool";
                        case 6:
/* 25 */                    return "short";
                        default:
/* 20 */                    I000II.I000iOII(IlIi0I0.I000lI("DataType error: DataType ", IIl001iO0Io.I001lloI(i), " is not supported yet"));
/* 23 */                    return null;
                    }
                }
            }
