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
            public class i011io1o0i {
                public static final i011io1o0i I00iiO;
                public static final i011io1o0i I00iio;
                public static final i010iiiIi I00ilI0I1;
                public static final i010lloOIOi I00ilO0;
                public static final i011io1o0i I00io1l;
                public static final i011io1o0i[] I00ioIO;
                public final i011loO I00iOIl;
                public final int I00iiI;

                i011io1o0i EF0;

                i011io1o0i EF1;

                i011io1o0i EF2;

                static {
/* 9 */             i011io1o0i i011io1o0iVar = new i011io1o0i("DOUBLE", 0, i011loO.DOUBLE, 1);
/* 19 */            i011io1o0i i011io1o0iVar2 = new i011io1o0i("FLOAT", 1, i011loO.FLOAT, 5);
/* 24 */            i011loO i011loo = i011loO.LONG;
/* 29 */            i011io1o0i i011io1o0iVar3 = new i011io1o0i("INT64", 2, i011loo, 0);
/* 37 */            i011io1o0i i011io1o0iVar4 = new i011io1o0i("UINT64", 3, i011loo, 0);
/* 42 */            i011loO i011loo2 = i011loO.INT;
/* 47 */            i011io1o0i i011io1o0iVar5 = new i011io1o0i("INT32", 4, i011loo2, 0);
/* 50 */            I00iiO = i011io1o0iVar5;
/* 56 */            i011io1o0i i011io1o0iVar6 = new i011io1o0i("FIXED64", 5, i011loo, 1);
/* 66 */            i011io1o0i i011io1o0iVar7 = new i011io1o0i("FIXED32", 6, i011loo2, 5);
/* 78 */            i011io1o0i i011io1o0iVar8 = new i011io1o0i("BOOL", 7, i011loO.BOOLEAN, 0);
/* 81 */            I00iio = i011io1o0iVar8;
/* 93 */            i010Olo0O i010olo0o = new i010Olo0O("STRING", 8, i011loO.STRING, 2);
/* 98 */            i011loO i011loo3 = i011loO.MESSAGE;
/* 106 */           i010iiiIi i010iiiii = new i010iiiIi("GROUP", 9, i011loo3, 3);
/* 109 */           I00ilI0I1 = i010iiiii;
/* 124 */           i010lloOIOi i010llooioi = new i010lloOIOi("MESSAGE", 10, i011loo3, 2);
/* 127 */           I00ilO0 = i010llooioi;
/* 141 */           i011110io1i i011110io1iVar = new i011110io1i("BYTES", 11, i011loO.BYTE_STRING, 2);
/* 153 */           i011io1o0i i011io1o0iVar9 = new i011io1o0i("UINT32", 12, i011loo2, 0);
/* 170 */           i011io1o0i i011io1o0iVar10 = new i011io1o0i("ENUM", 13, i011loO.ENUM, 0);
/* 173 */           I00io1l = i011io1o0iVar10;
/* 272 */           I00ioIO = new i011io1o0i[]{i011io1o0iVar, i011io1o0iVar2, i011io1o0iVar3, i011io1o0iVar4, i011io1o0iVar5, i011io1o0iVar6, i011io1o0iVar7, i011io1o0iVar8, i010olo0o, i010iiiii, i010llooioi, i011110io1iVar, i011io1o0iVar9, i011io1o0iVar10, new i011io1o0i("SFIXED32", 14, i011loo2, 5), new i011io1o0i("SFIXED64", 15, i011loo, 1), new i011io1o0i("SINT32", 16, i011loo2, 0), new i011io1o0i("SINT64", 17, i011loo, 0)};
                }

                public i011io1o0i(String str, int i, i011loO i011loo, int i2) {
/* 4 */             this.I00iOIl = i011loo;
/* 6 */             this.I00iiI = i2;
                }

                public static i011io1o0i valueOf(String str) {
/* 7 */             return (i011io1o0i) Enum.valueOf(i011io1o0i.class, str);
                }

                public static i011io1o0i[] values() {
/* 7 */             return (i011io1o0i[]) I00ioIO.clone();
                }

                public boolean I00000oIO() {
/* 3 */             return !(this instanceof i010Olo0O);
                }
            }
