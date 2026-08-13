            package p000;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public class i011I10o1IlI {
                public static final i011I10o1IlI I00iiO;
                public static final i010OOl I00iio;
                public static final i010i1l I00ilI0I1;
                public static final i010liII I00ilO0;
                public static final i011I10o1IlI[] I00io1l;
                public final i011lil01 I00iOIl;
                public final int I00iiI;

                i011I10o1IlI EF0;

                i011I10o1IlI EF1;

                i011I10o1IlI EF2;

                static {
/* 9 */             i011I10o1IlI i011i10o1ili = new i011I10o1IlI("DOUBLE", 0, i011lil01.I00iio, 1);
/* 19 */            i011I10o1IlI i011i10o1ili2 = new i011I10o1IlI("FLOAT", 1, i011lil01.I00iiO, 5);
/* 24 */            i011lil01 i011lil01Var = i011lil01.I00iiI;
/* 29 */            i011I10o1IlI i011i10o1ili3 = new i011I10o1IlI("INT64", 2, i011lil01Var, 0);
/* 37 */            i011I10o1IlI i011i10o1ili4 = new i011I10o1IlI("UINT64", 3, i011lil01Var, 0);
/* 42 */            i011lil01 i011lil01Var2 = i011lil01.I00iOIl;
/* 47 */            i011I10o1IlI i011i10o1ili5 = new i011I10o1IlI("INT32", 4, i011lil01Var2, 0);
/* 54 */            i011I10o1IlI i011i10o1ili6 = new i011I10o1IlI("FIXED64", 5, i011lil01Var, 1);
/* 64 */            i011I10o1IlI i011i10o1ili7 = new i011I10o1IlI("FIXED32", 6, i011lil01Var2, 5);
/* 76 */            i011I10o1IlI i011i10o1ili8 = new i011I10o1IlI("BOOL", 7, i011lil01.I00ilI0I1, 0);
/* 79 */            I00iiO = i011i10o1ili8;
/* 91 */            i010OOl i010ool = new i010OOl("STRING", 8, i011lil01.I00ilO0, 2);
/* 94 */            I00iio = i010ool;
/* 98 */            i011lil01 i011lil01Var3 = i011lil01.I00l0I0l0lO1;
/* 106 */           i010i1l i010i1lVar = new i010i1l("GROUP", 9, i011lil01Var3, 3);
/* 109 */           I00ilI0I1 = i010i1lVar;
/* 124 */           i010liII i010liii = new i010liII("MESSAGE", 10, i011lil01Var3, 2);
/* 127 */           I00ilO0 = i010liii;
/* 270 */           I00io1l = new i011I10o1IlI[]{i011i10o1ili, i011i10o1ili2, i011i10o1ili3, i011i10o1ili4, i011i10o1ili5, i011i10o1ili6, i011i10o1ili7, i011i10o1ili8, i010ool, i010i1lVar, i010liii, new i0110IOi0("BYTES", 11, i011lil01.I00io1l, 2), new i011I10o1IlI("UINT32", 12, i011lil01Var2, 0), new i011I10o1IlI("ENUM", 13, i011lil01.I00ioIO, 0), new i011I10o1IlI("SFIXED32", 14, i011lil01Var2, 5), new i011I10o1IlI("SFIXED64", 15, i011lil01Var, 1), new i011I10o1IlI("SINT32", 16, i011lil01Var2, 0), new i011I10o1IlI("SINT64", 17, i011lil01Var, 0)};
                }

                public i011I10o1IlI(String str, int i, i011lil01 i011lil01Var, int i2) {
/* 4 */             this.I00iOIl = i011lil01Var;
/* 6 */             this.I00iiI = i2;
                }

                public static i011I10o1IlI valueOf(String str) {
/* 7 */             return (i011I10o1IlI) Enum.valueOf(i011I10o1IlI.class, str);
                }

                public static i011I10o1IlI[] values() {
/* 7 */             return (i011I10o1IlI[]) I00io1l.clone();
                }
            }
