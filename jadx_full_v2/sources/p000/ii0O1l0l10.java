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
            public final class ii0O1l0l10 {
                public static final ii0O1l0l10 I00iiI;
                public static final ii0O1l0l10 I00iiO;
                public static final ii0O1l0l10[] I00iio;
                public static final ii0O1l0l10[] I00ilI0I1;
                public final int I00iOIl;

                ii0O1l0l10 EF0;

                static {
/* 3 */             ii0iO0illO ii0io0illo = ii0iO0illO.DOUBLE;
/* 11 */            ii0O1l0l10 ii0o1l0l10 = new ii0O1l0l10("DOUBLE", 0, 0, 1, ii0io0illo);
/* 16 */            ii0iO0illO ii0io0illo2 = ii0iO0illO.FLOAT;
/* 24 */            ii0O1l0l10 ii0o1l0l102 = new ii0O1l0l10("FLOAT", 1, 1, 1, ii0io0illo2);
/* 30 */            ii0iO0illO ii0io0illo3 = ii0iO0illO.LONG;
/* 41 */            ii0O1l0l10 ii0o1l0l103 = new ii0O1l0l10("INT64", 2, 2, 1, ii0io0illo3);
/* 55 */            ii0O1l0l10 ii0o1l0l104 = new ii0O1l0l10("UINT64", 3, 3, 1, ii0io0illo3);
/* 62 */            ii0iO0illO ii0io0illo4 = ii0iO0illO.INT;
/* 74 */            ii0O1l0l10 ii0o1l0l105 = new ii0O1l0l10("INT32", 4, 4, 1, ii0io0illo4);
/* 87 */            ii0O1l0l10 ii0o1l0l106 = new ii0O1l0l10("FIXED64", 5, 5, 1, ii0io0illo3);
/* 100 */           ii0O1l0l10 ii0o1l0l107 = new ii0O1l0l10("FIXED32", 6, 6, 1, ii0io0illo4);
/* 107 */           ii0iO0illO ii0io0illo5 = ii0iO0illO.BOOLEAN;
/* 119 */           ii0O1l0l10 ii0o1l0l108 = new ii0O1l0l10("BOOL", 7, 7, 1, ii0io0illo5);
/* 126 */           ii0iO0illO ii0io0illo6 = ii0iO0illO.STRING;
/* 136 */           ii0O1l0l10 ii0o1l0l109 = new ii0O1l0l10("STRING", 8, 8, 1, ii0io0illo6);
/* 141 */           ii0iO0illO ii0io0illo7 = ii0iO0illO.MESSAGE;
/* 153 */           ii0O1l0l10 ii0o1l0l1010 = new ii0O1l0l10("MESSAGE", 9, 9, 1, ii0io0illo7);
/* 160 */           ii0iO0illO ii0io0illo8 = ii0iO0illO.BYTE_STRING;
/* 170 */           ii0O1l0l10 ii0o1l0l1011 = new ii0O1l0l10("BYTES", 10, 10, 1, ii0io0illo8);
/* 181 */           ii0O1l0l10 ii0o1l0l1012 = new ii0O1l0l10("UINT32", 11, 11, 1, ii0io0illo4);
/* 188 */           ii0iO0illO ii0io0illo9 = ii0iO0illO.ENUM;
/* 200 */           ii0O1l0l10 ii0o1l0l1013 = new ii0O1l0l10("ENUM", 12, 12, 1, ii0io0illo9);
/* 211 */           ii0O1l0l10 ii0o1l0l1014 = new ii0O1l0l10("SFIXED32", 13, 13, 1, ii0io0illo4);
/* 224 */           ii0O1l0l10 ii0o1l0l1015 = new ii0O1l0l10("SFIXED64", 14, 14, 1, ii0io0illo3);
/* 239 */           ii0O1l0l10 ii0o1l0l1016 = new ii0O1l0l10("SINT32", 15, 15, 1, ii0io0illo4);
/* 254 */           ii0O1l0l10 ii0o1l0l1017 = new ii0O1l0l10("SINT64", 16, 16, 1, ii0io0illo3);
/* 269 */           ii0O1l0l10 ii0o1l0l1018 = new ii0O1l0l10("GROUP", 17, 17, 1, ii0io0illo7);
/* 282 */           ii0O1l0l10 ii0o1l0l1019 = new ii0O1l0l10("DOUBLE_LIST", 18, 18, 2, ii0io0illo);
/* 295 */           ii0O1l0l10 ii0o1l0l1020 = new ii0O1l0l10("FLOAT_LIST", 19, 19, 2, ii0io0illo2);
/* 312 */           ii0O1l0l10 ii0o1l0l1021 = new ii0O1l0l10("INT64_LIST", 20, 20, 2, ii0io0illo3);
/* 329 */           ii0O1l0l10 ii0o1l0l1022 = new ii0O1l0l10("UINT64_LIST", 21, 21, 2, ii0io0illo3);
/* 344 */           ii0O1l0l10 ii0o1l0l1023 = new ii0O1l0l10("INT32_LIST", 22, 22, 2, ii0io0illo4);
/* 359 */           ii0O1l0l10 ii0o1l0l1024 = new ii0O1l0l10("FIXED64_LIST", 23, 23, 2, ii0io0illo3);
/* 372 */           ii0O1l0l10 ii0o1l0l1025 = new ii0O1l0l10("FIXED32_LIST", 24, 24, 2, ii0io0illo4);
/* 389 */           ii0O1l0l10 ii0o1l0l1026 = new ii0O1l0l10("BOOL_LIST", 25, 25, 2, ii0io0illo5);
/* 406 */           ii0O1l0l10 ii0o1l0l1027 = new ii0O1l0l10("STRING_LIST", 26, 26, 2, ii0io0illo6);
/* 419 */           ii0O1l0l10 ii0o1l0l1028 = new ii0O1l0l10("MESSAGE_LIST", 27, 27, 2, ii0io0illo7);
/* 438 */           ii0O1l0l10 ii0o1l0l1029 = new ii0O1l0l10("BYTES_LIST", 28, 28, 2, ii0io0illo8);
/* 451 */           ii0O1l0l10 ii0o1l0l1030 = new ii0O1l0l10("UINT32_LIST", 29, 29, 2, ii0io0illo4);
/* 468 */           ii0O1l0l10 ii0o1l0l1031 = new ii0O1l0l10("ENUM_LIST", 30, 30, 2, ii0io0illo9);
/* 483 */           ii0O1l0l10 ii0o1l0l1032 = new ii0O1l0l10("SFIXED32_LIST", 31, 31, 2, ii0io0illo4);
/* 498 */           ii0O1l0l10 ii0o1l0l1033 = new ii0O1l0l10("SFIXED64_LIST", 32, 32, 2, ii0io0illo3);
/* 513 */           ii0O1l0l10 ii0o1l0l1034 = new ii0O1l0l10("SINT32_LIST", 33, 33, 2, ii0io0illo4);
/* 528 */           ii0O1l0l10 ii0o1l0l1035 = new ii0O1l0l10("SINT64_LIST", 34, 34, 2, ii0io0illo3);
/* 541 */           ii0O1l0l10 ii0o1l0l1036 = new ii0O1l0l10("DOUBLE_LIST_PACKED", 35, 35, 3, ii0io0illo);
/* 544 */           I00iiI = ii0o1l0l1036;
/* 554 */           ii0O1l0l10 ii0o1l0l1037 = new ii0O1l0l10("FLOAT_LIST_PACKED", 36, 36, 3, ii0io0illo2);
/* 567 */           ii0O1l0l10 ii0o1l0l1038 = new ii0O1l0l10("INT64_LIST_PACKED", 37, 37, 3, ii0io0illo3);
/* 582 */           ii0O1l0l10 ii0o1l0l1039 = new ii0O1l0l10("UINT64_LIST_PACKED", 38, 38, 3, ii0io0illo3);
/* 599 */           ii0O1l0l10 ii0o1l0l1040 = new ii0O1l0l10("INT32_LIST_PACKED", 39, 39, 3, ii0io0illo4);
/* 614 */           ii0O1l0l10 ii0o1l0l1041 = new ii0O1l0l10("FIXED64_LIST_PACKED", 40, 40, 3, ii0io0illo3);
/* 633 */           ii0O1l0l10 ii0o1l0l1042 = new ii0O1l0l10("FIXED32_LIST_PACKED", 41, 41, 3, ii0io0illo4);
/* 650 */           ii0O1l0l10 ii0o1l0l1043 = new ii0O1l0l10("BOOL_LIST_PACKED", 42, 42, 3, ii0io0illo5);
/* 661 */           ii0O1l0l10 ii0o1l0l1044 = new ii0O1l0l10("UINT32_LIST_PACKED", 43, 43, 3, ii0io0illo4);
/* 676 */           ii0O1l0l10 ii0o1l0l1045 = new ii0O1l0l10("ENUM_LIST_PACKED", 44, 44, 3, ii0io0illo9);
/* 687 */           ii0O1l0l10 ii0o1l0l1046 = new ii0O1l0l10("SFIXED32_LIST_PACKED", 45, 45, 3, ii0io0illo4);
/* 700 */           ii0O1l0l10 ii0o1l0l1047 = new ii0O1l0l10("SFIXED64_LIST_PACKED", 46, 46, 3, ii0io0illo3);
/* 714 */           ii0O1l0l10 ii0o1l0l1048 = new ii0O1l0l10("SINT32_LIST_PACKED", 47, 47, 3, ii0io0illo4);
/* 725 */           ii0O1l0l10 ii0o1l0l1049 = new ii0O1l0l10("SINT64_LIST_PACKED", 48, 48, 3, ii0io0illo3);
/* 728 */           I00iiO = ii0o1l0l1049;
/* 834 */           I00ilI0I1 = new ii0O1l0l10[]{ii0o1l0l10, ii0o1l0l102, ii0o1l0l103, ii0o1l0l104, ii0o1l0l105, ii0o1l0l106, ii0o1l0l107, ii0o1l0l108, ii0o1l0l109, ii0o1l0l1010, ii0o1l0l1011, ii0o1l0l1012, ii0o1l0l1013, ii0o1l0l1014, ii0o1l0l1015, ii0o1l0l1016, ii0o1l0l1017, ii0o1l0l1018, ii0o1l0l1019, ii0o1l0l1020, ii0o1l0l1021, ii0o1l0l1022, ii0o1l0l1023, ii0o1l0l1024, ii0o1l0l1025, ii0o1l0l1026, ii0o1l0l1027, ii0o1l0l1028, ii0o1l0l1029, ii0o1l0l1030, ii0o1l0l1031, ii0o1l0l1032, ii0o1l0l1033, ii0o1l0l1034, ii0o1l0l1035, ii0o1l0l1036, ii0o1l0l1037, ii0o1l0l1038, ii0o1l0l1039, ii0o1l0l1040, ii0o1l0l1041, ii0o1l0l1042, ii0o1l0l1043, ii0o1l0l1044, ii0o1l0l1045, ii0o1l0l1046, ii0o1l0l1047, ii0o1l0l1048, ii0o1l0l1049, new ii0O1l0l10("GROUP_LIST", 49, 49, 2, ii0io0illo7), new ii0O1l0l10("MAP", 50, 50, 4, ii0iO0illO.VOID)};
/* 836 */           ii0O1l0l10[] ii0o1l0l10ArrValues = values();
/* 843 */           I00iio = new ii0O1l0l10[ii0o1l0l10ArrValues.length];
/* 846 */           for (ii0O1l0l10 ii0o1l0l1050 : ii0o1l0l10ArrValues) {
/* 854 */               I00iio[ii0o1l0l1050.I00iOIl] = ii0o1l0l1050;
                    }
                }

                public ii0O1l0l10(String str, int i, int i2, int i3, ii0iO0illO ii0io0illo) {
/* 4 */             this.I00iOIl = i2;
                    int i4 = i3 - 1;
/* 9 */             if (i4 == 1 || i4 == 3) {
/* 15 */                Class cls = ii0io0illo.I00iOIl;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                ii0iO0illO ii0io0illo2 = ii0iO0illO.VOID;
/* 24 */                ii0io0illo.ordinal();
                    }
                }

                public static ii0O1l0l10[] values() {
/* 7 */             return (ii0O1l0l10[]) I00ilI0I1.clone();
                }
            }
