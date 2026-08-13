            package p000;

            import java.io.PrintStream;
            
            public abstract class Oi01Io {
                public static final int I00000oIO;
                public static final int I00000oOI;

                static {
                    int i;
/* 7 */             String[] strArr = {"System.out", "stdout", "sysout"};
/* 13 */            String property = System.getProperty("slf4j.internal.report.stream");
/* 17 */            int i2 = 2;
/* 20 */            if (property == null || property.isEmpty()) {
/* 45 */                i = 1;
                    } else {
/* 30 */                for (int i3 = 0; i3 < 3; i3++) {
/* 38 */                    if (strArr[i3].equalsIgnoreCase(property)) {
/* 40 */                        i = 2;
                                break;
                            }
                        }
/* 45 */                i = 1;
                    }
/* 46 */            I00000oIO = i;
/* 50 */            String property2 = System.getProperty("slf4j.internal.verbosity");
/* 54 */            if (property2 != null && !property2.isEmpty()) {
/* 69 */                if (property2.equalsIgnoreCase("DEBUG")) {
/* 71 */                    i2 = 1;
                        } else if (property2.equalsIgnoreCase("ERROR")) {
/* 81 */                    i2 = 4;
                        } else if (property2.equalsIgnoreCase("WARN")) {
/* 91 */                    i2 = 3;
                        }
                    }
/* 92 */            I00000oOI = i2;
                }

                public static final void I00000oIO(String str) {
/* 11 */            I0000Il00O().println("SLF4J(E): ".concat(str));
                }

                public static final void I00000oOI(String str, Throwable th) {
/* 11 */            I0000Il00O().println("SLF4J(E): ".concat(str));
/* 20 */            I0000Il00O().println("SLF4J(E): Reported exception:");
/* 27 */            th.printStackTrace(I0000Il00O());
                }

                public static PrintStream I0000Il00O() {
                    return IIlIOloOOO.I001lIiIIo1O(I00000oIO) != 1 ? System.err : System.out;
                }

                public static final void I0000O(String str) {
/* 12 */            if (IIlIOloOOO.I001lIiIIo1O(3) >= IIlIOloOOO.I001lIiIIo1O(I00000oOI)) {
/* 32 */                I0000Il00O().println("SLF4J(W): " + str);
                    }
                }
            }
