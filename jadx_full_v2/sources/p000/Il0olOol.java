            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Il0olOol {
                public static final Il0olOol I00iiI;
                public static final Il0olOol I00iiO;
                public static final Il0olOol I00iio;
                public static final Il0olOol I00ilI0I1;
                public static final Il0olOol I00ilO0;
                public static final Il0olOol[] I00io1l;
                public final String I00iOIl;

                static {
/* 8 */             Il0olOol il0olOol = new Il0olOol("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
/* 11 */            I00iiI = il0olOol;
/* 20 */            Il0olOol il0olOol2 = new Il0olOol("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
/* 23 */            I00iiO = il0olOol2;
/* 32 */            Il0olOol il0olOol3 = new Il0olOol("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
/* 42 */            Il0olOol il0olOol4 = new Il0olOol("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
/* 45 */            I00iio = il0olOol4;
/* 54 */            Il0olOol il0olOol5 = new Il0olOol("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
/* 64 */            Il0olOol il0olOol6 = new Il0olOol("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
/* 74 */            Il0olOol il0olOol7 = new Il0olOol("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
/* 77 */            I00ilI0I1 = il0olOol7;
/* 86 */            Il0olOol il0olOol8 = new Il0olOol("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
/* 97 */            Il0olOol il0olOol9 = new Il0olOol("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
/* 100 */           I00ilO0 = il0olOol9;
/* 113 */           Il0olOol[] il0olOolArr = {il0olOol, il0olOol2, il0olOol3, il0olOol4, il0olOol5, il0olOol6, il0olOol7, il0olOol8, il0olOol9, new Il0olOol("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s")};
/* 117 */           I00io1l = il0olOolArr;
/* 119 */           ilIII1o11.I00000oIO(il0olOolArr);
                }

                public Il0olOol(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static Il0olOol valueOf(String str) {
/* 7 */             return (Il0olOol) Enum.valueOf(Il0olOol.class, str);
                }

                public static Il0olOol[] values() {
/* 7 */             return (Il0olOol[]) I00io1l.clone();
                }
            }
