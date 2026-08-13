            package p000;
            
            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
            	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
            	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
            	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public final class ili0l110 {
                public static final ili0l110 I00iiI;
                public static final ili0l110 I00iiO;
                public static final ili0l110[] I00iio;
                public static final ili0l110[] I00ilI0I1;
                public final int I00iOIl;

                ili0l110 EF0;

                static {
/* 3 */             ilooiOIl ilooioil = ilooiOIl.DOUBLE;
/* 11 */            ili0l110 ili0l110Var = new ili0l110("DOUBLE", 0, 0, 1, ilooioil);
/* 16 */            ilooiOIl ilooioil2 = ilooiOIl.FLOAT;
/* 24 */            ili0l110 ili0l110Var2 = new ili0l110("FLOAT", 1, 1, 1, ilooioil2);
/* 30 */            ilooiOIl ilooioil3 = ilooiOIl.LONG;
/* 41 */            ili0l110 ili0l110Var3 = new ili0l110("INT64", 2, 2, 1, ilooioil3);
/* 55 */            ili0l110 ili0l110Var4 = new ili0l110("UINT64", 3, 3, 1, ilooioil3);
/* 62 */            ilooiOIl ilooioil4 = ilooiOIl.INT;
/* 74 */            ili0l110 ili0l110Var5 = new ili0l110("INT32", 4, 4, 1, ilooioil4);
/* 87 */            ili0l110 ili0l110Var6 = new ili0l110("FIXED64", 5, 5, 1, ilooioil3);
/* 100 */           ili0l110 ili0l110Var7 = new ili0l110("FIXED32", 6, 6, 1, ilooioil4);
/* 107 */           ilooiOIl ilooioil5 = ilooiOIl.BOOLEAN;
/* 119 */           ili0l110 ili0l110Var8 = new ili0l110("BOOL", 7, 7, 1, ilooioil5);
/* 126 */           ilooiOIl ilooioil6 = ilooiOIl.STRING;
/* 136 */           ili0l110 ili0l110Var9 = new ili0l110("STRING", 8, 8, 1, ilooioil6);
/* 141 */           ilooiOIl ilooioil7 = ilooiOIl.MESSAGE;
/* 153 */           ili0l110 ili0l110Var10 = new ili0l110("MESSAGE", 9, 9, 1, ilooioil7);
/* 160 */           ilooiOIl ilooioil8 = ilooiOIl.BYTE_STRING;
/* 170 */           ili0l110 ili0l110Var11 = new ili0l110("BYTES", 10, 10, 1, ilooioil8);
/* 181 */           ili0l110 ili0l110Var12 = new ili0l110("UINT32", 11, 11, 1, ilooioil4);
/* 188 */           ilooiOIl ilooioil9 = ilooiOIl.ENUM;
/* 200 */           ili0l110 ili0l110Var13 = new ili0l110("ENUM", 12, 12, 1, ilooioil9);
/* 211 */           ili0l110 ili0l110Var14 = new ili0l110("SFIXED32", 13, 13, 1, ilooioil4);
/* 224 */           ili0l110 ili0l110Var15 = new ili0l110("SFIXED64", 14, 14, 1, ilooioil3);
/* 239 */           ili0l110 ili0l110Var16 = new ili0l110("SINT32", 15, 15, 1, ilooioil4);
/* 254 */           ili0l110 ili0l110Var17 = new ili0l110("SINT64", 16, 16, 1, ilooioil3);
/* 269 */           ili0l110 ili0l110Var18 = new ili0l110("GROUP", 17, 17, 1, ilooioil7);
/* 282 */           ili0l110 ili0l110Var19 = new ili0l110("DOUBLE_LIST", 18, 18, 2, ilooioil);
/* 295 */           ili0l110 ili0l110Var20 = new ili0l110("FLOAT_LIST", 19, 19, 2, ilooioil2);
/* 312 */           ili0l110 ili0l110Var21 = new ili0l110("INT64_LIST", 20, 20, 2, ilooioil3);
/* 329 */           ili0l110 ili0l110Var22 = new ili0l110("UINT64_LIST", 21, 21, 2, ilooioil3);
/* 344 */           ili0l110 ili0l110Var23 = new ili0l110("INT32_LIST", 22, 22, 2, ilooioil4);
/* 359 */           ili0l110 ili0l110Var24 = new ili0l110("FIXED64_LIST", 23, 23, 2, ilooioil3);
/* 372 */           ili0l110 ili0l110Var25 = new ili0l110("FIXED32_LIST", 24, 24, 2, ilooioil4);
/* 389 */           ili0l110 ili0l110Var26 = new ili0l110("BOOL_LIST", 25, 25, 2, ilooioil5);
/* 406 */           ili0l110 ili0l110Var27 = new ili0l110("STRING_LIST", 26, 26, 2, ilooioil6);
/* 419 */           ili0l110 ili0l110Var28 = new ili0l110("MESSAGE_LIST", 27, 27, 2, ilooioil7);
/* 438 */           ili0l110 ili0l110Var29 = new ili0l110("BYTES_LIST", 28, 28, 2, ilooioil8);
/* 451 */           ili0l110 ili0l110Var30 = new ili0l110("UINT32_LIST", 29, 29, 2, ilooioil4);
/* 468 */           ili0l110 ili0l110Var31 = new ili0l110("ENUM_LIST", 30, 30, 2, ilooioil9);
/* 483 */           ili0l110 ili0l110Var32 = new ili0l110("SFIXED32_LIST", 31, 31, 2, ilooioil4);
/* 498 */           ili0l110 ili0l110Var33 = new ili0l110("SFIXED64_LIST", 32, 32, 2, ilooioil3);
/* 513 */           ili0l110 ili0l110Var34 = new ili0l110("SINT32_LIST", 33, 33, 2, ilooioil4);
/* 528 */           ili0l110 ili0l110Var35 = new ili0l110("SINT64_LIST", 34, 34, 2, ilooioil3);
/* 541 */           ili0l110 ili0l110Var36 = new ili0l110("DOUBLE_LIST_PACKED", 35, 35, 3, ilooioil);
/* 544 */           I00iiI = ili0l110Var36;
/* 554 */           ili0l110 ili0l110Var37 = new ili0l110("FLOAT_LIST_PACKED", 36, 36, 3, ilooioil2);
/* 567 */           ili0l110 ili0l110Var38 = new ili0l110("INT64_LIST_PACKED", 37, 37, 3, ilooioil3);
/* 582 */           ili0l110 ili0l110Var39 = new ili0l110("UINT64_LIST_PACKED", 38, 38, 3, ilooioil3);
/* 599 */           ili0l110 ili0l110Var40 = new ili0l110("INT32_LIST_PACKED", 39, 39, 3, ilooioil4);
/* 614 */           ili0l110 ili0l110Var41 = new ili0l110("FIXED64_LIST_PACKED", 40, 40, 3, ilooioil3);
/* 633 */           ili0l110 ili0l110Var42 = new ili0l110("FIXED32_LIST_PACKED", 41, 41, 3, ilooioil4);
/* 650 */           ili0l110 ili0l110Var43 = new ili0l110("BOOL_LIST_PACKED", 42, 42, 3, ilooioil5);
/* 661 */           ili0l110 ili0l110Var44 = new ili0l110("UINT32_LIST_PACKED", 43, 43, 3, ilooioil4);
/* 676 */           ili0l110 ili0l110Var45 = new ili0l110("ENUM_LIST_PACKED", 44, 44, 3, ilooioil9);
/* 687 */           ili0l110 ili0l110Var46 = new ili0l110("SFIXED32_LIST_PACKED", 45, 45, 3, ilooioil4);
/* 700 */           ili0l110 ili0l110Var47 = new ili0l110("SFIXED64_LIST_PACKED", 46, 46, 3, ilooioil3);
/* 714 */           ili0l110 ili0l110Var48 = new ili0l110("SINT32_LIST_PACKED", 47, 47, 3, ilooioil4);
/* 725 */           ili0l110 ili0l110Var49 = new ili0l110("SINT64_LIST_PACKED", 48, 48, 3, ilooioil3);
/* 728 */           I00iiO = ili0l110Var49;
/* 834 */           I00ilI0I1 = new ili0l110[]{ili0l110Var, ili0l110Var2, ili0l110Var3, ili0l110Var4, ili0l110Var5, ili0l110Var6, ili0l110Var7, ili0l110Var8, ili0l110Var9, ili0l110Var10, ili0l110Var11, ili0l110Var12, ili0l110Var13, ili0l110Var14, ili0l110Var15, ili0l110Var16, ili0l110Var17, ili0l110Var18, ili0l110Var19, ili0l110Var20, ili0l110Var21, ili0l110Var22, ili0l110Var23, ili0l110Var24, ili0l110Var25, ili0l110Var26, ili0l110Var27, ili0l110Var28, ili0l110Var29, ili0l110Var30, ili0l110Var31, ili0l110Var32, ili0l110Var33, ili0l110Var34, ili0l110Var35, ili0l110Var36, ili0l110Var37, ili0l110Var38, ili0l110Var39, ili0l110Var40, ili0l110Var41, ili0l110Var42, ili0l110Var43, ili0l110Var44, ili0l110Var45, ili0l110Var46, ili0l110Var47, ili0l110Var48, ili0l110Var49, new ili0l110("GROUP_LIST", 49, 49, 2, ilooioil7), new ili0l110("MAP", 50, 50, 4, ilooiOIl.VOID)};
/* 836 */           ili0l110[] ili0l110VarArrValues = values();
/* 843 */           I00iio = new ili0l110[ili0l110VarArrValues.length];
/* 846 */           for (ili0l110 ili0l110Var50 : ili0l110VarArrValues) {
/* 854 */               I00iio[ili0l110Var50.I00iOIl] = ili0l110Var50;
                    }
                }

                public ili0l110(String str, int i, int i2, int i3, ilooiOIl ilooioil) {
/* 4 */             this.I00iOIl = i2;
                    int i4 = i3 - 1;
/* 9 */             if (i4 == 1 || i4 == 3) {
/* 15 */                Class cls = ilooioil.I00iOIl;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                ilooiOIl ilooioil2 = ilooiOIl.VOID;
/* 24 */                ilooioil.ordinal();
                    }
                }

                public static ili0l110[] values() {
/* 7 */             return (ili0l110[]) I00ilI0I1.clone();
                }
            }
