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
            public final class IlIOOlOo1lIi {
                public static final IlIOOlOo1lIi I00iiI;
                public static final IlIOOlOo1lIi I00iiO;
                public static final IlIOOlOo1lIi[] I00iio;
                public static final IlIOOlOo1lIi[] I00ilI0I1;
                public final int I00iOIl;

                IlIOOlOo1lIi EF0;

                static {
/* 3 */             O00oOIl1O1i o00oOIl1O1i = O00oOIl1O1i.DOUBLE;
/* 12 */            IlIOOlOo1lIi ilIOOlOo1lIi = new IlIOOlOo1lIi("DOUBLE", 0, 0, 1, o00oOIl1O1i);
/* 17 */            O00oOIl1O1i o00oOIl1O1i2 = O00oOIl1O1i.FLOAT;
/* 26 */            IlIOOlOo1lIi ilIOOlOo1lIi2 = new IlIOOlOo1lIi("FLOAT", 1, 1, 1, o00oOIl1O1i2);
/* 33 */            O00oOIl1O1i o00oOIl1O1i3 = O00oOIl1O1i.LONG;
/* 42 */            IlIOOlOo1lIi ilIOOlOo1lIi3 = new IlIOOlOo1lIi("INT64", 2, 2, 1, o00oOIl1O1i3);
/* 54 */            IlIOOlOo1lIi ilIOOlOo1lIi4 = new IlIOOlOo1lIi("UINT64", 3, 3, 1, o00oOIl1O1i3);
/* 61 */            O00oOIl1O1i o00oOIl1O1i4 = O00oOIl1O1i.INT;
/* 70 */            IlIOOlOo1lIi ilIOOlOo1lIi5 = new IlIOOlOo1lIi("INT32", 4, 4, 1, o00oOIl1O1i4);
/* 83 */            IlIOOlOo1lIi ilIOOlOo1lIi6 = new IlIOOlOo1lIi("FIXED64", 5, 5, 1, o00oOIl1O1i3);
/* 96 */            IlIOOlOo1lIi ilIOOlOo1lIi7 = new IlIOOlOo1lIi("FIXED32", 6, 6, 1, o00oOIl1O1i4);
/* 103 */           O00oOIl1O1i o00oOIl1O1i5 = O00oOIl1O1i.BOOLEAN;
/* 111 */           IlIOOlOo1lIi ilIOOlOo1lIi8 = new IlIOOlOo1lIi("BOOL", 7, 7, 1, o00oOIl1O1i5);
/* 118 */           O00oOIl1O1i o00oOIl1O1i6 = O00oOIl1O1i.STRING;
/* 128 */           IlIOOlOo1lIi ilIOOlOo1lIi9 = new IlIOOlOo1lIi("STRING", 8, 8, 1, o00oOIl1O1i6);
/* 135 */           O00oOIl1O1i o00oOIl1O1i7 = O00oOIl1O1i.MESSAGE;
/* 145 */           IlIOOlOo1lIi ilIOOlOo1lIi10 = new IlIOOlOo1lIi("MESSAGE", 9, 9, 1, o00oOIl1O1i7);
/* 152 */           O00oOIl1O1i o00oOIl1O1i8 = O00oOIl1O1i.BYTE_STRING;
/* 160 */           IlIOOlOo1lIi ilIOOlOo1lIi11 = new IlIOOlOo1lIi("BYTES", 10, 10, 1, o00oOIl1O1i8);
/* 177 */           IlIOOlOo1lIi ilIOOlOo1lIi12 = new IlIOOlOo1lIi("UINT32", 11, 11, 1, o00oOIl1O1i4);
/* 184 */           O00oOIl1O1i o00oOIl1O1i9 = O00oOIl1O1i.ENUM;
/* 194 */           IlIOOlOo1lIi ilIOOlOo1lIi13 = new IlIOOlOo1lIi("ENUM", 12, 12, 1, o00oOIl1O1i9);
/* 209 */           IlIOOlOo1lIi ilIOOlOo1lIi14 = new IlIOOlOo1lIi("SFIXED32", 13, 13, 1, o00oOIl1O1i4);
/* 224 */           IlIOOlOo1lIi ilIOOlOo1lIi15 = new IlIOOlOo1lIi("SFIXED64", 14, 14, 1, o00oOIl1O1i3);
/* 241 */           IlIOOlOo1lIi ilIOOlOo1lIi16 = new IlIOOlOo1lIi("SINT32", 15, 15, 1, o00oOIl1O1i4);
/* 256 */           IlIOOlOo1lIi ilIOOlOo1lIi17 = new IlIOOlOo1lIi("SINT64", 16, 16, 1, o00oOIl1O1i3);
/* 271 */           IlIOOlOo1lIi ilIOOlOo1lIi18 = new IlIOOlOo1lIi("GROUP", 17, 17, 1, o00oOIl1O1i7);
/* 286 */           IlIOOlOo1lIi ilIOOlOo1lIi19 = new IlIOOlOo1lIi("DOUBLE_LIST", 18, 18, 2, o00oOIl1O1i);
/* 302 */           IlIOOlOo1lIi ilIOOlOo1lIi20 = new IlIOOlOo1lIi("FLOAT_LIST", 19, 19, 2, o00oOIl1O1i2);
/* 314 */           IlIOOlOo1lIi ilIOOlOo1lIi21 = new IlIOOlOo1lIi("INT64_LIST", 20, 20, 2, o00oOIl1O1i3);
/* 327 */           IlIOOlOo1lIi ilIOOlOo1lIi22 = new IlIOOlOo1lIi("UINT64_LIST", 21, 21, 2, o00oOIl1O1i3);
/* 342 */           IlIOOlOo1lIi ilIOOlOo1lIi23 = new IlIOOlOo1lIi("INT32_LIST", 22, 22, 2, o00oOIl1O1i4);
/* 355 */           IlIOOlOo1lIi ilIOOlOo1lIi24 = new IlIOOlOo1lIi("FIXED64_LIST", 23, 23, 2, o00oOIl1O1i3);
/* 368 */           IlIOOlOo1lIi ilIOOlOo1lIi25 = new IlIOOlOo1lIi("FIXED32_LIST", 24, 24, 2, o00oOIl1O1i4);
/* 385 */           IlIOOlOo1lIi ilIOOlOo1lIi26 = new IlIOOlOo1lIi("BOOL_LIST", 25, 25, 2, o00oOIl1O1i5);
/* 402 */           IlIOOlOo1lIi ilIOOlOo1lIi27 = new IlIOOlOo1lIi("STRING_LIST", 26, 26, 2, o00oOIl1O1i6);
/* 415 */           IlIOOlOo1lIi ilIOOlOo1lIi28 = new IlIOOlOo1lIi("MESSAGE_LIST", 27, 27, 2, o00oOIl1O1i7);
/* 430 */           IlIOOlOo1lIi ilIOOlOo1lIi29 = new IlIOOlOo1lIi("BYTES_LIST", 28, 28, 2, o00oOIl1O1i8);
/* 441 */           IlIOOlOo1lIi ilIOOlOo1lIi30 = new IlIOOlOo1lIi("UINT32_LIST", 29, 29, 2, o00oOIl1O1i4);
/* 456 */           IlIOOlOo1lIi ilIOOlOo1lIi31 = new IlIOOlOo1lIi("ENUM_LIST", 30, 30, 2, o00oOIl1O1i9);
/* 469 */           IlIOOlOo1lIi ilIOOlOo1lIi32 = new IlIOOlOo1lIi("SFIXED32_LIST", 31, 31, 2, o00oOIl1O1i4);
/* 482 */           IlIOOlOo1lIi ilIOOlOo1lIi33 = new IlIOOlOo1lIi("SFIXED64_LIST", 32, 32, 2, o00oOIl1O1i3);
/* 497 */           IlIOOlOo1lIi ilIOOlOo1lIi34 = new IlIOOlOo1lIi("SINT32_LIST", 33, 33, 2, o00oOIl1O1i4);
/* 512 */           IlIOOlOo1lIi ilIOOlOo1lIi35 = new IlIOOlOo1lIi("SINT64_LIST", 34, 34, 2, o00oOIl1O1i3);
/* 535 */           IlIOOlOo1lIi ilIOOlOo1lIi36 = new IlIOOlOo1lIi("DOUBLE_LIST_PACKED", 35, 35, 3, o00oOIl1O1i);
/* 538 */           I00iiI = ilIOOlOo1lIi36;
/* 552 */           IlIOOlOo1lIi ilIOOlOo1lIi37 = new IlIOOlOo1lIi("FLOAT_LIST_PACKED", 36, 36, 3, o00oOIl1O1i2);
/* 563 */           IlIOOlOo1lIi ilIOOlOo1lIi38 = new IlIOOlOo1lIi("INT64_LIST_PACKED", 37, 37, 3, o00oOIl1O1i3);
/* 576 */           IlIOOlOo1lIi ilIOOlOo1lIi39 = new IlIOOlOo1lIi("UINT64_LIST_PACKED", 38, 38, 3, o00oOIl1O1i3);
/* 593 */           IlIOOlOo1lIi ilIOOlOo1lIi40 = new IlIOOlOo1lIi("INT32_LIST_PACKED", 39, 39, 3, o00oOIl1O1i4);
/* 606 */           IlIOOlOo1lIi ilIOOlOo1lIi41 = new IlIOOlOo1lIi("FIXED64_LIST_PACKED", 40, 40, 3, o00oOIl1O1i3);
/* 619 */           IlIOOlOo1lIi ilIOOlOo1lIi42 = new IlIOOlOo1lIi("FIXED32_LIST_PACKED", 41, 41, 3, o00oOIl1O1i4);
/* 637 */           IlIOOlOo1lIi ilIOOlOo1lIi43 = new IlIOOlOo1lIi("BOOL_LIST_PACKED", 42, 42, 3, o00oOIl1O1i5);
/* 648 */           IlIOOlOo1lIi ilIOOlOo1lIi44 = new IlIOOlOo1lIi("UINT32_LIST_PACKED", 43, 43, 3, o00oOIl1O1i4);
/* 665 */           IlIOOlOo1lIi ilIOOlOo1lIi45 = new IlIOOlOo1lIi("ENUM_LIST_PACKED", 44, 44, 3, o00oOIl1O1i9);
/* 676 */           IlIOOlOo1lIi ilIOOlOo1lIi46 = new IlIOOlOo1lIi("SFIXED32_LIST_PACKED", 45, 45, 3, o00oOIl1O1i4);
/* 691 */           IlIOOlOo1lIi ilIOOlOo1lIi47 = new IlIOOlOo1lIi("SFIXED64_LIST_PACKED", 46, 46, 3, o00oOIl1O1i3);
/* 706 */           IlIOOlOo1lIi ilIOOlOo1lIi48 = new IlIOOlOo1lIi("SINT32_LIST_PACKED", 47, 47, 3, o00oOIl1O1i4);
/* 717 */           IlIOOlOo1lIi ilIOOlOo1lIi49 = new IlIOOlOo1lIi("SINT64_LIST_PACKED", 48, 48, 3, o00oOIl1O1i3);
/* 720 */           I00iiO = ilIOOlOo1lIi49;
/* 827 */           I00ilI0I1 = new IlIOOlOo1lIi[]{ilIOOlOo1lIi, ilIOOlOo1lIi2, ilIOOlOo1lIi3, ilIOOlOo1lIi4, ilIOOlOo1lIi5, ilIOOlOo1lIi6, ilIOOlOo1lIi7, ilIOOlOo1lIi8, ilIOOlOo1lIi9, ilIOOlOo1lIi10, ilIOOlOo1lIi11, ilIOOlOo1lIi12, ilIOOlOo1lIi13, ilIOOlOo1lIi14, ilIOOlOo1lIi15, ilIOOlOo1lIi16, ilIOOlOo1lIi17, ilIOOlOo1lIi18, ilIOOlOo1lIi19, ilIOOlOo1lIi20, ilIOOlOo1lIi21, ilIOOlOo1lIi22, ilIOOlOo1lIi23, ilIOOlOo1lIi24, ilIOOlOo1lIi25, ilIOOlOo1lIi26, ilIOOlOo1lIi27, ilIOOlOo1lIi28, ilIOOlOo1lIi29, ilIOOlOo1lIi30, ilIOOlOo1lIi31, ilIOOlOo1lIi32, ilIOOlOo1lIi33, ilIOOlOo1lIi34, ilIOOlOo1lIi35, ilIOOlOo1lIi36, ilIOOlOo1lIi37, ilIOOlOo1lIi38, ilIOOlOo1lIi39, ilIOOlOo1lIi40, ilIOOlOo1lIi41, ilIOOlOo1lIi42, ilIOOlOo1lIi43, ilIOOlOo1lIi44, ilIOOlOo1lIi45, ilIOOlOo1lIi46, ilIOOlOo1lIi47, ilIOOlOo1lIi48, ilIOOlOo1lIi49, new IlIOOlOo1lIi("GROUP_LIST", 49, 49, 2, o00oOIl1O1i7), new IlIOOlOo1lIi("MAP", 50, 50, 4, O00oOIl1O1i.VOID)};
/* 829 */           IlIOOlOo1lIi[] ilIOOlOo1lIiArrValues = values();
/* 836 */           I00iio = new IlIOOlOo1lIi[ilIOOlOo1lIiArrValues.length];
/* 840 */           for (IlIOOlOo1lIi ilIOOlOo1lIi50 : ilIOOlOo1lIiArrValues) {
/* 848 */               I00iio[ilIOOlOo1lIi50.I00iOIl] = ilIOOlOo1lIi50;
                    }
                }

                public IlIOOlOo1lIi(String str, int i, int i2, int i3, O00oOIl1O1i o00oOIl1O1i) {
/* 4 */             this.I00iOIl = i2;
/* 6 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i3);
/* 11 */            if (iI001lIiIIo1O == 1 || iI001lIiIIo1O == 3) {
/* 17 */                Class cls = o00oOIl1O1i.I00iOIl;
                    }
/* 22 */            if (i3 == 1) {
/* 24 */                o00oOIl1O1i.ordinal();
                    }
                }

                public static IlIOOlOo1lIi valueOf(String str) {
/* 7 */             return (IlIOOlOo1lIi) Enum.valueOf(IlIOOlOo1lIi.class, str);
                }

                public static IlIOOlOo1lIi[] values() {
/* 7 */             return (IlIOOlOo1lIi[]) I00ilI0I1.clone();
                }
            }
