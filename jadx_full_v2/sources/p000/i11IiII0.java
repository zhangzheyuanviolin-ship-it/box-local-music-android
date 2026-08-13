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
            public final class i11IiII0 {
                public static final i11IiII0 I00iiI;
                public static final i11IiII0 I00iiO;
                public static final i11IiII0[] I00iio;
                public static final i11IiII0[] I00ilI0I1;
                public final int I00iOIl;

                i11IiII0 EF0;

                static {
/* 3 */             i11i1Io1o i11i1io1o = i11i1Io1o.DOUBLE;
/* 11 */            i11IiII0 i11iiii0 = new i11IiII0("DOUBLE", 0, 0, 1, i11i1io1o);
/* 16 */            i11i1Io1o i11i1io1o2 = i11i1Io1o.FLOAT;
/* 24 */            i11IiII0 i11iiii02 = new i11IiII0("FLOAT", 1, 1, 1, i11i1io1o2);
/* 30 */            i11i1Io1o i11i1io1o3 = i11i1Io1o.LONG;
/* 41 */            i11IiII0 i11iiii03 = new i11IiII0("INT64", 2, 2, 1, i11i1io1o3);
/* 55 */            i11IiII0 i11iiii04 = new i11IiII0("UINT64", 3, 3, 1, i11i1io1o3);
/* 62 */            i11i1Io1o i11i1io1o4 = i11i1Io1o.INT;
/* 74 */            i11IiII0 i11iiii05 = new i11IiII0("INT32", 4, 4, 1, i11i1io1o4);
/* 87 */            i11IiII0 i11iiii06 = new i11IiII0("FIXED64", 5, 5, 1, i11i1io1o3);
/* 100 */           i11IiII0 i11iiii07 = new i11IiII0("FIXED32", 6, 6, 1, i11i1io1o4);
/* 107 */           i11i1Io1o i11i1io1o5 = i11i1Io1o.BOOLEAN;
/* 119 */           i11IiII0 i11iiii08 = new i11IiII0("BOOL", 7, 7, 1, i11i1io1o5);
/* 126 */           i11i1Io1o i11i1io1o6 = i11i1Io1o.STRING;
/* 136 */           i11IiII0 i11iiii09 = new i11IiII0("STRING", 8, 8, 1, i11i1io1o6);
/* 141 */           i11i1Io1o i11i1io1o7 = i11i1Io1o.MESSAGE;
/* 153 */           i11IiII0 i11iiii010 = new i11IiII0("MESSAGE", 9, 9, 1, i11i1io1o7);
/* 160 */           i11i1Io1o i11i1io1o8 = i11i1Io1o.BYTE_STRING;
/* 170 */           i11IiII0 i11iiii011 = new i11IiII0("BYTES", 10, 10, 1, i11i1io1o8);
/* 181 */           i11IiII0 i11iiii012 = new i11IiII0("UINT32", 11, 11, 1, i11i1io1o4);
/* 188 */           i11i1Io1o i11i1io1o9 = i11i1Io1o.ENUM;
/* 200 */           i11IiII0 i11iiii013 = new i11IiII0("ENUM", 12, 12, 1, i11i1io1o9);
/* 211 */           i11IiII0 i11iiii014 = new i11IiII0("SFIXED32", 13, 13, 1, i11i1io1o4);
/* 224 */           i11IiII0 i11iiii015 = new i11IiII0("SFIXED64", 14, 14, 1, i11i1io1o3);
/* 239 */           i11IiII0 i11iiii016 = new i11IiII0("SINT32", 15, 15, 1, i11i1io1o4);
/* 254 */           i11IiII0 i11iiii017 = new i11IiII0("SINT64", 16, 16, 1, i11i1io1o3);
/* 269 */           i11IiII0 i11iiii018 = new i11IiII0("GROUP", 17, 17, 1, i11i1io1o7);
/* 282 */           i11IiII0 i11iiii019 = new i11IiII0("DOUBLE_LIST", 18, 18, 2, i11i1io1o);
/* 295 */           i11IiII0 i11iiii020 = new i11IiII0("FLOAT_LIST", 19, 19, 2, i11i1io1o2);
/* 312 */           i11IiII0 i11iiii021 = new i11IiII0("INT64_LIST", 20, 20, 2, i11i1io1o3);
/* 329 */           i11IiII0 i11iiii022 = new i11IiII0("UINT64_LIST", 21, 21, 2, i11i1io1o3);
/* 344 */           i11IiII0 i11iiii023 = new i11IiII0("INT32_LIST", 22, 22, 2, i11i1io1o4);
/* 359 */           i11IiII0 i11iiii024 = new i11IiII0("FIXED64_LIST", 23, 23, 2, i11i1io1o3);
/* 372 */           i11IiII0 i11iiii025 = new i11IiII0("FIXED32_LIST", 24, 24, 2, i11i1io1o4);
/* 389 */           i11IiII0 i11iiii026 = new i11IiII0("BOOL_LIST", 25, 25, 2, i11i1io1o5);
/* 406 */           i11IiII0 i11iiii027 = new i11IiII0("STRING_LIST", 26, 26, 2, i11i1io1o6);
/* 419 */           i11IiII0 i11iiii028 = new i11IiII0("MESSAGE_LIST", 27, 27, 2, i11i1io1o7);
/* 438 */           i11IiII0 i11iiii029 = new i11IiII0("BYTES_LIST", 28, 28, 2, i11i1io1o8);
/* 451 */           i11IiII0 i11iiii030 = new i11IiII0("UINT32_LIST", 29, 29, 2, i11i1io1o4);
/* 468 */           i11IiII0 i11iiii031 = new i11IiII0("ENUM_LIST", 30, 30, 2, i11i1io1o9);
/* 483 */           i11IiII0 i11iiii032 = new i11IiII0("SFIXED32_LIST", 31, 31, 2, i11i1io1o4);
/* 498 */           i11IiII0 i11iiii033 = new i11IiII0("SFIXED64_LIST", 32, 32, 2, i11i1io1o3);
/* 513 */           i11IiII0 i11iiii034 = new i11IiII0("SINT32_LIST", 33, 33, 2, i11i1io1o4);
/* 528 */           i11IiII0 i11iiii035 = new i11IiII0("SINT64_LIST", 34, 34, 2, i11i1io1o3);
/* 541 */           i11IiII0 i11iiii036 = new i11IiII0("DOUBLE_LIST_PACKED", 35, 35, 3, i11i1io1o);
/* 544 */           I00iiI = i11iiii036;
/* 554 */           i11IiII0 i11iiii037 = new i11IiII0("FLOAT_LIST_PACKED", 36, 36, 3, i11i1io1o2);
/* 567 */           i11IiII0 i11iiii038 = new i11IiII0("INT64_LIST_PACKED", 37, 37, 3, i11i1io1o3);
/* 582 */           i11IiII0 i11iiii039 = new i11IiII0("UINT64_LIST_PACKED", 38, 38, 3, i11i1io1o3);
/* 599 */           i11IiII0 i11iiii040 = new i11IiII0("INT32_LIST_PACKED", 39, 39, 3, i11i1io1o4);
/* 614 */           i11IiII0 i11iiii041 = new i11IiII0("FIXED64_LIST_PACKED", 40, 40, 3, i11i1io1o3);
/* 633 */           i11IiII0 i11iiii042 = new i11IiII0("FIXED32_LIST_PACKED", 41, 41, 3, i11i1io1o4);
/* 650 */           i11IiII0 i11iiii043 = new i11IiII0("BOOL_LIST_PACKED", 42, 42, 3, i11i1io1o5);
/* 661 */           i11IiII0 i11iiii044 = new i11IiII0("UINT32_LIST_PACKED", 43, 43, 3, i11i1io1o4);
/* 676 */           i11IiII0 i11iiii045 = new i11IiII0("ENUM_LIST_PACKED", 44, 44, 3, i11i1io1o9);
/* 687 */           i11IiII0 i11iiii046 = new i11IiII0("SFIXED32_LIST_PACKED", 45, 45, 3, i11i1io1o4);
/* 700 */           i11IiII0 i11iiii047 = new i11IiII0("SFIXED64_LIST_PACKED", 46, 46, 3, i11i1io1o3);
/* 714 */           i11IiII0 i11iiii048 = new i11IiII0("SINT32_LIST_PACKED", 47, 47, 3, i11i1io1o4);
/* 725 */           i11IiII0 i11iiii049 = new i11IiII0("SINT64_LIST_PACKED", 48, 48, 3, i11i1io1o3);
/* 728 */           I00iiO = i11iiii049;
/* 834 */           I00ilI0I1 = new i11IiII0[]{i11iiii0, i11iiii02, i11iiii03, i11iiii04, i11iiii05, i11iiii06, i11iiii07, i11iiii08, i11iiii09, i11iiii010, i11iiii011, i11iiii012, i11iiii013, i11iiii014, i11iiii015, i11iiii016, i11iiii017, i11iiii018, i11iiii019, i11iiii020, i11iiii021, i11iiii022, i11iiii023, i11iiii024, i11iiii025, i11iiii026, i11iiii027, i11iiii028, i11iiii029, i11iiii030, i11iiii031, i11iiii032, i11iiii033, i11iiii034, i11iiii035, i11iiii036, i11iiii037, i11iiii038, i11iiii039, i11iiii040, i11iiii041, i11iiii042, i11iiii043, i11iiii044, i11iiii045, i11iiii046, i11iiii047, i11iiii048, i11iiii049, new i11IiII0("GROUP_LIST", 49, 49, 2, i11i1io1o7), new i11IiII0("MAP", 50, 50, 4, i11i1Io1o.VOID)};
/* 836 */           i11IiII0[] i11iiii0ArrValues = values();
/* 843 */           I00iio = new i11IiII0[i11iiii0ArrValues.length];
/* 846 */           for (i11IiII0 i11iiii050 : i11iiii0ArrValues) {
/* 854 */               I00iio[i11iiii050.I00iOIl] = i11iiii050;
                    }
                }

                public i11IiII0(String str, int i, int i2, int i3, i11i1Io1o i11i1io1o) {
/* 4 */             this.I00iOIl = i2;
                    int i4 = i3 - 1;
/* 9 */             if (i4 == 1 || i4 == 3) {
/* 15 */                Class cls = i11i1io1o.I00iOIl;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                i11i1Io1o i11i1io1o2 = i11i1Io1o.VOID;
/* 24 */                i11i1io1o.ordinal();
                    }
                }

                public static i11IiII0[] values() {
/* 7 */             return (i11IiII0[]) I00ilI0I1.clone();
                }
            }
