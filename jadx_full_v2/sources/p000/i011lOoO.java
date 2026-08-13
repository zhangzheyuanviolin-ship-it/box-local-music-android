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
            public class i011lOoO {
                public static final i010i11 I00iiO;
                public static final i010io0i0IOO I00iio;
                public static final i010loi00 I00ilI0I1;
                public static final i011lOoO[] I00ilO0;
                public final i011o0I1Io I00iOIl;
                public final int I00iiI;

                i011lOoO EF0;

                i011lOoO EF1;

                i011lOoO EF2;

                static {
/* 9 */             i011lOoO i011looo = new i011lOoO("DOUBLE", 0, i011o0I1Io.I00iio, 1);
/* 19 */            i011lOoO i011looo2 = new i011lOoO("FLOAT", 1, i011o0I1Io.I00iiO, 5);
/* 24 */            i011o0I1Io i011o0i1io = i011o0I1Io.I00iiI;
/* 29 */            i011lOoO i011looo3 = new i011lOoO("INT64", 2, i011o0i1io, 0);
/* 37 */            i011lOoO i011looo4 = new i011lOoO("UINT64", 3, i011o0i1io, 0);
/* 42 */            i011o0I1Io i011o0i1io2 = i011o0I1Io.I00iOIl;
/* 47 */            i011lOoO i011looo5 = new i011lOoO("INT32", 4, i011o0i1io2, 0);
/* 54 */            i011lOoO i011looo6 = new i011lOoO("FIXED64", 5, i011o0i1io, 1);
/* 64 */            i011lOoO i011looo7 = new i011lOoO("FIXED32", 6, i011o0i1io2, 5);
/* 76 */            i011lOoO i011looo8 = new i011lOoO("BOOL", 7, i011o0I1Io.I00ilI0I1, 0);
/* 89 */            i010i11 i010i11Var = new i010i11("STRING", 8, i011o0I1Io.I00ilO0, 2);
/* 92 */            I00iiO = i010i11Var;
/* 96 */            i011o0I1Io i011o0i1io3 = i011o0I1Io.I00l0I0l0lO1;
/* 104 */           i010io0i0IOO i010io0i0ioo = new i010io0i0IOO("GROUP", 9, i011o0i1io3, 3);
/* 107 */           I00iio = i010io0i0ioo;
/* 122 */           i010loi00 i010loi00Var = new i010loi00("MESSAGE", 10, i011o0i1io3, 2);
/* 125 */           I00ilI0I1 = i010loi00Var;
/* 268 */           I00ilO0 = new i011lOoO[]{i011looo, i011looo2, i011looo3, i011looo4, i011looo5, i011looo6, i011looo7, i011looo8, i010i11Var, i010io0i0ioo, i010loi00Var, new i01111l0li("BYTES", 11, i011o0I1Io.I00io1l, 2), new i011lOoO("UINT32", 12, i011o0i1io2, 0), new i011lOoO("ENUM", 13, i011o0I1Io.I00ioIO, 0), new i011lOoO("SFIXED32", 14, i011o0i1io2, 5), new i011lOoO("SFIXED64", 15, i011o0i1io, 1), new i011lOoO("SINT32", 16, i011o0i1io2, 0), new i011lOoO("SINT64", 17, i011o0i1io, 0)};
                }

                public i011lOoO(String str, int i, i011o0I1Io i011o0i1io, int i2) {
/* 4 */             this.I00iOIl = i011o0i1io;
/* 6 */             this.I00iiI = i2;
                }

                public static i011lOoO valueOf(String str) {
/* 7 */             return (i011lOoO) Enum.valueOf(i011lOoO.class, str);
                }

                public static i011lOoO[] values() {
/* 7 */             return (i011lOoO[]) I00ilO0.clone();
                }
            }
