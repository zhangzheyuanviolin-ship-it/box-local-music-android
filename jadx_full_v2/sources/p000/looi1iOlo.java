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
            public final class looi1iOlo {
                public static final looi1iOlo I00iiI;
                public static final looi1iOlo I00iiO;
                public static final looi1iOlo[] I00iio;
                public static final looi1iOlo[] I00ilI0I1;
                public final int I00iOIl;

                looi1iOlo EF0;

                static {
/* 3 */             o010li010 o010li010Var = o010li010.DOUBLE;
/* 11 */            looi1iOlo looi1iolo = new looi1iOlo("DOUBLE", 0, 0, 1, o010li010Var);
/* 16 */            o010li010 o010li010Var2 = o010li010.FLOAT;
/* 24 */            looi1iOlo looi1iolo2 = new looi1iOlo("FLOAT", 1, 1, 1, o010li010Var2);
/* 30 */            o010li010 o010li010Var3 = o010li010.LONG;
/* 41 */            looi1iOlo looi1iolo3 = new looi1iOlo("INT64", 2, 2, 1, o010li010Var3);
/* 55 */            looi1iOlo looi1iolo4 = new looi1iOlo("UINT64", 3, 3, 1, o010li010Var3);
/* 62 */            o010li010 o010li010Var4 = o010li010.INT;
/* 74 */            looi1iOlo looi1iolo5 = new looi1iOlo("INT32", 4, 4, 1, o010li010Var4);
/* 87 */            looi1iOlo looi1iolo6 = new looi1iOlo("FIXED64", 5, 5, 1, o010li010Var3);
/* 100 */           looi1iOlo looi1iolo7 = new looi1iOlo("FIXED32", 6, 6, 1, o010li010Var4);
/* 107 */           o010li010 o010li010Var5 = o010li010.BOOLEAN;
/* 119 */           looi1iOlo looi1iolo8 = new looi1iOlo("BOOL", 7, 7, 1, o010li010Var5);
/* 126 */           o010li010 o010li010Var6 = o010li010.STRING;
/* 136 */           looi1iOlo looi1iolo9 = new looi1iOlo("STRING", 8, 8, 1, o010li010Var6);
/* 141 */           o010li010 o010li010Var7 = o010li010.MESSAGE;
/* 153 */           looi1iOlo looi1iolo10 = new looi1iOlo("MESSAGE", 9, 9, 1, o010li010Var7);
/* 160 */           o010li010 o010li010Var8 = o010li010.BYTE_STRING;
/* 170 */           looi1iOlo looi1iolo11 = new looi1iOlo("BYTES", 10, 10, 1, o010li010Var8);
/* 181 */           looi1iOlo looi1iolo12 = new looi1iOlo("UINT32", 11, 11, 1, o010li010Var4);
/* 188 */           o010li010 o010li010Var9 = o010li010.ENUM;
/* 200 */           looi1iOlo looi1iolo13 = new looi1iOlo("ENUM", 12, 12, 1, o010li010Var9);
/* 211 */           looi1iOlo looi1iolo14 = new looi1iOlo("SFIXED32", 13, 13, 1, o010li010Var4);
/* 224 */           looi1iOlo looi1iolo15 = new looi1iOlo("SFIXED64", 14, 14, 1, o010li010Var3);
/* 239 */           looi1iOlo looi1iolo16 = new looi1iOlo("SINT32", 15, 15, 1, o010li010Var4);
/* 254 */           looi1iOlo looi1iolo17 = new looi1iOlo("SINT64", 16, 16, 1, o010li010Var3);
/* 269 */           looi1iOlo looi1iolo18 = new looi1iOlo("GROUP", 17, 17, 1, o010li010Var7);
/* 282 */           looi1iOlo looi1iolo19 = new looi1iOlo("DOUBLE_LIST", 18, 18, 2, o010li010Var);
/* 295 */           looi1iOlo looi1iolo20 = new looi1iOlo("FLOAT_LIST", 19, 19, 2, o010li010Var2);
/* 312 */           looi1iOlo looi1iolo21 = new looi1iOlo("INT64_LIST", 20, 20, 2, o010li010Var3);
/* 329 */           looi1iOlo looi1iolo22 = new looi1iOlo("UINT64_LIST", 21, 21, 2, o010li010Var3);
/* 344 */           looi1iOlo looi1iolo23 = new looi1iOlo("INT32_LIST", 22, 22, 2, o010li010Var4);
/* 359 */           looi1iOlo looi1iolo24 = new looi1iOlo("FIXED64_LIST", 23, 23, 2, o010li010Var3);
/* 372 */           looi1iOlo looi1iolo25 = new looi1iOlo("FIXED32_LIST", 24, 24, 2, o010li010Var4);
/* 389 */           looi1iOlo looi1iolo26 = new looi1iOlo("BOOL_LIST", 25, 25, 2, o010li010Var5);
/* 406 */           looi1iOlo looi1iolo27 = new looi1iOlo("STRING_LIST", 26, 26, 2, o010li010Var6);
/* 419 */           looi1iOlo looi1iolo28 = new looi1iOlo("MESSAGE_LIST", 27, 27, 2, o010li010Var7);
/* 438 */           looi1iOlo looi1iolo29 = new looi1iOlo("BYTES_LIST", 28, 28, 2, o010li010Var8);
/* 451 */           looi1iOlo looi1iolo30 = new looi1iOlo("UINT32_LIST", 29, 29, 2, o010li010Var4);
/* 468 */           looi1iOlo looi1iolo31 = new looi1iOlo("ENUM_LIST", 30, 30, 2, o010li010Var9);
/* 483 */           looi1iOlo looi1iolo32 = new looi1iOlo("SFIXED32_LIST", 31, 31, 2, o010li010Var4);
/* 498 */           looi1iOlo looi1iolo33 = new looi1iOlo("SFIXED64_LIST", 32, 32, 2, o010li010Var3);
/* 513 */           looi1iOlo looi1iolo34 = new looi1iOlo("SINT32_LIST", 33, 33, 2, o010li010Var4);
/* 528 */           looi1iOlo looi1iolo35 = new looi1iOlo("SINT64_LIST", 34, 34, 2, o010li010Var3);
/* 541 */           looi1iOlo looi1iolo36 = new looi1iOlo("DOUBLE_LIST_PACKED", 35, 35, 3, o010li010Var);
/* 544 */           I00iiI = looi1iolo36;
/* 554 */           looi1iOlo looi1iolo37 = new looi1iOlo("FLOAT_LIST_PACKED", 36, 36, 3, o010li010Var2);
/* 567 */           looi1iOlo looi1iolo38 = new looi1iOlo("INT64_LIST_PACKED", 37, 37, 3, o010li010Var3);
/* 582 */           looi1iOlo looi1iolo39 = new looi1iOlo("UINT64_LIST_PACKED", 38, 38, 3, o010li010Var3);
/* 599 */           looi1iOlo looi1iolo40 = new looi1iOlo("INT32_LIST_PACKED", 39, 39, 3, o010li010Var4);
/* 614 */           looi1iOlo looi1iolo41 = new looi1iOlo("FIXED64_LIST_PACKED", 40, 40, 3, o010li010Var3);
/* 633 */           looi1iOlo looi1iolo42 = new looi1iOlo("FIXED32_LIST_PACKED", 41, 41, 3, o010li010Var4);
/* 650 */           looi1iOlo looi1iolo43 = new looi1iOlo("BOOL_LIST_PACKED", 42, 42, 3, o010li010Var5);
/* 661 */           looi1iOlo looi1iolo44 = new looi1iOlo("UINT32_LIST_PACKED", 43, 43, 3, o010li010Var4);
/* 676 */           looi1iOlo looi1iolo45 = new looi1iOlo("ENUM_LIST_PACKED", 44, 44, 3, o010li010Var9);
/* 687 */           looi1iOlo looi1iolo46 = new looi1iOlo("SFIXED32_LIST_PACKED", 45, 45, 3, o010li010Var4);
/* 700 */           looi1iOlo looi1iolo47 = new looi1iOlo("SFIXED64_LIST_PACKED", 46, 46, 3, o010li010Var3);
/* 714 */           looi1iOlo looi1iolo48 = new looi1iOlo("SINT32_LIST_PACKED", 47, 47, 3, o010li010Var4);
/* 725 */           looi1iOlo looi1iolo49 = new looi1iOlo("SINT64_LIST_PACKED", 48, 48, 3, o010li010Var3);
/* 728 */           I00iiO = looi1iolo49;
/* 834 */           I00ilI0I1 = new looi1iOlo[]{looi1iolo, looi1iolo2, looi1iolo3, looi1iolo4, looi1iolo5, looi1iolo6, looi1iolo7, looi1iolo8, looi1iolo9, looi1iolo10, looi1iolo11, looi1iolo12, looi1iolo13, looi1iolo14, looi1iolo15, looi1iolo16, looi1iolo17, looi1iolo18, looi1iolo19, looi1iolo20, looi1iolo21, looi1iolo22, looi1iolo23, looi1iolo24, looi1iolo25, looi1iolo26, looi1iolo27, looi1iolo28, looi1iolo29, looi1iolo30, looi1iolo31, looi1iolo32, looi1iolo33, looi1iolo34, looi1iolo35, looi1iolo36, looi1iolo37, looi1iolo38, looi1iolo39, looi1iolo40, looi1iolo41, looi1iolo42, looi1iolo43, looi1iolo44, looi1iolo45, looi1iolo46, looi1iolo47, looi1iolo48, looi1iolo49, new looi1iOlo("GROUP_LIST", 49, 49, 2, o010li010Var7), new looi1iOlo("MAP", 50, 50, 4, o010li010.VOID)};
/* 836 */           looi1iOlo[] looi1ioloArrValues = values();
/* 843 */           I00iio = new looi1iOlo[looi1ioloArrValues.length];
/* 846 */           for (looi1iOlo looi1iolo50 : looi1ioloArrValues) {
/* 854 */               I00iio[looi1iolo50.I00iOIl] = looi1iolo50;
                    }
                }

                public looi1iOlo(String str, int i, int i2, int i3, o010li010 o010li010Var) {
/* 4 */             this.I00iOIl = i2;
                    int i4 = i3 - 1;
/* 9 */             if (i4 == 1 || i4 == 3) {
/* 15 */                Class cls = o010li010Var.I00iOIl;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                o010li010 o010li010Var2 = o010li010.VOID;
/* 24 */                o010li010Var.ordinal();
                    }
                }

                public static looi1iOlo[] values() {
/* 7 */             return (looi1iOlo[]) I00ilI0I1.clone();
                }
            }
