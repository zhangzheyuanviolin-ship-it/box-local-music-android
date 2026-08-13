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
            public final class i1oIO0 {
                public static final i1oIO0 I00iiI;
                public static final i1oIO0 I00iiO;
                public static final i1oIO0[] I00iio;
                public static final i1oIO0[] I00ilI0I1;
                public final int I00iOIl;

                i1oIO0 EF0;

                static {
/* 3 */             iI00olI1OOiO ii00oli1ooio = iI00olI1OOiO.DOUBLE;
/* 11 */            i1oIO0 i1oio0 = new i1oIO0("DOUBLE", 0, 0, 1, ii00oli1ooio);
/* 16 */            iI00olI1OOiO ii00oli1ooio2 = iI00olI1OOiO.FLOAT;
/* 24 */            i1oIO0 i1oio02 = new i1oIO0("FLOAT", 1, 1, 1, ii00oli1ooio2);
/* 30 */            iI00olI1OOiO ii00oli1ooio3 = iI00olI1OOiO.LONG;
/* 41 */            i1oIO0 i1oio03 = new i1oIO0("INT64", 2, 2, 1, ii00oli1ooio3);
/* 55 */            i1oIO0 i1oio04 = new i1oIO0("UINT64", 3, 3, 1, ii00oli1ooio3);
/* 62 */            iI00olI1OOiO ii00oli1ooio4 = iI00olI1OOiO.INT;
/* 74 */            i1oIO0 i1oio05 = new i1oIO0("INT32", 4, 4, 1, ii00oli1ooio4);
/* 87 */            i1oIO0 i1oio06 = new i1oIO0("FIXED64", 5, 5, 1, ii00oli1ooio3);
/* 100 */           i1oIO0 i1oio07 = new i1oIO0("FIXED32", 6, 6, 1, ii00oli1ooio4);
/* 107 */           iI00olI1OOiO ii00oli1ooio5 = iI00olI1OOiO.BOOLEAN;
/* 119 */           i1oIO0 i1oio08 = new i1oIO0("BOOL", 7, 7, 1, ii00oli1ooio5);
/* 126 */           iI00olI1OOiO ii00oli1ooio6 = iI00olI1OOiO.STRING;
/* 136 */           i1oIO0 i1oio09 = new i1oIO0("STRING", 8, 8, 1, ii00oli1ooio6);
/* 141 */           iI00olI1OOiO ii00oli1ooio7 = iI00olI1OOiO.MESSAGE;
/* 153 */           i1oIO0 i1oio010 = new i1oIO0("MESSAGE", 9, 9, 1, ii00oli1ooio7);
/* 160 */           iI00olI1OOiO ii00oli1ooio8 = iI00olI1OOiO.BYTE_STRING;
/* 170 */           i1oIO0 i1oio011 = new i1oIO0("BYTES", 10, 10, 1, ii00oli1ooio8);
/* 181 */           i1oIO0 i1oio012 = new i1oIO0("UINT32", 11, 11, 1, ii00oli1ooio4);
/* 188 */           iI00olI1OOiO ii00oli1ooio9 = iI00olI1OOiO.ENUM;
/* 200 */           i1oIO0 i1oio013 = new i1oIO0("ENUM", 12, 12, 1, ii00oli1ooio9);
/* 211 */           i1oIO0 i1oio014 = new i1oIO0("SFIXED32", 13, 13, 1, ii00oli1ooio4);
/* 224 */           i1oIO0 i1oio015 = new i1oIO0("SFIXED64", 14, 14, 1, ii00oli1ooio3);
/* 239 */           i1oIO0 i1oio016 = new i1oIO0("SINT32", 15, 15, 1, ii00oli1ooio4);
/* 254 */           i1oIO0 i1oio017 = new i1oIO0("SINT64", 16, 16, 1, ii00oli1ooio3);
/* 269 */           i1oIO0 i1oio018 = new i1oIO0("GROUP", 17, 17, 1, ii00oli1ooio7);
/* 282 */           i1oIO0 i1oio019 = new i1oIO0("DOUBLE_LIST", 18, 18, 2, ii00oli1ooio);
/* 295 */           i1oIO0 i1oio020 = new i1oIO0("FLOAT_LIST", 19, 19, 2, ii00oli1ooio2);
/* 312 */           i1oIO0 i1oio021 = new i1oIO0("INT64_LIST", 20, 20, 2, ii00oli1ooio3);
/* 329 */           i1oIO0 i1oio022 = new i1oIO0("UINT64_LIST", 21, 21, 2, ii00oli1ooio3);
/* 344 */           i1oIO0 i1oio023 = new i1oIO0("INT32_LIST", 22, 22, 2, ii00oli1ooio4);
/* 359 */           i1oIO0 i1oio024 = new i1oIO0("FIXED64_LIST", 23, 23, 2, ii00oli1ooio3);
/* 372 */           i1oIO0 i1oio025 = new i1oIO0("FIXED32_LIST", 24, 24, 2, ii00oli1ooio4);
/* 389 */           i1oIO0 i1oio026 = new i1oIO0("BOOL_LIST", 25, 25, 2, ii00oli1ooio5);
/* 406 */           i1oIO0 i1oio027 = new i1oIO0("STRING_LIST", 26, 26, 2, ii00oli1ooio6);
/* 419 */           i1oIO0 i1oio028 = new i1oIO0("MESSAGE_LIST", 27, 27, 2, ii00oli1ooio7);
/* 438 */           i1oIO0 i1oio029 = new i1oIO0("BYTES_LIST", 28, 28, 2, ii00oli1ooio8);
/* 451 */           i1oIO0 i1oio030 = new i1oIO0("UINT32_LIST", 29, 29, 2, ii00oli1ooio4);
/* 468 */           i1oIO0 i1oio031 = new i1oIO0("ENUM_LIST", 30, 30, 2, ii00oli1ooio9);
/* 483 */           i1oIO0 i1oio032 = new i1oIO0("SFIXED32_LIST", 31, 31, 2, ii00oli1ooio4);
/* 498 */           i1oIO0 i1oio033 = new i1oIO0("SFIXED64_LIST", 32, 32, 2, ii00oli1ooio3);
/* 513 */           i1oIO0 i1oio034 = new i1oIO0("SINT32_LIST", 33, 33, 2, ii00oli1ooio4);
/* 528 */           i1oIO0 i1oio035 = new i1oIO0("SINT64_LIST", 34, 34, 2, ii00oli1ooio3);
/* 541 */           i1oIO0 i1oio036 = new i1oIO0("DOUBLE_LIST_PACKED", 35, 35, 3, ii00oli1ooio);
/* 544 */           I00iiI = i1oio036;
/* 554 */           i1oIO0 i1oio037 = new i1oIO0("FLOAT_LIST_PACKED", 36, 36, 3, ii00oli1ooio2);
/* 567 */           i1oIO0 i1oio038 = new i1oIO0("INT64_LIST_PACKED", 37, 37, 3, ii00oli1ooio3);
/* 582 */           i1oIO0 i1oio039 = new i1oIO0("UINT64_LIST_PACKED", 38, 38, 3, ii00oli1ooio3);
/* 599 */           i1oIO0 i1oio040 = new i1oIO0("INT32_LIST_PACKED", 39, 39, 3, ii00oli1ooio4);
/* 614 */           i1oIO0 i1oio041 = new i1oIO0("FIXED64_LIST_PACKED", 40, 40, 3, ii00oli1ooio3);
/* 633 */           i1oIO0 i1oio042 = new i1oIO0("FIXED32_LIST_PACKED", 41, 41, 3, ii00oli1ooio4);
/* 650 */           i1oIO0 i1oio043 = new i1oIO0("BOOL_LIST_PACKED", 42, 42, 3, ii00oli1ooio5);
/* 661 */           i1oIO0 i1oio044 = new i1oIO0("UINT32_LIST_PACKED", 43, 43, 3, ii00oli1ooio4);
/* 676 */           i1oIO0 i1oio045 = new i1oIO0("ENUM_LIST_PACKED", 44, 44, 3, ii00oli1ooio9);
/* 687 */           i1oIO0 i1oio046 = new i1oIO0("SFIXED32_LIST_PACKED", 45, 45, 3, ii00oli1ooio4);
/* 700 */           i1oIO0 i1oio047 = new i1oIO0("SFIXED64_LIST_PACKED", 46, 46, 3, ii00oli1ooio3);
/* 714 */           i1oIO0 i1oio048 = new i1oIO0("SINT32_LIST_PACKED", 47, 47, 3, ii00oli1ooio4);
/* 725 */           i1oIO0 i1oio049 = new i1oIO0("SINT64_LIST_PACKED", 48, 48, 3, ii00oli1ooio3);
/* 728 */           I00iiO = i1oio049;
/* 834 */           I00ilI0I1 = new i1oIO0[]{i1oio0, i1oio02, i1oio03, i1oio04, i1oio05, i1oio06, i1oio07, i1oio08, i1oio09, i1oio010, i1oio011, i1oio012, i1oio013, i1oio014, i1oio015, i1oio016, i1oio017, i1oio018, i1oio019, i1oio020, i1oio021, i1oio022, i1oio023, i1oio024, i1oio025, i1oio026, i1oio027, i1oio028, i1oio029, i1oio030, i1oio031, i1oio032, i1oio033, i1oio034, i1oio035, i1oio036, i1oio037, i1oio038, i1oio039, i1oio040, i1oio041, i1oio042, i1oio043, i1oio044, i1oio045, i1oio046, i1oio047, i1oio048, i1oio049, new i1oIO0("GROUP_LIST", 49, 49, 2, ii00oli1ooio7), new i1oIO0("MAP", 50, 50, 4, iI00olI1OOiO.VOID)};
/* 836 */           i1oIO0[] i1oio0ArrValues = values();
/* 843 */           I00iio = new i1oIO0[i1oio0ArrValues.length];
/* 846 */           for (i1oIO0 i1oio050 : i1oio0ArrValues) {
/* 854 */               I00iio[i1oio050.I00iOIl] = i1oio050;
                    }
                }

                public i1oIO0(String str, int i, int i2, int i3, iI00olI1OOiO ii00oli1ooio) {
/* 4 */             this.I00iOIl = i2;
                    int i4 = i3 - 1;
/* 9 */             if (i4 == 1 || i4 == 3) {
/* 15 */                Class cls = ii00oli1ooio.I00iOIl;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                iI00olI1OOiO ii00oli1ooio2 = iI00olI1OOiO.VOID;
/* 24 */                ii00oli1ooio.ordinal();
                    }
                }

                public static i1oIO0[] values() {
/* 7 */             return (i1oIO0[]) I00ilI0I1.clone();
                }
            }
