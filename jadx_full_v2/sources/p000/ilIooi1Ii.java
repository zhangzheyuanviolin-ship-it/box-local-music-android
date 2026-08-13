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
            public final class ilIooi1Ii {
                public static final ilIooi1Ii I00iiI;
                public static final ilIooi1Ii I00iiO;
                public static final ilIooi1Ii[] I00iio;
                public static final ilIooi1Ii[] I00ilI0I1;
                public final int I00iOIl;

                ilIooi1Ii EF0;

                static {
/* 3 */             ill1l0 ill1l0Var = ill1l0.DOUBLE;
/* 11 */            ilIooi1Ii iliooi1ii = new ilIooi1Ii("DOUBLE", 0, 0, 1, ill1l0Var);
/* 16 */            ill1l0 ill1l0Var2 = ill1l0.FLOAT;
/* 24 */            ilIooi1Ii iliooi1ii2 = new ilIooi1Ii("FLOAT", 1, 1, 1, ill1l0Var2);
/* 30 */            ill1l0 ill1l0Var3 = ill1l0.LONG;
/* 41 */            ilIooi1Ii iliooi1ii3 = new ilIooi1Ii("INT64", 2, 2, 1, ill1l0Var3);
/* 55 */            ilIooi1Ii iliooi1ii4 = new ilIooi1Ii("UINT64", 3, 3, 1, ill1l0Var3);
/* 62 */            ill1l0 ill1l0Var4 = ill1l0.INT;
/* 74 */            ilIooi1Ii iliooi1ii5 = new ilIooi1Ii("INT32", 4, 4, 1, ill1l0Var4);
/* 87 */            ilIooi1Ii iliooi1ii6 = new ilIooi1Ii("FIXED64", 5, 5, 1, ill1l0Var3);
/* 100 */           ilIooi1Ii iliooi1ii7 = new ilIooi1Ii("FIXED32", 6, 6, 1, ill1l0Var4);
/* 107 */           ill1l0 ill1l0Var5 = ill1l0.BOOLEAN;
/* 119 */           ilIooi1Ii iliooi1ii8 = new ilIooi1Ii("BOOL", 7, 7, 1, ill1l0Var5);
/* 126 */           ill1l0 ill1l0Var6 = ill1l0.STRING;
/* 136 */           ilIooi1Ii iliooi1ii9 = new ilIooi1Ii("STRING", 8, 8, 1, ill1l0Var6);
/* 141 */           ill1l0 ill1l0Var7 = ill1l0.MESSAGE;
/* 153 */           ilIooi1Ii iliooi1ii10 = new ilIooi1Ii("MESSAGE", 9, 9, 1, ill1l0Var7);
/* 160 */           ill1l0 ill1l0Var8 = ill1l0.BYTE_STRING;
/* 170 */           ilIooi1Ii iliooi1ii11 = new ilIooi1Ii("BYTES", 10, 10, 1, ill1l0Var8);
/* 181 */           ilIooi1Ii iliooi1ii12 = new ilIooi1Ii("UINT32", 11, 11, 1, ill1l0Var4);
/* 188 */           ill1l0 ill1l0Var9 = ill1l0.ENUM;
/* 200 */           ilIooi1Ii iliooi1ii13 = new ilIooi1Ii("ENUM", 12, 12, 1, ill1l0Var9);
/* 211 */           ilIooi1Ii iliooi1ii14 = new ilIooi1Ii("SFIXED32", 13, 13, 1, ill1l0Var4);
/* 224 */           ilIooi1Ii iliooi1ii15 = new ilIooi1Ii("SFIXED64", 14, 14, 1, ill1l0Var3);
/* 239 */           ilIooi1Ii iliooi1ii16 = new ilIooi1Ii("SINT32", 15, 15, 1, ill1l0Var4);
/* 254 */           ilIooi1Ii iliooi1ii17 = new ilIooi1Ii("SINT64", 16, 16, 1, ill1l0Var3);
/* 269 */           ilIooi1Ii iliooi1ii18 = new ilIooi1Ii("GROUP", 17, 17, 1, ill1l0Var7);
/* 282 */           ilIooi1Ii iliooi1ii19 = new ilIooi1Ii("DOUBLE_LIST", 18, 18, 2, ill1l0Var);
/* 295 */           ilIooi1Ii iliooi1ii20 = new ilIooi1Ii("FLOAT_LIST", 19, 19, 2, ill1l0Var2);
/* 312 */           ilIooi1Ii iliooi1ii21 = new ilIooi1Ii("INT64_LIST", 20, 20, 2, ill1l0Var3);
/* 329 */           ilIooi1Ii iliooi1ii22 = new ilIooi1Ii("UINT64_LIST", 21, 21, 2, ill1l0Var3);
/* 344 */           ilIooi1Ii iliooi1ii23 = new ilIooi1Ii("INT32_LIST", 22, 22, 2, ill1l0Var4);
/* 359 */           ilIooi1Ii iliooi1ii24 = new ilIooi1Ii("FIXED64_LIST", 23, 23, 2, ill1l0Var3);
/* 372 */           ilIooi1Ii iliooi1ii25 = new ilIooi1Ii("FIXED32_LIST", 24, 24, 2, ill1l0Var4);
/* 389 */           ilIooi1Ii iliooi1ii26 = new ilIooi1Ii("BOOL_LIST", 25, 25, 2, ill1l0Var5);
/* 406 */           ilIooi1Ii iliooi1ii27 = new ilIooi1Ii("STRING_LIST", 26, 26, 2, ill1l0Var6);
/* 419 */           ilIooi1Ii iliooi1ii28 = new ilIooi1Ii("MESSAGE_LIST", 27, 27, 2, ill1l0Var7);
/* 438 */           ilIooi1Ii iliooi1ii29 = new ilIooi1Ii("BYTES_LIST", 28, 28, 2, ill1l0Var8);
/* 451 */           ilIooi1Ii iliooi1ii30 = new ilIooi1Ii("UINT32_LIST", 29, 29, 2, ill1l0Var4);
/* 468 */           ilIooi1Ii iliooi1ii31 = new ilIooi1Ii("ENUM_LIST", 30, 30, 2, ill1l0Var9);
/* 483 */           ilIooi1Ii iliooi1ii32 = new ilIooi1Ii("SFIXED32_LIST", 31, 31, 2, ill1l0Var4);
/* 498 */           ilIooi1Ii iliooi1ii33 = new ilIooi1Ii("SFIXED64_LIST", 32, 32, 2, ill1l0Var3);
/* 513 */           ilIooi1Ii iliooi1ii34 = new ilIooi1Ii("SINT32_LIST", 33, 33, 2, ill1l0Var4);
/* 528 */           ilIooi1Ii iliooi1ii35 = new ilIooi1Ii("SINT64_LIST", 34, 34, 2, ill1l0Var3);
/* 541 */           ilIooi1Ii iliooi1ii36 = new ilIooi1Ii("DOUBLE_LIST_PACKED", 35, 35, 3, ill1l0Var);
/* 544 */           I00iiI = iliooi1ii36;
/* 554 */           ilIooi1Ii iliooi1ii37 = new ilIooi1Ii("FLOAT_LIST_PACKED", 36, 36, 3, ill1l0Var2);
/* 567 */           ilIooi1Ii iliooi1ii38 = new ilIooi1Ii("INT64_LIST_PACKED", 37, 37, 3, ill1l0Var3);
/* 582 */           ilIooi1Ii iliooi1ii39 = new ilIooi1Ii("UINT64_LIST_PACKED", 38, 38, 3, ill1l0Var3);
/* 599 */           ilIooi1Ii iliooi1ii40 = new ilIooi1Ii("INT32_LIST_PACKED", 39, 39, 3, ill1l0Var4);
/* 614 */           ilIooi1Ii iliooi1ii41 = new ilIooi1Ii("FIXED64_LIST_PACKED", 40, 40, 3, ill1l0Var3);
/* 633 */           ilIooi1Ii iliooi1ii42 = new ilIooi1Ii("FIXED32_LIST_PACKED", 41, 41, 3, ill1l0Var4);
/* 650 */           ilIooi1Ii iliooi1ii43 = new ilIooi1Ii("BOOL_LIST_PACKED", 42, 42, 3, ill1l0Var5);
/* 661 */           ilIooi1Ii iliooi1ii44 = new ilIooi1Ii("UINT32_LIST_PACKED", 43, 43, 3, ill1l0Var4);
/* 676 */           ilIooi1Ii iliooi1ii45 = new ilIooi1Ii("ENUM_LIST_PACKED", 44, 44, 3, ill1l0Var9);
/* 687 */           ilIooi1Ii iliooi1ii46 = new ilIooi1Ii("SFIXED32_LIST_PACKED", 45, 45, 3, ill1l0Var4);
/* 700 */           ilIooi1Ii iliooi1ii47 = new ilIooi1Ii("SFIXED64_LIST_PACKED", 46, 46, 3, ill1l0Var3);
/* 714 */           ilIooi1Ii iliooi1ii48 = new ilIooi1Ii("SINT32_LIST_PACKED", 47, 47, 3, ill1l0Var4);
/* 725 */           ilIooi1Ii iliooi1ii49 = new ilIooi1Ii("SINT64_LIST_PACKED", 48, 48, 3, ill1l0Var3);
/* 728 */           I00iiO = iliooi1ii49;
/* 834 */           I00ilI0I1 = new ilIooi1Ii[]{iliooi1ii, iliooi1ii2, iliooi1ii3, iliooi1ii4, iliooi1ii5, iliooi1ii6, iliooi1ii7, iliooi1ii8, iliooi1ii9, iliooi1ii10, iliooi1ii11, iliooi1ii12, iliooi1ii13, iliooi1ii14, iliooi1ii15, iliooi1ii16, iliooi1ii17, iliooi1ii18, iliooi1ii19, iliooi1ii20, iliooi1ii21, iliooi1ii22, iliooi1ii23, iliooi1ii24, iliooi1ii25, iliooi1ii26, iliooi1ii27, iliooi1ii28, iliooi1ii29, iliooi1ii30, iliooi1ii31, iliooi1ii32, iliooi1ii33, iliooi1ii34, iliooi1ii35, iliooi1ii36, iliooi1ii37, iliooi1ii38, iliooi1ii39, iliooi1ii40, iliooi1ii41, iliooi1ii42, iliooi1ii43, iliooi1ii44, iliooi1ii45, iliooi1ii46, iliooi1ii47, iliooi1ii48, iliooi1ii49, new ilIooi1Ii("GROUP_LIST", 49, 49, 2, ill1l0Var7), new ilIooi1Ii("MAP", 50, 50, 4, ill1l0.VOID)};
/* 836 */           ilIooi1Ii[] iliooi1iiArrValues = values();
/* 843 */           I00iio = new ilIooi1Ii[iliooi1iiArrValues.length];
/* 846 */           for (ilIooi1Ii iliooi1ii50 : iliooi1iiArrValues) {
/* 854 */               I00iio[iliooi1ii50.I00iOIl] = iliooi1ii50;
                    }
                }

                public ilIooi1Ii(String str, int i, int i2, int i3, ill1l0 ill1l0Var) {
/* 4 */             this.I00iOIl = i2;
                    int i4 = i3 - 1;
/* 9 */             if (i4 == 1 || i4 == 3) {
/* 15 */                Class cls = ill1l0Var.I00iOIl;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                ill1l0 ill1l0Var2 = ill1l0.VOID;
/* 24 */                ill1l0Var.ordinal();
                    }
                }

                public static ilIooi1Ii[] values() {
/* 7 */             return (ilIooi1Ii[]) I00ilI0I1.clone();
                }
            }
