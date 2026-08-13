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
            public final class lI0oI0OIoI0 {
                public static final lI0oI0OIoI0 I00iiI;
                public static final lI0oI0OIoI0 I00iiO;
                public static final lI0oI0OIoI0[] I00iio;
                public static final lI0oI0OIoI0[] I00ilI0I1;
                public final int I00iOIl;

                lI0oI0OIoI0 EF0;

                static {
/* 3 */             lIi101i lii101i = lIi101i.DOUBLE;
/* 11 */            lI0oI0OIoI0 li0oi0oioi0 = new lI0oI0OIoI0("DOUBLE", 0, 0, 1, lii101i);
/* 16 */            lIi101i lii101i2 = lIi101i.FLOAT;
/* 24 */            lI0oI0OIoI0 li0oi0oioi02 = new lI0oI0OIoI0("FLOAT", 1, 1, 1, lii101i2);
/* 30 */            lIi101i lii101i3 = lIi101i.LONG;
/* 41 */            lI0oI0OIoI0 li0oi0oioi03 = new lI0oI0OIoI0("INT64", 2, 2, 1, lii101i3);
/* 55 */            lI0oI0OIoI0 li0oi0oioi04 = new lI0oI0OIoI0("UINT64", 3, 3, 1, lii101i3);
/* 62 */            lIi101i lii101i4 = lIi101i.INT;
/* 74 */            lI0oI0OIoI0 li0oi0oioi05 = new lI0oI0OIoI0("INT32", 4, 4, 1, lii101i4);
/* 87 */            lI0oI0OIoI0 li0oi0oioi06 = new lI0oI0OIoI0("FIXED64", 5, 5, 1, lii101i3);
/* 100 */           lI0oI0OIoI0 li0oi0oioi07 = new lI0oI0OIoI0("FIXED32", 6, 6, 1, lii101i4);
/* 107 */           lIi101i lii101i5 = lIi101i.BOOLEAN;
/* 119 */           lI0oI0OIoI0 li0oi0oioi08 = new lI0oI0OIoI0("BOOL", 7, 7, 1, lii101i5);
/* 126 */           lIi101i lii101i6 = lIi101i.STRING;
/* 136 */           lI0oI0OIoI0 li0oi0oioi09 = new lI0oI0OIoI0("STRING", 8, 8, 1, lii101i6);
/* 141 */           lIi101i lii101i7 = lIi101i.MESSAGE;
/* 153 */           lI0oI0OIoI0 li0oi0oioi010 = new lI0oI0OIoI0("MESSAGE", 9, 9, 1, lii101i7);
/* 160 */           lIi101i lii101i8 = lIi101i.BYTE_STRING;
/* 170 */           lI0oI0OIoI0 li0oi0oioi011 = new lI0oI0OIoI0("BYTES", 10, 10, 1, lii101i8);
/* 181 */           lI0oI0OIoI0 li0oi0oioi012 = new lI0oI0OIoI0("UINT32", 11, 11, 1, lii101i4);
/* 188 */           lIi101i lii101i9 = lIi101i.ENUM;
/* 200 */           lI0oI0OIoI0 li0oi0oioi013 = new lI0oI0OIoI0("ENUM", 12, 12, 1, lii101i9);
/* 211 */           lI0oI0OIoI0 li0oi0oioi014 = new lI0oI0OIoI0("SFIXED32", 13, 13, 1, lii101i4);
/* 224 */           lI0oI0OIoI0 li0oi0oioi015 = new lI0oI0OIoI0("SFIXED64", 14, 14, 1, lii101i3);
/* 239 */           lI0oI0OIoI0 li0oi0oioi016 = new lI0oI0OIoI0("SINT32", 15, 15, 1, lii101i4);
/* 254 */           lI0oI0OIoI0 li0oi0oioi017 = new lI0oI0OIoI0("SINT64", 16, 16, 1, lii101i3);
/* 269 */           lI0oI0OIoI0 li0oi0oioi018 = new lI0oI0OIoI0("GROUP", 17, 17, 1, lii101i7);
/* 282 */           lI0oI0OIoI0 li0oi0oioi019 = new lI0oI0OIoI0("DOUBLE_LIST", 18, 18, 2, lii101i);
/* 295 */           lI0oI0OIoI0 li0oi0oioi020 = new lI0oI0OIoI0("FLOAT_LIST", 19, 19, 2, lii101i2);
/* 312 */           lI0oI0OIoI0 li0oi0oioi021 = new lI0oI0OIoI0("INT64_LIST", 20, 20, 2, lii101i3);
/* 329 */           lI0oI0OIoI0 li0oi0oioi022 = new lI0oI0OIoI0("UINT64_LIST", 21, 21, 2, lii101i3);
/* 344 */           lI0oI0OIoI0 li0oi0oioi023 = new lI0oI0OIoI0("INT32_LIST", 22, 22, 2, lii101i4);
/* 359 */           lI0oI0OIoI0 li0oi0oioi024 = new lI0oI0OIoI0("FIXED64_LIST", 23, 23, 2, lii101i3);
/* 372 */           lI0oI0OIoI0 li0oi0oioi025 = new lI0oI0OIoI0("FIXED32_LIST", 24, 24, 2, lii101i4);
/* 389 */           lI0oI0OIoI0 li0oi0oioi026 = new lI0oI0OIoI0("BOOL_LIST", 25, 25, 2, lii101i5);
/* 406 */           lI0oI0OIoI0 li0oi0oioi027 = new lI0oI0OIoI0("STRING_LIST", 26, 26, 2, lii101i6);
/* 419 */           lI0oI0OIoI0 li0oi0oioi028 = new lI0oI0OIoI0("MESSAGE_LIST", 27, 27, 2, lii101i7);
/* 438 */           lI0oI0OIoI0 li0oi0oioi029 = new lI0oI0OIoI0("BYTES_LIST", 28, 28, 2, lii101i8);
/* 451 */           lI0oI0OIoI0 li0oi0oioi030 = new lI0oI0OIoI0("UINT32_LIST", 29, 29, 2, lii101i4);
/* 468 */           lI0oI0OIoI0 li0oi0oioi031 = new lI0oI0OIoI0("ENUM_LIST", 30, 30, 2, lii101i9);
/* 483 */           lI0oI0OIoI0 li0oi0oioi032 = new lI0oI0OIoI0("SFIXED32_LIST", 31, 31, 2, lii101i4);
/* 498 */           lI0oI0OIoI0 li0oi0oioi033 = new lI0oI0OIoI0("SFIXED64_LIST", 32, 32, 2, lii101i3);
/* 513 */           lI0oI0OIoI0 li0oi0oioi034 = new lI0oI0OIoI0("SINT32_LIST", 33, 33, 2, lii101i4);
/* 528 */           lI0oI0OIoI0 li0oi0oioi035 = new lI0oI0OIoI0("SINT64_LIST", 34, 34, 2, lii101i3);
/* 541 */           lI0oI0OIoI0 li0oi0oioi036 = new lI0oI0OIoI0("DOUBLE_LIST_PACKED", 35, 35, 3, lii101i);
/* 544 */           I00iiI = li0oi0oioi036;
/* 554 */           lI0oI0OIoI0 li0oi0oioi037 = new lI0oI0OIoI0("FLOAT_LIST_PACKED", 36, 36, 3, lii101i2);
/* 567 */           lI0oI0OIoI0 li0oi0oioi038 = new lI0oI0OIoI0("INT64_LIST_PACKED", 37, 37, 3, lii101i3);
/* 582 */           lI0oI0OIoI0 li0oi0oioi039 = new lI0oI0OIoI0("UINT64_LIST_PACKED", 38, 38, 3, lii101i3);
/* 599 */           lI0oI0OIoI0 li0oi0oioi040 = new lI0oI0OIoI0("INT32_LIST_PACKED", 39, 39, 3, lii101i4);
/* 614 */           lI0oI0OIoI0 li0oi0oioi041 = new lI0oI0OIoI0("FIXED64_LIST_PACKED", 40, 40, 3, lii101i3);
/* 633 */           lI0oI0OIoI0 li0oi0oioi042 = new lI0oI0OIoI0("FIXED32_LIST_PACKED", 41, 41, 3, lii101i4);
/* 650 */           lI0oI0OIoI0 li0oi0oioi043 = new lI0oI0OIoI0("BOOL_LIST_PACKED", 42, 42, 3, lii101i5);
/* 661 */           lI0oI0OIoI0 li0oi0oioi044 = new lI0oI0OIoI0("UINT32_LIST_PACKED", 43, 43, 3, lii101i4);
/* 676 */           lI0oI0OIoI0 li0oi0oioi045 = new lI0oI0OIoI0("ENUM_LIST_PACKED", 44, 44, 3, lii101i9);
/* 687 */           lI0oI0OIoI0 li0oi0oioi046 = new lI0oI0OIoI0("SFIXED32_LIST_PACKED", 45, 45, 3, lii101i4);
/* 700 */           lI0oI0OIoI0 li0oi0oioi047 = new lI0oI0OIoI0("SFIXED64_LIST_PACKED", 46, 46, 3, lii101i3);
/* 714 */           lI0oI0OIoI0 li0oi0oioi048 = new lI0oI0OIoI0("SINT32_LIST_PACKED", 47, 47, 3, lii101i4);
/* 725 */           lI0oI0OIoI0 li0oi0oioi049 = new lI0oI0OIoI0("SINT64_LIST_PACKED", 48, 48, 3, lii101i3);
/* 728 */           I00iiO = li0oi0oioi049;
/* 834 */           I00ilI0I1 = new lI0oI0OIoI0[]{li0oi0oioi0, li0oi0oioi02, li0oi0oioi03, li0oi0oioi04, li0oi0oioi05, li0oi0oioi06, li0oi0oioi07, li0oi0oioi08, li0oi0oioi09, li0oi0oioi010, li0oi0oioi011, li0oi0oioi012, li0oi0oioi013, li0oi0oioi014, li0oi0oioi015, li0oi0oioi016, li0oi0oioi017, li0oi0oioi018, li0oi0oioi019, li0oi0oioi020, li0oi0oioi021, li0oi0oioi022, li0oi0oioi023, li0oi0oioi024, li0oi0oioi025, li0oi0oioi026, li0oi0oioi027, li0oi0oioi028, li0oi0oioi029, li0oi0oioi030, li0oi0oioi031, li0oi0oioi032, li0oi0oioi033, li0oi0oioi034, li0oi0oioi035, li0oi0oioi036, li0oi0oioi037, li0oi0oioi038, li0oi0oioi039, li0oi0oioi040, li0oi0oioi041, li0oi0oioi042, li0oi0oioi043, li0oi0oioi044, li0oi0oioi045, li0oi0oioi046, li0oi0oioi047, li0oi0oioi048, li0oi0oioi049, new lI0oI0OIoI0("GROUP_LIST", 49, 49, 2, lii101i7), new lI0oI0OIoI0("MAP", 50, 50, 4, lIi101i.VOID)};
/* 836 */           lI0oI0OIoI0[] li0oi0oioi0ArrValues = values();
/* 843 */           I00iio = new lI0oI0OIoI0[li0oi0oioi0ArrValues.length];
/* 846 */           for (lI0oI0OIoI0 li0oi0oioi050 : li0oi0oioi0ArrValues) {
/* 854 */               I00iio[li0oi0oioi050.I00iOIl] = li0oi0oioi050;
                    }
                }

                public lI0oI0OIoI0(String str, int i, int i2, int i3, lIi101i lii101i) {
/* 4 */             this.I00iOIl = i2;
                    int i4 = i3 - 1;
/* 9 */             if (i4 == 1 || i4 == 3) {
/* 15 */                Class cls = lii101i.I00iOIl;
                    }
/* 20 */            if (i3 == 1) {
/* 22 */                lIi101i lii101i2 = lIi101i.VOID;
/* 24 */                lii101i.ordinal();
                    }
                }

                public static lI0oI0OIoI0[] values() {
/* 7 */             return (lI0oI0OIoI0[]) I00ilI0I1.clone();
                }
            }
